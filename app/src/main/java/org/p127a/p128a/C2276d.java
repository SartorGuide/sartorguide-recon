package org.p127a.p128a;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C2276d<T> {
    private final WeakReference<T> f10307a;

    public C2276d(WeakReference<T> weakRef) {
        Intrinsics.checkParameterIsNotNull(weakRef, "weakRef");
        this.f10307a = weakRef;
    }

    public final WeakReference<T> m11049a() {
        return this.f10307a;
    }
}
