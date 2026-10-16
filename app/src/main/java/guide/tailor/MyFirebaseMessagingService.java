package guide.tailor;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private void m10539c(String str) {
        Intent intent = new Intent("DataMessage");
        intent.putExtra("data_payload", str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage RemoteMessage) {
        m10539c(new JSONObject(RemoteMessage.getData()).toString());
    }
}
