package org.p127a.p128a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C2279g {
    public static C2279g f10316a = null;
    private static ExecutorService f10317b;

    static {
        new C2279g();
    }

    private C2279g() {
        f10316a = this;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        Intrinsics.checkExpressionValueIsNotNull(newScheduledThreadPool, "Executors.newScheduledTh…().availableProcessors())");
        f10317b = newScheduledThreadPool;
    }

    public final <T> Future<T> m11054a(Function0<? extends T> task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        @SuppressWarnings("unchecked")
        Future<T> submit = (Future<T>) f10317b.submit(new CallableC2278f(task));
        Intrinsics.checkExpressionValueIsNotNull(submit, "executor.submit(task)");
        return submit;
    }
}
