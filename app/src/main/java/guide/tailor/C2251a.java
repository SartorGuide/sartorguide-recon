package guide.tailor;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.vision.barcode.Barcode;
import guide.tailor.barcode.GraphicOverlay;

/* loaded from: classes4.dex */
public class C2251a extends GraphicOverlay.AbstractC2255a {
    private static final int[] f9453b = {-16776961, -16711681, -16711936};
    private static int f9454c;
    private int f9455a;
    private Paint f9456d;
    private Paint f9457e;
    private volatile Barcode f9458f;

    C2251a(GraphicOverlay graphicOverlay) {
        super(graphicOverlay);
        this.f9456d = new Paint();
        this.f9456d.setColor(Color.argb(255, 0, FacebookRequestErrorClassification.EC_INVALID_SESSION, 255));
        this.f9456d.setStyle(Paint.Style.STROKE);
        this.f9456d.setStrokeWidth(6.0f);
        this.f9457e = new Paint();
        this.f9457e.setColor(Color.argb(255, 0, FacebookRequestErrorClassification.EC_INVALID_SESSION, 255));
        this.f9457e.setTextSize(36.0f);
    }

    public Barcode m10660a() {
        return this.f9458f;
    }

    public void m10661a(int i) {
        this.f9455a = i;
    }

    @Override // guide.tailor.barcode.GraphicOverlay.AbstractC2255a
    public void mo10662a(Canvas canvas) {
        Barcode Barcode = this.f9458f;
        if (Barcode == null) {
            return;
        }
        RectF rectF = new RectF(Barcode.getBoundingBox());
        rectF.left = m10682c(rectF.left);
        rectF.top = m10683d(rectF.top);
        rectF.right = m10682c(rectF.right);
        rectF.bottom = m10683d(rectF.bottom);
        canvas.drawRect(rectF, this.f9456d);
    }

    void m10663a(Barcode Barcode) {
        this.f9458f = Barcode;
        m10681b();
    }
}
