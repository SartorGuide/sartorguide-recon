package guide.tailor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class C2263i extends ImageView {
    Paint f10097A;
    Paint f10098B;
    Paint f10099C;
    double f10100D;
    double f10101E;
    double f10102F;
    double f10103G;
    private boolean f10104H;
    double f10105a;
    double f10106b;
    int f10107c;
    int f10108d;
    int f10109e;
    int f10110f;
    int f10111g;
    int f10112h;
    int f10113i;
    boolean f10114j;
    boolean f10115k;
    boolean f10116l;
    boolean f10117m;
    int f10118n;
    int f10119o;
    int f10120p;
    int f10121q;
    int f10122r;
    int f10123s;
    int f10124t;
    int f10125u;
    double f10126v;
    int f10127w;
    int f10128x;
    Paint f10129y;
    Paint f10130z;

    public C2263i(Context context) {
        super(context);
        this.f10105a = 1.0d;
        this.f10106b = 1.0d;
        this.f10109e = 0;
        this.f10110f = 0;
        this.f10111g = 0;
        this.f10112h = 0;
        this.f10113i = 0;
        this.f10114j = false;
        this.f10115k = true;
        this.f10116l = false;
        this.f10117m = false;
        this.f10118n = 0;
        this.f10119o = 0;
        this.f10120p = 0;
        this.f10121q = 0;
        this.f10122r = 0;
        this.f10123s = 0;
        this.f10124t = 0;
        this.f10125u = 0;
        this.f10126v = 0.0d;
        this.f10127w = 0;
        this.f10128x = 0;
        this.f10100D = 0.0d;
        this.f10104H = false;
        this.f10101E = 0.02856d;
        this.f10102F = 0.29145d;
        this.f10103G = 0.0d;
        this.f10129y = new Paint();
        this.f10130z = new Paint();
        this.f10097A = new Paint();
        this.f10097A.setAntiAlias(true);
        this.f10098B = new Paint();
        this.f10098B.setAntiAlias(true);
        this.f10099C = new Paint();
        this.f10099C.setAntiAlias(true);
        this.f10129y.setStyle(Paint.Style.FILL);
        this.f10129y.setAntiAlias(true);
        this.f10130z.setStyle(Paint.Style.STROKE);
        this.f10130z.setStrokeWidth(4.0f);
        this.f10130z.setAntiAlias(true);
        this.f10129y.setColor(Color.parseColor("#FFFFFF"));
        this.f10130z.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public void m10959a(double d) {
        this.f10100D = d;
        if (this.f10100D > 0.0d) {
            this.f10100D = -1.0d;
        }
        invalidate();
    }

    public void m10960a(double d, int i, int i2) {
        try {
            this.f10126v = d;
            this.f10103G = (i * 0.5d) / Math.tan(0.5d * d);
            double d2 = i2;
            this.f10120p = (int) Math.round(d2 / 6.0d);
            this.f10122r = (int) Math.round((2.0d * d2) / 3.0d);
            this.f10121q = this.f10120p + this.f10122r;
        } catch (Exception e) {
        }
    }

    public void m10961a(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            this.f10106b = i / i6;
            this.f10105a = i3 / i5;
            this.f10107c = i5;
            this.f10108d = i6;
        } catch (Exception e) {
        }
    }

    public void m10962a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        this.f10127w = i6;
        this.f10128x = i5;
        if (i == 0 && i2 == 0) {
            this.f10113i++;
            if (this.f10113i > 3) {
                this.f10109e = 0;
                this.f10110f = 0;
                this.f10111g = 0;
                this.f10112h = 0;
            }
        } else {
            this.f10113i = 0;
            this.f10109e = (int) (this.f10106b * (this.f10108d - i));
            this.f10110f = (int) (this.f10106b * (this.f10108d - i2));
            this.f10111g = (int) (this.f10105a * (this.f10107c - i3));
            this.f10112h = (int) (this.f10105a * (this.f10107c - i4));
            this.f10109e = (this.f10109e - ((int) ((this.f10109e - this.f10110f) * 0.3d))) + ((int) ((this.f10112h - this.f10111g) * 0.5d));
            this.f10110f = (this.f10110f + ((int) ((this.f10109e - this.f10110f) * 0.3d))) - ((int) ((this.f10112h - this.f10111g) * 0.5d));
        }
        if (this.f10104H) {
            this.f10109e = getHeight() - this.f10109e;
            this.f10110f = getHeight() - this.f10110f;
            this.f10111g = getWidth() - this.f10111g;
            this.f10112h = getWidth() - this.f10112h;
        }
        this.f10114j = z;
        this.f10115k = z2;
        this.f10116l = z3;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        if (r14.f10100D >= 0.0d) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        r5 = ((int) (r14.f10100D * (-1.0d))) - 1;
        r14.f10097A.setTextSize(300.0f);
        r14.f10097A.setStrokeWidth(20.0f);
        r14.f10097A.setTextAlign(android.graphics.Paint.Align.CENTER);
        r14.f10097A.setStyle(android.graphics.Paint.Style.STROKE);
        r14.f10097A.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        r14.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        if (r14.f10114j == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        r15.drawText(java.lang.String.valueOf(r5), r14.f10128x / 2, (r14.f10127w / 2) + 150, r14.f10097A);
        r14.f10097A.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        r14.f10097A.setStrokeWidth(0.0f);
        r14.f10097A.setColor(-1);
        r1 = java.lang.String.valueOf(r5);
        r2 = r14.f10128x / 2;
        r3 = (r14.f10127w / 2) + 150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0129, code lost:
    
        r15.drawText(r1, r2, r3, r14.f10097A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e7, code lost:
    
        r15.drawText(java.lang.String.valueOf(r5), (r14.f10128x * 4) / 5, ((int) (r14.f10127w * 0.9d)) + 33, r14.f10097A);
        r14.f10097A.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        r14.f10097A.setStrokeWidth(0.0f);
        r14.f10097A.setColor(-1);
        r1 = java.lang.String.valueOf(r5);
        r2 = (r14.f10128x * 4) / 5;
        r3 = ((int) (r14.f10127w * 0.9d)) + 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r14.f10114j == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r14.f10114j == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r1 = r14.f10097A;
        r1.setStrokeWidth(4.0f);
        r14.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, android.graphics.Color.parseColor("#73798c"));
        r14.f10097A.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas a0) {
        Paint a1;
        String s0;
        String s1;
        float f0;
        int i2;
        if (this.f10127w != 0) {
            super.onDraw(a0);
            int i0 = this.f10111g;
            if (i0 == 0) {
                int i1 = this.f10112h;
                if (i1 == 0) {
                    if (this.f10114j) {
                        Paint a2 = this.f10097A;
                        a2.setStrokeWidth(4.0f);
                        this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                        this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    }
                } else {
                    this.f10097A.setStrokeWidth(10.0f);
                    this.f10097A.setStyle(Paint.Style.STROKE);
                    if (this.f10114j) {
                        a1 = this.f10097A;
                        s0 = "#950404";
                    } else {
                        a1 = this.f10097A;
                        s0 = "#022A44";
                    }
                    a1.setColor(Color.parseColor(s0));
                    a0.drawArc(this.f10111g, this.f10110f, this.f10112h, this.f10109e, 0.0f, 360.0f, true, this.f10097A);
                    if (this.f10114j) {
                        Paint a3 = this.f10097A;
                        a3.setStrokeWidth(4.0f);
                        this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                        this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    }
                }
            } else {
                this.f10097A.setStrokeWidth(10.0f);
                this.f10097A.setStyle(Paint.Style.STROKE);
                if (this.f10114j) {
                    a1 = this.f10097A;
                    s0 = "#950404";
                } else {
                    a1 = this.f10097A;
                    s0 = "#022A44";
                }
                a1.setColor(Color.parseColor(s0));
                a0.drawArc(this.f10111g, this.f10110f, this.f10112h, this.f10109e, 0.0f, 360.0f, true, this.f10097A);
                if (this.f10114j) {
                    Paint a4 = this.f10097A;
                    a4.setStrokeWidth(4.0f);
                    this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                }
            }
            if (this.f10100D < 0.0d) {
                int i3 = ((int) (this.f10100D * (-1.0d))) - 1;
                this.f10097A.setTextSize(300.0f);
                this.f10097A.setStrokeWidth(20.0f);
                this.f10097A.setTextAlign(Paint.Align.CENTER);
                this.f10097A.setStyle(Paint.Style.STROKE);
                this.f10097A.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
                if (this.f10114j) {
                    a0.drawText(String.valueOf(i3), this.f10128x / 2, (this.f10127w / 2) + 150, this.f10097A);
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.f10097A.setStrokeWidth(0.0f);
                    this.f10097A.setColor(-1);
                    s1 = String.valueOf(i3);
                    f0 = this.f10128x / 2;
                    i2 = (this.f10127w / 2) + 150;
                } else {
                    a0.drawText(String.valueOf(i3), (this.f10128x * 4) / 5, ((int) (((double) this.f10127w) * 0.9d)) + 33, this.f10097A);
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.f10097A.setStrokeWidth(0.0f);
                    this.f10097A.setColor(-1);
                    s1 = String.valueOf(i3);
                    f0 = (this.f10128x * 4) / 5;
                    i2 = ((int) (((double) this.f10127w) * 0.9d)) + 33;
                }
                a0.drawText(s1, f0, i2, this.f10097A);
            }
        }
    }

    public void setOrientation(boolean z) {
        this.f10104H = z;
    }
}
