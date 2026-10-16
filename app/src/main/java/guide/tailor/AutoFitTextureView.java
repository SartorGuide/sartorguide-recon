package guide.tailor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes4.dex */
public class AutoFitTextureView extends TextureView {
    private int f9115a;
    private int f9116b;

    public AutoFitTextureView(Context context) {
        this(context, null);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9115a = 0;
        this.f9116b = 0;
    }

    public void m10530a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f9115a = i;
        this.f9116b = i2;
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f9115a != 0 && this.f9116b != 0) {
            if (size < (this.f9115a * size2) / this.f9116b) {
                size2 = (this.f9116b * size) / this.f9115a;
            } else {
                size = (this.f9115a * size2) / this.f9116b;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
