package guide.tailor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * Main launcher activity: dual-WebView host for the bundled TailorGuide web app
 * plus the prompt-key JS bridge used by the web frontend to reach native features.
 *
 * Reconstructed from the original app's decompiled WebStart.
 */
public class WebStart extends AppCompatActivity {

    private static final String TAG = "WebStart";
    private static final String APP_URL = "file:///android_asset/www/index.html";
    private static final String BRIDGE_KEY = "gT2xsRbt8.#r";
    private static final String PREF_UUID = "app.uuid";
    private static final String PREF_INTERNET_DIALOG = "app.internetDialogShown";

    private static final int REQUEST_CAMERA_PERMISSION = 103;
    private static final int REQUEST_VIDEO_ACTIVITY = 34;
    private static final int REQUEST_QR_SCAN = 35;
    private static final int REQUEST_GOOGLE_SIGNIN = 64206;

    public static com.google.firebase.analytics.FirebaseAnalytics f9394o;

    private final Handler handler = new Handler();

    private WebView mainWebView;
    private WebView popupWebView;

    private String uuid = "";
    private String pushToken = "";
    private String initialPage = "main";
    private String pendingNotificationPayload = null;
    private String measurementsResponse = null;
    private String qrResponse = null;
    private String videoResponse = null;
    private String socialSignInResponse = null;

    // ------------------------------------------------------------------
    // Lifecycle
    // ------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
        setContentView(R.layout.activity_web_start);

        // FCM / push init was removed from the reconstruction scope.
        // TODO(M3): re-init FirebaseMessaging + subscribe to topics once keys are available.
        // Intent from a notification tap routes to a specific in-app page.
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getString("action") != null) {
            this.initialPage = extras.getString("action");
            if ("notification".equals(this.initialPage)) {
                this.pendingNotificationPayload = extras.getString("custom");
            }
        }

        // Enable background audio playback inside the WebView.
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        if (audioManager != null) {
            audioManager.requestAudioFocus(null,
                    AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
        }

        this.uuid = loadOrCreateUuid();
        this.mainWebView = findViewById(R.id.wvPortal);
        configureWebSettings(this.mainWebView);
        this.mainWebView.setWebViewClient(new PortalWebViewClient());
        this.mainWebView.setWebChromeClient(new PortalWebChromeClient());
        this.mainWebView.loadUrl(APP_URL);
    }

    @Override
    protected void onPause() {
        this.mainWebView.pauseTimers();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Original queried FirebaseInstanceId here and re-broadcast the token.
        this.mainWebView.resumeTimers();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Original cancelled image-picker compression futures here.
    }

    @Override
    public void onBackPressed() {
        if (this.popupWebView != null) {
            // A popup window.open() WebView is on top: tear it down instead of navigating.
            this.mainWebView.removeView(this.popupWebView);
            this.popupWebView.destroy();
            this.popupWebView = null;
            return;
        }
        jsNavigationGoBack();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras == null || extras.getString("action") == null) {
            return;
        }
        if ("main".equals(extras.getString("action"))) {
            this.mainWebView.loadUrl(APP_URL);
        } else if ("notification".equals(extras.getString("action"))) {
            this.pendingNotificationPayload = extras.getString("custom");
            notifyJs();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Facebook / Google sign-in callbacks were dispatched to their SDKs here.
        // TODO(M3): re-wire Facebook CallbackManager + Google Sign-In when the
        //           OAuth client IDs are restored.
        if (requestCode == REQUEST_VIDEO_ACTIVITY) {
            this.videoResponse = null;
            if (data != null && data.getStringExtra("result") != null) {
                this.videoResponse = data.getStringExtra("result");
            }
        } else if (requestCode == REQUEST_QR_SCAN) {
            this.qrResponse = null;
            if (data != null && data.getStringExtra("result") != null) {
                this.qrResponse = data.getStringExtra("result");
            }
        }
    }

    // ------------------------------------------------------------------
    // WebView setup
    // ------------------------------------------------------------------

    private void configureWebSettings(WebView webView) {
        WebSettings s = webView.getSettings();
        s.setJavaScriptEnabled(true);
        s.setJavaScriptCanOpenWindowsAutomatically(true);
        s.setSupportMultipleWindows(true);
        s.setAllowFileAccess(true);
        s.setAllowContentAccess(true);
        s.setDomStorageEnabled(true);
        s.setLoadWithOverviewMode(true);
        s.setUseWideViewPort(true);
        s.setAllowFileAccessFromFileURLs(true);
        s.setAllowUniversalAccessFromFileURLs(true);
        s.setGeolocationEnabled(true);
        s.setSupportZoom(true);
        s.setBuiltInZoomControls(true);
        s.setDisplayZoomControls(false);
        s.setPluginState(WebSettings.PluginState.ON);
        if (Build.VERSION.SDK_INT >= 21) {
            s.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
    }

    private void fadeOutLaunchImage() {
        final ImageView launchImage = findViewById(R.id.launchImage);
        if (launchImage == null || launchImage.getVisibility() == View.GONE) {
            return;
        }
        AlphaAnimation fade = new AlphaAnimation(1.0f, 0.0f);
        fade.setDuration(1000L);
        fade.setAnimationListener(new Animation.AnimationListener() {
            @Override public void onAnimationStart(Animation animation) { }

            @Override
            public void onAnimationEnd(Animation animation) {
                launchImage.setVisibility(View.GONE);
            }

            @Override public void onAnimationRepeat(Animation animation) { }
        });
        launchImage.startAnimation(fade);
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm != null ? cm.getActiveNetworkInfo() : null;
        return info != null && info.isConnected();
    }

    private void showInternetRequiredDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("You need internet connection to use this application")
                .setCancelable(false)
                .setPositiveButton("Connect", (dialog, which) ->
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS)))
                .setNegativeButton("Cancel", (dialog, which) -> {
                    SharedPreferences prefs =
                            PreferenceManager.getDefaultSharedPreferences(this);
                    prefs.edit().putBoolean(PREF_INTERNET_DIALOG, true).apply();
                    dialog.dismiss();
                });
        builder.create().show();
    }

    private void handleNoConnectivity() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (!prefs.getBoolean(PREF_INTERNET_DIALOG, false)) {
            runOnUiThread(this::showInternetRequiredDialog);
        } else {
            runOnUiThread(() -> {
                ImageView launchImage = findViewById(R.id.launchImage);
                if (launchImage != null) {
                    launchImage.setVisibility(View.GONE);
                }
                this.mainWebView.loadUrl("javascript:tailor.errorNoInternet()");
            });
        }
    }

    // ------------------------------------------------------------------
    // WebViewClient
    // ------------------------------------------------------------------

    private class PortalWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            // Reveal the WebView once the first page has finished loading.
            WebStart.this.fadeOutLaunchImage();
            // Original launched post-page-load services (image compression, QR warmup).
            if (!WebStart.this.isNetworkAvailable()) {
                WebStart.this.handleNoConnectivity();
            }
        }

        @Override
        public void onReceivedError(WebView view, int errorCode,
                                    String description, String failingUrl) {
            Log.e(TAG, "WebView error " + errorCode + ": " + description);
            WebStart.this.handleNoConnectivity();
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            if (request != null && request.getUrl() != null) {
                Uri uri = request.getUrl();
                if (uri.toString().startsWith("tg:")) {
                    WebStart.this.onJsPrompt(
                            uri.toString(), view, null, null, null);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(view, request);
        }
    }

    // ------------------------------------------------------------------
    // WebChromeClient + prompt-key bridge
    // ------------------------------------------------------------------

    private class PortalWebChromeClient extends WebChromeClient {
        @Override
        public boolean onCreateWindow(WebView view, boolean isDialog,
                                      boolean isUserGesture, Message resultMsg) {
            WebStart.this.popupWebView = new WebView(WebStart.this);
            WebStart.this.configureWebSettings(WebStart.this.popupWebView);
            WebStart.this.popupWebView.setWebViewClient(new PopupWebViewClient());
            WebStart.this.popupWebView.setWebChromeClient(new WebChromeClient() {
                @Override
                public void onCloseWindow(WebView w) {
                    WebStart.this.mainWebView.removeView(WebStart.this.popupWebView);
                    WebStart.this.popupWebView.destroy();
                    WebStart.this.popupWebView = null;
                }
            });
            view.addView(WebStart.this.popupWebView);
            ((WebView.WebViewTransport) resultMsg.obj)
                    .setWebView(WebStart.this.popupWebView);
            resultMsg.sendToTarget();
            return true;
        }

        @Override
        public boolean onJsPrompt(WebView view, String url, String message,
                                  String defaultValue, JsPromptResult result) {
            // Web side calls: prompt(PROMPT_KEY, JSON.stringify({method: ...}))
            // => message carries the bridge key, defaultValue carries the JSON.
            if (BRIDGE_KEY.equals(message)) {
                try {
                    JSONObject json = new JSONObject(defaultValue);
                    result.confirm(WebStart.this.dispatchBridgeCommand(json));
                } catch (JSONException e) {
                    Log.e(TAG, "Bad bridge payload: " + defaultValue, e);
                    result.confirm("");
                }
            } else {
                result.confirm();
            }
            return true;
        }
    }

    private class PopupWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            WebStart.this.fadeOutLaunchImage();
            WebStart.this.mainWebView.setBackgroundColor(0);
            if (!WebStart.this.isNetworkAvailable()) {
                WebStart.this.handleNoConnectivity();
            }
        }

        @Override
        public void onReceivedError(WebView view, int errorCode,
                                    String description, String failingUrl) {
            Log.e(TAG, "Popup WebView error " + errorCode + ": " + description);
        }
    }

    // Overload used by the tg: URL-scheme path.
    private void onJsPrompt(String url, WebView view, String message,
                            String defaultValue, JsPromptResult result) {
        Uri uri = Uri.parse(url);
        String command = uri.getHost();
        Map<String, String> params = new HashMap<>();
        if (uri.getQuery() != null) {
            for (String name : uri.getQueryParameterNames()) {
                params.put(name, uri.getQueryParameter(name));
            }
        }
        if ("auth".equals(command)) {
            String token = params.get("token");
            if (token != null && !token.isEmpty()) {
                // Original refreshed Firebase/Facebook tokens here.
                // TODO(M3): restore sign-in provider token refresh.
            }
        } else if ("version".equals(command)) {
            // Original posted the build to a version-check backend.
            // TODO(M3): restore version endpoint.
        } else if ("error".equals(command)) {
            String payload = params.get("m");
            Log.w(TAG, "Bridge error reported from JS: " + payload);
        }
    }

    // ------------------------------------------------------------------
    // Bridge command dispatcher
    // ------------------------------------------------------------------

    private String dispatchBridgeCommand(JSONObject json) {
        // Web side sends {"method": "<command>", ...}
        if (!json.has("method")) {
            return "";
        }
        String command = json.optString("method");
        try {
            switch (command) {
                case "event":
                    Log.d(TAG, "analytics event: " + json.optString("action"));
                    return "";
                case "external_url":
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(json.getString("url"))));
                    return "";
                case "startFilming":
            case "start_filming":
            case "start_filming_anon":
                    return handleStartFilming(json);
                case "login":
                    return handleLogin(json);
                case "get_token":
                    return this.pushToken;
                case "get_measurements":
                    return handleGetMeasurements();
                case "read_qr":
                    return handleReadQr();
                case "platformReady":
                    return handlePlatformReady(json);
                case "get_info":
                    return handleGetInfo();
                case "quit":
                    return handleQuit();
                default:
                    Log.w(TAG, "Unknown bridge command: " + command);
                    return "";
            }
        } catch (JSONException e) {
            Log.e(TAG, "Bridge command failed: " + command, e);
            return "";
        }
    }

    private String handleStartFilming(JSONObject json) throws JSONException {
        if (this.videoResponse != null) {
            String cached = this.videoResponse;
            this.videoResponse = null;
            return cached;
        }
        String jsonSettings = json.optString("jsonSettings", "");
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("HEIGHT_START", json.optString("height_start", ""));
        editor.putString("HEIGHT_END", json.optString("height_end", ""));
        editor.putString("FPS", json.optString("fps", ""));
        editor.putString("duration", json.optString("duration", ""));
        editor.putString("BODY_TYPE", json.optString("body", ""));
        editor.apply();

        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA")
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{"android.permission.CAMERA"}, REQUEST_CAMERA_PERMISSION);
            return "CANCELED";
        }
        if (isDeviceSupported()) {
            return "NOT_COMPATIBLE";
        }
        return launchVideoActivity(jsonSettings);
    }

    private String launchVideoActivity(String jsonSettings) {
        // start_filming must open the real capture flow (angle detection ->
        // calibration -> Camera2 photos), which lives in CaptureActivity.
        // VideoActivity is only an instructional "how to edit points" clip and
        // is reachable from inside the capture screen, so it is NOT the target.
        Intent intent = new Intent(this, CaptureActivity.class);
        intent.putExtra("jsonSettings", jsonSettings);
        startActivityForResult(intent, REQUEST_VIDEO_ACTIVITY);
        return "OK";
    }

    private String handleLogin(JSONObject json) throws JSONException {
        String provider = json.getString("provider");
        if ("facebook".equals(provider)) {
            if (this.socialSignInResponse != null) {
                String cached = this.socialSignInResponse;
                this.socialSignInResponse = null;
                return cached;
            }
            // TODO(M3): Facebook LoginManager logInWithReadPermissions — needs app id.
            Log.w(TAG, "facebook login stubbed (no OAuth config)");
            return "CANCELED";
        }
        if ("google".equals(provider)) {
            if (this.socialSignInResponse != null) {
                String cached = this.socialSignInResponse;
                this.socialSignInResponse = null;
                return cached;
            }
            // TODO(M3): Google Sign-In intent — needs OAuth client id.
            Log.w(TAG, "google login stubbed (no OAuth config)");
            return "CANCELED";
        }
        if ("logout".equals(provider)) {
            // TODO(M3): Facebook LoginManager.getInstance().logOut();
            Log.d(TAG, "logout (providers stubbed)");
            return "OK";
        }
        return "CANCELED";
    }

    private String handleGetMeasurements() {
        if (this.measurementsResponse != null) {
            String cached = this.measurementsResponse;
            this.measurementsResponse = null;
            return cached;
        }
        // TODO(M3): launch measurements UI when it is ported.
        Log.w(TAG, "get_measurements stubbed (measurements UI not yet ported)");
        return "CANCELED";
    }

    private String handleReadQr() {
        if (this.qrResponse != null) {
            String cached = this.qrResponse;
            this.qrResponse = null;
            return cached;
        }
        if (isDeviceSupported()) {
            return "NOT_COMPATIBLE";
        }
        try {
            @SuppressWarnings("unchecked")
            Class<? extends android.app.Activity> qrClass =
                    (Class<? extends android.app.Activity>)
                            Class.forName("guide.tailor.BarCodeCaptureActivity");
            startActivityForResult(new Intent(this, qrClass), REQUEST_QR_SCAN);
            return "OK";
        } catch (ClassNotFoundException e) {
            // TODO(M3): BarCodeCaptureActivity not yet ported.
            Log.w(TAG, "BarCodeCaptureActivity missing; read_qr stubbed");
            return "CANCELED";
        }
    }

    private String handlePlatformReady(JSONObject json) throws JSONException {
        String appVersion = json.optString("version", "");
        if ("3.2.0".equals(appVersion)) {
            Log.w(TAG, "client requested unsupported web bundle version");
            // Original fired an "unsupported_app" analytics event and loaded an
            // error page from the backend. TODO(M3): restore error-page URL.
            // TODO(M3): restore error-page URL.
            finishAffinity();
            return "";
        }
        if (isDeviceSupported()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Your device is not compatible with this version of the app. Please download an older version from the website.")
                    .setCancelable(false)
                    .setPositiveButton("OK", (dialog, which) -> {
                        dialog.dismiss();
                        finishAffinity();
                    });
            runOnUiThread(() -> builder.create().show());
            return "";
        }
        String webViewAgent = this.mainWebView.getSettings().getUserAgentString();
        // TODO(M3): restore analytics: WebView UA + versionCode + display metrics.
        // Original sent:
        //   action "android_version", label webViewAgent
        //   action "screen_width",     label String.valueOf(dm.widthPixels)
        //   action "screen_height",    label String.valueOf(dm.heightPixels)
        return "";
    }

    private String handleGetInfo() {
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics dm = new DisplayMetrics();
        display.getMetrics(dm);
        JSONObject info = new JSONObject();
        try {
            info.put("token", this.pushToken);
            info.put("uuid", this.uuid);
            info.put("version", 58);
            info.put("device", "android");
            info.put("version_name", "1.0.24");
            info.put("screen_width", dm.widthPixels);
            info.put("screen_height", dm.heightPixels);
        } catch (JSONException e) {
            Log.e(TAG, "get_info build failed", e);
        }
        return info.toString();
    }

    private String handleQuit() {
        if (isDeviceSupported()) {
            finishAffinity();
        }
        return "";
    }

    /**
     * Device-compatibility gate from the original: Samsung device from the KITKAT
     * era was blacklisted (broken camera API paths used by filming).
     */
    private boolean isDeviceSupported() {
        return "samsung".equals(Build.MANUFACTURER)
                && Build.VERSION.SDK_INT == 19
                && "klte".equals(Build.DEVICE);
    }

    // ------------------------------------------------------------------
    // window.tg inbound injection (native -> JS)
    // ------------------------------------------------------------------

    /** Escape a Java string for embedding inside a JS single-quoted literal. */
    private String escapeForJs(String value) {
        if (value == null) {
            return null;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '\'':
                    out.append("\\'");
                    break;
                case '"':
                    out.append("\\\"");
                    break;
                case '\\':
                    out.append("\\\\");
                    break;
                case '\n':
                    out.append("\\n");
                    break;
                case '\r':
                    out.append("\\r");
                    break;
                default:
                    out.append(c);
            }
        }
        return out.toString();
    }

    private void loadJs(String js) {
        this.mainWebView.loadUrl("javascript:" + js);
    }

    public void notifyJs() {
        loadJs("window.tg.notifications.notify("
                + (this.pendingNotificationPayload != null
                ? "'" + escapeForJs(this.pendingNotificationPayload) + "'"
                : "null")
                + ")");
        this.pendingNotificationPayload = null;
    }

    public void showPickerJs() {
        loadJs("window.tg.notifications.picker()");
    }

    public void updateTokenJs(String token) {
        this.pushToken = token;
        loadJs("window.tg.notifications.updateToken('" + escapeForJs(token) + "')");
    }

    public void setUuidJs(String uuid) {
        loadJs("window.tg.notifications.setUUID('" + escapeForJs(uuid) + "')");
    }

    public void socialSignInJs(String provider, String payload) {
        loadJs("window.tg.notifications.socialsignin('"
                + escapeForJs(provider) + "', '"
                + escapeForJs(payload) + "')");
    }

    public void setLocaleJs(String locale) {
        loadJs("window.tg.navigation.locale('" + escapeForJs(locale) + "')");
    }

    public void jsNavigationGoBack() {
        loadJs("window.tg.navigation.goBack()");
    }

    public void addMeasurementsJs(String measurementsJson) {
        loadJs("window.tg.measurements.add(" + measurementsJson + ")");
    }

    public void authQrJs(String qrPayload) {
        loadJs("window.tg.auth.qr('" + escapeForJs(qrPayload) + "')");
    }

    public void versionJs(String version) {
        loadJs("window.tg.version('" + escapeForJs(version) + "')");
    }

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private String loadOrCreateUuid() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String existing = prefs.getString(PREF_UUID, null);
        if (existing != null && !existing.isEmpty()) {
            return existing;
        }
        String created = UUID.randomUUID().toString();
        prefs.edit().putString(PREF_UUID, created).apply();
        return created;
    }

    @SuppressWarnings("unused")
    private static String base64Encode(byte[] data) {
        return Base64.encodeToString(data, Base64.NO_WRAP);
    }

    @SuppressWarnings("unused")
    private static byte[] base64Decode(String value) {
        try {
            return Base64.decode(value, Base64.NO_WRAP);
        } catch (IllegalArgumentException e) {
            return new byte[0];
        }
    }

    // ------------------------------------------------------------------
    // Compatibility shims for legacy smali-ported call sites (M3)
    // ------------------------------------------------------------------

    /** Legacy analytics/event hook. Original posted event names to backend; we log-only until backend is wired. */
    public static void m10620d(String eventName) {
        android.util.Log.d("WebStart", "event: " + eventName);
    }

    /** Legacy analytics/event hook with a detail payload (e.g. error context). Log-only until backend is wired. */
    public static void m10610a(String eventName, String detail) {
        android.util.Log.d("WebStart", "event: " + eventName + " detail: " + detail);
    }

    // ------------------------------------------------------------------
    // Legacy static state fields (M3) — referenced by smali-ported classes.
    // Types inferred from usage at call sites. Defaults match Java field init.
    // ------------------------------------------------------------------

    /** Global flags (booleans used in conditionals). */
    public static boolean f9376A;
    public static boolean f9379D;
    public static boolean f9380E;
    public static boolean f9381F;
    public static boolean f9405z;

    /** Gender selection: compared with .equals("male"). */
    public static String f9382G = "";

    /** Customer/display name, sent as JSON "meta.name". */
    public static String f9383H = "";

    /** True when the legacy Camera1 API is in use. */
    public static boolean f9385J;

    /** Camera info string for diagnostics payload. */
    public static String f9386K = "";

    /** True once camera angle calibration has been completed. */
    public static boolean f9392R;

    /** Set true when measurements have been returned to the web flow. */
    public static boolean f9395p;

    /** Last scanned barcode value (assigned Barcode.displayValue). */
    public static String f9396q = "";

    /** Measurements payload returned to the web flow. */
    public static org.json.JSONObject f9398s;

    /** Model id / customer id, sent in JSON payloads. */
    public static String f9400u = "";
    public static String f9402w = "";

    /** Calibration scale/offset values (floats assigned to measurement fields). */
    public static float f9388N;
    public static float f9389O;
    public static float f9390P;
    public static float f9391Q;
}
