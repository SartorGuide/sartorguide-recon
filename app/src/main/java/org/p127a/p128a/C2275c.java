package org.p127a.p128a;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C2275c {
    public static final C2274b m11048a(Context receiver, int i, Integer num, Function1<? super InterfaceC2273a<? extends DialogInterface>, Unit> Function1) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        C2274b c2274b = new C2274b(receiver);
        if (num != null) {
            c2274b.m11044a(num.intValue());
        }
        c2274b.m11046b(i);
        if (Function1 != null) {
            Function1.invoke(c2274b);
        }
        return c2274b;
    }
}
