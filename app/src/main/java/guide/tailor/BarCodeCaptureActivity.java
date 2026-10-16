package guide.tailor;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import guide.tailor.barcode.C2256a;
import guide.tailor.barcode.CameraSourcePreview;
import guide.tailor.barcode.GraphicOverlay;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BarCodeCaptureActivity extends AppCompatActivity {
    private C2256a f9119p;
    private CameraSourcePreview f9120q;
    private GraphicOverlay<C2251a> f9121r;
    private boolean f9122s = false;
    Handler f9117n = new Handler();
    Runnable f9118o = new Runnable() { // from class: guide.tailor.BarCodeCaptureActivity.1
        @Override // java.lang.Runnable
        public void run() {
            if (!BarCodeCaptureActivity.this.f9122s) {
                BarCodeCaptureActivity.this.m10535n();
            }
            BarCodeCaptureActivity.this.f9117n.postDelayed(this, 500L);
        }
    };

    private void m10531a(boolean z, boolean z2) {
        BarcodeDetector build = new BarcodeDetector.Builder(getApplicationContext()).build();
        build.setProcessor(new MultiProcessor.Builder(new C2257c(this.f9121r)).build());
        if (!build.isOperational()) {
            Log.w("Barcode-reader", "Detector dependencies are not yet available.");
            if (registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
                System.out.println("Low storage");
            }
        }
        this.f9119p = new C2256a.a(getApplicationContext(), build).m10711a(0).m10712a(1600, 1024).m10710a(15.0f).m10713a(z ? "continuous-picture" : null).m10715b(z2 ? "torch" : null).m10714a();
    }

    private void m10534m() {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getApplicationContext());
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().getErrorDialog(this, isGooglePlayServicesAvailable, 9001).show();
        }
        if (this.f9119p != null) {
            this.f9120q.m10670a(this.f9119p, this.f9121r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m10535n() {
        this.f9122s = true;
        float height = (this.f9121r.getHeight() / 2.0f) / this.f9121r.getWidthScaleFactor();
        float width = (this.f9121r.getWidth() / 2.0f) / this.f9121r.getHeightScaleFactor();
        Iterator it = this.f9121r.getGraphics().iterator();
        Barcode Barcode = null;
        float f = Float.MAX_VALUE;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Barcode m10660a = ((C2251a) it.next()).m10660a();
            if (m10660a.getBoundingBox().contains((int) height, (int) width)) {
                Barcode = m10660a;
                break;
            }
            float centerX = height - m10660a.getBoundingBox().centerX();
            float centerY = width - m10660a.getBoundingBox().centerY();
            float f2 = (centerX * centerX) + (centerY * centerY);
            if (f2 < f) {
                Barcode = m10660a;
                f = f2;
            }
        }
        if (Barcode == null) {
            this.f9122s = false;
            return false;
        }
        WebStart.f9396q = Barcode.displayValue;
        Intent intent = new Intent();
        intent.putExtra("Barcode", Barcode);
        setResult(0, intent);
        this.f9117n.removeCallbacks(this.f9118o);
        finish();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bar_code_capture);
        this.f9122s = false;
        this.f9120q = (CameraSourcePreview) findViewById(R.id.preview);
        this.f9121r = (GraphicOverlay) findViewById(R.id.graphicOverlay);
        m10531a(getIntent().getBooleanExtra("AutoFocus", false), getIntent().getBooleanExtra("UseFlash", false));
        this.f9117n.postDelayed(this.f9118o, 200L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f9117n.removeCallbacks(this.f9118o);
        if (this.f9120q != null) {
            this.f9120q.m10671b();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f9120q != null) {
            this.f9120q.m10668a();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        m10534m();
    }
}
