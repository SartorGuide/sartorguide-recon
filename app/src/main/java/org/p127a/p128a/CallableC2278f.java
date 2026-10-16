package org.p127a.p128a;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
final class CallableC2278f implements Callable<Object> {
    private final Function0 f10315a;

    CallableC2278f(Function0 Function0) {
        this.f10315a = Function0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f10315a.invoke();
    }
}
