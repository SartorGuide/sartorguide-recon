package org.p127a.p128a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class C2277e {
    private static final Function1<Throwable, Unit> f10308a = a.f10309a;

    static final class a implements Function1<Throwable, Unit> {
        public static final a f10309a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Throwable th) {
            a2(th);
            return Unit.INSTANCE;
        }

        public final void a2(Throwable throwable) {
            Intrinsics.checkParameterIsNotNull(throwable, "throwable");
            throwable.printStackTrace();
        }
    }

    static final class b extends Lambda<Unit> implements Function0<Unit> {
        final Function1 f10310a;
        final C2276d f10311b;
        final Function1 f10312c;

        b(Function1 Function1, C2276d c2276d, Function1 Function12) {
            super(0);
            this.f10310a = Function1;
            this.f10311b = c2276d;
            this.f10312c = Function12;
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            m11053b();
            return Unit.INSTANCE;
        }

        public final void m11053b() {
            try {
                this.f10310a.invoke(this.f10311b);
            } catch (Throwable th) {
                Function1 Function1 = this.f10312c;
                if ((Function1 != null ? (Unit) Function1.invoke(th) : null) != null) {
                }
            }
        }
    }

    static final class c implements Runnable {
        final Function1 f10313a;
        final Object f10314b;

        c(Function1 function1, Object obj) {
            this.f10313a = function1;
            this.f10314b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10313a.invoke(this.f10314b);
        }
    }

    public static final <T> Future<Unit> m11050a(T t, Function1<? super Throwable, Unit> Function1, Function1<? super C2276d<T>, Unit> task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        return C2279g.f10316a.m11054a(new b(task, new C2276d(new WeakReference(t)), Function1));
    }

    public static Future m11051a(Object obj, Function1 function1, Function1 function12, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = f10308a;
        }
        return m11050a(obj, function1, function12);
    }

    public static final <T> boolean m11052a(C2276d<T> receiver, Function1<? super T, Unit> f) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(f, "f");
        T t = receiver.m11049a().get();
        if (t == null) {
            return false;
        }
        if (Intrinsics.areEqual(C2280h.f10318a.m11056b(), Thread.currentThread())) {
            f.invoke(t);
            return true;
        }
        C2280h.f10318a.m11055a().post(new c(f, t));
        return true;
    }
}
