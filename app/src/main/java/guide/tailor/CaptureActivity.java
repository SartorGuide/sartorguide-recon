package guide.tailor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes4.dex */
public class CaptureActivity extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_capture);
        if (bundle == null) {
            getFragmentManager().beginTransaction().replace(R.id.container, FragmentC2259e.m10800c()).commit();
        }
    }
}
