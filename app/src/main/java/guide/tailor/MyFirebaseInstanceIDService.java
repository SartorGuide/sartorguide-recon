package guide.tailor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/* loaded from: classes4.dex */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private void m10537a(String str) {
        Intent intent = new Intent("tokenUpdate");
        intent.putExtra("refreshedToken", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void m10538b(String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putString("token", str);
        edit.apply();
    }

    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void onTokenRefresh() {
        String getToken = FirebaseInstanceId.getInstance().getToken();
        m10538b(getToken);
        m10537a(getToken);
    }
}
