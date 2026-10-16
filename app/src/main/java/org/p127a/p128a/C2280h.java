package org.p127a.p128a;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class C2280h {
    public static C2280h f10318a = null;
    private static Handler f10319b = null;
    private static Thread f10320c = null;

    static {
        new C2280h();
    }

    private C2280h() {
        f10318a = this;
        f10319b = new Handler(Looper.getMainLooper());
        Thread thread = Looper.getMainLooper().getThread();
        Intrinsics.checkExpressionValueIsNotNull(thread, "Looper.getMainLooper().thread");
        f10320c = thread;
    }

    public final Handler m11055a() {
        return f10319b;
    }

    public final Thread m11056b() {
        return f10320c;
    }
}
