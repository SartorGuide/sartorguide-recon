package guide.tailor;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class NonSwipeableViewPager extends ViewPager {
    private boolean f9126d;

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9126d = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9126d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f9126d) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                System.out.println(e.toString());
                return false;
            }
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.f9126d = z;
    }
}
