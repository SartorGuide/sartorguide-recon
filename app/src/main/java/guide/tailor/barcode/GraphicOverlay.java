package guide.tailor.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import guide.tailor.barcode.GraphicOverlay.AbstractC2255a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* loaded from: classes5.dex */
public class GraphicOverlay<T extends AbstractC2255a> extends View {
    private final Object f9468a;
    private int f9469b;
    private float f9470c;
    private int f9471d;
    private float f9472e;
    private int f9473f;
    private Set<T> f9474g;

    public static abstract class AbstractC2255a {
        private GraphicOverlay f9475a;

        public abstract void mo10662a(Canvas canvas);

        public AbstractC2255a(GraphicOverlay graphicOverlay) {
            this.f9475a = graphicOverlay;
        }

        public float m10679a(float f) {
            return this.f9475a.f9470c * f;
        }

        public float m10680b(float f) {
            return this.f9475a.f9472e * f;
        }

        public void m10681b() {
            this.f9475a.postInvalidate();
        }

        public float m10682c(float f) {
            return this.f9475a.f9473f == 1 ? this.f9475a.getWidth() - m10679a(f) : m10679a(f);
        }

        public float m10683d(float f) {
            return m10680b(f);
        }
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9468a = new Object();
        this.f9470c = 1.0f;
        this.f9472e = 1.0f;
        this.f9473f = 0;
        this.f9474g = new HashSet();
    }

    public void m10675a() {
        synchronized (this.f9468a) {
            this.f9474g.clear();
        }
        postInvalidate();
    }

    public void m10676a(int i, int i2, int i3) {
        synchronized (this.f9468a) {
            this.f9469b = i;
            this.f9471d = i2;
            this.f9473f = i3;
        }
        postInvalidate();
    }

    public void m10677a(T t) {
        synchronized (this.f9468a) {
            this.f9474g.add(t);
        }
        postInvalidate();
    }

    public void m10678b(T t) {
        synchronized (this.f9468a) {
            this.f9474g.remove(t);
        }
        postInvalidate();
    }

    public List<T> getGraphics() {
        Vector vector;
        synchronized (this.f9468a) {
            vector = new Vector(this.f9474g);
        }
        return vector;
    }

    public float getHeightScaleFactor() {
        return this.f9472e;
    }

    public float getWidthScaleFactor() {
        return this.f9470c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.f9468a) {
            if (this.f9469b != 0 && this.f9471d != 0) {
                this.f9470c = canvas.getWidth() / this.f9469b;
                this.f9472e = canvas.getHeight() / this.f9471d;
            }
            Iterator<T> it = this.f9474g.iterator();
            while (it.hasNext()) {
                it.next().mo10662a(canvas);
            }
        }
    }
}
