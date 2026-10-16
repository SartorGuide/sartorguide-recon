package guide.tailor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.RggbChannelVector;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.SoundPool;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.material.tabs.TabLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FragmentC2259e extends Fragment {
    public static Size f9547s;
    public static Size f9548t;
    float f9557J;
    float f9558K;
    float f9559L;
    AudioManager f9560M;
    int[] f9562Q;
    int[] f9563R;
    int[] f9564S;
    int[] f9565T;
    private SensorManager f9577aI;
    private Sensor f9578aJ;
    private Sensor f9579aK;
    private SensorEventListener f9580aL;
    private int f9581aM;
    private int f9582aN;
    private double f9583aO;
    private SoundPool f9593aY;
    private SoundPool f9594aZ;
    AnimationDrawable f9607av;
    private Long f9615bE;
    private Long f9616bF;
    private Integer f9617bG;
    private RggbChannelVector f9619bI;
    private ColorSpaceTransform f9620bJ;
    private Camera f9623bM;
    private Camera.Parameters f9624bN;
    private SurfaceHolderCallbackC2264j f9625bO;
    private Camera.PictureCallback f9626bP;
    private AutoFitTextureView f9627bQ;
    private ProgressBar f9628bR;
    private ImageView f9629bS;
    private View f9630bT;
    private LinearLayout f9631bU;
    private CameraCaptureSession f9632bY;
    private Surface f9633bZ;
    private int f9636bc;
    private int f9637bd;
    private int f9638be;
    private int f9639bf;
    private int f9640bg;
    private int f9641bh;
    private int f9642bi;
    private int f9643bj;
    private File f9645bl;
    private File f9646bm;
    private File f9647bn;
    private File f9648bo;
    private FrameLayout f9649bp;
    private C2263i f9650bq;
    private FrameLayout f9651br;
    private FrameLayout f9652bs;
    private TextView f9653bt;
    private TextView f9654bu;
    private ImageView f9655bv;
    private TextView f9656bw;
    private CameraDevice f9660ca;
    private Size f9661cb;
    private ViewPager f9662cc;
    private C2267m f9663cd;
    private LinearLayout f9664ce;
    private Button f9665cf;
    private ImageView f9666cg;
    private String f9667ch;
    private HandlerThread f9670ck;
    private Handler f9671cl;
    private ImageReader f9672cm;
    private CaptureRequest.Builder f9674co;
    private CaptureRequest f9675cp;
    private boolean f9678cs;
    public Size f9682r;
    public Size f9683u;
    public static int f9511H = 0;
    public static boolean f9512N = false;
    public static boolean f9513O = false;
    public static int f9514Y = 0;
    public static double f9515Z = 0.5d;
    static final boolean f9517aB = true;
    public static boolean f9516a = f9517aB;
    public static int f9519ab = 2;
    public static boolean f9520ac = false;
    public static String f9521ap = "";
    public static String f9522aq = "";
    public static String f9523ar = "";
    public static Resources f9524as = null;
    public static long f9525at = 0;
    public static double f9526au = 0.0d;
    static AsyncTaskC2258d f9527ax = null;
    public static boolean f9528b = false; // force Camera2 path: legacy Camera1 (m10867b) renders black on modern Android
    private static Toolbar f9529bV = null;
    private static String f9530bW = "";
    private static String f9531bX = "";
    public static boolean f9532c = false;
    public static boolean f9533d = false;
    public static int f9534e = 0;
    public static boolean f9535f = false;
    public static boolean f9536g = false;
    public static int f9538i = 0;
    public static boolean f9539j = f9517aB;
    public static boolean f9540k = false;
    public static String f9541l = "";
    public static double f9542m = 0.0d;
    public static double f9543n = 0.0d;
    public static double f9544o = 0.0d;
    public static int f9545p = 0;
    public static double f9546q = 1.0d;
    public static Boolean f9537h = Boolean.valueOf(f9517aB);
    public static int[] f9518aa = new int[2];
    private boolean f9571aC = false;
    private double f9572aD = 1.0d;
    private CameraCharacteristics f9573aE = null;
    private int f9574aF = 0;
    private int f9575aG = 0;
    private int f9576aH = 1;
    float[] f9684v = new float[3];
    float[] f9685w = new float[3];
    private int f9584aP = 0;
    private boolean f9585aQ = f9517aB;
    private float f9586aR = 0.0f;
    private long f9587aS = 0;
    private float f9588aT = 1.0f;
    private float f9589aU = 1.0f;
    private float f9590aV = 0.0f;
    private float f9591aW = 0.0f;
    int f9686x = 0;
    int[] f9687y = new int[30];
    int[] f9688z = new int[30];
    int f9549A = 0;
    public boolean f9550B = false;
    public boolean f9551C = false;
    int f9552D = 0;
    int f9553E = 20;
    boolean f9554F = f9517aB;
    int f9555G = 0;
    private int f9592aX = 6;
    MediaActionSound f9556I = new MediaActionSound();
    private int f9634ba = 0;
    private int f9635bb = 0;
    private boolean f9644bk = false;
    private boolean f9657bx = false;
    private boolean f9658by = false;
    public boolean f9561P = false;
    int f9566U = 0;
    int f9567V = 0;
    int f9568W = 0;
    private MeteringRectangle f9659bz = null;
    boolean f9569X = false;
    private boolean f9611bA = false;
    private boolean f9612bB = false;
    private boolean f9613bC = false;
    private boolean f9614bD = false;
    private boolean f9618bH = f9517aB;
    private int f9621bK = 5;
    private int f9622bL = 0;
    boolean f9595ad = false;
    boolean f9596ae = false;
    final int f9597af = 1;
    final int f9598ag = 2;
    final int f9599ah = 30;
    final int f9600ai = 40;
    final int f9601aj = 45;
    final int f9602ak = 50;
    final int f9603al = 40;
    final int f9604am = 40;
    final int f9605an = 5;
    final int f9606ao = 20;
    int f9608aw = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
    boolean f9609ay = false;
    boolean f9610az = false;
    boolean f9570aA = false;
    private final TextureView.SurfaceTextureListener f9668ci = new TextureView.SurfaceTextureListener() { // from class: guide.tailor.FragmentC2259e.1
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                FragmentC2259e.this.m10809d(i, i2);
            } catch (CameraAccessException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return FragmentC2259e.f9517aB;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            FragmentC2259e.this.m10817e(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    };
    private final CameraDevice.StateCallback f9669cj = new CameraDevice.StateCallback() { // from class: guide.tailor.FragmentC2259e.2
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            FragmentC2259e.this.f9677cr.release();
            cameraDevice.close();
            FragmentC2259e.this.f9660ca = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            FragmentC2259e.this.f9677cr.release();
            cameraDevice.close();
            FragmentC2259e.this.f9660ca = null;
            Activity activity = FragmentC2259e.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            FragmentC2259e.this.f9677cr.release();
            FragmentC2259e.this.f9660ca = cameraDevice;
            FragmentC2259e.this.m10835l();
        }
    };
    private final ImageReader.OnImageAvailableListener f9673cn = new ImageReader.OnImageAvailableListener() { // from class: guide.tailor.FragmentC2259e.3
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Handler handler;
            d dVar;
            if (!FragmentC2259e.this.f9571aC) {
                imageReader.acquireLatestImage().close();
                return;
            }
            FragmentC2259e.access$580(FragmentC2259e.this, 1);
            switch (FragmentC2259e.f9511H) {
                case 0:
                    FragmentC2259e.this.f9645bl = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_0_TEST.jpg");
                    break;
                case 1:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e.this.f9647bn = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_1_FP.jpg");
                        break;
                    } else {
                        FragmentC2259e.this.f9647bn = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_1_FP.jpg");
                        break;
                    }
                case 2:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e.this.f9648bo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_2_SP.jpg");
                        break;
                    } else {
                        FragmentC2259e.this.f9648bo = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_2_SP.jpg");
                        break;
                    }
                case 3:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e = FragmentC2259e.this;
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_3_BG.jpg");
                        fragmentC2259e.f9646bm = file;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e2 = FragmentC2259e.this;
                        File file2 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_3_BG.jpg");
                        fragmentC2259e2.f9646bm = file2;
                        break;
                    }
                case 4:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e3 = FragmentC2259e.this;
                        File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_4_BG.jpg");
                        fragmentC2259e3.f9646bm = file3;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e4 = FragmentC2259e.this;
                        File file22 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_4_BG.jpg");
                        fragmentC2259e4.f9646bm = file22;
                        break;
                    }
                case 5:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e5 = FragmentC2259e.this;
                        File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_5_BG.jpg");
                        fragmentC2259e5.f9646bm = file4;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e6 = FragmentC2259e.this;
                        File file23 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_5_BG.jpg");
                        fragmentC2259e6.f9646bm = file23;
                        break;
                    }
                case 6:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e7 = FragmentC2259e.this;
                        File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_6_BG.jpg");
                        fragmentC2259e7.f9646bm = file5;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e8 = FragmentC2259e.this;
                        File file24 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_6_BG.jpg");
                        fragmentC2259e8.f9646bm = file24;
                        break;
                    }
                case 7:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e9 = FragmentC2259e.this;
                        File file6 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_7_BG.jpg");
                        fragmentC2259e9.f9646bm = file6;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e10 = FragmentC2259e.this;
                        File file25 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_7_BG.jpg");
                        fragmentC2259e10.f9646bm = file25;
                        break;
                    }
                case 8:
                    if (!FragmentC2259e.f9516a) {
                        FragmentC2259e fragmentC2259e11 = FragmentC2259e.this;
                        File file7 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_8_BG.jpg");
                        fragmentC2259e11.f9646bm = file7;
                        break;
                    } else {
                        FragmentC2259e fragmentC2259e12 = FragmentC2259e.this;
                        File file26 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_8_BG.jpg");
                        fragmentC2259e12.f9646bm = file26;
                        break;
                    }
            }
            try {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (FragmentC2259e.f9511H > 2) {
                    Uri fromFile = Uri.fromFile(FragmentC2259e.this.f9646bm);
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile);
                    intent.setData(fromFile);
                    FragmentC2259e.this.getActivity().sendBroadcast(intent);
                    handler = FragmentC2259e.this.f9671cl;
                    dVar = new d(acquireNextImage, Integer.valueOf(FragmentC2259e.f9511H), FragmentC2259e.this.f9646bm);
                } else if (FragmentC2259e.f9511H == 0) {
                    Uri fromFile2 = Uri.fromFile(FragmentC2259e.this.f9645bl);
                    Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile2);
                    intent2.setData(fromFile2);
                    FragmentC2259e.this.getActivity().sendBroadcast(intent2);
                    handler = FragmentC2259e.this.f9671cl;
                    dVar = new d(acquireNextImage, Integer.valueOf(FragmentC2259e.f9511H), FragmentC2259e.this.f9645bl);
                } else if (FragmentC2259e.f9511H == 1) {
                    Uri fromFile3 = Uri.fromFile(FragmentC2259e.this.f9647bn);
                    Intent intent3 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile3);
                    intent3.setData(fromFile3);
                    FragmentC2259e.this.getActivity().sendBroadcast(intent3);
                    handler = FragmentC2259e.this.f9671cl;
                    dVar = new d(acquireNextImage, Integer.valueOf(FragmentC2259e.f9511H), FragmentC2259e.this.f9647bn);
                } else {
                    Uri fromFile4 = Uri.fromFile(FragmentC2259e.this.f9648bo);
                    Intent intent4 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile4);
                    intent4.setData(fromFile4);
                    FragmentC2259e.this.getActivity().sendBroadcast(intent4);
                    handler = FragmentC2259e.this.f9671cl;
                    dVar = new d(acquireNextImage, Integer.valueOf(FragmentC2259e.f9511H), FragmentC2259e.this.f9648bo);
                }
                handler.post(dVar);
                FragmentC2259e.this.m10725A();
            } catch (Exception e) {
            }
        }
    };
    private int f9676cq = 0;
    private Semaphore f9677cr = new Semaphore(1);
    private CameraCaptureSession.CaptureCallback f9679ct = new CameraCaptureSession.CaptureCallback() { // from class: guide.tailor.FragmentC2259e.4
        /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0289  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m10871a(CaptureResult a0, boolean b2) {
            Handler a2 = null;
            Object a3 = null;
            int i;
            boolean b3 = false;
            Integer a9;
            Integer a10;
            boolean b1;
            Object a12;
            String s;
            boolean b0 = false;
            Face[] a1 = FragmentC2259e.this.f9657bx ? (Face[]) a0.get(CaptureResult.STATISTICS_FACES) : null;
            if (a1 == null) {
                a2 = FragmentC2259e.this.f9650bq.getHandler();
                a3 = new Runnable() { // from class: guide.tailor.FragmentC2259e.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean b4 = FragmentC2259e.this.f9561P;
                        FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), b4, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                    }
                };
            } else {
                if (a1.length > 0) {
                    FragmentC2259e.this.f9658by = FragmentC2259e.f9517aB;
                    final Face a4 = a1[0];
                    FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.4.3
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean b4 = FragmentC2259e.this.f9561P;
                            FragmentC2259e.this.f9650bq.m10962a(a4.getBounds().left, a4.getBounds().right, a4.getBounds().bottom, a4.getBounds().top, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), b4, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                        }
                    });
                } else {
                    FragmentC2259e.this.f9658by = false;
                    a2 = FragmentC2259e.this.f9650bq.getHandler();
                    a3 = new Runnable() { // from class: guide.tailor.FragmentC2259e.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean b4 = FragmentC2259e.this.f9561P;
                            FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), b4, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                        }
                    };
                }
                i = FragmentC2259e.this.f9676cq;
                if (i == 4) {
                    switch (i) {
                        case 0:
                            if (FragmentC2259e.this.f9618bH) {
                                b3 = FragmentC2259e.f9520ac;
                                if (b3 || FragmentC2259e.f9519ab == 1) {
                                    try {
                                        FragmentC2259e.this.f9615bE = (Long) a0.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                                        FragmentC2259e.this.f9617bG = (Integer) a0.get(CaptureResult.SENSOR_SENSITIVITY);
                                        FragmentC2259e.this.f9619bI = (RggbChannelVector) a0.get(CaptureResult.COLOR_CORRECTION_GAINS);
                                        FragmentC2259e.this.f9620bJ = (ColorSpaceTransform) a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM);
                                        FragmentC2259e.this.f9616bF = (Long) a0.get(CaptureResult.SENSOR_FRAME_DURATION);
                                        if (FragmentC2259e.this.f9617bG != null) {
                                            FragmentC2259e.this.f9618bH = FragmentC2259e.f9517aB;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static ExposureTime set: " + FragmentC2259e.this.f9615bE + " and ISO: " + FragmentC2259e.this.f9617bG + "\n";
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static frame duration set: " + FragmentC2259e.this.f9616bF + "\n";
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static color gains set: " + FragmentC2259e.this.f9619bI.toString() + "\n";
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static color transform set: " + FragmentC2259e.this.f9620bJ.toString() + "\n";
                                        }
                                    } catch (NullPointerException e) {
                                        return;
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            a9 = (Integer) a0.get(CaptureResult.CONTROL_AF_STATE);
                            FragmentC2259e.this.f9622bL++;
                            a10 = FragmentC2259e.this.f9617bG;
                            if (a10 != null && FragmentC2259e.this.f9615bE != null && FragmentC2259e.this.f9619bI != null) {
                                b1 = FragmentC2259e.f9520ac;
                                if (!b1 || FragmentC2259e.f9519ab == 1) {
                                    FragmentC2259e.this.f9621bK = 10;
                                    CaptureResult.Key a11 = CaptureResult.COLOR_CORRECTION_GAINS;
                                    try {
                                        a12 = a0.get(a11);
                                        try {
                                            if (a12 == null && ((Integer) a0.get(CaptureResult.SENSOR_SENSITIVITY)).equals(FragmentC2259e.this.f9617bG) && ((RggbChannelVector) a0.get(CaptureResult.COLOR_CORRECTION_GAINS)).equals(FragmentC2259e.this.f9619bI)) {
                                                FragmentC2259e.this.f9622bL = FragmentC2259e.this.f9621bK;
                                                String s2 = FragmentC2259e.f9541l + System.currentTimeMillis() + ":STATE_WAITING_LOCK - Continue to film - static params are equal to set values\n";
                                                s = s2;
                                            } else {
                                                a0.get(CaptureResult.COLOR_CORRECTION_GAINS);
                                                StringBuilder a14 = new StringBuilder();
                                                a14.append(FragmentC2259e.f9541l);
                                                a14.append(System.currentTimeMillis());
                                                a14.append(":STATE_WAITING_LOCK - - ExposureTime: ");
                                                a14.append(a0.get(CaptureResult.SENSOR_EXPOSURE_TIME));
                                                a14.append(" ISO: ");
                                                a14.append(a0.get(CaptureResult.SENSOR_SENSITIVITY));
                                                a14.append("\n");
                                                s = a14.toString();
                                            }
                                            FragmentC2259e.f9541l = s;
                                        } catch (Exception e2) {
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Exception on State waiting lock - check manual parameters\n";
                                        }
                                        break;
                                    } catch (Exception e3) {
                                    }
                                }
                            }
                            if (FragmentC2259e.this.f9622bL < FragmentC2259e.this.f9621bK) {
                                FragmentC2259e.this.f9622bL = 0;
                                if (a9 != null && a9.intValue() != 0 && 4 != a9.intValue()) {
                                    a9.intValue();
                                }
                                FragmentC2259e.this.f9676cq = 4;
                                FragmentC2259e.this.m10863z();
                                break;
                            }
                            break;
                    }
                    return;
                }
                b0 = FragmentC2259e.f9520ac;
                if (b0 || FragmentC2259e.f9519ab == 1) {
                    try {
                        FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: Etime: " + a0.get(CaptureResult.SENSOR_EXPOSURE_TIME) + " ISO: " + a0.get(CaptureResult.SENSOR_SENSITIVITY) + "\n";
                        if (a0.get(CaptureResult.COLOR_CORRECTION_GAINS) != null) {
                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: ColorCorrectionGains: " + ((RggbChannelVector) a0.get(CaptureResult.COLOR_CORRECTION_GAINS)).toString() + "\n";
                        }
                        if (a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM) != null) {
                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: ColorCorrectionTransform: " + ((ColorSpaceTransform) a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM)).toString() + "\n";
                        }
                        if (a0.get(CaptureResult.SENSOR_FRAME_DURATION) == null) {
                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: FrameDuration: " + a0.get(CaptureResult.SENSOR_FRAME_DURATION) + "\n";
                        }
                    } catch (Exception e4) {
                        FragmentC2259e.f9541l += System.currentTimeMillis() + ":STATE_PICTURE_TAKEN: Camera does not not support some of the manual settings\n";
                        return;
                    }
                }
                return;
            }
            a2.post((Runnable) a3);
            i = FragmentC2259e.this.f9676cq;
            if (i == 4) {
                switch (i) {
                    case 0:
                        if (FragmentC2259e.this.f9618bH) {
                            b3 = FragmentC2259e.f9520ac;
                            if (b3) {
                            }
                            FragmentC2259e.this.f9615bE = (Long) a0.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                            FragmentC2259e.this.f9617bG = (Integer) a0.get(CaptureResult.SENSOR_SENSITIVITY);
                            FragmentC2259e.this.f9619bI = (RggbChannelVector) a0.get(CaptureResult.COLOR_CORRECTION_GAINS);
                            FragmentC2259e.this.f9620bJ = (ColorSpaceTransform) a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM);
                            FragmentC2259e.this.f9616bF = (Long) a0.get(CaptureResult.SENSOR_FRAME_DURATION);
                            if (FragmentC2259e.this.f9617bG != null) {
                                FragmentC2259e.this.f9618bH = FragmentC2259e.f9517aB;
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static ExposureTime set: " + FragmentC2259e.this.f9615bE + " and ISO: " + FragmentC2259e.this.f9617bG + "\n";
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static frame duration set: " + FragmentC2259e.this.f9616bF + "\n";
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static color gains set: " + FragmentC2259e.this.f9619bI.toString() + "\n";
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Static color transform set: " + FragmentC2259e.this.f9620bJ.toString() + "\n";
                            }
                            break;
                        }
                        break;
                    case 1:
                        a9 = (Integer) a0.get(CaptureResult.CONTROL_AF_STATE);
                        FragmentC2259e.this.f9622bL++;
                        a10 = FragmentC2259e.this.f9617bG;
                        if (a10 != null) {
                            b1 = FragmentC2259e.f9520ac;
                            if (!b1) {
                                FragmentC2259e.this.f9621bK = 10;
                                CaptureResult.Key a13 = CaptureResult.COLOR_CORRECTION_GAINS;
                                a12 = a0.get(a13);
                                if (a12 == null) {
                                    FragmentC2259e.this.f9622bL = FragmentC2259e.this.f9621bK;
                                    String s3 = FragmentC2259e.f9541l + System.currentTimeMillis() + ":STATE_WAITING_LOCK - Continue to film - static params are equal to set values\n";
                                    s = s3;
                                    FragmentC2259e.f9541l = s;
                                    break;
                                }
                                a0.get(CaptureResult.COLOR_CORRECTION_GAINS);
                                StringBuilder a15 = new StringBuilder();
                                a15.append(FragmentC2259e.f9541l);
                                a15.append(System.currentTimeMillis());
                                a15.append(":STATE_WAITING_LOCK - - ExposureTime: ");
                                a15.append(a0.get(CaptureResult.SENSOR_EXPOSURE_TIME));
                                a15.append(" ISO: ");
                                a15.append(a0.get(CaptureResult.SENSOR_SENSITIVITY));
                                a15.append("\n");
                                s = a15.toString();
                                FragmentC2259e.f9541l = s;
                            } else {
                                FragmentC2259e.this.f9621bK = 10;
                                CaptureResult.Key a16 = CaptureResult.COLOR_CORRECTION_GAINS;
                                a12 = a0.get(a16);
                                if (a12 == null) {
                                    FragmentC2259e.this.f9622bL = FragmentC2259e.this.f9621bK;
                                    String s4 = FragmentC2259e.f9541l + System.currentTimeMillis() + ":STATE_WAITING_LOCK - Continue to film - static params are equal to set values\n";
                                    s = s4;
                                    FragmentC2259e.f9541l = s;
                                    break;
                                }
                                a0.get(CaptureResult.COLOR_CORRECTION_GAINS);
                                StringBuilder a17 = new StringBuilder();
                                a17.append(FragmentC2259e.f9541l);
                                a17.append(System.currentTimeMillis());
                                a17.append(":STATE_WAITING_LOCK - - ExposureTime: ");
                                a17.append(a0.get(CaptureResult.SENSOR_EXPOSURE_TIME));
                                a17.append(" ISO: ");
                                a17.append(a0.get(CaptureResult.SENSOR_SENSITIVITY));
                                a17.append("\n");
                                s = a17.toString();
                                FragmentC2259e.f9541l = s;
                            }
                        }
                        if (FragmentC2259e.this.f9622bL < FragmentC2259e.this.f9621bK) {
                            FragmentC2259e.this.f9622bL = 0;
                            if (a9 != null) {
                                a9.intValue();
                            }
                            FragmentC2259e.this.f9676cq = 4;
                            FragmentC2259e.this.m10863z();
                            break;
                        }
                        break;
                }
                return;
            }
            b0 = FragmentC2259e.f9520ac;
            if (b0) {
                return;
            }
            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: Etime: " + a0.get(CaptureResult.SENSOR_EXPOSURE_TIME) + " ISO: " + a0.get(CaptureResult.SENSOR_SENSITIVITY) + "\n";
            if (a0.get(CaptureResult.COLOR_CORRECTION_GAINS) != null) {
                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: ColorCorrectionGains: " + ((RggbChannelVector) a0.get(CaptureResult.COLOR_CORRECTION_GAINS)).toString() + "\n";
            }
            if (a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM) != null) {
                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: ColorCorrectionTransform: " + ((ColorSpaceTransform) a0.get(CaptureResult.COLOR_CORRECTION_TRANSFORM)).toString() + "\n";
            }
            if (a0.get(CaptureResult.SENSOR_FRAME_DURATION) == null) {
                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Picture taken with: FrameDuration: " + a0.get(CaptureResult.SENSOR_FRAME_DURATION) + "\n";
            }
        }
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            if (FragmentC2259e.f9540k) {
                return;
            }
            m10871a(totalCaptureResult, false);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }
    };
    private Runnable f9680cu = new Runnable() { // from class: guide.tailor.FragmentC2259e.5
        @Override // java.lang.Runnable
        public void run() {
            if (FragmentC2259e.f9538i == 0) {
                WebStart.m10620d("measurement_success");
                FragmentC2259e.this.f9665cf.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.f9529bV.setTitle(FragmentC2259e.f9531bX);
                        FragmentC2259e.this.f9630bT.setVisibility(4);
                        FragmentC2259e.this.f9665cf.setEnabled(FragmentC2259e.f9517aB);
                    }
                });
            } else if (FragmentC2259e.f9538i == 1) {
                FragmentC2259e.this.f9671cl.postDelayed(this, 200L);
            } else {
                FragmentC2259e.this.getActivity().finish();
            }
        }
    };
    private Runnable f9681cv = new Runnable() { // from class: guide.tailor.FragmentC2259e.6
        /* JADX WARN: Code restructure failed: missing block: B:270:0x02b4, code lost:
        
            if (r41.this$0.f9581aM < (r41.this$0.f9584aP + 350)) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0b1e  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            int i14;
            int i16 = 0;
            int i18 = 0;
            StringBuilder a10;
            String s;
            boolean b1;
            Handler a4 = null;
            Object a5 = null;
            double d2 = 0.0d;
            double d0 = 0.0d;
            int i19;
            int i15 = 0;
            boolean b2;
            int i17 = 0;
            int i110;
            int i20;
            boolean b3 = false;
            Handler a23;
            Object a24;
            Handler a2 = null;
            Object a3 = null;
            boolean b4 = false;
            int i = FragmentC2259e.f9538i;
            Boolean boolValueOf = Boolean.valueOf(FragmentC2259e.f9517aB);
            if (i > 1) {
                FragmentC2259e.this.f9550B = false;
                FragmentC2259e.this.f9549A = 0;
                FragmentC2259e.this.f9555G = 0;
                FragmentC2259e.f9511H = 0;
                FragmentC2259e.this.f9686x = 0;
                FragmentC2259e.this.f9658by = false;
                FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9650bq.m10959a(0.0d);
                    }
                });
                FragmentC2259e.this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.2
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9654bu.setVisibility(8);
                    }
                });
                FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.3
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9666cg.setVisibility(8);
                    }
                });
                FragmentC2259e.this.f9629bS.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.4
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.turn_animation);
                        FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                        FragmentC2259e.this.m10828i();
                        FragmentC2259e.this.f9629bS.setVisibility(8);
                    }
                });
                FragmentC2259e.this.f9627bQ.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.5
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.m10869b(false);
                    }
                });
                FragmentC2259e.this.f9551C = FragmentC2259e.f9517aB;
                FragmentC2259e.this.f9561P = false;
                FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.6
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), false, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                    }
                });
                final int i2 = FragmentC2259e.this.f9581aM;
                FragmentC2259e.this.f9628bR.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.7
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9628bR.setProgress(600 - i2);
                    }
                });
                FragmentC2259e.this.f9653bt.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.8
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Angle_full_reset));
                    }
                });
                FragmentC2259e.this.f9652bs.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.9
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9652bs.setVisibility(0);
                    }
                });
                if (!FragmentC2259e.f9528b) {
                    FragmentC2259e.this.m10771a(FragmentC2259e.f9517aB, false);
                } else {
                    FragmentC2259e.this.m10866a(false);
                }
                FragmentC2259e.this.m10793b(FragmentC2259e.this.f9643bj);
                FragmentC2259e.f9538i = 0;
                FragmentC2259e.this.m10859x();
            }
            int i3 = FragmentC2259e.f9538i;
            Handler a0 = null;
            Object a1 = null;
            if (i3 == 0) {
                int i1 = FragmentC2259e.this.f9686x;
                if (i1 >= 350 || FragmentC2259e.this.f9551C || WebStart.f9402w.equals("fi_FI") || FragmentC2259e.this.f9550B) {
                    int i4 = FragmentC2259e.this.f9686x;
                    if ((i4 >= 550 || FragmentC2259e.this.f9551C || FragmentC2259e.this.f9550B) && (FragmentC2259e.this.f9686x >= 500 || FragmentC2259e.this.f9550B || (!FragmentC2259e.this.f9551C && FragmentC2259e.this.f9585aQ))) {
                        if (!FragmentC2259e.f9537h.booleanValue() && !FragmentC2259e.f9539j) {
                            int[] a8 = FragmentC2259e.this.m10857w();
                            FragmentC2259e.this.f9581aM = a8[0];
                            FragmentC2259e.this.f9582aN = a8[1];
                            FragmentC2259e.this.f9687y[FragmentC2259e.this.f9552D] = FragmentC2259e.this.f9581aM;
                            FragmentC2259e.this.f9552D = (FragmentC2259e.this.f9552D + 1) % 30;
                            int i10 = 0;
                            for (int i5 = 30; i10 < i5; i5 = 30) {
                                FragmentC2259e.this.f9688z[i10] = FragmentC2259e.this.f9687y[i10];
                                i10++;
                            }
                            Arrays.sort(FragmentC2259e.this.f9688z);
                            FragmentC2259e.this.f9581aM = 0;
                            int i11 = 5;
                            while (i11 < 25) {
                                FragmentC2259e.this.f9581aM += FragmentC2259e.this.f9688z[i11];
                                i11++;
                                b4 = b4;
                            }
                            FragmentC2259e.this.f9581aM = (int) (((double) FragmentC2259e.this.f9581aM) * 0.05d);
                            if (FragmentC2259e.this.f9549A != 0 && FragmentC2259e.f9511H < 7 && (FragmentC2259e.this.f9581aM - FragmentC2259e.this.f9549A) * (FragmentC2259e.this.f9581aM - FragmentC2259e.this.f9549A) > 10) {
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Angle has changed " + (((double) (FragmentC2259e.this.f9581aM - FragmentC2259e.this.f9549A)) * 0.1d) + " degrees. Filming restarted.\n";
                                FragmentC2259e.this.f9581aM = 0;
                                FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.14
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9650bq.m10959a(0.0d);
                                    }
                                });
                            }
                            int i12 = FragmentC2259e.this.f9581aM;
                            int i13 = FragmentC2259e.this.f9584aP + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                            if (i12 <= i13) {
                                i14 = 0;
                            } else {
                                i14 = 0;
                                if (FragmentC2259e.this.f9581aM < FragmentC2259e.this.f9584aP + 350) {
                                    FragmentC2259e.this.f9553E = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
                                    i18 = FragmentC2259e.f9511H;
                                    if (i18 != 0) {
                                        FragmentC2259e fragmentC2259e = FragmentC2259e.this;
                                        FragmentC2259e.this.f9555G++;
                                        switch (FragmentC2259e.this.f9555G) {
                                            case 1:
                                                if (!FragmentC2259e.f9528b) {
                                                    a10 = new StringBuilder();
                                                    a10.append(FragmentC2259e.f9541l);
                                                    a10.append(System.currentTimeMillis());
                                                    s = ":Trigger takepicture TEST_CAMERA\n";
                                                    a10.append(s);
                                                    FragmentC2259e.f9541l = a10.toString();
                                                    FragmentC2259e.this.m10861y();
                                                }
                                                break;
                                            case 2:
                                                if (FragmentC2259e.f9528b && FragmentC2259e.f9514Y == FragmentC2259e.f9518aa[1] && FragmentC2259e.f9514Y != 0) {
                                                    FragmentC2259e.f9541l += System.currentTimeMillis() + ":VERIFY_CAMERA AE_COMPENSATION is maxed, change to camera 2 API\n";
                                                    FragmentC2259e.this.m10843p();
                                                }
                                                break;
                                            case 5:
                                                FragmentC2259e fragmentC2259e2 = FragmentC2259e.this;
                                                i16 = FragmentC2259e.this.f9639bf;
                                                FragmentC2259e.this.m10793b(i16);
                                                break;
                                            case 7:
                                                if (!FragmentC2259e.f9532c) {
                                                    FragmentC2259e.this.getActivity().runOnUiThread(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.29
                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            FragmentC2259e.this.getView().findViewById(R.id.cameraApiPreview).setVisibility(8);
                                                        }
                                                    });
                                                }
                                                break;
                                            case 30:
                                                b1 = FragmentC2259e.f9528b;
                                                if (b1) {
                                                    Handler a6 = FragmentC2259e.this.f9650bq.getHandler();
                                                    Object a7 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.28
                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            boolean z = FragmentC2259e.this.f9561P;
                                                            FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), false, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                                                        }
                                                    };
                                                    a4 = a6;
                                                    a5 = a7;
                                                    a4.post((Runnable) a5);
                                                } else {
                                                    FragmentC2259e.this.m10771a(FragmentC2259e.f9517aB, FragmentC2259e.f9517aB);
                                                }
                                                break;
                                            case 40:
                                                FragmentC2259e a12 = FragmentC2259e.this;
                                                a12.f9618bH = false;
                                                break;
                                            case 45:
                                                if (FragmentC2259e.f9528b) {
                                                    FragmentC2259e.this.m10771a(false, false);
                                                } else {
                                                    FragmentC2259e.this.m10866a(FragmentC2259e.f9517aB);
                                                }
                                                break;
                                            case 50:
                                                a10 = new StringBuilder();
                                                a10.append(FragmentC2259e.f9541l);
                                                a10.append(System.currentTimeMillis());
                                                s = ":Trigger takepicture test image\n";
                                                a10.append(s);
                                                FragmentC2259e.f9541l = a10.toString();
                                                FragmentC2259e.this.m10861y();
                                                break;
                                            case 56:
                                                FragmentC2259e a13 = FragmentC2259e.this;
                                                a13.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.27
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setVisibility(0);
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                    }
                                                };
                                                a4.post((Runnable) a5);
                                                break;
                                            case 64:
                                                FragmentC2259e a14 = FragmentC2259e.this;
                                                a14.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.26
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                    }
                                                };
                                                a4.post((Runnable) a5);
                                                break;
                                            case 72:
                                                FragmentC2259e a15 = FragmentC2259e.this;
                                                a15.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.25
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                    }
                                                };
                                                a4.post((Runnable) a5);
                                                break;
                                            case 80:
                                                FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.24
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                    }
                                                });
                                                FragmentC2259e.f9537h = boolValueOf;
                                                FragmentC2259e.this.f9549A = FragmentC2259e.this.f9581aM;
                                                FragmentC2259e.this.f9583aO = Math.toRadians(((double) (FragmentC2259e.this.f9581aM - 100)) * 0.1d);
                                                if (FragmentC2259e.f9543n > FragmentC2259e.f9544o) {
                                                    d2 = FragmentC2259e.this.f9583aO;
                                                    d0 = FragmentC2259e.f9543n;
                                                } else {
                                                    d2 = FragmentC2259e.this.f9583aO;
                                                    d0 = FragmentC2259e.f9544o;
                                                }
                                                C2262h.m10906a(d2, d0, Build.MODEL, FragmentC2259e.f9523ar, FragmentC2259e.f9521ap, FragmentC2259e.f9522aq);
                                                WebStart.f9385J = FragmentC2259e.f9528b;
                                                FragmentC2259e.f9511H++;
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Angle is " + FragmentC2259e.this.f9583aO + "\n";
                                                a10 = new StringBuilder();
                                                a10.append(FragmentC2259e.f9541l);
                                                a10.append(System.currentTimeMillis());
                                                s = ":Trigger Person front picture\n";
                                                a10.append(s);
                                                FragmentC2259e.f9541l = a10.toString();
                                                FragmentC2259e.this.m10861y();
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    i19 = FragmentC2259e.f9511H;
                                    if (i19 != 1) {
                                        FragmentC2259e a16 = FragmentC2259e.this;
                                        a16.f9555G++;
                                        i15 = FragmentC2259e.this.f9555G;
                                        if (i15 != 5) {
                                            FragmentC2259e fragmentC2259e3 = FragmentC2259e.this;
                                            i16 = FragmentC2259e.this.f9640bg;
                                            FragmentC2259e.this.m10793b(i16);
                                        } else {
                                            if (i15 == 30) {
                                                a4 = FragmentC2259e.this.f9629bS.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.36
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        if (FragmentC2259e.this.f9550B) {
                                                            FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.away_animation);
                                                            FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                                                            FragmentC2259e.this.m10828i();
                                                        }
                                                    }
                                                };
                                            } else if (i15 == 46) {
                                                FragmentC2259e.this.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.37
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setVisibility(0);
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                    }
                                                };
                                            } else if (i15 == 54) {
                                                FragmentC2259e.this.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.38
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                    }
                                                };
                                            } else if (i15 == 62) {
                                                FragmentC2259e.this.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.39
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                    }
                                                };
                                            } else if (i15 != 70) {
                                                FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.30
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                    }
                                                });
                                                FragmentC2259e.f9537h = boolValueOf;
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger Person side picture\n";
                                                FragmentC2259e.f9511H++;
                                                FragmentC2259e.this.m10861y();
                                            }
                                            a4.post((Runnable) a5);
                                        }
                                    } else if (FragmentC2259e.f9511H != 2) {
                                        b2 = FragmentC2259e.this.f9658by;
                                        if (b2 && FragmentC2259e.this.f9555G < 40 && FragmentC2259e.this.f9555G > 5) {
                                            FragmentC2259e.this.f9658by = false;
                                        } else {
                                            FragmentC2259e a17 = FragmentC2259e.this;
                                            a17.f9555G++;
                                        }
                                        i17 = FragmentC2259e.this.f9555G;
                                        if (i17 != 5) {
                                            FragmentC2259e fragmentC2259e4 = FragmentC2259e.this;
                                            i16 = FragmentC2259e.this.f9641bh;
                                            FragmentC2259e.this.m10793b(i16);
                                        } else {
                                            if (i17 == 46) {
                                                FragmentC2259e.this.m10851t();
                                                FragmentC2259e.this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.32
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9654bu.setVisibility(8);
                                                    }
                                                });
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.33
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setVisibility(0);
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                    }
                                                };
                                            } else if (i17 == 54) {
                                                FragmentC2259e.this.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.34
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                    }
                                                };
                                            } else if (i17 == 62) {
                                                FragmentC2259e.this.m10851t();
                                                a4 = FragmentC2259e.this.f9666cg.getHandler();
                                                a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.35
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                    }
                                                };
                                            } else if (i17 == 70) {
                                                FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.31
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                    }
                                                });
                                                FragmentC2259e.f9537h = boolValueOf;
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger bg 0 picture\n";
                                                FragmentC2259e.f9511H++;
                                                FragmentC2259e.this.m10851t();
                                                FragmentC2259e.this.m10861y();
                                            }
                                            a4.post((Runnable) a5);
                                        }
                                    } else {
                                        i110 = FragmentC2259e.f9511H;
                                        if (i110 >= 7) {
                                            if (FragmentC2259e.this.f9658by) {
                                                FragmentC2259e.this.f9658by = false;
                                                FragmentC2259e.this.f9555G = 0;
                                                FragmentC2259e.f9511H = 2;
                                            } else {
                                                FragmentC2259e a18 = FragmentC2259e.this;
                                                a18.f9555G++;
                                                FragmentC2259e.f9537h = boolValueOf;
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger bg picture\n";
                                                FragmentC2259e.this.m10851t();
                                                FragmentC2259e.f9511H++;
                                                FragmentC2259e.this.m10861y();
                                            }
                                        } else {
                                            i20 = FragmentC2259e.f9511H;
                                            if (i20 != 7) {
                                                FragmentC2259e a21 = FragmentC2259e.this;
                                                a21.f9555G++;
                                                FragmentC2259e.f9537h = boolValueOf;
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger last bg picture\n";
                                                FragmentC2259e.f9511H++;
                                                FragmentC2259e.this.m10861y();
                                                FragmentC2259e.this.f9663cd.m10974a(FragmentC2259e.this.f9662cc, 12);
                                            } else if (FragmentC2259e.f9511H != 8) {
                                                FragmentC2259e.this.m10853u();
                                                WebStart.m10620d("measurement_success");
                                                FragmentC2259e.this.f9665cf.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.46
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.f9529bV.setTitle(FragmentC2259e.f9531bX);
                                                        FragmentC2259e.this.f9630bT.setVisibility(4);
                                                        FragmentC2259e.this.f9665cf.setEnabled(FragmentC2259e.f9517aB);
                                                    }
                                                });
                                                b3 = FragmentC2259e.f9517aB;
                                            }
                                        }
                                    }
                                }
                            }
                            if (FragmentC2259e.f9511H < 7) {
                                FragmentC2259e.this.f9550B = false;
                                FragmentC2259e.this.f9549A = 0;
                                FragmentC2259e.this.f9555G = 0;
                                FragmentC2259e.f9511H = 0;
                                FragmentC2259e.this.f9686x = 0;
                                FragmentC2259e.this.f9658by = false;
                                FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.15
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9650bq.m10959a(0.0d);
                                    }
                                });
                                FragmentC2259e.this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.16
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9654bu.setVisibility(8);
                                    }
                                });
                                FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.17
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9666cg.setVisibility(8);
                                    }
                                });
                                FragmentC2259e.this.f9629bS.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.18
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.turn_animation);
                                        FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                                        FragmentC2259e.this.m10828i();
                                        FragmentC2259e.this.f9629bS.setVisibility(8);
                                    }
                                });
                                FragmentC2259e.this.f9627bQ.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.19
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.m10869b(false);
                                    }
                                });
                                FragmentC2259e.this.f9551C = FragmentC2259e.f9517aB;
                                FragmentC2259e.this.f9561P = false;
                                FragmentC2259e.this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.20
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), false, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                                    }
                                });
                                final int i111 = FragmentC2259e.this.f9581aM;
                                FragmentC2259e.this.f9628bR.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.21
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9628bR.setProgress(600 - i111);
                                    }
                                });
                                FragmentC2259e.this.f9653bt.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.22
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Angle_full_reset));
                                    }
                                });
                                FragmentC2259e.this.f9652bs.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.23
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentC2259e.this.f9652bs.setVisibility(0);
                                    }
                                });
                                if (!FragmentC2259e.f9528b) {
                                    FragmentC2259e.this.m10771a(FragmentC2259e.f9517aB, false);
                                } else {
                                    FragmentC2259e.this.m10866a(false);
                                }
                                FragmentC2259e fragmentC2259e5 = FragmentC2259e.this;
                                i16 = FragmentC2259e.this.f9643bj;
                            } else {
                                FragmentC2259e.this.f9553E = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
                                i18 = FragmentC2259e.f9511H;
                                if (i18 != 0) {
                                    FragmentC2259e fragmentC2259e6 = FragmentC2259e.this;
                                    FragmentC2259e.this.f9555G++;
                                    switch (FragmentC2259e.this.f9555G) {
                                        case 1:
                                            if (!FragmentC2259e.f9528b) {
                                                a10 = new StringBuilder();
                                                a10.append(FragmentC2259e.f9541l);
                                                a10.append(System.currentTimeMillis());
                                                s = ":Trigger takepicture TEST_CAMERA\n";
                                                a10.append(s);
                                                FragmentC2259e.f9541l = a10.toString();
                                                FragmentC2259e.this.m10861y();
                                            }
                                            break;
                                        case 2:
                                            if (FragmentC2259e.f9528b) {
                                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":VERIFY_CAMERA AE_COMPENSATION is maxed, change to camera 2 API\n";
                                                FragmentC2259e.this.m10843p();
                                            }
                                            break;
                                        case 5:
                                            FragmentC2259e fragmentC2259e7 = FragmentC2259e.this;
                                            i16 = FragmentC2259e.this.f9639bf;
                                            break;
                                        case 7:
                                            if (!FragmentC2259e.f9532c) {
                                                FragmentC2259e.this.getActivity().runOnUiThread(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.29
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        FragmentC2259e.this.getView().findViewById(R.id.cameraApiPreview).setVisibility(8);
                                                    }
                                                });
                                            }
                                            break;
                                        case 30:
                                            b1 = FragmentC2259e.f9528b;
                                            if (b1) {
                                                Handler a9 = FragmentC2259e.this.f9650bq.getHandler();
                                                Object a11 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.28
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        boolean z = FragmentC2259e.this.f9561P;
                                                        FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), false, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                                                    }
                                                };
                                                a4 = a9;
                                                a5 = a11;
                                                a4.post((Runnable) a5);
                                            } else {
                                                FragmentC2259e.this.m10771a(FragmentC2259e.f9517aB, FragmentC2259e.f9517aB);
                                            }
                                            break;
                                        case 40:
                                            FragmentC2259e a19 = FragmentC2259e.this;
                                            a19.f9618bH = false;
                                            break;
                                        case 45:
                                            if (FragmentC2259e.f9528b) {
                                                FragmentC2259e.this.m10771a(false, false);
                                            } else {
                                                FragmentC2259e.this.m10866a(FragmentC2259e.f9517aB);
                                            }
                                            break;
                                        case 50:
                                            a10 = new StringBuilder();
                                            a10.append(FragmentC2259e.f9541l);
                                            a10.append(System.currentTimeMillis());
                                            s = ":Trigger takepicture test image\n";
                                            a10.append(s);
                                            FragmentC2259e.f9541l = a10.toString();
                                            FragmentC2259e.this.m10861y();
                                            break;
                                        case 56:
                                            FragmentC2259e a110 = FragmentC2259e.this;
                                            a110.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.27
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setVisibility(0);
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                }
                                            };
                                            a4.post((Runnable) a5);
                                            break;
                                        case 64:
                                            FragmentC2259e a111 = FragmentC2259e.this;
                                            a111.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.26
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                }
                                            };
                                            a4.post((Runnable) a5);
                                            break;
                                        case 72:
                                            FragmentC2259e a112 = FragmentC2259e.this;
                                            a112.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.25
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                }
                                            };
                                            a4.post((Runnable) a5);
                                            break;
                                        case 80:
                                            FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.24
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                }
                                            });
                                            FragmentC2259e.f9537h = boolValueOf;
                                            FragmentC2259e.this.f9549A = FragmentC2259e.this.f9581aM;
                                            FragmentC2259e.this.f9583aO = Math.toRadians(((double) (FragmentC2259e.this.f9581aM - 100)) * 0.1d);
                                            if (FragmentC2259e.f9543n > FragmentC2259e.f9544o) {
                                                d2 = FragmentC2259e.this.f9583aO;
                                                d0 = FragmentC2259e.f9543n;
                                            } else {
                                                d2 = FragmentC2259e.this.f9583aO;
                                                d0 = FragmentC2259e.f9544o;
                                            }
                                            C2262h.m10906a(d2, d0, Build.MODEL, FragmentC2259e.f9523ar, FragmentC2259e.f9521ap, FragmentC2259e.f9522aq);
                                            WebStart.f9385J = FragmentC2259e.f9528b;
                                            FragmentC2259e.f9511H++;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Angle is " + FragmentC2259e.this.f9583aO + "\n";
                                            a10 = new StringBuilder();
                                            a10.append(FragmentC2259e.f9541l);
                                            a10.append(System.currentTimeMillis());
                                            s = ":Trigger Person front picture\n";
                                            a10.append(s);
                                            FragmentC2259e.f9541l = a10.toString();
                                            FragmentC2259e.this.m10861y();
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                i19 = FragmentC2259e.f9511H;
                                if (i19 != 1) {
                                    FragmentC2259e a113 = FragmentC2259e.this;
                                    a113.f9555G++;
                                    i15 = FragmentC2259e.this.f9555G;
                                    if (i15 != 5) {
                                        FragmentC2259e fragmentC2259e8 = FragmentC2259e.this;
                                        i16 = FragmentC2259e.this.f9640bg;
                                    } else {
                                        if (i15 == 30) {
                                            a4 = FragmentC2259e.this.f9629bS.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.36
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    if (FragmentC2259e.this.f9550B) {
                                                        FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.away_animation);
                                                        FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                                                        FragmentC2259e.this.m10828i();
                                                    }
                                                }
                                            };
                                        } else if (i15 == 46) {
                                            FragmentC2259e.this.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.37
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setVisibility(0);
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                }
                                            };
                                        } else if (i15 == 54) {
                                            FragmentC2259e.this.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.38
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                }
                                            };
                                        } else if (i15 == 62) {
                                            FragmentC2259e.this.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.39
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                }
                                            };
                                        } else if (i15 != 70) {
                                            FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.30
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                }
                                            });
                                            FragmentC2259e.f9537h = boolValueOf;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger Person side picture\n";
                                            FragmentC2259e.f9511H++;
                                            FragmentC2259e.this.m10861y();
                                        }
                                        a4.post((Runnable) a5);
                                    }
                                } else if (FragmentC2259e.f9511H != 2) {
                                    b2 = FragmentC2259e.this.f9658by;
                                    if (b2) {
                                        FragmentC2259e.this.f9658by = false;
                                    } else {
                                        FragmentC2259e a114 = FragmentC2259e.this;
                                        a114.f9555G++;
                                    }
                                    i17 = FragmentC2259e.this.f9555G;
                                    if (i17 != 5) {
                                        FragmentC2259e fragmentC2259e9 = FragmentC2259e.this;
                                        i16 = FragmentC2259e.this.f9641bh;
                                    } else {
                                        if (i17 == 46) {
                                            FragmentC2259e.this.m10851t();
                                            FragmentC2259e.this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.32
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9654bu.setVisibility(8);
                                                }
                                            });
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.33
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setVisibility(0);
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_3);
                                                }
                                            };
                                        } else if (i17 == 54) {
                                            FragmentC2259e.this.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.34
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_2);
                                                }
                                            };
                                        } else if (i17 == 62) {
                                            FragmentC2259e.this.m10851t();
                                            a4 = FragmentC2259e.this.f9666cg.getHandler();
                                            a5 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.35
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_1);
                                                }
                                            };
                                        } else if (i17 == 70) {
                                            FragmentC2259e.this.f9666cg.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.31
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9666cg.setImageResource(R.drawable.countdown_0);
                                                }
                                            });
                                            FragmentC2259e.f9537h = boolValueOf;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger bg 0 picture\n";
                                            FragmentC2259e.f9511H++;
                                            FragmentC2259e.this.m10851t();
                                            FragmentC2259e.this.m10861y();
                                        }
                                        a4.post((Runnable) a5);
                                    }
                                } else {
                                    i110 = FragmentC2259e.f9511H;
                                    if (i110 >= 7) {
                                        if (FragmentC2259e.this.f9658by) {
                                            FragmentC2259e.this.f9658by = false;
                                            FragmentC2259e.this.f9555G = 0;
                                            FragmentC2259e.f9511H = 2;
                                        } else {
                                            FragmentC2259e a115 = FragmentC2259e.this;
                                            a115.f9555G++;
                                            FragmentC2259e.f9537h = boolValueOf;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger bg picture\n";
                                            FragmentC2259e.this.m10851t();
                                            FragmentC2259e.f9511H++;
                                            FragmentC2259e.this.m10861y();
                                        }
                                    } else {
                                        i20 = FragmentC2259e.f9511H;
                                        if (i20 != 7) {
                                            FragmentC2259e a22 = FragmentC2259e.this;
                                            a22.f9555G++;
                                            FragmentC2259e.f9537h = boolValueOf;
                                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Trigger last bg picture\n";
                                            FragmentC2259e.f9511H++;
                                            FragmentC2259e.this.m10861y();
                                            FragmentC2259e.this.f9663cd.m10974a(FragmentC2259e.this.f9662cc, 12);
                                        } else if (FragmentC2259e.f9511H != 8) {
                                            FragmentC2259e.this.m10853u();
                                            WebStart.m10620d("measurement_success");
                                            FragmentC2259e.this.f9665cf.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.46
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.f9529bV.setTitle(FragmentC2259e.f9531bX);
                                                    FragmentC2259e.this.f9630bT.setVisibility(4);
                                                    FragmentC2259e.this.f9665cf.setEnabled(FragmentC2259e.f9517aB);
                                                }
                                            });
                                            b3 = FragmentC2259e.f9517aB;
                                        }
                                    }
                                }
                            }
                            FragmentC2259e.this.m10793b(i16);
                        }
                    }
                    if (!b3) {
                        FragmentC2259e.this.f9671cl.postDelayed(this, FragmentC2259e.this.f9553E);
                    }
                }
                FragmentC2259e.f9511H = 0;
                FragmentC2259e.this.f9555G = 0;
                FragmentC2259e.this.f9553E = 20;
                if (FragmentC2259e.f9512N && FragmentC2259e.f9513O) {
                    FragmentC2259e.f9512N = false;
                    FragmentC2259e.this.m10793b(FragmentC2259e.this.f9642bi);
                }
                FragmentC2259e.this.f9549A = 0;
                int[] a20 = FragmentC2259e.this.m10857w();
                FragmentC2259e.this.f9581aM = a20[0];
                FragmentC2259e.this.f9582aN = a20[1];
                if (FragmentC2259e.this.f9581aM == -90) {
                    FragmentC2259e.this.f9628bR.setProgress(0);
                    FragmentC2259e.this.f9686x = 0;
                } else {
                    if (FragmentC2259e.this.f9687y[0] == 0 && FragmentC2259e.this.f9687y[10] == 0 && FragmentC2259e.this.f9687y[20] == 0) {
                        for (int i6 = 0; i6 < 30; i6++) {
                            FragmentC2259e.this.f9687y[i6] = FragmentC2259e.this.f9581aM;
                        }
                    }
                    FragmentC2259e.this.f9687y[FragmentC2259e.this.f9552D] = FragmentC2259e.this.f9581aM;
                    FragmentC2259e.this.f9552D = (FragmentC2259e.this.f9552D + 1) % 30;
                    for (int i7 = 0; i7 < 30; i7++) {
                        FragmentC2259e.this.f9688z[i7] = FragmentC2259e.this.f9687y[i7];
                    }
                    Arrays.sort(FragmentC2259e.this.f9688z);
                    FragmentC2259e.this.f9581aM = 0;
                    for (int i8 = 5; i8 < 25; i8++) {
                        FragmentC2259e.this.f9581aM += FragmentC2259e.this.f9688z[i8];
                    }
                    FragmentC2259e.this.f9581aM = (int) (((double) FragmentC2259e.this.f9581aM) * 0.05d);
                    int i9 = FragmentC2259e.this.f9581aM - FragmentC2259e.this.f9584aP;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    if (i9 > 600) {
                        i9 = 600;
                    }
                    FragmentC2259e.this.f9628bR.setProgress(i9);
                }
                if (FragmentC2259e.this.f9581aM > FragmentC2259e.this.f9584aP + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION && FragmentC2259e.this.f9581aM < FragmentC2259e.this.f9584aP + 350) {
                    FragmentC2259e fragmentC2259e10 = FragmentC2259e.this;
                    FragmentC2259e.this.f9686x++;
                    int i21 = FragmentC2259e.this.f9686x;
                    if (i21 != 350 || FragmentC2259e.this.f9551C || !FragmentC2259e.this.f9585aQ) {
                        int i22 = FragmentC2259e.this.f9686x;
                        if (i22 == 500) {
                            FragmentC2259e.this.f9550B = FragmentC2259e.f9517aB;
                            FragmentC2259e.this.m10851t();
                            FragmentC2259e.this.f9652bs.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.10
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9652bs.setVisibility(8);
                                }
                            });
                            a2 = FragmentC2259e.this.f9629bS.getHandler();
                            Object a25 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.11
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9629bS.setVisibility(0);
                                    FragmentC2259e.this.f9629bS.setBackground(null);
                                    FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.turn_animation);
                                    FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                                    FragmentC2259e.this.m10828i();
                                }
                            };
                            a3 = a25;
                        } else {
                            int i23 = FragmentC2259e.this.f9686x;
                            if (i23 == 0 || FragmentC2259e.this.f9686x == 50 || FragmentC2259e.this.f9686x == 100 || FragmentC2259e.this.f9686x == 150 || FragmentC2259e.this.f9686x == 200) {
                                boolean b0 = FragmentC2259e.this.f9585aQ;
                                if (b0) {
                                    if (FragmentC2259e.this.f9582aN > -5 && FragmentC2259e.this.f9582aN < 5) {
                                        a4 = FragmentC2259e.this.f9653bt.getHandler();
                                        Object a26 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.13
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Camera2BasicFragment_Angle_toast));
                                            }
                                        };
                                        a5 = a26;
                                    } else {
                                        if (FragmentC2259e.this.f9582aN < -5) {
                                            a0 = FragmentC2259e.this.f9653bt.getHandler();
                                            a1 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.44
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Camera2BasicFragment_Angle_left));
                                                }
                                            };
                                        } else if (FragmentC2259e.this.f9582aN > 5) {
                                            a0 = FragmentC2259e.this.f9653bt.getHandler();
                                            a1 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.45
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Camera2BasicFragment_Angle_right));
                                                }
                                            };
                                        }
                                        if (a0 != null) {
                                            a0.post((Runnable) a1);
                                        }
                                        FragmentC2259e.this.f9686x = -40;
                                    }
                                } else {
                                    a4 = FragmentC2259e.this.f9653bt.getHandler();
                                    Object a27 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.12
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Angle_full_first));
                                        }
                                    };
                                    a5 = a27;
                                }
                                if (a4 != null) {
                                    a4.post((Runnable) a5);
                                }
                            } else if (FragmentC2259e.this.f9686x == 40) {
                                FragmentC2259e.this.m10851t();
                            }
                        }
                    } else {
                        FragmentC2259e.this.f9550B = FragmentC2259e.f9517aB;
                        FragmentC2259e.this.m10851t();
                        FragmentC2259e.this.f9652bs.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.6.40
                            @Override // java.lang.Runnable
                            public void run() {
                                FragmentC2259e.this.f9652bs.setVisibility(8);
                            }
                        });
                        a2 = FragmentC2259e.this.f9629bS.getHandler();
                        a3 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.41
                            @Override // java.lang.Runnable
                            public void run() {
                                FragmentC2259e.this.f9629bS.setVisibility(0);
                                FragmentC2259e.this.f9629bS.setBackgroundResource(R.drawable.turn_animation);
                                FragmentC2259e.this.f9607av = (AnimationDrawable) FragmentC2259e.this.f9629bS.getBackground();
                                FragmentC2259e.this.m10828i();
                            }
                        };
                    }
                    if (a2 != null) {
                        a2.post((Runnable) a3);
                    }
                    FragmentC2259e.f9537h = false;
                    FragmentC2259e.f9539j = false;
                    FragmentC2259e.this.f9555G = 0;
                } else {
                    if (FragmentC2259e.this.f9686x != 0) {
                        if (FragmentC2259e.this.f9551C) {
                            a23 = FragmentC2259e.this.f9653bt.getHandler();
                            a24 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.42
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Angle_full_reset));
                                }
                            };
                        } else {
                            a23 = FragmentC2259e.this.f9653bt.getHandler();
                            a24 = new Runnable() { // from class: guide.tailor.FragmentC2259e.6.43
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9653bt.setText(FragmentC2259e.this.getActivity().getResources().getText(R.string.Angle_full_first));
                                }
                            };
                        }
                        if (a23 != null) {
                            a23.post((Runnable) a24);
                        }
                    }
                    FragmentC2259e.this.f9686x = 0;
                }
            }
            b3 = false;
            if (!b3) {
                FragmentC2259e.this.f9671cl.postDelayed(this, FragmentC2259e.this.f9553E);
            }
        }    };

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, byte] */
    static /* synthetic */ boolean access$580(FragmentC2259e fragmentC2259e, int i) {
        boolean r0 = fragmentC2259e.f9571aC ^ (i != 0);
        fragmentC2259e.f9571aC = r0;
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, byte] */
    static /* synthetic */ boolean access$6780(FragmentC2259e fragmentC2259e, int i) {
        boolean r0 = fragmentC2259e.f9644bk ^ (i != 0);
        fragmentC2259e.f9644bk = r0;
        return r0;
    }

    static class a implements Comparator<Size> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    public static class b extends DialogFragment {
        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            final Fragment parentFragment = getParentFragment();
            return new AlertDialog.Builder(getActivity()).setMessage("TailorGuide™ requires your permission to use the front camera.").setPositiveButton("Allow", new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    ActivityCompat.requestPermissions(b.this.getActivity(), new String[]{"android.permission.CAMERA"}, 1);
                }
            }).setNegativeButton("Deny", new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.b.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Activity activity = parentFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }).create();
        }
    }

    public static class c extends DialogFragment {
        public static c m10873a(String str) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
            cVar.setArguments(bundle);
            return cVar;
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            final Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setMessage(getArguments().getString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.c.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    activity.finish();
                }
            }).create();
        }
    }

    private static class d implements Runnable {
        private final Image f9789a;
        private final Integer f9790b;
        private final File f9791c;

        public d(Image image, Integer num, File file) {
            this.f9789a = image;
            this.f9790b = num;
            this.f9791c = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            int width = this.f9789a.getCropRect().width();
            int height = this.f9789a.getCropRect().height();
            if (width != FragmentC2259e.f9547s.getWidth() || height != FragmentC2259e.f9547s.getHeight()) {
                this.f9789a.setCropRect(new Rect(0, 0, FragmentC2259e.f9547s.getWidth(), FragmentC2259e.f9547s.getHeight()));
            }
            ByteBuffer buffer = this.f9789a.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            Integer.valueOf(0);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f9791c);
                try {
                    fileOutputStream.write(bArr);
                    this.f9789a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    this.f9789a.close();
                    fileOutputStream.close();
                    FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                } catch (Throwable th) {
                    this.f9789a.close();
                    throw th;
                }
                fileOutputStream.close();
                Object[] objArr = {this.f9791c.getPath(), this.f9790b};
                FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                FragmentC2259e.f9527ax.execute(objArr);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:2:0x0000, B:4:0x0024, B:6:0x002c, B:9:0x00d2, B:12:0x00dc, B:15:0x00f2, B:17:0x00f6, B:18:0x010e, B:23:0x0115, B:26:0x0105, B:28:0x010b, B:29:0x00e1, B:30:0x00d7, B:33:0x0032, B:34:0x00a8, B:35:0x007e, B:36:0x00b0, B:38:0x00c2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115 A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #0 {Exception -> 0x0119, blocks: (B:2:0x0000, B:4:0x0024, B:6:0x002c, B:9:0x00d2, B:12:0x00dc, B:15:0x00f2, B:17:0x00f6, B:18:0x010e, B:23:0x0115, B:26:0x0105, B:28:0x010b, B:29:0x00e1, B:30:0x00d7, B:33:0x0032, B:34:0x00a8, B:35:0x007e, B:36:0x00b0, B:38:0x00c2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:2:0x0000, B:4:0x0024, B:6:0x002c, B:9:0x00d2, B:12:0x00dc, B:15:0x00f2, B:17:0x00f6, B:18:0x010e, B:23:0x0115, B:26:0x0105, B:28:0x010b, B:29:0x00e1, B:30:0x00d7, B:33:0x0032, B:34:0x00a8, B:35:0x007e, B:36:0x00b0, B:38:0x00c2), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10725A() {
        Handler a1 = null;
        Object a2 = null;
        try {
            f9541l += System.currentTimeMillis() + ":UnlockFocus called\n";
            if (f9511H != 8) {
                int i0 = f9511H;
                if (i0 == 1) {
                    this.f9629bS.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.7
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9629bS.setImageResource(0);
                            new Handler().postDelayed(new Runnable() { // from class: guide.tailor.FragmentC2259e.7.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9607av.start();
                                }
                            }, FragmentC2259e.this.f9608aw);
                        }
                    });
                    this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.8
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9650bq.m10959a(0.0d);
                        }
                    });
                    a1 = this.f9666cg.getHandler();
                    a2 = new Runnable() { // from class: guide.tailor.FragmentC2259e.9
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9666cg.setVisibility(8);
                        }
                    };
                } else if (f9511H == 2) {
                    this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.10
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9654bu.setVisibility(0);
                        }
                    });
                    this.f9561P = f9517aB;
                    this.f9658by = false;
                    final boolean b0 = this.f9551C;
                    this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.11
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9650bq.m10962a(0, 0, 0, 0, FragmentC2259e.this.f9650bq.getWidth(), FragmentC2259e.this.f9650bq.getHeight(), b0, FragmentC2259e.this.f9550B ^ FragmentC2259e.f9517aB, FragmentC2259e.this.f9551C);
                        }
                    });
                    this.f9629bS.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.12
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9629bS.setImageResource(0);
                            new Handler().postDelayed(new Runnable() { // from class: guide.tailor.FragmentC2259e.12.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentC2259e.this.f9607av.start();
                                }
                            }, FragmentC2259e.this.f9608aw);
                        }
                    });
                    this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.13
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9650bq.m10959a(0.0d);
                        }
                    });
                    a1 = this.f9666cg.getHandler();
                    a2 = new Runnable() { // from class: guide.tailor.FragmentC2259e.14
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.f9666cg.setVisibility(8);
                        }
                    };
                }
                a1.post((Runnable) a2);
            } else {
                this.f9654bu.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.15
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.f9654bu.setVisibility(8);
                    }
                });
                if (f9528b) {
                    m10832k();
                    getView().findViewById(R.id.cameraApiPreview).setVisibility(8);
                }
            }
            int i1 = f9511H;
            if (i1 > 2 || f9511H <= 0) {
                if (f9511H != 8) {
                }
                if (f9511H >= 8) {
                    this.f9627bQ.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.17
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentC2259e.this.m10869b(FragmentC2259e.f9517aB);
                        }
                    });
                } else {
                    this.f9676cq = 0;
                    if (!f9528b) {
                        m10771a(false, false);
                    }
                }
                f9539j = false;
                if (f9511H <= 0) {
                    this.f9555G = 0;
                }
            }
            m10854v();
            this.f9664ce.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.16
                @Override // java.lang.Runnable
                public void run() {
                    FragmentC2259e.this.m10870d();
                }
            });
            if (f9511H >= 8) {
                this.f9627bQ.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.17
                    @Override // java.lang.Runnable
                    public void run() {
                        FragmentC2259e.this.m10869b(FragmentC2259e.f9517aB);
                    }
                });
            } else {
                this.f9676cq = 0;
                if (!f9528b) {
                    m10771a(false, false);
                }
            }
            f9539j = false;
            if (f9511H <= 0) {
                this.f9555G = 0;
            }
        } catch (Exception a3) {
            a3.printStackTrace();
        }
    }
    private static Size m10758a(Size[] sizeArr, int i, int i2, int i3, int i4, Size size) {
        Object max;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getWidth() <= i3 && size2.getHeight() <= i4 && size2.getHeight() == (size2.getWidth() * height) / width) {
                if (size2.getWidth() < i || size2.getHeight() < i2) {
                    arrayList2.add(size2);
                } else {
                    arrayList.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            max = Collections.min(arrayList, new a());
        } else {
            if (arrayList2.size() <= 0) {
                return sizeArr[0];
            }
            max = Collections.max(arrayList2, new a());
        }
        return (Size) max;
    }

    public static void m10763a(int i) {
        f9529bV.setTitle(f9530bW + String.valueOf(i) + " %");
    }

    private void m10764a(int i, int i2) {
        try {
            int height = this.f9651br.getHeight();
            int width = this.f9651br.getWidth();
            int round = Math.round(height * (i / i2));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9651br.getLayoutParams();
            layoutParams.width = round;
            int i3 = (int) ((width - round) * 0.5d);
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
            this.f9651br.setLayoutParams(layoutParams);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10765a(CaptureRequest.Builder builder, boolean z, boolean z2) {
        CaptureRequest.Key key;
        int i;
        try {
            if (z2) {
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                i = 1;
            } else {
                key = CaptureRequest.CONTROL_AF_TRIGGER;
                i = 0;
            }
            builder.set(key, Integer.valueOf(i));
            m10772a(builder);
            m10796b(builder);
            m10773a(builder, z ^ f9517aB);
            m10797b(builder, z ^ f9517aB);
            m10805c(builder);
            m10804c(builder, z ^ f9517aB);
            m10810d(builder);
            m10818e(builder);
            m10821f(builder);
            m10825g(builder);
            this.f9674co.set(CaptureRequest.JPEG_QUALITY, (byte) 85);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10770a(final String str) {
        final Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: guide.tailor.FragmentC2259e.18
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(activity, str, 0).show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10771a(boolean z, boolean z2) {
        try {
            this.f9632bY.stopRepeating();
        } catch (Exception e) {
        }
        try {
            f9540k = false;
            if (this.f9660ca == null) {
                m10770a("Camera was closed before config - 02");
                return;
            }
            if (!z) {
                m10765a(this.f9674co, false, false);
            } else {
                m10765a(this.f9674co, f9517aB, z2);
            }
            this.f9675cp = this.f9674co.build();
            this.f9632bY.setRepeatingRequest(this.f9675cp, this.f9679ct, this.f9671cl);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean m10772a(CaptureRequest.Builder builder) {
        CaptureRequest.Key key;
        int i;
        if (builder.get(CaptureRequest.CONTROL_SCENE_MODE) != null && ((Integer) builder.get(CaptureRequest.CONTROL_SCENE_MODE)).intValue() == this.f9574aF) {
            return false;
        }
        if (this.f9574aF == 0) {
            key = CaptureRequest.CONTROL_MODE;
            i = 1;
        } else {
            key = CaptureRequest.CONTROL_MODE;
            i = 2;
        }
        builder.set(key, Integer.valueOf(i));
        builder.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.f9574aF));
        return f9517aB;
    }

    private boolean m10773a(CaptureRequest.Builder builder, boolean z) {
        CaptureRequest.Builder builder2 = null;
        CaptureRequest.Key key = null;
        Object obj = null;
        if (z) {
            if (this.f9615bE == null) {
                builder2 = this.f9674co;
                key = CaptureRequest.CONTROL_AWB_LOCK;
                obj = Boolean.valueOf(f9517aB);
            } else {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 0);
                if (this.f9619bI != null) {
                    this.f9674co.set(CaptureRequest.COLOR_CORRECTION_MODE, 0);
                    builder2 = this.f9674co;
                    key = CaptureRequest.COLOR_CORRECTION_GAINS;
                    obj = this.f9619bI;
                }
            }
            builder2.set(key, obj);
            return false;
        }
        this.f9674co.set(CaptureRequest.CONTROL_AWB_LOCK, false);
        if (builder.get(CaptureRequest.CONTROL_AWB_MODE) != null && ((Integer) builder.get(CaptureRequest.CONTROL_AWB_MODE)).intValue() == 1) {
            return false;
        }
        builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        return f9517aB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10793b(int i) {
        if (!WebStart.f9405z || this.f9644bk) {
            return;
        }
        this.f9635bb = this.f9594aZ.play(i, this.f9559L, this.f9559L, 1, 0, 1.0f);
    }

    private void m10794b(int i, int i2) {
        if (this.f9672cm != null) {
            this.f9672cm.close();
            this.f9672cm = null;
        }
        this.f9672cm = ImageReader.newInstance(i, i2, 256, 2);
        f9541l += System.currentTimeMillis() + ":Imagereader width: " + this.f9672cm.getWidth() + "Imagereader height: " + this.f9672cm.getHeight() + "\n";
        this.f9672cm.setOnImageAvailableListener(this.f9673cn, this.f9671cl);
    }

    private boolean m10796b(CaptureRequest.Builder builder) {
        if (builder.get(CaptureRequest.CONTROL_EFFECT_MODE) != null && ((Integer) builder.get(CaptureRequest.CONTROL_EFFECT_MODE)).intValue() == this.f9575aG) {
            return false;
        }
        builder.set(CaptureRequest.CONTROL_EFFECT_MODE, Integer.valueOf(this.f9575aG));
        return f9517aB;
    }

    private boolean m10797b(CaptureRequest.Builder builder, boolean z) {
        CaptureRequest.Builder builder2;
        CaptureRequest.Key key;
        int i;
        if (this.f9615bE == null || !z) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 0);
            if (this.f9595ad) {
                builder2 = this.f9674co;
                key = CaptureRequest.CONTROL_AE_ANTIBANDING_MODE;
                i = 3;
            } else {
                if (!this.f9596ae) {
                    CaptureRequest.Builder builder22 = this.f9674co;
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_ANTIBANDING_MODE;
                    builder22.set(key2, 1);
                    m10811d(builder, z);
                    return f9517aB;
                }
                builder2 = this.f9674co;
                key = CaptureRequest.CONTROL_AE_ANTIBANDING_MODE;
                i = 2;
            }
            int i2 = Integer.valueOf(i).intValue();
            builder2.set(key, Integer.valueOf(i2));
            m10811d(builder, z);
            return f9517aB;
        }
        builder.set(CaptureRequest.CONTROL_AE_MODE, 0);
        builder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, this.f9615bE);
        if (this.f9617bG != null) {
            builder.set(CaptureRequest.SENSOR_SENSITIVITY, this.f9617bG);
        }
        if (this.f9616bF != null) {
            builder.set(CaptureRequest.SENSOR_FRAME_DURATION, this.f9616bF);
        }
        builder.set(CaptureRequest.FLASH_MODE, 0);
        return f9517aB;
    }

    public static FragmentC2259e m10800c() {
        return new FragmentC2259e();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:273|274|275|(0)(0)|278|279|(2:280|281)|283|284|285|286|(0)(0)|289|290|(0)|670|295|296|(3:297|298|299)|(7:(4:300|301|(0)(0)|304)|438|439|440|(0)(0)|475|(3:476|477|478))|(0)(0)|333|334|335|336|337|338|(0)|346|(0)|351|(0)(0)|354|355|(3:356|357|358)|371|372|(2:373|374)|392|393|(3:394|395|396)|404|405|(2:406|407)|592|593|419|(0)(0)|423|(1:424)|427|428|(0)(0)|436|437|(13:479|480|481|482|(0)(0)|491|(0)(0)|494|(0)(0)|497|498|499|(7:500|501|502|503|504|505|(4:506|507|508|(8:509|510|511|512|513|(0)(0)|516|(0)(0)))))) */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0eb6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0eb7, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0ec5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ec6, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0454 A[Catch: CameraAccessException -> 0x1177, TRY_ENTER, TRY_LEAVE, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x064e A[Catch: NullPointerException -> 0x0f1d, CameraAccessException -> 0x1177, TRY_ENTER, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07f5 A[Catch: NullPointerException -> 0x07fd, CameraAccessException -> 0x1177, TRY_ENTER, TRY_LEAVE, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x08a3 A[Catch: Exception -> 0x08c1, NullPointerException -> 0x08c4, CameraAccessException -> 0x1177, TRY_LEAVE, TryCatch #24 {NullPointerException -> 0x08c4, blocks: (B:298:0x086a, B:301:0x0885, B:303:0x08a3), top: B:297:0x086a }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x098c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a31 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a7c A[Catch: NullPointerException -> 0x0aa4, CameraAccessException -> 0x1177, TRY_ENTER, TryCatch #40 {NullPointerException -> 0x0aa4, blocks: (B:382:0x0a45, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:422:0x0b06, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:587:0x0b89), top: B:381:0x0a45 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0abc A[Catch: NullPointerException -> 0x0aa4, Exception -> 0x0af6, CameraAccessException -> 0x1177, TryCatch #4 {Exception -> 0x0af6, blocks: (B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3), top: B:406:0x0ab5 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0b3c A[Catch: NullPointerException -> 0x0e93, CameraAccessException -> 0x1177, LOOP:10: B:424:0x0b37->B:426:0x0b3c, LOOP_END, TryCatch #44 {NullPointerException -> 0x0e93, blocks: (B:395:0x0a74, B:419:0x0afa, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:436:0x0bb4), top: B:394:0x0a74 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0ca0 A[Catch: NullPointerException -> 0x0c59, CameraAccessException -> 0x1177, TRY_ENTER, TRY_LEAVE, TryCatch #71 {NullPointerException -> 0x0c59, blocks: (B:480:0x0c4c, B:486:0x0ca0), top: B:479:0x0c4c }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0dfc A[Catch: NullPointerException -> 0x0e24, CameraAccessException -> 0x1177, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0e20 A[Catch: NullPointerException -> 0x0e24, CameraAccessException -> 0x1177, TRY_LEAVE, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0e0b A[Catch: NullPointerException -> 0x0e24, CameraAccessException -> 0x1177, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0c88  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x098d A[Catch: NullPointerException -> 0x0eb6, CameraAccessException -> 0x1177, TryCatch #33 {NullPointerException -> 0x0eb6, blocks: (B:338:0x0955, B:346:0x0971, B:351:0x0982, B:602:0x098d, B:604:0x099a), top: B:337:0x0955 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x099f A[Catch: CameraAccessException -> 0x1177, TRY_ENTER, TRY_LEAVE, TryCatch #72 {CameraAccessException -> 0x1177, blocks: (B:85:0x01dc, B:95:0x033d, B:98:0x037f, B:101:0x03c4, B:104:0x03c8, B:107:0x03ce, B:110:0x03d3, B:114:0x03da, B:117:0x03de, B:120:0x03e4, B:122:0x03e6, B:125:0x03ec, B:127:0x03f2, B:129:0x03fc, B:134:0x0406, B:155:0x0435, B:160:0x0449, B:163:0x044f, B:166:0x0454, B:169:0x045a, B:176:0x0464, B:181:0x0470, B:198:0x04a5, B:202:0x04ae, B:205:0x04d2, B:210:0x04ef, B:216:0x050d, B:220:0x052a, B:223:0x0554, B:226:0x0591, B:232:0x05a5, B:274:0x0636, B:709:0x063c, B:278:0x066e, B:281:0x0681, B:284:0x06d5, B:285:0x0786, B:674:0x078c, B:677:0x0797, B:679:0x079a, B:682:0x07a7, B:290:0x07eb, B:292:0x07f5, B:295:0x080f, B:298:0x086a, B:301:0x0885, B:303:0x08a3, B:309:0x0900, B:335:0x094d, B:338:0x0955, B:342:0x095e, B:346:0x0971, B:349:0x0980, B:351:0x0982, B:357:0x09e9, B:361:0x09f0, B:363:0x09f6, B:373:0x0a2a, B:377:0x0a31, B:379:0x0a37, B:382:0x0a45, B:395:0x0a74, B:398:0x0a7c, B:400:0x0a82, B:407:0x0ab5, B:409:0x0abc, B:411:0x0ac3, B:414:0x0ad3, B:419:0x0afa, B:422:0x0b06, B:424:0x0b37, B:426:0x0b3c, B:428:0x0b3f, B:431:0x0b44, B:434:0x0b67, B:435:0x0bab, B:436:0x0bb4, B:439:0x0bbd, B:445:0x0bc4, B:477:0x0c38, B:480:0x0c4c, B:486:0x0ca0, B:489:0x0ca4, B:498:0x0ce6, B:501:0x0dc6, B:504:0x0dcf, B:507:0x0dd6, B:510:0x0dde, B:513:0x0de9, B:515:0x0dfc, B:516:0x0e19, B:518:0x0e20, B:522:0x0e0b, B:448:0x0bd2, B:452:0x0bd7, B:455:0x0be6, B:458:0x0bed, B:587:0x0b89, B:602:0x098d, B:604:0x099a, B:607:0x099f, B:609:0x09a1, B:616:0x09ab, B:618:0x09b3, B:621:0x09b9, B:312:0x0908, B:316:0x090d, B:319:0x091f, B:650:0x08dc, B:653:0x08e9, B:702:0x0768, B:706:0x06b6, B:277:0x064e, B:234:0x05ae, B:241:0x05c3, B:244:0x05e1, B:245:0x0606, B:253:0x05ec, B:255:0x05f2, B:260:0x0603, B:735:0x0506, B:739:0x0f71, B:742:0x0f8b, B:750:0x0f95, B:752:0x0f9b, B:754:0x0fa3, B:779:0x04ea, B:783:0x1014, B:786:0x102c, B:793:0x1035, B:795:0x103b, B:797:0x1043, B:831:0x043d, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:644:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x078c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x063c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x043d A[Catch: NullPointerException -> 0x10e8, CameraAccessException -> 0x1177, TRY_LEAVE, TryCatch #7 {NullPointerException -> 0x10e8, blocks: (B:155:0x0435, B:831:0x043d), top: B:154:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0270 A[Catch: NullPointerException -> 0x02ba, Exception -> 0x02ca, CameraAccessException -> 0x1177, TryCatch #37 {NullPointerException -> 0x02ba, blocks: (B:85:0x01dc, B:856:0x01e4, B:858:0x01ea, B:861:0x01f6, B:862:0x0268, B:864:0x0270, B:865:0x02af, B:871:0x024a), top: B:84:0x01dc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10803c(int i0, int i1) throws CameraAccessException {
        android.app.Activity a0 = getActivity();
        CameraManager a2 = (CameraManager) a0.getSystemService("camera");
        String[] a20 = a2.getCameraIdList();
        for (String s0 : a20) {
            CameraCharacteristics a22 = a2.getCameraCharacteristics(s0);
            Integer facing = (Integer) a22.get(CameraCharacteristics.LENS_FACING);
            if (facing == null || facing.intValue() != 1) {
                StreamConfigurationMap a7 = (StreamConfigurationMap) a22.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (a7 != null) {
                    this.f9573aE = a22;
                    Rect rect = (Rect) a22.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    if (rect != null) {
                        this.f9567V = rect.width();
                        this.f9568W = rect.height();
                    }
                    Size[] jpegSizes = a7.getOutputSizes(256);
                    if (jpegSizes != null && jpegSizes.length > 0) {
                        this.f9683u = (Size) Collections.max(Arrays.asList(jpegSizes), new a());
                    }
                    if (this.f9683u == null) {
                        this.f9683u = new Size(1920, 1080);
                    }
                    Point pt = new Point();
                    a0.getWindowManager().getDefaultDisplay().getSize(pt);
                    Size[] stSizes = a7.getOutputSizes(SurfaceTexture.class);
                    if (stSizes != null && stSizes.length > 0) {
                        this.f9661cb = m10758a(stSizes, 640, 480, 1920, 1080, this.f9683u);
                    }
                    if (this.f9661cb == null) {
                        this.f9661cb = new Size(1280, 720);
                    }
                    this.f9682r = this.f9661cb;
                    f9547s = this.f9683u;
                    f9548t = this.f9683u;
                    this.f9667ch = s0;
                    m10794b(f9547s.getWidth(), f9547s.getHeight());
                    return;
                }
            }
        }
        if (this.f9667ch == null && a20.length > 0) {
            this.f9667ch = a20[0];
            this.f9573aE = a2.getCameraCharacteristics(a20[0]);
            if (this.f9683u == null) {
                this.f9683u = new Size(1920, 1080);
                f9547s = this.f9683u;
                f9548t = this.f9683u;
            }
            if (this.f9661cb == null) {
                this.f9661cb = new Size(1280, 720);
                this.f9682r = this.f9661cb;
            }
        }
    }
    private void m10804c(CaptureRequest.Builder builder, boolean z) {
        CaptureRequest.Key key;
        int i;
        if (z) {
            key = CaptureRequest.CONTROL_AF_MODE;
            i = 0;
        } else {
            key = CaptureRequest.CONTROL_AF_MODE;
            i = 1;
        }
        builder.set(key, Integer.valueOf(i));
    }

    private boolean m10805c(CaptureRequest.Builder builder) {
        if (!this.f9569X || this.f9615bE != null) {
            return false;
        }
        if (builder.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION) != null && f9514Y == ((Integer) builder.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)).intValue()) {
            return false;
        }
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(f9514Y));
        return f9517aB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022f A[Catch: Exception -> 0x0290, SecurityException -> 0x0292, InterruptedException -> 0x0294, CameraAccessException -> 0x0296, TryCatch #0 {Exception -> 0x0290, blocks: (B:35:0x0229, B:37:0x022f, B:38:0x0231, B:40:0x023c, B:41:0x0262, B:43:0x026c, B:44:0x0273, B:109:0x0285, B:110:0x028f), top: B:17:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023c A[Catch: Exception -> 0x0290, SecurityException -> 0x0292, InterruptedException -> 0x0294, CameraAccessException -> 0x0296, TryCatch #0 {Exception -> 0x0290, blocks: (B:35:0x0229, B:37:0x022f, B:38:0x0231, B:40:0x023c, B:41:0x0262, B:43:0x026c, B:44:0x0273, B:109:0x0285, B:110:0x028f), top: B:17:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026c A[Catch: Exception -> 0x0290, SecurityException -> 0x0292, InterruptedException -> 0x0294, CameraAccessException -> 0x0296, TryCatch #0 {Exception -> 0x0290, blocks: (B:35:0x0229, B:37:0x022f, B:38:0x0231, B:40:0x023c, B:41:0x0262, B:43:0x026c, B:44:0x0273, B:109:0x0285, B:110:0x028f), top: B:17:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10809d(int i0, int i1) throws CameraAccessException {
        double d3;
        int i6;
        int i3;
        int i4 = 0;
        boolean b0 = false;
        double d4 = 0.0d;
        int i5;
        double d5;
        double d0 = 0.0d;
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(getActivity(), "android.permission.CAMERA") != 0) {
            m10841o();
            return;
        }
        m10803c(i0, i1);
        m10817e(i0, i1);
        try {
            Camera a0 = Camera.open(Integer.parseInt(this.f9667ch));
            Camera.Parameters a1 = a0.getParameters();
            a1.getSupportedPictureSizes();
            this.f9613bC = a1.isAutoExposureLockSupported();
            f9541l += System.currentTimeMillis() + ":Auto exposure lock support = " + this.f9613bC + "\n";
            WebStart.f9386K = "{\"" + a1.flatten().replace(":", ".").replace(";", "\",\"").replace("=", "\":\"") + "\"}";
            f9542m = Math.toRadians((double) a1.getVerticalViewAngle());
            f9543n = Math.toRadians((double) a1.getHorizontalViewAngle());
            if (this.f9572aD == 0.0d) {
                this.f9572aD = 1.0d;
            }
            f9544o = Math.atan(f9546q / (this.f9572aD * 2.0d)) * 2.0d;
            f9541l += System.currentTimeMillis() + ":FOV calculated: " + f9544o + "\n";
            f9541l += System.currentTimeMillis() + ":Front camera vertical FOV: " + f9542m + " and horizontal FOV: " + f9543n + "\n";
            a0.release();
        } catch (Exception e) {
            f9541l += System.currentTimeMillis() + ":Error at getting FOV values\n";
        }
        CameraManager a7 = (CameraManager) getActivity().getSystemService("camera");
        boolean z = f9517aB;
        Exception a15;
        Exception a16;
        SecurityException a17;
        Exception a18 = null;
        try {
            try {
                try {
                    try {
                        if (!this.f9677cr.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Time out waiting to lock camera opening.");
                        }
                        if (f9528b) {
                            try {
                                f9541l += System.currentTimeMillis() + ":Using old Camera api\n";
                                m10867b();
                            } catch (Exception e2) {
                                a15 = e2;
                                Exception a10 = a15;
                                a10.printStackTrace();
                            }
                        } else {
                            getView().findViewById(R.id.cameraApiPreview).setVisibility(8);
                            f9541l += System.currentTimeMillis() + ":Using Camera2 api\n";
                            a7.openCamera(this.f9667ch, this.f9669cj, this.f9671cl);
                        }
                        try {
                            CameraCharacteristics a13 = a7.getCameraCharacteristics(this.f9667ch);
                            ((SizeF) a13.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getWidth();
                            int i2 = ((Size) a13.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)).getWidth();
                            double d1 = i2 <= 0 ? 0.0d : ((double) this.f9567V) / ((double) i2);
                            double d2 = ((SizeF) a13.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getWidth();
                            if (d1 > 0.75d) {
                                d2 *= d1;
                            }
                            try {
                                d0 = Math.atan(d2 / (this.f9572aD * 2.0d)) * 2.0d;
                            } catch (Exception e6) {
                                d0 = 0.0d;
                            }
                        } catch (Exception e7) {
                        }
                        if (d0 > f9544o) {
                            f9544o = d0;
                        }
                        if (f9543n < 0.35d) {
                            f9543n = f9544o;
                            f9541l += System.currentTimeMillis() + ":Using calculated FOV\n";
                            f9545p++;
                        }
                        if (Build.DEVICE.equals("htc_m8")) {
                            f9543n = 1.2566d;
                        }
                        this.f9650bq.getHandler().post(new Runnable() { // from class: guide.tailor.FragmentC2259e.23
                            @Override // java.lang.Runnable
                            public void run() {
                                C2263i a2 = null;
                                double d6;
                                if (FragmentC2259e.f9544o > FragmentC2259e.f9543n) {
                                    a2 = FragmentC2259e.this.f9650bq;
                                    d6 = FragmentC2259e.f9544o;
                                } else {
                                    a2 = FragmentC2259e.this.f9650bq;
                                    d6 = FragmentC2259e.f9543n;
                                }
                                a2.m10960a(d6, FragmentC2259e.this.f9650bq.getHeight(), FragmentC2259e.this.f9650bq.getWidth());
                                FragmentC2259e.this.f9650bq.setOrientation(FragmentC2259e.f9536g);
                            }
                        });
                        this.f9584aP = 0;
                        d3 = f9543n;
                        i6 = -1;
                        if (d3 < 1.0d) {
                            i3 = -1;
                        } else if (d3 == 1.0d) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i3 >= 0) {
                            i4 = -30;
                        } else {
                            d4 = f9543n;
                            if (d4 < 1.1d) {
                                i5 = -1;
                            } else if (d4 == 1.1d) {
                                i5 = 0;
                            } else {
                                i5 = 1;
                            }
                            if (i5 >= 0) {
                                i4 = -20;
                            } else {
                                d5 = f9543n;
                                if (d5 >= 1.2d) {
                                    if (d5 == 1.2d) {
                                        i6 = 0;
                                    } else {
                                        i6 = 1;
                                    }
                                }
                                if (i6 < 0) {
                                    this.f9584aP = 0;
                                } else {
                                    i4 = -10;
                                }
                                if (f9543n < 0.35d) {
                                    b0 = f9517aB;
                                } else {
                                    if (f9543n <= 1.57d) {
                                        z = false;
                                    }
                                    b0 = z;
                                }
                                if (b0) {
                                    new AlertDialog.Builder(getActivity()).setTitle(getString(R.string.fov_invalid_title)).setMessage(getString(R.string.fov_invalid_message)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.24
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                        }
                                    }).create().show();
                                }
                            }
                        }
                        this.f9584aP = i4;
                        if (f9543n < 0.35d) {
                            b0 = f9517aB;
                        } else {
                            if (f9543n <= 1.57d) {
                                z = false;
                            }
                            b0 = z;
                        }
                        if (b0) {
                            new AlertDialog.Builder(getActivity()).setTitle(getString(R.string.fov_invalid_title)).setMessage(getString(R.string.fov_invalid_message)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.24
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            }).create().show();
                        }
                    } catch (Exception e8) {
                        a18 = e8;
                    }
                } catch (Exception e9) {
                    a15 = e9;
                }
            } catch (Exception e12) {
                a18 = e12;
            }
        } catch (Exception e13) {
            a15 = e13;
        }
        if (a18 != null) {
            a18.printStackTrace();
        }
        this.f9584aP = 0;
        d3 = f9543n;
        i6 = -1;
        if (d3 < 1.0d) {
            i3 = -1;
        } else if (d3 == 1.0d) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i3 >= 0) {
            i4 = -30;
        } else {
            d4 = f9543n;
            if (d4 < 1.1d) {
                i5 = -1;
            } else if (d4 == 1.1d) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            if (i5 >= 0) {
                i4 = -20;
            } else {
                d5 = f9543n;
                if (d5 >= 1.2d) {
                    if (d5 == 1.2d) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                }
                if (i6 < 0) {
                    this.f9584aP = 0;
                } else {
                    i4 = -10;
                }
                if (f9543n < 0.35d) {
                    b0 = f9517aB;
                } else {
                    if (f9543n <= 1.57d) {
                        z = false;
                    }
                    b0 = z;
                }
                if (b0) {
                    new AlertDialog.Builder(getActivity()).setTitle(getString(R.string.fov_invalid_title)).setMessage(getString(R.string.fov_invalid_message)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.24
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).create().show();
                }
            }
        }
        this.f9584aP = i4;
        if (f9543n < 0.35d) {
            b0 = f9517aB;
        } else {
            if (f9543n <= 1.57d) {
                z = false;
            }
            b0 = z;
        }
        if (b0) {
            new AlertDialog.Builder(getActivity()).setTitle(getString(R.string.fov_invalid_title)).setMessage(getString(R.string.fov_invalid_message)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: guide.tailor.FragmentC2259e.24
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).create().show();
        }
    }
    private void m10810d(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(0.0f));
    }

    private void m10811d(CaptureRequest.Builder builder, boolean z) {
        if (this.f9615bE == null) {
            builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10817e(int i, int i2) {
        float f = 0.0f;
        Activity activity = getActivity();
        if (this.f9627bQ == null || this.f9661cb == null || activity == null) {
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f9661cb.getHeight(), this.f9661cb.getWidth());
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (1 != rotation && 3 != rotation) {
            if (2 == rotation) {
                f = 180.0f;
            }
            this.f9627bQ.setTransform(matrix);
        } else {
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float max = Math.max(f3 / this.f9661cb.getHeight(), f2 / this.f9661cb.getWidth());
            matrix.postScale(max, max, centerX, centerY);
            f = (rotation - 2) * 90;
        }
        matrix.postRotate(f, centerX, centerY);
        this.f9627bQ.setTransform(matrix);
    }

    private void m10818e(CaptureRequest.Builder builder) {
        if (this.f9659bz == null || ((Integer) this.f9573aE.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{this.f9659bz});
    }

    private void m10821f(CaptureRequest.Builder builder) {
        if (this.f9659bz == null || ((Integer) this.f9573aE.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{this.f9659bz});
    }

    private Camera.PictureCallback m10823g() {
        return new Camera.PictureCallback() { // from class: guide.tailor.FragmentC2259e.25
            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                Object[] objArr;
                AsyncTaskC2258d asyncTaskC2258d;
                switch (FragmentC2259e.f9511H) {
                    case 0:
                        FragmentC2259e.this.f9645bl = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_0_TEST.jpg");
                        break;
                    case 1:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e.this.f9647bn = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_1_FP.jpg");
                            break;
                        } else {
                            FragmentC2259e.this.f9647bn = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_1_FP.jpg");
                            break;
                        }
                    case 2:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e.this.f9648bo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_2_SP.jpg");
                            break;
                        } else {
                            FragmentC2259e.this.f9648bo = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_2_SP.jpg");
                            break;
                        }
                    case 3:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e = FragmentC2259e.this;
                            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_3_BG.jpg");
                            fragmentC2259e.f9646bm = file;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e2 = FragmentC2259e.this;
                            File file2 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_3_BG.jpg");
                            fragmentC2259e2.f9646bm = file2;
                            break;
                        }
                    case 4:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e3 = FragmentC2259e.this;
                            File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_4_BG.jpg");
                            fragmentC2259e3.f9646bm = file3;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e4 = FragmentC2259e.this;
                            File file22 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_4_BG.jpg");
                            fragmentC2259e4.f9646bm = file22;
                            break;
                        }
                    case 5:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e5 = FragmentC2259e.this;
                            File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_5_BG.jpg");
                            fragmentC2259e5.f9646bm = file4;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e6 = FragmentC2259e.this;
                            File file23 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_5_BG.jpg");
                            fragmentC2259e6.f9646bm = file23;
                            break;
                        }
                    case 6:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e7 = FragmentC2259e.this;
                            File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_6_BG.jpg");
                            fragmentC2259e7.f9646bm = file5;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e8 = FragmentC2259e.this;
                            File file24 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_6_BG.jpg");
                            fragmentC2259e8.f9646bm = file24;
                            break;
                        }
                    case 7:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e9 = FragmentC2259e.this;
                            File file6 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_7_BG.jpg");
                            fragmentC2259e9.f9646bm = file6;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e10 = FragmentC2259e.this;
                            File file25 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_7_BG.jpg");
                            fragmentC2259e10.f9646bm = file25;
                            break;
                        }
                    case 8:
                        if (!FragmentC2259e.f9516a) {
                            FragmentC2259e fragmentC2259e11 = FragmentC2259e.this;
                            File file7 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + File.separator + "Temp", "AD_8_BG.jpg");
                            fragmentC2259e11.f9646bm = file7;
                            break;
                        } else {
                            FragmentC2259e fragmentC2259e12 = FragmentC2259e.this;
                            File file26 = new File(FragmentC2259e.this.getActivity().getExternalFilesDir(null), "AD_8_BG.jpg");
                            fragmentC2259e12.f9646bm = file26;
                            break;
                        }
                }
                try {
                    if (FragmentC2259e.f9511H > 2) {
                        Uri fromFile = Uri.fromFile(FragmentC2259e.this.f9646bm);
                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile);
                        intent.setData(fromFile);
                        FragmentC2259e.this.getActivity().sendBroadcast(intent);
                        FileOutputStream fileOutputStream = new FileOutputStream(FragmentC2259e.this.f9646bm);
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                        objArr = new Object[]{FragmentC2259e.this.f9646bm.getPath(), Integer.valueOf(FragmentC2259e.f9511H)};
                        FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                        asyncTaskC2258d = FragmentC2259e.f9527ax;
                    } else if (FragmentC2259e.f9511H == 0) {
                        Uri fromFile2 = Uri.fromFile(FragmentC2259e.this.f9645bl);
                        Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile2);
                        intent2.setData(fromFile2);
                        FragmentC2259e.this.getActivity().sendBroadcast(intent2);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(FragmentC2259e.this.f9645bl);
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.close();
                        objArr = new Object[]{FragmentC2259e.this.f9645bl.getPath(), Integer.valueOf(FragmentC2259e.f9511H)};
                        FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                        asyncTaskC2258d = FragmentC2259e.f9527ax;
                    } else if (FragmentC2259e.f9511H == 1) {
                        Uri fromFile3 = Uri.fromFile(FragmentC2259e.this.f9647bn);
                        Intent intent3 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile3);
                        intent3.setData(fromFile3);
                        FragmentC2259e.this.getActivity().sendBroadcast(intent3);
                        FileOutputStream fileOutputStream3 = new FileOutputStream(FragmentC2259e.this.f9647bn);
                        fileOutputStream3.write(bArr);
                        fileOutputStream3.close();
                        objArr = new Object[]{FragmentC2259e.this.f9647bn.getPath(), Integer.valueOf(FragmentC2259e.f9511H)};
                        FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                        asyncTaskC2258d = FragmentC2259e.f9527ax;
                    } else {
                        Uri fromFile4 = Uri.fromFile(FragmentC2259e.this.f9648bo);
                        Intent intent4 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile4);
                        intent4.setData(fromFile4);
                        FragmentC2259e.this.getActivity().sendBroadcast(intent4);
                        FileOutputStream fileOutputStream4 = new FileOutputStream(FragmentC2259e.this.f9648bo);
                        fileOutputStream4.write(bArr);
                        fileOutputStream4.close();
                        objArr = new Object[]{FragmentC2259e.this.f9648bo.getPath(), Integer.valueOf(FragmentC2259e.f9511H)};
                        FragmentC2259e.f9527ax = new AsyncTaskC2258d();
                        asyncTaskC2258d = FragmentC2259e.f9527ax;
                    }
                    asyncTaskC2258d.execute(objArr);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (FragmentC2259e.f9511H < 8) {
                    FragmentC2259e.this.f9623bM.startPreview();
                }
                FragmentC2259e.this.m10725A();
            }
        };
    }

    private void m10825g(CaptureRequest.Builder builder) {
        if (this.f9657bx) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1);
        }
    }

    private Camera.ErrorCallback m10826h() {
        return new Camera.ErrorCallback() { // from class: guide.tailor.FragmentC2259e.26
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i, Camera camera) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10828i() {
        int width = this.f9649bp.getWidth();
        int height = this.f9649bp.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        int i = height - 15;
        float f = width;
        float f2 = i;
        if (0.6f > f / f2) {
            int i2 = (int) (f / 0.6f);
            int i3 = (i - i2) / 2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9629bS.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = width;
            layoutParams.topMargin = 5;
            this.f9629bS.setLayoutParams(layoutParams);
            return;
        }
        int i4 = (int) (f2 * 0.6f);
        int i5 = (width - i4) / 2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f9629bS.getLayoutParams();
        layoutParams2.width = i4;
        layoutParams2.height = i;
        layoutParams2.topMargin = 5;
        this.f9629bS.setLayoutParams(layoutParams2);
    }

    private void m10831j() {
        this.f9623bM.cancelAutoFocus();
        if (this.f9623bM == null) {
            return;
        }
        this.f9623bM.takePicture(null, null, this.f9626bP);
    }

    private void m10832k() {
        if (this.f9623bM != null) {
            this.f9623bM.release();
            this.f9623bM = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10835l() {
        try {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SurfaceTexture surfaceTexture = this.f9627bQ.getSurfaceTexture();
            f9541l += System.currentTimeMillis() + ":CreateCamPrev: " + this.f9661cb.getWidth() + "x" + this.f9661cb.getHeight() + "\n";
            surfaceTexture.setDefaultBufferSize(this.f9661cb.getWidth(), this.f9661cb.getHeight());
            this.f9633bZ = new Surface(surfaceTexture);
            this.f9674co = this.f9660ca.createCaptureRequest(1);
            this.f9674co.addTarget(this.f9633bZ);
            this.f9660ca.createCaptureSession(Arrays.asList(this.f9633bZ, this.f9672cm.getSurface()), new CameraCaptureSession.StateCallback() { // from class: guide.tailor.FragmentC2259e.27
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    FragmentC2259e.this.m10770a("Camera configure failed - 01: " + FragmentC2259e.this.f9682r.getWidth() + "x" + FragmentC2259e.this.f9682r.getHeight() + " " + FragmentC2259e.f9547s.getWidth() + "x" + FragmentC2259e.f9547s.getHeight());
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    FragmentC2259e.this.f9632bY = cameraCaptureSession;
                    try {
                        FragmentC2259e.this.m10765a(FragmentC2259e.this.f9674co, FragmentC2259e.f9517aB, false);
                        FragmentC2259e.this.f9675cp = FragmentC2259e.this.f9674co.build();
                        FragmentC2259e.this.f9632bY.setRepeatingRequest(FragmentC2259e.this.f9675cp, FragmentC2259e.this.f9679ct, FragmentC2259e.this.f9671cl);
                        FragmentC2259e.this.f9671cl.postDelayed(FragmentC2259e.this.f9681cv, 100L);
                    } catch (CameraAccessException e2) {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onReady(CameraCaptureSession cameraCaptureSession) {
                }
            }, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void m10837m() {
        try {
            try {
                this.f9677cr.acquire();
                if (this.f9632bY != null) {
                    this.f9632bY.close();
                    this.f9632bY = null;
                }
                if (this.f9660ca != null) {
                    this.f9660ca.close();
                    this.f9660ca = null;
                }
                if (this.f9672cm != null) {
                    this.f9672cm.close();
                    this.f9672cm = null;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } finally {
            this.f9677cr.release();
        }
    }

    private void m10838n() {
        this.f9560M = (AudioManager) getActivity().getSystemService("audio");
        this.f9557J = this.f9560M.getStreamVolume(3);
        this.f9558K = this.f9560M.getStreamMaxVolume(3);
        this.f9559L = this.f9557J / this.f9558K;
        getActivity().setVolumeControlStream(3);
        AudioAttributes build = new AudioAttributes.Builder().setContentType(1).setUsage(1).build();
        this.f9593aY = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(build).build();
        this.f9594aZ = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(build).build();
        this.f9636bc = this.f9593aY.load(getActivity(), R.raw.tone_beep, 1);
        this.f9637bd = this.f9593aY.load(getActivity(), R.raw.bling_sound, 1);
        this.f9638be = this.f9593aY.load(getActivity(), R.raw.shutter, 1);
        this.f9642bi = this.f9594aZ.load(getActivity(), R.raw.instructions_lean, 1);
        this.f9643bj = this.f9594aZ.load(getActivity(), R.raw.instructions_error_angle, 1);
        this.f9639bf = this.f9594aZ.load(getActivity(), R.raw.instructions_front, 1);
        this.f9640bg = this.f9594aZ.load(getActivity(), R.raw.instructions_side, 1);
        this.f9641bh = this.f9594aZ.load(getActivity(), R.raw.instructions_leave, 1);
        this.f9594aZ.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: guide.tailor.FragmentC2259e.28
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                if (FragmentC2259e.this.f9642bi == i) {
                    FragmentC2259e.f9513O = FragmentC2259e.f9517aB;
                }
            }
        });
    }

    private void m10841o() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), "android.permission.CAMERA")) {
            new b().show(getChildFragmentManager(), "dialog");
        } else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{"android.permission.CAMERA"}, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10843p() {
        try {
            f9528b = false;
            f9532c = f9517aB;
            this.f9623bM.stopPreview();
            m10832k();
            f9541l += System.currentTimeMillis() + ":Using Camera2 api\n";
            ((CameraManager) getActivity().getSystemService("camera")).openCamera(this.f9667ch, this.f9669cj, this.f9671cl);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            throw new RuntimeException("Camera permissions missing", e2);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void m10845q() {
        f9535f = false;
        this.f9670ck = new HandlerThread("CameraBackground");
        this.f9670ck.start();
        this.f9671cl = new Handler(this.f9670ck.getLooper());
    }

    private void m10847r() {
        f9535f = false;
        this.f9670ck = new HandlerThread("CameraBackground");
        this.f9670ck.start();
        this.f9671cl = new Handler(this.f9670ck.getLooper());
    }

    private void m10849s() {
        System.out.println("DEBUG - stop background thread");
        f9535f = f9517aB;
        if (f9527ax != null) {
            f9527ax.cancel(f9517aB);
        }
        if (this.f9670ck != null) {
            this.f9670ck.quitSafely();
            try {
                this.f9670ck.join();
                this.f9670ck = null;
                this.f9671cl = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10851t() {
        this.f9634ba = this.f9593aY.play(this.f9636bc, this.f9559L, this.f9559L, 1, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10853u() {
        this.f9634ba = this.f9593aY.play(this.f9637bd, this.f9559L, this.f9559L, 1, 0, 1.0f);
    }

    private void m10854v() {
        this.f9634ba = this.f9593aY.play(this.f9638be, this.f9559L, this.f9559L, 1, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] m10857w() {
        if (!this.f9585aQ) {
            int[] a0 = {300, 0};
            return a0;
        }
        float[] a1 = new float[9];
        float[] a2 = new float[9];
        SensorManager sensorManager = this.f9577aI;
        SensorManager.getRotationMatrix(a1, null, this.f9684v, this.f9685w);
        SensorManager sensorManager2 = this.f9577aI;
        SensorManager.remapCoordinateSystem(a1, 1, 3, a2);
        float[] a3 = new float[3];
        SensorManager.getOrientation(a2, a3);
        for (int i0 = 0; i0 < a3.length; i0++) {
            a3[i0] = Double.valueOf((a3[i0] * 180.0f) / 3.141592653589793d).floatValue();
        }
        int i1 = (int) a3[2];
        if (i1 > 45) {
            i1 -= 90;
        }
        this.f9587aS = this.f9586aR != a3[1] ? 0L : this.f9587aS + 1;
        this.f9586aR = a3[1];
        if (this.f9587aS == 200) {
            this.f9585aQ = false;
        }
        a3[1] = a3[1] + 11.0f;
        if (a3[1] < 0.0f) {
            a3[1] = 0.0f;
        }
        if (a3[1] > 60.0f) {
            a3[1] = 60.0f;
        }
        int[] a4 = {(int) (a3[1] * 10.0f), i1};
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m10859x() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", "error");
            jSONObject.put("cid", WebStart.f9402w);
            jSONObject.put(NativeProtocol.WEB_DIALOG_ACTION, "filming_stop_on_fail");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "log");
            jSONObject2.put(FirebaseAnalytics.Param.VALUE, String.valueOf(f9541l));
            jSONObject.put("data", jSONObject2);
            C2261g.m10874a().m10879c(jSONObject.toString());
            return f9517aB;
        } catch (Exception e) {
            return f9517aB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10861y() {
        this.f9622bL = 0;
        this.f9571aC = f9517aB;
        f9539j = f9517aB;
        this.f9676cq = 1;
        if (!f9528b || this.f9623bM == null) {
            return;
        }
        m10831j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10863z() {
        CaptureRequest.Builder createCaptureRequest;
        String str = null;
        try {
            if (getActivity() != null && this.f9660ca != null) {
                if (f9520ac && this.f9615bE != null) {
                    createCaptureRequest = this.f9660ca.createCaptureRequest(6);
                    str = f9541l + System.currentTimeMillis() + ":CaptureRequest - Template manual\n";
                    f9541l = str;
                    m10765a(createCaptureRequest, false, false);
                    createCaptureRequest.addTarget(this.f9672cm.getSurface());
                    CameraCaptureSession.CaptureCallback captureCallback = new CameraCaptureSession.CaptureCallback() { // from class: guide.tailor.FragmentC2259e.29
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        }

                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Capture failed - " + captureFailure.toString() + "\n";
                        }

                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                        }
                    };
                    f9541l += System.currentTimeMillis() + ":CaptureBuilder called\n";
                    f9540k = f9517aB;
                    this.f9632bY.capture(createCaptureRequest.build(), captureCallback, null);
                }
                createCaptureRequest = this.f9660ca.createCaptureRequest(2);
                str = f9541l + System.currentTimeMillis() + ":CaptureRequest - Template still capture\n";
                f9541l = str;
                m10765a(createCaptureRequest, false, false);
                createCaptureRequest.addTarget(this.f9672cm.getSurface());
                CameraCaptureSession.CaptureCallback captureCallback2 = new CameraCaptureSession.CaptureCallback() { // from class: guide.tailor.FragmentC2259e.29
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                        FragmentC2259e.f9541l += System.currentTimeMillis() + ":Capture failed - " + captureFailure.toString() + "\n";
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
                    }
                };
                f9541l += System.currentTimeMillis() + ":CaptureBuilder called\n";
                f9540k = f9517aB;
                this.f9632bY.capture(createCaptureRequest.build(), captureCallback2, null);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public void m10864a() {
        if (this.f9624bN != null) {
            if (this.f9624bN.isAutoExposureLockSupported()) {
                this.f9609ay = f9517aB;
            }
            if (this.f9624bN.isAutoWhiteBalanceLockSupported()) {
                this.f9610az = f9517aB;
            }
            if (this.f9624bN.getSupportedFocusModes().contains("infinity")) {
                this.f9570aA = f9517aB;
            }
            try {
                this.f9623bM.enableShutterSound(false);
            } catch (Exception e) {
            }
        }
    }

    public void m10865a(SensorManager sensorManager, SensorEventListener sensorEventListener) {
        try {
            sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(1), 3);
            sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(2), 3);
        } catch (Exception e) {
            System.out.println(e.toString());
            this.f9585aQ = false;
        }
    }

    public void m10866a(boolean z) {
        Camera.Parameters parameters;
        Camera.Parameters parameters2;
        try {
            if (this.f9623bM != null) {
                this.f9624bN = this.f9623bM.getParameters();
                String str2 = "50hz";
                if (z) {
                    if (this.f9595ad) {
                        parameters2 = this.f9624bN;
                        str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    } else if (this.f9596ae) {
                        Camera.Parameters parameters22 = this.f9624bN;
                        str2 = "60hz";
                        parameters2 = parameters22;
                    } else {
                        parameters2 = this.f9624bN;
                    }
                    parameters2.setAntibanding(str2);
                    if (this.f9609ay) {
                        if (f9533d) {
                            this.f9624bN.setAutoExposureLock(false);
                        } else {
                            this.f9624bN.setAutoExposureLock(f9517aB);
                        }
                    }
                    if (this.f9610az) {
                        this.f9624bN.setAutoWhiteBalanceLock(f9517aB);
                    }
                } else {
                    if (this.f9595ad) {
                        parameters = this.f9624bN;
                        str2 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                    } else if (this.f9596ae) {
                        Camera.Parameters parameters3 = this.f9624bN;
                        str2 = "60hz";
                        parameters = parameters3;
                    } else {
                        parameters = this.f9624bN;
                    }
                    parameters.setAntibanding(str2);
                    if (this.f9609ay) {
                        this.f9624bN.setAutoExposureLock(false);
                    }
                    if (this.f9610az) {
                        this.f9624bN.setAutoWhiteBalanceLock(false);
                    }
                }
                this.f9625bO.m10966a(this.f9624bN);
            }
        } catch (Exception e) {
        }
    }

    public void m10867b() {
        int parseInt = Integer.parseInt(this.f9667ch);
        if (parseInt >= 0) {
            this.f9623bM = Camera.open(parseInt);
            m10764a(f9547s.getHeight(), f9547s.getWidth());
            this.f9625bO = new SurfaceHolderCallbackC2264j(getActivity(), this.f9623bM, (SurfaceView) getView().findViewById(R.id.cameraApiPreview), this.f9682r.getWidth(), this.f9682r.getHeight(), f9547s.getWidth(), f9547s.getHeight());
            this.f9624bN = this.f9623bM.getParameters();
            m10864a();
            this.f9626bP = m10823g();
            m10826h();
            this.f9625bO.m10965a();
            this.f9671cl.postDelayed(this.f9681cv, 100L);
        }
    }

    public void m10868b(SensorManager sensorManager, SensorEventListener sensorEventListener) {
        try {
            sensorManager.unregisterListener(sensorEventListener);
        } catch (Exception e) {
            System.out.println("Error at unregister sensor:" + e.toString());
        }
    }

    public void m10869b(final boolean z) {
        this.f9631bU.setVisibility(z ? 0 : 8);
        this.f9627bQ.setVisibility(z ? 8 : 0);
        int integer = getResources().getInteger(android.R.integer.config_shortAnimTime);
        this.f9630bT.setVisibility(z ? 0 : 8);
        this.f9630bT.animate().setDuration(integer).alpha(z ? 1.0f : 0.0f).setListener(new AnimatorListenerAdapter() { // from class: guide.tailor.FragmentC2259e.30
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                FragmentC2259e.this.f9630bT.setVisibility(z ? 0 : 8);
                if (z) {
                    return;
                }
                FragmentC2259e.m10763a(0);
            }
        });
    }

    void m10870d() {
        this.f9664ce.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: guide.tailor.FragmentC2259e.31
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                FragmentC2259e.this.f9664ce.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.f9664ce.startAnimation(alphaAnimation);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_camera2_basic, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        if (f9528b) {
            m10832k();
        } else {
            m10837m();
        }
        m10868b(this.f9577aI, this.f9580aL);
        m10849s();
        if (this.f9593aY != null) {
            this.f9593aY.release();
            this.f9593aY = null;
        }
        if (this.f9594aZ != null) {
            this.f9594aZ.release();
            this.f9594aZ = null;
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (iArr.length == 1 && iArr[0] == 0) {
                return;
            }
            c.m10873a(getActivity().getApplicationContext().getResources().getString(R.string.Camera2BasicFragment_Error_camera)).show(getChildFragmentManager(), "dialog");
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9588aT = WebStart.f9388N;
        this.f9589aU = WebStart.f9389O;
        this.f9590aV = WebStart.f9390P;
        this.f9591aW = WebStart.f9391Q;
        m10838n();
        m10865a(this.f9577aI, this.f9580aL);
        if (f9527ax != null && (f9527ax.getStatus() == AsyncTask.Status.PENDING || f9527ax.getStatus() == AsyncTask.Status.RUNNING)) {
            f9527ax.cancel(f9517aB);
            try {
                f9527ax.get(2L, TimeUnit.SECONDS);
            } catch (Exception e) {
            }
        }
        if (WebStart.f9380E) {
            getView().findViewById(R.id.cameraApiPreview).setVisibility(8);
            this.f9652bs.setVisibility(8);
            m10869b(f9517aB);
            f9538i = 1;
            f9527ax = new AsyncTaskC2258d();
            f9527ax.execute("", -1);
            m10847r();
            this.f9671cl.postDelayed(this.f9680cu, 200L);
            return;
        }
        if (this.f9627bQ.isAvailable()) {
            try {
                m10809d(this.f9627bQ.getWidth(), this.f9627bQ.getHeight());
            } catch (CameraAccessException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.f9627bQ.setSurfaceTextureListener(this.f9668ci);
        }
        this.f9653bt.setText(getActivity().getResources().getText(R.string.Angle_full_first));
        this.f9653bt.setVisibility(0);
        this.f9654bu.setVisibility(8);
        this.f9652bs.setVisibility(0);
        this.f9629bS.setVisibility(8);
        this.f9686x = 0;
        this.f9555G = 0;
        f9511H = 0;
        f9539j = false;
        f9538i = 0;
        f9533d = false;
        f9532c = false;
        m10845q();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        f9534e = ((ActivityManager) getActivity().getSystemService("activity")).getLargeMemoryClass();
        f9541l = System.currentTimeMillis() + ":Camera2BasicFragment - Created\n";
        f9541l += System.currentTimeMillis() + ":Large Heap = " + f9534e + "\n";
        this.f9627bQ = (AutoFitTextureView) view.findViewById(R.id.texture);
        this.f9628bR = (ProgressBar) view.findViewById(R.id.pitchbar);
        this.f9629bS = (ImageView) view.findViewById(R.id.personmask);
        this.f9577aI = (SensorManager) getActivity().getSystemService("sensor");
        this.f9578aJ = this.f9577aI.getDefaultSensor(1);
        if (this.f9578aJ == null) {
            this.f9585aQ = false;
            WebStart.m10610a("Accelerometer_null", WebStart.f9400u);
        } else {
            this.f9585aQ = f9517aB;
        }
        f9512N = f9517aB;
        f9513O = false;
        this.f9587aS = 0L;
        this.f9579aK = this.f9577aI.getDefaultSensor(2);
        this.f9650bq = new C2263i(getActivity());
        this.f9649bp = (FrameLayout) view.findViewById(R.id.control);
        this.f9649bp.addView(this.f9650bq, 0);
        this.f9651br = (FrameLayout) view.findViewById(R.id.old_camera_frame);
        this.f9631bU = (LinearLayout) view.findViewById(R.id.progress_layout);
        f9529bV = (Toolbar) view.findViewById(R.id.camera_progress_text);
        this.f9652bs = (FrameLayout) view.findViewById(R.id.angle_instructions_frame);
        this.f9653bt = (TextView) view.findViewById(R.id.angle_instructions_label);
        this.f9654bu = (TextView) view.findViewById(R.id.KeepAwayText);
        this.f9654bu.setText(getActivity().getResources().getText(R.string.Keepaway_full));
        f9530bW = getActivity().getApplicationContext().getResources().getString(R.string.str_task_processing);
        f9531bX = getActivity().getApplicationContext().getResources().getString(R.string.str_task_processing_finished);
        this.f9630bT = view.findViewById(R.id.measuring_progress);
        this.f9553E = 20;
        this.f9551C = false;
        f9524as = getResources();
        f9521ap = getActivity().getResources().getString(R.string.Edit_overlay_feet);
        f9522aq = getActivity().getResources().getString(R.string.Edit_overlay_feet_side);
        f9523ar = getActivity().getResources().getString(R.string.Edit_overlay_head);
        this.f9664ce = (LinearLayout) view.findViewById(R.id.flashEffect);
        this.f9665cf = (Button) view.findViewById(R.id.loading_donebtn);
        this.f9665cf.setEnabled(false);
        this.f9630bT.setVisibility(0);
        this.f9666cg = (ImageView) view.findViewById(R.id.countdown_img);
        this.f9666cg.setVisibility(8);
        this.f9655bv = (ImageView) view.findViewById(R.id.mute_btn);
        this.f9656bw = (TextView) view.findViewById(R.id.calibrateBtn);
        this.f9644bk = false;
        this.f9655bv.setImageDrawable(getActivity().getDrawable(R.drawable.ic_volume_up_white_24dp));
        this.f9655bv.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.FragmentC2259e.32
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (FragmentC2259e.this.f9644bk) {
                    FragmentC2259e.this.f9655bv.setImageDrawable(FragmentC2259e.this.getActivity().getDrawable(R.drawable.ic_volume_up_white_24dp));
                } else {
                    FragmentC2259e.this.f9655bv.setImageDrawable(FragmentC2259e.this.getActivity().getDrawable(R.drawable.ic_volume_off_white_24dp));
                    try {
                        FragmentC2259e.this.f9594aZ.stop(FragmentC2259e.this.f9635bb);
                    } catch (Exception e) {
                        System.out.println("SoundPool error");
                    }
                }
                FragmentC2259e.access$6780(FragmentC2259e.this, 1);
            }
        });
        this.f9656bw.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.FragmentC2259e.33
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                FragmentC2259e.this.startActivity(new Intent(FragmentC2259e.this.getActivity(), (Class<?>) AngleCalibrationActivity.class));
                FragmentC2259e.this.getActivity().finish();
            }
        });
        this.f9662cc = (ViewPager) view.findViewById(R.id.info_swipe_pager);
        this.f9663cd = new C2267m(getActivity());
        this.f9662cc.setAdapter(this.f9663cd);
        this.f9663cd.m10975c();
        ((TabLayout) view.findViewById(R.id.tabDots)).setupWithViewPager(this.f9662cc, f9517aB);
        this.f9685w[0] = 1.0f;
        this.f9685w[1] = 1.0f;
        this.f9685w[2] = 1.0f;
        this.f9580aL = new SensorEventListener() { // from class: guide.tailor.FragmentC2259e.34
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                switch (sensorEvent.sensor.getType()) {
                    case 1:
                        FragmentC2259e.this.f9684v[0] = sensorEvent.values[0];
                        FragmentC2259e.this.f9684v[1] = (sensorEvent.values[1] - FragmentC2259e.this.f9590aV) * FragmentC2259e.this.f9588aT;
                        FragmentC2259e.this.f9684v[2] = (sensorEvent.values[2] - FragmentC2259e.this.f9591aW) * FragmentC2259e.this.f9589aU;
                        break;
                    case 2:
                        System.arraycopy(sensorEvent.values, 0, FragmentC2259e.this.f9685w, 0, 3);
                        break;
                }
            }
        };
        getActivity().getWindow().addFlags(128);
        this.f9665cf.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.FragmentC2259e.35
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Intent intent = new Intent(FragmentC2259e.this.getActivity(), (Class<?>) VideoActivity.class);
                intent.putExtra("closing_activity", "results");
                FragmentC2259e.this.startActivity(intent);
                FragmentC2259e.this.getActivity().finish();
            }
        });
    }
}
