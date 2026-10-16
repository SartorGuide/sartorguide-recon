package guide.tailor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.TimedText;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class VideoActivity extends AppCompatActivity implements MediaPlayer.OnTimedTextListener {
    public Button f9356n;
    public FloatingActionButton f9357o;
    public VideoView f9358p;
    public ProgressBar f9359q;
    public MediaController f9360r;
    public TextView f9361s;
    private final String f9362t = "text/vtt";
    private final String f9363u = "application/x-subrip";
    private final String f9364v = "#CLEAR#";
    private final String f9365w = "closing_activity";
    private boolean f9366x;

    final class ViewOnClickListenerC2224a implements View.OnClickListener {
        ViewOnClickListenerC2224a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoActivity.this.m10585u();
        }
    }

    final class ViewOnClickListenerC2225b implements View.OnClickListener {
        ViewOnClickListenerC2225b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoActivity.this.m10583s();
        }
    }

    final class C2226c implements MediaPlayer.OnCompletionListener {
        C2226c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            System.out.println("videoView onComplete");
            VideoActivity.this.m10578n().setVisibility(0);
            VideoActivity.this.m10577m().setText(R.string.Loading_quide_continue_btn);
        }
    }

    static final class C2227d implements MediaPlayer.OnInfoListener {
        public static final C2227d f9370a = new C2227d();

        C2227d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            PrintStream printStream;
            String str;
            System.out.println("OnInfo " + i);
            if (i == 802) {
                printStream = System.out;
                str = "MEDIA_INFO_METADATA_UPDATE";
            } else if (i == 901) {
                printStream = System.out;
                str = "MEDIA_INFO_UNSUPPORTED_SUBTITLE";
            } else {
                if (i != 902) {
                    return true;
                }
                printStream = System.out;
                str = "MEDIA_INFO_SUBTITLE_TIMED_OUT";
            }
            printStream.println(str);
            return true;
        }
    }

    static final class C2228e implements MediaPlayer.OnErrorListener {
        public static final C2228e f9371a = new C2228e();

        C2228e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            System.out.println("OnError " + i);
            return true;
        }
    }

    final class C2229f implements MediaPlayer.OnPreparedListener {
        C2229f() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer it) {
            PrintStream printStream = null;
            String str = "";
            System.out.println("videoView onPrepared");
            try {
                it.addTimedTextSource(VideoActivity.this.m10575c(R.raw.subtitles_edit_subrip), VideoActivity.this.m10582r());
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                MediaPlayer.TrackInfo[] trackInfo = it.getTrackInfo();
                System.out.println("TrackInfo length " + trackInfo.length);
                for (int j = 0; j < trackInfo.length; j++) {
                    MediaPlayer.TrackInfo trackInfo2 = trackInfo[j];
                    if (trackInfo2 != null) {
                        if (trackInfo2.getTrackType() == 4) {
                            printStream = System.out;
                            str = "Enable subtitle track";
                        } else {
                            if (trackInfo2.getTrackType() == 3) {
                                printStream = System.out;
                                str = "Enable timed text track";
                            }
                            System.out.println(trackInfo2.toString());
                        }
                        if (printStream != null) {
                            printStream.println(str);
                        }
                        it.selectTrack(j);
                        System.out.println(trackInfo2.toString());
                    }
                }
                it.setOnTimedTextListener(VideoActivity.this);
                VideoActivity.this.m10580p().setVisibility(8);
                VideoActivity.this.m10579o().start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    final class RunnableC2230g implements Runnable {
        final boolean f9374b;
        final String f9375c;

        RunnableC2230g(boolean z, String str) {
            this.f9374b = z;
            this.f9375c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView m10581q;
            int i;
            if (this.f9374b) {
                TextView m10581q2 = VideoActivity.this.m10581q();
                String str = this.f9375c;
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                m10581q2.setText(StringsKt.trim((CharSequence) str).toString());
                m10581q = VideoActivity.this.m10581q();
                i = 0;
            } else {
                m10581q = VideoActivity.this.m10581q();
                i = 8;
            }
            m10581q.setVisibility(i);
        }
    }

    private final void m10574a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                try {
                    outputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m10575c(int i) {
        File subtitleFile = getFileStreamPath(getResources().getResourceEntryName(i));
        InputStream inputStream2 = (InputStream) null;
        try {
            InputStream inputStream = getResources().openRawResource(i);
            FileOutputStream fileOutputStream = new FileOutputStream(subtitleFile, false);
            try {
                Intrinsics.checkExpressionValueIsNotNull(inputStream, "inputStream");
                m10574a(inputStream, fileOutputStream);
                Intrinsics.checkExpressionValueIsNotNull(subtitleFile, "subtitleFile");
                String absolutePath = subtitleFile.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "subtitleFile.absolutePath");
                try {
                    inputStream.close();
                    fileOutputStream.close();
                    return absolutePath;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return absolutePath;
                }
            } catch (Exception e3) {
                inputStream2 = inputStream;
                e3.printStackTrace();
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return "";
                    }
                }
                fileOutputStream.close();
                return "";
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        throw th2;
                    }
                }
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th) {
            return "";
        }
    }

    public final void m10576a(String text, boolean z) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        TextView textView = this.f9361s;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subView");
        }
        textView.getHandler().post(new RunnableC2230g(z, text));
    }

    public final Button m10577m() {
        Button button = this.f9356n;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skipBtn");
        }
        return button;
    }

    public final FloatingActionButton m10578n() {
        FloatingActionButton floatingActionButton = this.f9357o;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("restartBtn");
        }
        return floatingActionButton;
    }

    public final VideoView m10579o() {
        VideoView videoView = this.f9358p;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        return videoView;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        m10585u();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        Objects.requireNonNull(this);
        String stringExtra = intent.getStringExtra("closing_activity");
        if (stringExtra != null && stringExtra.equals("nothing")) {
            this.f9366x = true;
        }
        View findViewById = findViewById(R.id.skiptext_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.skiptext_btn)");
        this.f9356n = (Button) findViewById;
        View findViewById2 = findViewById(R.id.restart_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.restart_btn)");
        this.f9357o = (FloatingActionButton) findViewById2;
        View findViewById3 = findViewById(R.id.videoView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.videoView)");
        this.f9358p = (VideoView) findViewById3;
        View findViewById4 = findViewById(R.id.progressBarVideo);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.progressBarVideo)");
        this.f9359q = (ProgressBar) findViewById4;
        View findViewById5 = findViewById(R.id.subText);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.subText)");
        this.f9361s = (TextView) findViewById5;
        this.f9360r = new MediaController(this);
        MediaController mediaController = this.f9360r;
        if (mediaController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaController");
        }
        VideoView videoView = this.f9358p;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        mediaController.setAnchorView(videoView);
        VideoView videoView2 = this.f9358p;
        if (videoView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        MediaController mediaController2 = this.f9360r;
        if (mediaController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaController");
        }
        videoView2.setMediaController(mediaController2);
        VideoView videoView3 = this.f9358p;
        if (videoView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.edit_points_android_hd));
        Button button = this.f9356n;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skipBtn");
        }
        button.setOnClickListener(new ViewOnClickListenerC2224a());
        FloatingActionButton floatingActionButton = this.f9357o;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("restartBtn");
        }
        floatingActionButton.setOnClickListener(new ViewOnClickListenerC2225b());
        VideoView videoView4 = this.f9358p;
        if (videoView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView4.setOnCompletionListener(new C2226c());
        VideoView videoView5 = this.f9358p;
        if (videoView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView5.setOnInfoListener(C2227d.f9370a);
        VideoView videoView6 = this.f9358p;
        if (videoView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView6.setOnErrorListener(C2228e.f9371a);
        VideoView videoView7 = this.f9358p;
        if (videoView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView7.setOnPreparedListener(new C2229f());
    }

    @Override // android.media.MediaPlayer.OnTimedTextListener
    public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
        if (timedText != null) {
            String text = timedText.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "text.text");
            Objects.requireNonNull(this);
            if (StringsKt.contains((CharSequence) text, (CharSequence) "#CLEAR#", false)) {
                m10576a("", false);
                return;
            }
            String text2 = timedText.getText();
            Intrinsics.checkExpressionValueIsNotNull(text2, "text.text");
            m10576a(text2, true);
        }
    }

    public final ProgressBar m10580p() {
        ProgressBar progressBar = this.f9359q;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pgBar");
        }
        return progressBar;
    }

    public final TextView m10581q() {
        TextView textView = this.f9361s;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subView");
        }
        return textView;
    }

    public final String m10582r() {
        Objects.requireNonNull(this);
        return "application/x-subrip";
    }

    public final void m10583s() {
        System.out.println("videoView start video");
        Button button = this.f9356n;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skipBtn");
        }
        button.setText(R.string.CalibrationActivity_dialog_no);
        FloatingActionButton floatingActionButton = this.f9357o;
        if (floatingActionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("restartBtn");
        }
        floatingActionButton.setVisibility(8);
        m10584t();
    }

    public final void m10584t() {
        VideoView videoView = this.f9358p;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.edit_points_android_hd));
    }

    public final void m10585u() {
        VideoView videoView = this.f9358p;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoV");
        }
        videoView.stopPlayback();
        if (!this.f9366x) {
            startActivity(new Intent(this, (Class<?>) ResultActivity.class));
        }
        finish();
    }
}
