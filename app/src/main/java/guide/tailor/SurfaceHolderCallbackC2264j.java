package guide.tailor;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public class SurfaceHolderCallbackC2264j extends ViewGroup implements SurfaceHolder.Callback {
    SurfaceView f10131a;
    Camera.Size f10132b;
    Camera.Size f10133c;
    List<Camera.Size> f10134d;
    List<Camera.Size> f10135e;
    int f10136f;
    int f10137g;
    int f10138h;
    int f10139i;
    private SurfaceHolder f10140j;
    private Camera f10141k;
    private Camera.Parameters f10142l;

    public SurfaceHolderCallbackC2264j(Context context, Camera camera, SurfaceView surfaceView, int i, int i2, int i3, int i4) {
        super(context);
        this.f10136f = 0;
        this.f10137g = 0;
        this.f10138h = 0;
        this.f10139i = 0;
        this.f10131a = surfaceView;
        this.f10141k = camera;
        this.f10136f = i;
        this.f10137g = i2;
        this.f10138h = i3;
        this.f10139i = i4;
        this.f10140j = this.f10131a.getHolder();
        this.f10140j.addCallback(this);
        this.f10140j.setType(3);
    }

    private Camera.Size m10963a(List<Camera.Size> list, int i, int i2) {
        double d = i / i2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((size2.width / size2.height) - d) <= 0.1d && Math.abs(size2.height - i2) < d3) {
                d3 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - i2) < d2) {
                    size = size3;
                    d2 = Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    private Camera.Size m10964b(List<Camera.Size> list, int i, int i2) {
        double d = i / i2;
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((size2.width / size2.height) - d) <= 0.1d && Math.abs(size2.height - i2) < d3) {
                d3 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - i2) < d2) {
                    size = size3;
                    d2 = Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    public void m10965a() {
        if (this.f10140j.getSurface() == null) {
            return;
        }
        setCamera(this.f10141k);
        try {
            this.f10141k.setPreviewDisplay(this.f10140j);
            this.f10141k.startPreview();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m10966a(Camera.Parameters parameters) {
        try {
            this.f10141k.setParameters(parameters);
        } catch (Exception e) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!z || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (this.f10132b != null) {
            i5 = this.f10132b.width;
            i6 = this.f10132b.height;
        } else {
            i5 = i7;
            i6 = i8;
        }
        int i9 = i7 * i6;
        int i10 = i8 * i5;
        if (i9 > i10) {
            int i11 = i10 / i6;
            childAt.layout((i7 - i11) / 2, 0, (i7 + i11) / 2, i8);
        } else {
            int i12 = i9 / i5;
            childAt.layout(0, (i8 - i12) / 2, i7, (i8 + i12) / 2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int resolveSize = resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = resolveSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(resolveSize, resolveSize2);
        this.f10134d = this.f10141k.getParameters().getSupportedPreviewSizes();
        if (this.f10134d != null) {
            this.f10132b = (this.f10136f == 0 || this.f10137g == 0) ? m10963a(this.f10134d, resolveSize, resolveSize2) : m10963a(this.f10134d, this.f10136f, this.f10137g);
        }
    }

    public void setCamera(Camera camera) {
        this.f10141k = camera;
        this.f10141k.setDisplayOrientation(90);
        if (this.f10142l == null) {
            this.f10142l = this.f10141k.getParameters();
        }
        if (this.f10134d == null) {
            this.f10134d = this.f10141k.getParameters().getSupportedPreviewSizes();
        }
        if (this.f10135e == null) {
            this.f10135e = this.f10141k.getParameters().getSupportedPictureSizes();
        }
        if (this.f10132b == null) {
            this.f10132b = m10963a(this.f10134d, this.f10138h, this.f10139i);
        }
        if (this.f10133c == null) {
            this.f10133c = m10964b(this.f10135e, this.f10138h, this.f10139i);
        }
        if (this.f10142l.getSupportedFocusModes().contains("infinity")) {
            this.f10142l.setFocusMode("infinity");
        }
        this.f10142l.setPreviewSize(this.f10132b.width, this.f10132b.height);
        this.f10142l.setPictureSize(this.f10133c.width, this.f10133c.height);
        this.f10142l.setJpegQuality(85);
        this.f10141k.setParameters(this.f10142l);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            if (this.f10141k == null) {
                this.f10141k.setPreviewDisplay(surfaceHolder);
                this.f10141k.startPreview();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
