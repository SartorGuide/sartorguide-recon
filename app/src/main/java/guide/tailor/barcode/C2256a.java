package guide.tailor.barcode;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class C2256a {
    private Context f9476a;
    private final Object f9477b;
    private Camera f9478c;
    private int f9479d;
    private int f9480e;
    private Size f9481f;
    private float f9482g;
    private int f9483h;
    private int f9484i;
    private String f9485j;
    private String f9486k;
    private Thread f9487l;
    private c f9488m;
    private Map<byte[], ByteBuffer> f9489n;

    public static class a {
        private final Detector<?> f9490a;
        private C2256a f9491b = new C2256a();

        public a(Context context, Detector<?> Detector) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (Detector == null) {
                throw new IllegalArgumentException("No detector supplied.");
            }
            this.f9490a = Detector;
            this.f9491b.f9476a = context;
        }

        public a m10710a(float f) {
            if (f > 0.0f) {
                this.f9491b.f9482g = f;
                return this;
            }
            throw new IllegalArgumentException("Invalid fps: " + f);
        }

        public a m10711a(int i) {
            if (i == 0 || i == 1) {
                this.f9491b.f9479d = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid camera: " + i);
        }

        public a m10712a(int i, int i2) {
            if (i > 0 && i <= 1000000 && i2 > 0 && i2 <= 1000000) {
                this.f9491b.f9483h = i;
                this.f9491b.f9484i = i2;
                return this;
            }
            throw new IllegalArgumentException("Invalid preview size: " + i + "x" + i2);
        }

        public a m10713a(String str) {
            this.f9491b.f9485j = str;
            return this;
        }

        public C2256a m10714a() {
            C2256a c2256a = this.f9491b;
            C2256a c2256a2 = this.f9491b;
            c2256a2.getClass();
            Objects.requireNonNull(c2256a2);
            c2256a.f9488m = c2256a2.new c(this.f9490a);
            return this.f9491b;
        }

        public a m10715b(String str) {
            this.f9491b.f9486k = str;
            return this;
        }
    }

    private class b implements Camera.PreviewCallback {
        private b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C2256a.this.f9488m.m10718a(bArr, camera);
        }
    }

    private class c implements Runnable {
        static final boolean f9493a = true;
        private Detector<?> f9495c;
        private long f9499g;
        private ByteBuffer f9501i;
        private long f9496d = SystemClock.elapsedRealtime();
        private final Object f9497e = new Object();
        private boolean f9498f = f9493a;
        private int f9500h = 0;

        c(Detector<?> Detector) {
            this.f9495c = Detector;
        }

        void m10716a() {
            this.f9495c.release();
            this.f9495c = null;
        }

        void m10717a(boolean z) {
            synchronized (this.f9497e) {
                this.f9498f = z;
                this.f9497e.notifyAll();
            }
        }

        void m10718a(byte[] bArr, Camera camera) {
            synchronized (this.f9497e) {
                if (this.f9501i != null) {
                    camera.addCallbackBuffer(this.f9501i.array());
                    this.f9501i = null;
                }
                if (!C2256a.this.f9489n.containsKey(bArr)) {
                    Log.d("OpenCameraSource", "Skipping frame.  Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.f9499g = SystemClock.elapsedRealtime() - this.f9496d;
                this.f9500h++;
                this.f9501i = (ByteBuffer) C2256a.this.f9489n.get(bArr);
                this.f9497e.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Frame build;
            while (true) {
                synchronized (this.f9497e) {
                    while (this.f9498f && this.f9501i == null) {
                        try {
                            this.f9497e.wait();
                        } catch (InterruptedException e) {
                            Log.d("OpenCameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    }
                    if (!this.f9498f) {
                        return;
                    }
                    build = new Frame.Builder().setImageData(this.f9501i, C2256a.this.f9481f.getWidth(), C2256a.this.f9481f.getHeight(), 17).setId(this.f9500h).setTimestampMillis(this.f9499g).setRotation(C2256a.this.f9480e).build();
                    ByteBuffer byteBuffer = this.f9501i;
                    this.f9501i = null;
                }
                try {
                    this.f9495c.receiveFrame(build);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    private static class d {
        private Size f9502a;
        private Size f9503b;

        public d(Camera.Size size, Camera.Size size2) {
            this.f9502a = new Size(size.width, size.height);
            if (size2 != null) {
                this.f9503b = new Size(size2.width, size2.height);
            }
        }

        public Size m10719a() {
            return this.f9502a;
        }

        public Size m10720b() {
            return this.f9503b;
        }
    }

    private C2256a() {
        this.f9477b = new Object();
        this.f9479d = 0;
        this.f9482g = 30.0f;
        this.f9483h = 1024;
        this.f9484i = 768;
        this.f9485j = null;
        this.f9486k = null;
        this.f9489n = new HashMap();
    }

    private static int m10685a(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    private static d m10690a(Camera camera, int i, int i2) {
        d dVar = null;
        int i3 = Integer.MAX_VALUE;
        for (d dVar2 : m10692a(camera)) {
            Size m10719a = dVar2.m10719a();
            int abs = Math.abs(m10719a.getWidth() - i) + Math.abs(m10719a.getHeight() - i2);
            if (abs < i3) {
                dVar = dVar2;
                i3 = abs;
            }
        }
        return dVar;
    }

    private static List<d> m10692a(Camera camera) {
        Camera.Size next;
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Math.abs(f - (next.width / next.height)) < 0.01f) {
                        break;
                    }
                }
            }
            arrayList.add(new d(size, next));
        }
        if (arrayList.size() == 0) {
            Log.w("OpenCameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            while (it2.hasNext()) {
                arrayList.add(new d(it2.next(), null));
            }
        }
        return arrayList;
    }

    private void m10693a(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        int rotation = ((WindowManager) this.f9476a.getSystemService("window")).getDefaultDisplay().getRotation();
        int i4 = 0;
        switch (rotation) {
            case 0:
                break;
            case 1:
                i4 = 90;
                break;
            case 2:
                i4 = 180;
                break;
            case 3:
                i4 = 270;
                break;
            default:
                Log.e("OpenCameraSource", "Bad rotation value: " + rotation);
                break;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (cameraInfo.orientation + i4) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i4) + 360) % 360;
            i3 = i2;
        }
        this.f9480e = i2 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i2);
    }

    private byte[] m10694a(Size Size) {
        byte[] bArr = new byte[((int) Math.ceil(((Size.getHeight() * Size.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f9489n.put(bArr, wrap);
        return bArr;
    }

    private int[] m10695a(Camera camera, float f) {
        int i = (int) (1000.0f * f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (abs < i2) {
                iArr = iArr2;
                i2 = abs;
            }
        }
        return iArr;
    }

    private Camera m10703e() {
        int m10685a = m10685a(this.f9479d);
        if (m10685a == -1) {
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera open = Camera.open(m10685a);
        d m10690a = m10690a(open, this.f9483h, this.f9484i);
        if (m10690a == null) {
            throw new RuntimeException("Could not find suitable preview size.");
        }
        Size m10720b = m10690a.m10720b();
        this.f9481f = m10690a.m10719a();
        int[] m10695a = m10695a(open, this.f9482g);
        if (m10695a == null) {
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters = open.getParameters();
        if (m10720b != null) {
            parameters.setPictureSize(m10720b.getWidth(), m10720b.getHeight());
        }
        parameters.setPreviewSize(this.f9481f.getWidth(), this.f9481f.getHeight());
        parameters.setPreviewFpsRange(m10695a[0], m10695a[1]);
        parameters.setPreviewFormat(17);
        m10693a(open, parameters, m10685a);
        if (this.f9485j != null) {
            if (parameters.getSupportedFocusModes().contains(this.f9485j)) {
                parameters.setFocusMode(this.f9485j);
            } else {
                Log.i("OpenCameraSource", "Camera focus mode: " + this.f9485j + " is not supported on this device.");
            }
        }
        this.f9485j = parameters.getFocusMode();
        if (this.f9486k != null && parameters.getSupportedFlashModes() != null) {
            if (parameters.getSupportedFlashModes().contains(this.f9486k)) {
                parameters.setFlashMode(this.f9486k);
            } else {
                Log.i("OpenCameraSource", "Camera flash mode: " + this.f9486k + " is not supported on this device.");
            }
        }
        this.f9486k = parameters.getFlashMode();
        open.setParameters(parameters);
        open.setPreviewCallbackWithBuffer(new b());
        open.addCallbackBuffer(m10694a(this.f9481f));
        open.addCallbackBuffer(m10694a(this.f9481f));
        open.addCallbackBuffer(m10694a(this.f9481f));
        open.addCallbackBuffer(m10694a(this.f9481f));
        return open;
    }

    public C2256a m10705a(SurfaceHolder surfaceHolder) {
        synchronized (this.f9477b) {
            if (this.f9478c != null) {
                return this;
            }
            this.f9478c = m10703e();
            try {
                this.f9478c.setPreviewDisplay(surfaceHolder);
                this.f9478c.startPreview();
                this.f9487l = new Thread(this.f9488m);
                this.f9488m.m10717a(true);
                this.f9487l.start();
                return this;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void m10706a() {
        synchronized (this.f9477b) {
            m10707b();
            this.f9488m.m10716a();
        }
    }

    public void m10707b() {
        Object a0 = this.f9477b;
        synchronized (a0) {
            try {
                this.f9488m.m10717a(false);
                if (this.f9487l != null) {
                    try {
                        this.f9487l.join();
                    } catch (InterruptedException e) {
                        Log.d("OpenCameraSource", "Frame processing thread interrupted on release.");
                    }
                    this.f9487l = null;
                }
                this.f9489n.clear();
                if (this.f9478c != null) {
                    this.f9478c.stopPreview();
                    this.f9478c.setPreviewCallbackWithBuffer(null);
                    int i0 = Build.VERSION.SDK_INT;
                    try {
                        if (i0 < 11) {
                            this.f9478c.setPreviewDisplay(null);
                        } else {
                            this.f9478c.setPreviewTexture(null);
                        }
                    } catch (Exception a1) {
                        Log.e("OpenCameraSource", "Failed to clear camera preview: " + a1);
                    }
                    this.f9478c.release();
                    this.f9478c = null;
                }
            } finally {
            }
        }
    }

    public Size m10708c() {
        return this.f9481f;
    }

    public int m10709d() {
        return this.f9479d;
    }
}
