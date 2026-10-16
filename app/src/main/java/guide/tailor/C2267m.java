package guide.tailor;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class C2267m extends PagerAdapter {
    AnimationDrawable f10146a;
    public Timer f10148c;
    private Context f10154i;
    private LayoutInflater f10155j;
    private Date f10156k;
    private Date f10157l;
    private int[] f10149d = {R.raw.head_anim_woman, R.raw.point_anim_woman, R.drawable.perspective_animation_woman};
    private int[] f10150e = {R.string.info_head_line, R.string.info_edit_points, R.string.info_perspective};
    private String[] f10151f = {"shared_anim", "shared_anim", ""};
    private boolean[] f10152g = {true, true, true};
    private boolean[] f10153h = {true, true, false};
    final Handler f10147b = new Handler();

    public C2267m(Context context) {
        this.f10154i = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f10155j = (LayoutInflater) this.f10154i.getSystemService("layout_inflater");
        View inflate = this.f10155j.inflate(R.layout.info_swipe, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.progress_view_image);
        TextView textView = (TextView) inflate.findViewById(R.id.progress_view_text);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.swipe_animation_view);
        if (this.f10153h[i]) {
            imageView.setImageDrawable(null);
            imageView.setBackground(null);
            lottieAnimationView.setImageAssetsFolder(this.f10151f[i]);
            lottieAnimationView.setAnimation(this.f10149d[i]);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.playAnimation();
            imageView.setVisibility(8);
        } else {
            lottieAnimationView.setVisibility(8);
            if (this.f10152g[i]) {
                imageView.setImageDrawable(null);
                imageView.setBackgroundResource(this.f10149d[i]);
                this.f10146a = (AnimationDrawable) imageView.getBackground();
                this.f10146a.start();
            } else {
                imageView.setImageResource(this.f10149d[i]);
                imageView.setBackground(null);
            }
        }
        textView.setText(this.f10150e[i]);
        viewGroup.addView(inflate);
        return inflate;
    }

    public void m10974a(final ViewPager viewPager, final int i) {
        this.f10156k = Calendar.getInstance().getTime();
        final int length = this.f10149d.length;
        final Runnable runnable = new Runnable() { // from class: guide.tailor.C2267m.1
            int f10158a;
            int f10159b = 0;

            {
                this.f10158a = length;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f10159b == this.f10158a) {
                    this.f10159b = 0;
                }
                ViewPager viewPager2 = viewPager;
                int i2 = this.f10159b;
                this.f10159b = i2 + 1;
                viewPager2.setCurrentItem(i2, true);
            }
        };
        this.f10148c = new Timer();
        this.f10148c.schedule(new TimerTask() { // from class: guide.tailor.C2267m.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C2267m.this.f10157l = Calendar.getInstance().getTime();
                if (C2267m.this.f10157l.getTime() - C2267m.this.f10156k.getTime() >= (i - 2) * 1000) {
                    C2267m.this.f10147b.post(runnable);
                }
            }
        }, 3000L, 3000L);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: guide.tailor.C2267m.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                C2267m.this.f10156k = Calendar.getInstance().getTime();
            }
        });
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((LinearLayout) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f10149d.length;
    }

    public void m10975c() {
        if (WebStart.f9382G.equals("male")) {
            this.f10149d = new int[]{R.raw.head_anim_man, R.raw.point_anim_man, R.drawable.perspective_animation_man};
            this.f10151f = new String[]{"shared_anim", "shared_anim", ""};
        }
    }
}
