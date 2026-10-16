package org.p127a.p128a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class C2274b implements InterfaceC2273a<AlertDialog> {
    private final AlertDialog.Builder f10304a;
    private final Context f10305b;

    static final class a implements DialogInterface.OnClickListener {
        final Function1 f10306a;

        a(Function1 Function1) {
            this.f10306a = Function1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialog, int i) {
            Function1 Function1 = this.f10306a;
            Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog");
            Function1.invoke(dialog);
        }
    }

    public C2274b(Context ctx) {
        Intrinsics.checkParameterIsNotNull(ctx, "ctx");
        this.f10305b = ctx;
        this.f10304a = new AlertDialog.Builder(m11047c());
    }

    public void m11044a(int i) {
        this.f10304a.setTitle(i);
    }

    @Override // org.p127a.p128a.InterfaceC2273a
    public void mo11043a(int i, Function1<? super DialogInterface, Unit> onClicked) {
        Intrinsics.checkParameterIsNotNull(onClicked, "onClicked");
        this.f10304a.setPositiveButton(i, new a(onClicked));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.p127a.p128a.InterfaceC2273a
    public AlertDialog mo11042a() {
        AlertDialog show = this.f10304a.show();
        Intrinsics.checkExpressionValueIsNotNull(show, "builder.show()");
        return show;
    }

    public void m11046b(int i) {
        this.f10304a.setMessage(i);
    }

    public Context m11047c() {
        return this.f10305b;
    }
}
