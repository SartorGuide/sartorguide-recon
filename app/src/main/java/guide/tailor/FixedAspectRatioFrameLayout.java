package guide.tailor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class FixedAspectRatioFrameLayout extends FrameLayout {
    private int f9124a;
    private int f9125b;

    public FixedAspectRatioFrameLayout(Context context) {
        super(context);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10536a(context, attributeSet);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10536a(context, attributeSet);
    }

    private void m10536a(Context context, AttributeSet attributeSet) {
        this.f9124a = 1;
        this.f9125b = 1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = (this.f9125b * size) / this.f9124a;
        if (i3 > size2) {
            size = (this.f9124a * size2) / this.f9125b;
        } else {
            size2 = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.EXACTLY));
    }
}
