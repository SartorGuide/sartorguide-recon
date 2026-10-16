package guide.tailor.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.google.android.gms.common.images.Size;

/* loaded from: classes5.dex */
public class CameraSourcePreview extends ViewGroup {
    private Context f9461a;
    private SurfaceView f9462b;
    private boolean f9463c;
    private boolean f9464d;
    private C2256a f9465e;
    private GraphicOverlay f9466f;

    private class SurfaceHolderCallbackC2254a implements SurfaceHolder.Callback {
        private SurfaceHolderCallbackC2254a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.f9464d = true;
            try {
                CameraSourcePreview.this.m10666c();
            } catch (SecurityException e2) {
                Log.e("CameraSourcePreview", "Do not have permission to start the camera", e2);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.f9464d = false;
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9461a = context;
        this.f9463c = false;
        this.f9464d = false;
        this.f9462b = new SurfaceView(context);
        this.f9462b.getHolder().addCallback(new SurfaceHolderCallbackC2254a());
        addView(this.f9462b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10666c() {
        if (this.f9463c && this.f9464d) {
            this.f9465e.m10705a(this.f9462b.getHolder());
            if (this.f9466f != null) {
                Size m10708c = this.f9465e.m10708c();
                int min = Math.min(m10708c.getWidth(), m10708c.getHeight());
                int max = Math.max(m10708c.getWidth(), m10708c.getHeight());
                if (m10667d()) {
                    this.f9466f.m10676a(min, max, this.f9465e.m10709d());
                } else {
                    this.f9466f.m10676a(max, min, this.f9465e.m10709d());
                }
                this.f9466f.m10675a();
            }
            this.f9463c = false;
        }
    }

    private boolean m10667d() {
        int i = this.f9461a.getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        Log.d("CameraSourcePreview", "isPortraitMode returning false by default");
        return false;
    }

    public void m10668a() {
        if (this.f9465e != null) {
            this.f9465e.m10707b();
        }
    }

    public void m10669a(C2256a c2256a) {
        if (c2256a == null) {
            m10668a();
        }
        this.f9465e = c2256a;
        if (this.f9465e != null) {
            this.f9463c = true;
            m10666c();
        }
    }

    public void m10670a(C2256a c2256a, GraphicOverlay graphicOverlay) {
        this.f9466f = graphicOverlay;
        m10669a(c2256a);
    }

    public void m10671b() {
        if (this.f9465e != null) {
            this.f9465e.m10706a();
            this.f9465e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Size m10708c;
        if (this.f9465e == null || (m10708c = this.f9465e.m10708c()) == null) {
            i5 = 320;
            i6 = 240;
        } else {
            i5 = m10708c.getWidth();
            i6 = m10708c.getHeight();
        }
        if (!m10667d()) {
            int i7 = i5;
            i5 = i6;
            i6 = i7;
        }
        int i8 = i3 - i;
        int i9 = i4 - i2;
        float f = i6;
        float f2 = i5;
        int i10 = (int) ((i8 / f) * f2);
        if (i10 < i9) {
            i8 = (int) ((i9 / f2) * f);
            i10 = i9;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).layout(0, 0, i8, i10);
        }
        try {
            m10666c();
        } catch (SecurityException e2) {
            Log.e("CameraSourcePreview", "Do not have permission to start the camera", e2);
        }
    }
}
