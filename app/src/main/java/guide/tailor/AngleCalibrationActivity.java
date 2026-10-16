package guide.tailor;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.p127a.p128a.C2275c;
import org.p127a.p128a.C2276d;
import org.p127a.p128a.C2277e;
import org.p127a.p128a.InterfaceC2273a;

/* loaded from: classes4.dex */
public final class AngleCalibrationActivity extends AppCompatActivity {
    private SensorEventListener f9034C;
    private boolean f9035D;
    private float f9037F;
    private float f9038G;
    private float f9041J;
    private float f9042K;
    private float f9045N;
    private float f9046O;
    private int f9058aA;
    private int f9064af;
    private boolean f9071am;
    private float f9072an;
    private float f9073ao;
    private float f9074ap;
    private float f9075aq;
    private float f9076ar;
    private float f9077as;
    private float f9081aw;
    private float f9082ax;
    private int f9084az;
    public SensorManager f9085n;
    public SoundPool f9086o;
    public AudioManager f9087p;
    private ProgressBar f9088q;
    private ImageView f9089r;
    private TextView f9090s;
    private TextView f9091t;
    private FrameLayout f9092u;
    private ProgressBar f9093v;
    private TextView f9094w;
    private Sensor f9095x;
    private Sensor f9096y;
    private float[] f9097z = new float[3];
    private float[] f9032A = new float[3];
    private boolean f9033B = true;
    private final double f9036E = 30.0d;
    private final float f9039H = 0.3f;
    private final float f9040I = 0.3f;
    private float f9043L = 1.0f;
    private float f9044M = 1.0f;
    private final float f9047P = -0.4f;
    private final float f9048Q = 0.4f;
    private final float f9049R = -0.5f;
    private final float f9050S = 0.5f;
    private float f9051T = 90.0f;
    private float f9052U = 5.0f;
    private float f9053V = 12.0f;
    private final float f9054W = 3.0f;
    private final float f9055X = 1.0f;
    private final float f9056Y = 3.0f;
    private final float f9057Z = 3.0f;
    private float f9059aa = 90.0f;
    private float f9060ab = 80.0f;
    private float f9061ac = 290.0f;
    private final float f9062ad = -0.013f;
    private int f9063ae = 1;
    private final int f9065ag = 20;
    private final int f9066ah = 20;
    private ArrayList<Float> f9067ai = new ArrayList<>();
    private float[] f9068aj = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    private float[] f9069ak = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private ArrayList<Float> f9070al = new ArrayList<>();
    private final float f9078at = 0.04f;
    private final int f9079au = 9;
    private float f9080av = 0.05f;
    private final float f9083ay = 9.81f;

    final class C2211a implements Function1<C2276d<AngleCalibrationActivity>, Unit> {

        final class AnonymousClass1 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.m10481f(it).setVisibility(0);
            }
        }

        final class AnonymousClass2 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass2() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.m10481f(it).setVisibility(8);
            }
        }

        final class AnonymousClass3 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass3() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.m10481f(it).setVisibility(8);
            }
        }

        final class AnonymousClass4 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass4() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10502a(true, false, false, it.m10527x());
            }
        }

        final class AnonymousClass5 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass5() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10496N();
            }
        }

        final class AnonymousClass6 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass6() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10502a(true, false, false, it.m10527x());
            }
        }

        final class AnonymousClass7 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass7() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10496N();
            }
        }

        final class AnonymousClass8 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass8() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10502a(false, false, false, 0);
            }
        }

        final class AnonymousClass9 implements Function1<AngleCalibrationActivity, Unit> {
            AnonymousClass9() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(AngleCalibrationActivity angleCalibrationActivity) {
                a2(angleCalibrationActivity);
                return Unit.INSTANCE;
            }

            public final void a2(AngleCalibrationActivity it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                it.m10515k(it.f9037F);
                if (it.f9035D) {
                    return;
                }
                AngleCalibrationActivity.m10482g(it).setText("aY = " + String.valueOf(it.m10521r()) + " aZ = " + String.valueOf(it.m10520q()));
            }
        }

        C2211a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(C2276d<AngleCalibrationActivity> c2276d) {
            a2(c2276d);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0359  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0358 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        /* JADX WARN: Code duplicated, block: B:106:0x0359  */
        /* JADX WARN: Code duplicated, block: B:119:0x0358 A[SYNTHETIC] */
        public final void a2(C2276d receiver) {
            boolean b;
            boolean b0;
            Function1 a3 = null;
            int i0;
            Function1 a2;
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            while (!AngleCalibrationActivity.this.f9035D) {
                float[] a1 = AngleCalibrationActivity.this.m10472Q();
                AngleCalibrationActivity.this.f9037F = (a1[0] * 0.3f) + (AngleCalibrationActivity.this.f9037F * 0.7f);
                AngleCalibrationActivity.this.f9038G = (a1[1] * 0.3f) + (0.7f * AngleCalibrationActivity.this.f9038G);
                AngleCalibrationActivity.this.m10513i((AngleCalibrationActivity.this.m10490H() * AngleCalibrationActivity.this.m10521r()) + ((1.0f - AngleCalibrationActivity.this.m10490H()) * AngleCalibrationActivity.this.m10491I()));
                AngleCalibrationActivity.this.m10514j((AngleCalibrationActivity.this.m10490H() * AngleCalibrationActivity.this.m10520q()) + ((1.0f - AngleCalibrationActivity.this.m10490H()) * AngleCalibrationActivity.this.m10492J()));
                if (AngleCalibrationActivity.this.m10492J() != AngleCalibrationActivity.this.m10486D()) {
                    AngleCalibrationActivity.this.m10510f(AngleCalibrationActivity.this.m10492J() - AngleCalibrationActivity.this.m10486D());
                    AngleCalibrationActivity.this.m10509e(AngleCalibrationActivity.this.m10492J());
                }
                int i = AngleCalibrationActivity.this.m10526w();
                if (i == 2 && Math.abs(AngleCalibrationActivity.this.f9037F) < AngleCalibrationActivity.this.m10489G()) {
                    if (AngleCalibrationActivity.this.f9035D) {
                        return;
                    }
                    float f = AngleCalibrationActivity.this.m10487E() * (-1.0f);
                    float f0 = AngleCalibrationActivity.this.m10488F();
                    if (f > f0) {
                        i0 = 1;
                    } else {
                        i0 = f == f0 ? 0 : -1;
                    }
                    if (i0 > 0) {
                        if (AngleCalibrationActivity.m10481f(AngleCalibrationActivity.this).getVisibility() == 8) {
                            a2 = new AnonymousClass1();
                            C2277e.m11052a(receiver, a2);
                        }
                    } else if (AngleCalibrationActivity.m10481f(AngleCalibrationActivity.this).getVisibility() == 0) {
                        a2 = new AnonymousClass2();
                        C2277e.m11052a(receiver, a2);
                    }
                    if (AngleCalibrationActivity.this.m10491I() > AngleCalibrationActivity.this.m10485C()) {
                        AngleCalibrationActivity.this.m10506c(AngleCalibrationActivity.this.m10491I());
                        AngleCalibrationActivity.this.m10508d(AngleCalibrationActivity.this.m10492J());
                        AngleCalibrationActivity.this.m10511g(AngleCalibrationActivity.this.m10487E());
                        AngleCalibrationActivity.this.m10512h(AngleCalibrationActivity.this.f9038G);
                    }
                } else {
                    if (AngleCalibrationActivity.this.f9035D) {
                        return;
                    }
                    if (AngleCalibrationActivity.m10481f(AngleCalibrationActivity.this).getVisibility() == 0) {
                        C2277e.m11052a(receiver, new AnonymousClass3());
                    }
                }
                int i1 = AngleCalibrationActivity.this.m10526w();
                if (i1 != 1 || (AngleCalibrationActivity.this.m10521r() > AngleCalibrationActivity.this.m10522s() && AngleCalibrationActivity.this.m10521r() < AngleCalibrationActivity.this.m10523t())) {
                    b = true;
                } else {
                    b = false;
                }
                int i2 = AngleCalibrationActivity.this.m10526w();
                if (i2 == 1 ? Math.abs(AngleCalibrationActivity.this.f9037F - AngleCalibrationActivity.this.m10524u()) > AngleCalibrationActivity.this.m10525v() : !(AngleCalibrationActivity.this.m10526w() == 2 && AngleCalibrationActivity.this.f9037F < 0.0f && AngleCalibrationActivity.this.m10524u() - AngleCalibrationActivity.this.f9037F > (-AngleCalibrationActivity.this.m10525v()))) {
                    b0 = false;
                } else {
                    b0 = true;
                }
                if (AngleCalibrationActivity.this.f9035D) {
                    return;
                }
                if (!b0 || !b) {
                    AngleCalibrationActivity.this.m10507c(0);
                    a3 = new AnonymousClass8();
                } else {
                    AngleCalibrationActivity a4 = AngleCalibrationActivity.this;
                    a4.m10507c(a4.m10527x() + 1);
                    int i3 = AngleCalibrationActivity.this.m10526w();
                    if (i3 != 1) {
                        if (AngleCalibrationActivity.this.m10526w() == 2) {
                            C2277e.m11052a(receiver, new AnonymousClass6());
                            if (AngleCalibrationActivity.this.m10527x() == AngleCalibrationActivity.this.m10529z() * 1) {
                                AngleCalibrationActivity.this.m10505b(true);
                                a3 = new AnonymousClass7();
                            }
                        }
                    } else {
                        C2277e.m11052a(receiver, new AnonymousClass4());
                        int i4 = AngleCalibrationActivity.this.m10527x();
                        if (i4 != AngleCalibrationActivity.this.m10528y() * 1) {
                            if (i4 != AngleCalibrationActivity.this.m10528y() * 2) {
                                if (i4 == AngleCalibrationActivity.this.m10528y() * 3) {
                                    AngleCalibrationActivity.this.m10483A()[2] = AngleCalibrationActivity.this.m10520q();
                                    AngleCalibrationActivity.this.m10484B()[2] = AngleCalibrationActivity.this.m10521r();
                                } else if (i4 != AngleCalibrationActivity.this.m10528y() * 4) {
                                    if (i4 == AngleCalibrationActivity.this.m10528y() * 5) {
                                        AngleCalibrationActivity.this.m10483A()[4] = AngleCalibrationActivity.this.m10520q();
                                        AngleCalibrationActivity.this.m10484B()[4] = AngleCalibrationActivity.this.m10521r();
                                        a3 = new AnonymousClass5();
                                    }
                                } else {
                                    AngleCalibrationActivity.this.m10483A()[3] = AngleCalibrationActivity.this.m10520q();
                                    AngleCalibrationActivity.this.m10484B()[3] = AngleCalibrationActivity.this.m10521r();
                                }
                            } else {
                                AngleCalibrationActivity.this.m10483A()[1] = AngleCalibrationActivity.this.m10520q();
                                AngleCalibrationActivity.this.m10484B()[1] = AngleCalibrationActivity.this.m10521r();
                            }
                        } else {
                            AngleCalibrationActivity.this.m10483A()[0] = AngleCalibrationActivity.this.m10520q();
                            AngleCalibrationActivity.this.m10484B()[0] = AngleCalibrationActivity.this.m10521r();
                        }
                    }
                    if (AngleCalibrationActivity.this.f9035D) {
                        return;
                    }
                    C2277e.m11052a(receiver, new AnonymousClass9());
                    try {
                        Thread.sleep((long) AngleCalibrationActivity.this.m10518o());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                C2277e.m11052a(receiver, a3);
                if (AngleCalibrationActivity.this.f9035D) {
                    return;
                }
                C2277e.m11052a(receiver, new AnonymousClass9());
                try {
                    Thread.sleep((long) AngleCalibrationActivity.this.m10518o());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    final class C2212b implements Function1<InterfaceC2273a<? extends DialogInterface>, Unit> {

        final class AnonymousClass1 implements Function1<DialogInterface, Unit> {
            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DialogInterface dialogInterface) {
                a2(dialogInterface);
                return Unit.INSTANCE;
            }

            public final void a2(DialogInterface it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.this.m10497O();
            }
        }

        C2212b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(InterfaceC2273a<? extends DialogInterface> interfaceC2273a) {
            a2(interfaceC2273a);
            return Unit.INSTANCE;
        }

        public final void a2(InterfaceC2273a<? extends DialogInterface> receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            receiver.mo11043a(R.string.Result_ok_str, new AnonymousClass1());
        }
    }

    final class C2213c implements Function1<InterfaceC2273a<? extends DialogInterface>, Unit> {

        final class AnonymousClass1 implements Function1<DialogInterface, Unit> {
            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DialogInterface dialogInterface) {
                a2(dialogInterface);
                return Unit.INSTANCE;
            }

            public final void a2(DialogInterface it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.this.m10497O();
            }
        }

        C2213c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(InterfaceC2273a<? extends DialogInterface> interfaceC2273a) {
            a2(interfaceC2273a);
            return Unit.INSTANCE;
        }

        public final void a2(InterfaceC2273a<? extends DialogInterface> receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            receiver.mo11043a(R.string.Result_ok_str, new AnonymousClass1());
        }
    }

    final class C2214d implements Function1<InterfaceC2273a<? extends DialogInterface>, Unit> {

        final class AnonymousClass1 implements Function1<DialogInterface, Unit> {
            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DialogInterface dialogInterface) {
                a2(dialogInterface);
                return Unit.INSTANCE;
            }

            public final void a2(DialogInterface it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                AngleCalibrationActivity.this.m10497O();
            }
        }

        C2214d() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(InterfaceC2273a<? extends DialogInterface> interfaceC2273a) {
            a2(interfaceC2273a);
            return Unit.INSTANCE;
        }

        public final void a2(InterfaceC2273a<? extends DialogInterface> receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            receiver.mo11043a(R.string.Result_ok_str, new AnonymousClass1());
        }
    }

    public final class C2215e implements SensorEventListener {
        C2215e() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkParameterIsNotNull(sensor, "sensor");
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent event) {
            float[] fArr;
            float[] m10516m;
            Intrinsics.checkParameterIsNotNull(event, "event");
            Sensor sensor = event.sensor;
            Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
            switch (sensor.getType()) {
                case 1:
                    AngleCalibrationActivity.this.m10503b((AngleCalibrationActivity.this.m10519p() * event.values[1]) + ((1.0f - AngleCalibrationActivity.this.m10519p()) * AngleCalibrationActivity.this.m10521r()));
                    AngleCalibrationActivity.this.m10499a((AngleCalibrationActivity.this.m10519p() * event.values[2]) + ((1.0f - AngleCalibrationActivity.this.m10519p()) * AngleCalibrationActivity.this.m10520q()));
                    fArr = event.values;
                    m10516m = AngleCalibrationActivity.this.m10516m();
                    break;
                case 2:
                    fArr = event.values;
                    m10516m = AngleCalibrationActivity.this.m10517n();
                    break;
                default:
                    return;
            }
            System.arraycopy(fArr, 0, m10516m, 0, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] m10472Q() {
        float[] a = new float[9];
        float[] a0 = new float[9];
        SensorManager.getRotationMatrix(a, null, this.f9097z, this.f9032A);
        SensorManager.remapCoordinateSystem(a, 1, 3, a0);
        float[] a1 = new float[3];
        SensorManager.getOrientation(a0, a1);
        int i = a1.length;
        for (int i0 = 0; i0 < i; i0++) {
            a1[i0] = (float) ((a1[i0] * 180.0f) / 3.141592653589793d);
        }
        float[] a2 = {a1[1], a1[2], a1[0]};
        return a2;
    }

    private final void m10473R() {
        C2277e.m11051a(this, null, new C2211a(), 1, null);
    }

    public static final TextView m10481f(AngleCalibrationActivity angleCalibrationActivity) {
        TextView textView = angleCalibrationActivity.f9094w;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slowerText");
        }
        return textView;
    }

    public static final TextView m10482g(AngleCalibrationActivity angleCalibrationActivity) {
        TextView textView = angleCalibrationActivity.f9091t;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("debugText");
        }
        return textView;
    }

    public final float[] m10483A() {
        return this.f9068aj;
    }

    public final float[] m10484B() {
        return this.f9069ak;
    }

    public final float m10485C() {
        return this.f9072an;
    }

    public final float m10486D() {
        return this.f9074ap;
    }

    public final float m10487E() {
        return this.f9075aq;
    }

    public final float m10488F() {
        Objects.requireNonNull(this);
        return 0.04f;
    }

    public final int m10489G() {
        Objects.requireNonNull(this);
        return 9;
    }

    public final float m10490H() {
        return this.f9080av;
    }

    public final float m10491I() {
        return this.f9081aw;
    }

    public final float m10492J() {
        return this.f9082ax;
    }

    public final void m10493K() {
        Object systemService = getSystemService("audio");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
        }
        this.f9087p = (AudioManager) systemService;
        setVolumeControlStream(3);
        SoundPool build = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build()).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "SoundPool.Builder()\n    …\n                .build()");
        this.f9086o = build;
        SoundPool soundPool = this.f9086o;
        if (soundPool == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
        }
        this.f9084az = soundPool.load(this, R.raw.tone_beep, 1);
        SoundPool soundPool2 = this.f9086o;
        if (soundPool2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
        }
        this.f9058aA = soundPool2.load(this, R.raw.tick_sound, 1);
    }

    public final void m10494L() {
        AudioManager audioManager = this.f9087p;
        if (audioManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
        }
        float streamVolume = audioManager.getStreamVolume(3);
        if (this.f9087p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
        }
        float streamMaxVolume = streamVolume / this.f9087p.getStreamMaxVolume(3);
        SoundPool soundPool = this.f9086o;
        if (soundPool == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
        }
        soundPool.play(this.f9084az, streamMaxVolume, streamMaxVolume, 1, 0, 1.0f);
    }

    public final void m10495M() {
        AudioManager audioManager = this.f9087p;
        if (audioManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
        }
        float streamVolume = audioManager.getStreamVolume(3);
        if (this.f9087p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
        }
        float streamMaxVolume = streamVolume / this.f9087p.getStreamMaxVolume(3);
        SoundPool soundPool = this.f9086o;
        if (soundPool == null) {
            Intrinsics.throwUninitializedPropertyAccessException("soundPool");
        }
        soundPool.play(this.f9058aA, streamMaxVolume, streamMaxVolume, 1, 0, 1.0f);
    }

    public final void m10496N() {
        int i;
        Integer valueOf;
        Function1 c2214d;
        ProgressBar progressBar = this.f9093v;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calibrationProgress");
        }
        progressBar.setVisibility(4);
        ProgressBar progressBar2 = this.f9093v;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calibrationProgress");
        }
        progressBar2.setProgress(0);
        if (this.f9063ae == 1) {
            m10494L();
            TextView textView = this.f9090s;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructionText");
            }
            textView.setText(R.string.CalibrationActivity_instruction_2);
            ImageView imageView = this.f9089r;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructionImage");
            }
            imageView.setImageResource(0);
            ImageView imageView2 = this.f9089r;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructionImage");
            }
            imageView2.setBackgroundResource(R.drawable.calibration_lift);
            ImageView imageView3 = this.f9089r;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructionImage");
            }
            Drawable background = imageView3.getBackground();
            if (background == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            }
            ((AnimationDrawable) background).start();
            FrameLayout frameLayout = this.f9092u;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPitchFrame");
            }
            frameLayout.setVisibility(0);
            Objects.requireNonNull(this);
            this.f9052U = 1.0f;
            this.f9063ae++;
            this.f9059aa = 200.0f;
            this.f9051T = -10.0f;
            System.out.println("COLLECTSTART$");
            return;
        }
        m10494L();
        this.f9063ae++;
        float f = 0.0f;
        for (int i2 = 0; i2 <= 4; i2++) {
            if (this.f9068aj[i2] > f) {
                f = this.f9068aj[i2];
                this.f9045N = this.f9069ak[i2];
            }
        }
        this.f9046O = this.f9073ao;
        Objects.requireNonNull(this);
        this.f9044M = 9.81f / (f - this.f9046O);
        Objects.requireNonNull(this);
        this.f9043L = 9.81f / (this.f9072an - this.f9045N);
        float f2 = this.f9077as;
        Objects.requireNonNull(this);
        boolean z = f2 > 3.0f;
        float f3 = this.f9077as;
        Objects.requireNonNull(this);
        boolean z2 = f3 < -3.0f;
        float abs = Math.abs(this.f9076ar);
        Objects.requireNonNull(this);
        if (abs > 0.04f || this.f9076ar > 0.0f) {
            m10501a("invalid_speed");
            i = R.string.CalibrationActivity_invalid_speed;
            valueOf = Integer.valueOf(R.string.CalibrationActivity_invalid_title);
            c2214d = new C2212b();
        } else if (z2) {
            m10501a("too_left");
            i = R.string.CalibrationActivity_invalid_tilt_left;
            valueOf = Integer.valueOf(R.string.CalibrationActivity_invalid_title);
            c2214d = new C2213c();
        } else {
            if (!z) {
                this.f9035D = true;
                WebStart.f9388N = this.f9043L;
                WebStart.f9389O = this.f9044M;
                WebStart.f9390P = this.f9045N;
                WebStart.f9391Q = this.f9046O;
                m10498P();
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
                edit.putFloat("angle_Ycal", this.f9043L);
                edit.putFloat("angle_Zcal", this.f9044M);
                edit.putFloat("angle_YOffcal", this.f9045N);
                edit.putFloat("angle_ZOffcal", this.f9046O);
                edit.putBoolean("angleCalibrated", true);
                edit.apply();
                Toast makeText = Toast.makeText(this, R.string.CalibrationActivity_done, 1);
                makeText.show();
                Intrinsics.checkExpressionValueIsNotNull(makeText, "Toast\n        .makeText(…         show()\n        }");
                startActivity(new Intent(this, (Class<?>) CaptureActivity.class));
                finish();
                return;
            }
            m10501a("too_right");
            i = R.string.CalibrationActivity_invalid_tilt_right;
            valueOf = Integer.valueOf(R.string.CalibrationActivity_invalid_title);
            c2214d = new C2214d();
        }
        C2275c.m11048a(this, i, valueOf, c2214d).mo11042a();
    }

    public final void m10497O() {
        m10495M();
        this.f9071am = false;
        TextView textView = this.f9090s;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructionText");
        }
        textView.setText(R.string.CalibrationActivity_instruction_1);
        ImageView imageView = this.f9089r;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructionImage");
        }
        imageView.setImageResource(R.drawable.angle_calibration_1);
        ImageView imageView2 = this.f9089r;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructionImage");
        }
        imageView2.setBackgroundResource(0);
        FrameLayout frameLayout = this.f9092u;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPitchFrame");
        }
        frameLayout.setVisibility(8);
        TextView textView2 = this.f9094w;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slowerText");
        }
        textView2.setVisibility(8);
        this.f9051T = 90.0f;
        Objects.requireNonNull(this);
        this.f9052U = 3.0f;
        this.f9072an = 0.0f;
        this.f9073ao = 0.0f;
        this.f9063ae = 1;
    }

    public final void m10498P() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", "angle_calibration");
            jSONObject.put("cid", WebStart.f9402w);
            jSONObject.put(NativeProtocol.WEB_DIALOG_ACTION, "calibrated");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("model", WebStart.f9400u);
            jSONObject2.put("angle_Ycal", StringsKt.replace(String.valueOf(this.f9043L), ",", ".", false));
            jSONObject2.put("angle_Zcal", StringsKt.replace(String.valueOf(this.f9044M), ",", ".", false));
            jSONObject2.put("angle_YOffcal", StringsKt.replace(String.valueOf(this.f9045N), ",", ".", false));
            jSONObject2.put("angle_ZOffcal", StringsKt.replace(String.valueOf(this.f9046O), ",", ".", false));
            jSONObject.put("data", jSONObject2);
            C2261g.m10874a().m10879c(jSONObject.toString());
        } catch (Exception unused) {
            unused.printStackTrace();
        }
    }

    public final void m10499a(float f) {
        this.f9041J = f;
    }

    public final void m10500a(SensorManager _sensorManager, SensorEventListener mEventListener) {
        Intrinsics.checkParameterIsNotNull(_sensorManager, "_sensorManager");
        Intrinsics.checkParameterIsNotNull(mEventListener, "mEventListener");
        try {
            _sensorManager.registerListener(mEventListener, _sensorManager.getDefaultSensor(1), 0);
            _sensorManager.registerListener(mEventListener, _sensorManager.getDefaultSensor(2), 0);
        } catch (Exception e) {
            System.out.println((Object) e.toString());
            this.f9033B = false;
        }
    }

    public final void m10501a(String reason) {
        Intrinsics.checkParameterIsNotNull(reason, "reason");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", "angle_calibration_retry");
            jSONObject.put("cid", WebStart.f9402w);
            jSONObject.put(NativeProtocol.WEB_DIALOG_ACTION, "failed_" + reason);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("model", WebStart.f9400u);
            jSONObject2.put("angle_Ycal", StringsKt.replace(String.valueOf(this.f9043L), ",", ".", false));
            jSONObject2.put("angle_Zcal", StringsKt.replace(String.valueOf(this.f9044M), ",", ".", false));
            jSONObject2.put("angle_YOffcal", StringsKt.replace(String.valueOf(this.f9045N), ",", ".", false));
            jSONObject2.put("angle_ZOffcal", StringsKt.replace(String.valueOf(this.f9046O), ",", ".", false));
            jSONObject.put("data", jSONObject2);
            C2261g.m10874a().m10879c(jSONObject.toString());
        } catch (Exception e) {
        }
    }

    public final void m10502a(boolean z, boolean z2, boolean z3, int i) {
        TextView textView;
        TextView textView2;
        int i2;
        int i3;
        TextView textView3;
        ProgressBar progressBar = null;
        if (!z) {
            if (z2) {
                textView3 = this.f9090s;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i3 = R.string.Camera2BasicFragment_Angle_left;
            } else if (z3) {
                textView3 = this.f9090s;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i3 = R.string.Camera2BasicFragment_Angle_right;
            } else if (i == 0) {
                textView3 = this.f9090s;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i3 = R.string.Camera2BasicFragment_Angle_Ynotcalibrated;
            } else if (i == 1) {
                textView3 = this.f9090s;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i3 = R.string.Camera2BasicFragment_Angle_Znotcalibrated;
            } else if (i != 2) {
                this.f9063ae = 1;
                return;
            } else {
                textView3 = this.f9090s;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i3 = R.string.Camera2BasicFragment_Angle_Xnotcalibrated;
            }
            textView3.setText(i3);
        } else {
            TextView textView4 = this.f9090s;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instructionText");
            }
            textView4.setText("");
            ProgressBar progressBar2 = this.f9093v;
            if (progressBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calibrationProgress");
            } else {
                progressBar = progressBar2;
            }
            progressBar.setProgress(this.f9063ae);
            if (z2) {
                textView2 = this.f9090s;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i2 = R.string.CalibrationActivity_instruction_1;
            } else {
                if (!z3) {
                    textView = this.f9090s;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                    }
                    textView.setText(R.string.CalibrationActivity_instruction_2);
                    this.f9063ae++;
                    return;
                }
                textView2 = this.f9090s;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructionText");
                }
                i2 = R.string.CalibrationActivity_instruction_3;
            }
            textView2.setText(i2);
        }
    }

    public final void m10503b(float f) {
        this.f9042K = f;
    }

    public final void m10504b(SensorManager _sensorManager, SensorEventListener mEventListener) {
        Intrinsics.checkParameterIsNotNull(_sensorManager, "_sensorManager");
        Intrinsics.checkParameterIsNotNull(mEventListener, "mEventListener");
        try {
            _sensorManager.unregisterListener(mEventListener);
        } catch (Exception e) {
            System.out.println((Object) ("Error at unregister sensor:" + e.toString()));
        }
    }

    public final void m10505b(boolean z) {
        this.f9071am = z;
    }

    public final void m10506c(float f) {
        this.f9072an = f;
    }

    public final void m10507c(int i) {
        this.f9064af = i;
    }

    public final void m10508d(float f) {
        this.f9073ao = f;
    }

    public final void m10509e(float f) {
        this.f9074ap = f;
    }

    public final void m10510f(float f) {
        this.f9075aq = f;
    }

    public final void m10511g(float f) {
        this.f9076ar = f;
    }

    public final void m10512h(float f) {
        this.f9077as = f;
    }

    public final void m10513i(float f) {
        this.f9081aw = f;
    }

    public final void m10514j(float f) {
        this.f9082ax = f;
    }

    public final void m10515k(float f) {
        float f2 = this.f9059aa + f;
        if (f2 > this.f9060ab && f2 < this.f9061ac) {
            int i = 1000 - ((int) (((f2 - this.f9060ab) / (this.f9061ac - this.f9060ab)) * 1000.0f));
            ProgressBar progressBar = this.f9088q;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPitchlevel");
            }
            progressBar.setProgress(i);
            return;
        }
        ProgressBar progressBar2 = this.f9088q;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPitchlevel");
        }
        progressBar2.setSecondaryProgress(0);
        ProgressBar progressBar3 = this.f9088q;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPitchlevel");
        }
        progressBar3.setProgress(0);
    }

    public final float[] m10516m() {
        return this.f9097z;
    }

    public final float[] m10517n() {
        return this.f9032A;
    }

    public final double m10518o() {
        Objects.requireNonNull(this);
        return 30.0d;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_angle_calibration);
        getWindow().addFlags(128);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
        setTitle(applicationContext.getResources().getString(R.string.CalibrationActivity_title));
        View findViewById = findViewById(R.id.indicatorbar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.indicatorbar)");
        this.f9088q = (ProgressBar) findViewById;
        View findViewById2 = findViewById(R.id.calibration_instructions_lbl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.calibration_instructions_lbl)");
        this.f9090s = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.calibration_instructions_img);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.calibration_instructions_img)");
        this.f9089r = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.debugTxt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.debugTxt)");
        this.f9091t = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.angleBarFrame);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.angleBarFrame)");
        this.f9092u = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.calibration_counter);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.calibration_counter)");
        this.f9093v = (ProgressBar) findViewById6;
        View findViewById7 = findViewById(R.id.slower_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.slower_text)");
        this.f9094w = (TextView) findViewById7;
        Objects.requireNonNull(this);
        this.f9052U = 3.0f;
        Object systemService = getSystemService("sensor");
        if (systemService != null) {
            this.f9085n = (SensorManager) systemService;
            SensorManager sensorManager = this.f9085n;
            if (sensorManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_sensorManager");
            }
            this.f9095x = sensorManager.getDefaultSensor(1);
            SensorManager sensorManager2 = this.f9085n;
            if (sensorManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_sensorManager");
            }
            this.f9096y = sensorManager2.getDefaultSensor(2);
            this.f9032A[0] = 1.0f;
            this.f9032A[1] = 1.0f;
            this.f9032A[2] = 1.0f;
            if (this.f9033B) {
                this.f9034C = new C2215e();
            }
            m10493K();
            WebStart.m10620d("start_calibration");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f9085n;
        if (sensorManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_sensorManager");
        }
        SensorEventListener sensorEventListener = this.f9034C;
        if (sensorEventListener == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorEventListener");
        }
        m10504b(sensorManager, sensorEventListener);
        this.f9035D = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f9085n;
        if (sensorManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_sensorManager");
        }
        SensorEventListener sensorEventListener = this.f9034C;
        if (sensorEventListener == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorEventListener");
        }
        m10500a(sensorManager, sensorEventListener);
        this.f9035D = false;
        m10473R();
    }

    public final float m10519p() {
        Objects.requireNonNull(this);
        return 0.3f;
    }

    public final float m10520q() {
        return this.f9041J;
    }

    public final float m10521r() {
        return this.f9042K;
    }

    public final float m10522s() {
        Objects.requireNonNull(this);
        return -0.4f;
    }

    public final float m10523t() {
        Objects.requireNonNull(this);
        return 0.4f;
    }

    public final float m10524u() {
        return this.f9051T;
    }

    public final float m10525v() {
        return this.f9052U;
    }

    public final int m10526w() {
        return this.f9063ae;
    }

    public final int m10527x() {
        return this.f9064af;
    }

    public final int m10528y() {
        Objects.requireNonNull(this);
        return 20;
    }

    public final int m10529z() {
        Objects.requireNonNull(this);
        return 20;
    }
}
