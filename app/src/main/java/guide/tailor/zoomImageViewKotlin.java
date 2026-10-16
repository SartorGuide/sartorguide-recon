package guide.tailor;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.p127a.p128a.C2276d;
import org.p127a.p128a.C2277e;

/* loaded from: classes4.dex */
public final class zoomImageViewKotlin extends AppCompatImageView {
    private static final int f10168bu = 0;
    private static final int f10169bv = 1;
    private static final int f10170bw = 2;
    private float f10172A;
    private float f10173B;
    private float f10174C;
    private float f10175D;
    private float f10176E;
    private float f10177F;
    private float f10178G;
    private int f10179H;
    private int f10180I;
    private float f10181J;
    private float f10182K;
    private String f10183L;
    private String f10184M;
    private Paint f10185N;
    private Paint f10186O;
    private Paint f10187P;
    private Paint f10188Q;
    private Paint f10189R;
    private Paint f10190S;
    private Paint f10191T;
    private Paint f10192U;
    private Paint f10193V;
    private Paint f10194W;
    private Paint f10195aA;
    private Paint f10196aB;
    private float f10197aC;
    private PointF f10198aD;
    private PointF f10199aE;
    private PointF f10200aF;
    private PointF f10201aG;
    private float f10202aH;
    private float f10203aI;
    private float[] f10204aJ;
    private float f10205aK;
    private float f10206aL;
    private final float f10207aM;
    private final float f10208aN;
    private BlurMaskFilter f10209aO;
    private Date f10210aP;
    private long f10211aQ;
    private boolean f10212aR;
    private float f10213aS;
    private float f10214aT;
    private float f10215aU;
    private float f10216aV;
    private float f10217aW;
    private float f10218aX;
    private float f10219aY;
    private float f10220aZ;
    private Paint f10221aa;
    private Paint f10222ab;
    private Paint f10223ac;
    private Path f10224ad;
    private Paint f10225ae;
    private Paint f10226af;
    private Paint f10227ag;
    private Paint f10228ah;
    private Paint f10229ai;
    private float f10230aj;
    private int f10231ak;
    private int f10232al;
    private Paint f10233am;
    private Paint f10234an;
    private Paint f10235ao;
    private Paint f10236ap;
    private Paint f10237aq;
    private Paint f10238ar;
    private Paint f10239as;
    private float f10240at;
    private float f10241au;
    private float f10242av;
    private float f10243aw;
    private float f10244ax;
    private Paint f10245ay;
    private Paint f10246az;
    private Matrix f10247b;
    private float f10248ba;
    private float f10249bb;
    private float f10250bc;
    private float f10251bd;
    private float f10252be;
    private float f10253bf;
    private ScaleGestureDetector f10254bg;
    private RectF f10255bh;
    private RectF f10256bi;
    private RectF f10257bj;
    private final String f10258bk;
    private PropertyValuesHolder f10259bl;
    private final String f10260bm;
    private PropertyValuesHolder f10261bn;
    private float f10262bo;
    private float f10263bp;
    private float f10264bq;
    private float f10265br;
    private ValueAnimator f10266bs;
    private Context f10267bt;
    private int f10268c;
    private boolean f10269d;
    private boolean f10270e;
    private int f10271f;
    private int f10272g;
    private boolean f10273h;
    private float f10274i;
    private float f10275j;
    private int f10276k;
    private ArrayList<int[]> f10277l;
    private ArrayList<int[]> f10278m;
    private ArrayList<int[]> f10279n;
    private ArrayList<int[]> f10280o;
    private float f10281p;
    private float[] f10282q;
    private boolean f10283r;
    private boolean f10284s;
    private int f10285t;
    private int f10286u;
    private float f10287v;
    private boolean f10288w;
    private float f10289x;
    private float f10290y;
    private float f10291z;
    public static final C2270a f10167a = new C2270a(null);
    private static int f10171bx = 3;

    static /* synthetic */ float access$3116(zoomImageViewKotlin x0, float x1) {
        float f = x0.f10289x + x1;
        x0.f10289x = f;
        return f;
    }

    static /* synthetic */ float access$3316(zoomImageViewKotlin x0, float x1) {
        float f = x0.f10290y + x1;
        x0.f10290y = f;
        return f;
    }

    public static final class C2270a {
        private C2270a() {
        }

        public C2270a(DefaultConstructorMarker c0679a) {
            this();
        }

        public final int m11038a() {
            return 0;
        }

        public final int m11039b() {
            return 1;
        }

        public final int m11040c() {
            return 2;
        }

        public final int m11041d() {
            return zoomImageViewKotlin.f10171bx;
        }
    }

    private final class C2271b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C2271b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x036f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0371  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        /* JADX WARN: Code duplicated, block: B:100:0x044a  */
        /* JADX WARN: Code duplicated, block: B:101:0x0450  */
        /* JADX WARN: Code duplicated, block: B:40:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:41:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:43:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:44:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:47:0x01de  */
        /* JADX WARN: Code duplicated, block: B:50:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:51:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:58:0x036f  */
        /* JADX WARN: Code duplicated, block: B:59:0x0371  */
        /* JADX WARN: Code duplicated, block: B:61:0x0375  */
        /* JADX WARN: Code duplicated, block: B:62:0x0377  */
        /* JADX WARN: Code duplicated, block: B:64:0x037a  */
        /* JADX WARN: Code duplicated, block: B:66:0x039d  */
        /* JADX WARN: Code duplicated, block: B:68:0x03ba  */
        /* JADX WARN: Code duplicated, block: B:70:0x03c6  */
        /* JADX WARN: Code duplicated, block: B:71:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:73:0x03cd  */
        /* JADX WARN: Code duplicated, block: B:74:0x03d0  */
        /* JADX WARN: Code duplicated, block: B:77:0x03d7  */
        /* JADX WARN: Code duplicated, block: B:79:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:80:0x03e4  */
        /* JADX WARN: Code duplicated, block: B:81:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:84:0x0406  */
        /* JADX WARN: Code duplicated, block: B:86:0x0416  */
        /* JADX WARN: Code duplicated, block: B:87:0x0419  */
        /* JADX WARN: Code duplicated, block: B:89:0x041d  */
        /* JADX WARN: Code duplicated, block: B:90:0x0420  */
        /* JADX WARN: Code duplicated, block: B:93:0x0427  */
        /* JADX WARN: Code duplicated, block: B:95:0x042c A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x042e  */
        /* JADX WARN: Code duplicated, block: B:97:0x0435  */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            int i;
            float f3;
            int i2;
            float f17;
            float f18;
            float f20;
            int i3;
            int i4;
            Matrix a20;
            float f19;
            int i5;
            int i6;
            Matrix a19;
            int i0;
            Matrix a7 = null;
            float f8 = 0.0f;
            float f9;
            int i7;
            int i1;
            Matrix a6 = null;
            float f6 = 0.0f;
            Intrinsics.checkParameterIsNotNull(detector, "detector");
            PrintStream a1 = System.out;
            a1.println("ScaleGestureDetector - onScale, scalefactor = " + detector.getScaleFactor());
            PrintStream a3 = System.out;
            a3.println("focusX = " + detector.getFocusX() + " focusY = " + detector.getFocusY());
            float f = detector.getScaleFactor();
            float f0 = zoomImageViewKotlin.this.f10217aW;
            zoomImageViewKotlin.this.f10217aW = zoomImageViewKotlin.this.f10217aW * f;
            float f1 = zoomImageViewKotlin.this.f10217aW;
            float f2 = zoomImageViewKotlin.this.f10203aI;
            if (f1 > f2) {
                i = 1;
            } else {
                i = f1 == f2 ? 0 : -1;
            }
            if (i <= 0) {
                if (zoomImageViewKotlin.this.f10217aW < zoomImageViewKotlin.this.f10202aH) {
                    zoomImageViewKotlin.this.f10217aW = zoomImageViewKotlin.this.f10202aH;
                    f3 = zoomImageViewKotlin.this.f10202aH;
                }
                zoomImageViewKotlin.this.f10220aZ = ((zoomImageViewKotlin.this.f10215aU * zoomImageViewKotlin.this.f10217aW) - zoomImageViewKotlin.this.f10215aU) - ((zoomImageViewKotlin.this.f10213aS * 2.0f) * zoomImageViewKotlin.this.f10217aW);
                zoomImageViewKotlin.this.f10248ba = ((zoomImageViewKotlin.this.f10216aV * zoomImageViewKotlin.this.f10217aW) - zoomImageViewKotlin.this.f10216aV) - ((zoomImageViewKotlin.this.f10214aT * 2.0f) * zoomImageViewKotlin.this.f10217aW);
                zoomImageViewKotlin.this.setCurScale(f);
                if (zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10217aW <= zoomImageViewKotlin.this.f10215aU && zoomImageViewKotlin.this.f10250bc * zoomImageViewKotlin.this.f10217aW > zoomImageViewKotlin.this.f10216aV) {
                    zoomImageViewKotlin.this.getMatrix$app_release().postScale(f, f, detector.getFocusX(), detector.getFocusY());
                    zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
                    float f4 = zoomImageViewKotlin.this.f10204aJ[2];
                    float f5 = zoomImageViewKotlin.this.f10204aJ[5];
                    if (f < 1.0f) {
                        float f7 = -zoomImageViewKotlin.this.f10220aZ;
                        if (f4 < f7) {
                            i0 = -1;
                        } else {
                            i0 = f4 == f7 ? 0 : 1;
                        }
                        if (i0 >= 0) {
                            if (f4 > 0.0f) {
                                a7 = zoomImageViewKotlin.this.getMatrix$app_release();
                                f8 = -f4;
                            }
                            f9 = -zoomImageViewKotlin.this.f10248ba;
                            if (f5 < f9) {
                                i7 = -1;
                            } else if (f5 == f9) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i1 = i7;
                            if (i1 >= 0) {
                                a6 = zoomImageViewKotlin.this.getMatrix$app_release();
                                f6 = -(zoomImageViewKotlin.this.f10248ba + f5);
                            } else if (f5 > 0.0f) {
                                a6 = zoomImageViewKotlin.this.getMatrix$app_release();
                                f6 = -f5;
                            }
                            a6.postTranslate(0.0f, f6);
                        } else {
                            a7 = zoomImageViewKotlin.this.getMatrix$app_release();
                            f8 = -(zoomImageViewKotlin.this.f10220aZ + f4);
                        }
                        a7.postTranslate(f8, 0.0f);
                        f9 = -zoomImageViewKotlin.this.f10248ba;
                        if (f5 < f9) {
                            i7 = -1;
                        } else if (f5 == f9) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        i1 = i7;
                        if (i1 >= 0) {
                            a6 = zoomImageViewKotlin.this.getMatrix$app_release();
                            f6 = -(zoomImageViewKotlin.this.f10248ba + f5);
                        } else if (f5 > 0.0f) {
                            a6 = zoomImageViewKotlin.this.getMatrix$app_release();
                            f6 = -f5;
                        }
                        a6.postTranslate(0.0f, f6);
                    }
                    zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
                    float f10 = (-zoomImageViewKotlin.this.f10204aJ[2]) / zoomImageViewKotlin.this.f10204aJ[0];
                    float f11 = (-zoomImageViewKotlin.this.f10204aJ[5]) / zoomImageViewKotlin.this.f10204aJ[4];
                    PrintStream a8 = System.out;
                    a8.println("MTRANS_X = " + f4 + " ; MTRANS_Y = " + f5);
                    PrintStream a10 = System.out;
                    a10.println("MSCALE_X = " + zoomImageViewKotlin.this.f10204aJ[0] + " ; MSCALE_Y = " + zoomImageViewKotlin.this.f10204aJ[4]);
                    PrintStream a12 = System.out;
                    a12.println("corner_X = " + f10 + " ; corner_Y = " + f11);
                    PrintStream a14 = System.out;
                    a14.println("redundantXSpace = " + zoomImageViewKotlin.this.f10213aS + " ; redundantYSpace = " + zoomImageViewKotlin.this.f10214aT);
                    PrintStream a16 = System.out;
                    StringBuilder a17 = new StringBuilder();
                    a17.append("visible width = ");
                    float f12 = zoomImageViewKotlin.this.f10251bd;
                    a17.append(((zoomImageViewKotlin.this.f10213aS * 2.0f) + f12) / zoomImageViewKotlin.this.f10217aW);
                    a17.append(" ; visible height = ");
                    a17.append((zoomImageViewKotlin.this.f10252be + (zoomImageViewKotlin.this.f10214aT * 2.0f)) / zoomImageViewKotlin.this.f10217aW);
                    a16.println(a17.toString());
                    return true;
                }
                Matrix a18 = zoomImageViewKotlin.this.getMatrix$app_release();
                float f14 = zoomImageViewKotlin.this.f10215aU;
                a18.postScale(f, f, f14 / 2.0f, zoomImageViewKotlin.this.f10216aV / 2.0f);
                if (f < 1.0f) {
                    i2 = -1;
                } else if (f == 1.0f) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (i2 < 0) {
                    return true;
                }
                zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
                f17 = zoomImageViewKotlin.this.f10204aJ[2];
                f18 = zoomImageViewKotlin.this.f10204aJ[5];
                if (i2 < 0) {
                    return true;
                }
                if (Math.round(zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10217aW) < zoomImageViewKotlin.this.f10215aU) {
                    f19 = -zoomImageViewKotlin.this.f10248ba;
                    if (f18 < f19) {
                        i5 = -1;
                    } else if (f18 == f19) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    i6 = i5;
                    if (i6 >= 0) {
                        a19 = zoomImageViewKotlin.this.getMatrix$app_release();
                        f18 += zoomImageViewKotlin.this.f10248ba;
                    } else {
                        if (f18 <= 0.0f) {
                            return true;
                        }
                        a19 = zoomImageViewKotlin.this.getMatrix$app_release();
                    }
                    a19.postTranslate(0.0f, -f18);
                    return true;
                }
                f20 = -zoomImageViewKotlin.this.f10220aZ;
                if (f17 < f20) {
                    i3 = -1;
                } else if (f17 == f20) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                i4 = i3;
                if (i4 >= 0) {
                    a20 = zoomImageViewKotlin.this.getMatrix$app_release();
                    f17 += zoomImageViewKotlin.this.f10220aZ;
                } else {
                    if (f17 <= 0.0f) {
                        return true;
                    }
                    a20 = zoomImageViewKotlin.this.getMatrix$app_release();
                }
                a20.postTranslate(-f17, 0.0f);
                return true;
            }
            zoomImageViewKotlin.this.f10217aW = zoomImageViewKotlin.this.f10203aI;
            f3 = zoomImageViewKotlin.this.f10203aI;
            f = f3 / f0;
            zoomImageViewKotlin.this.f10220aZ = ((zoomImageViewKotlin.this.f10215aU * zoomImageViewKotlin.this.f10217aW) - zoomImageViewKotlin.this.f10215aU) - ((zoomImageViewKotlin.this.f10213aS * 2.0f) * zoomImageViewKotlin.this.f10217aW);
            zoomImageViewKotlin.this.f10248ba = ((zoomImageViewKotlin.this.f10216aV * zoomImageViewKotlin.this.f10217aW) - zoomImageViewKotlin.this.f10216aV) - ((zoomImageViewKotlin.this.f10214aT * 2.0f) * zoomImageViewKotlin.this.f10217aW);
            zoomImageViewKotlin.this.setCurScale(f);
            if (zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10217aW <= zoomImageViewKotlin.this.f10215aU) {
            }
            Matrix a110 = zoomImageViewKotlin.this.getMatrix$app_release();
            float f15 = zoomImageViewKotlin.this.f10215aU;
            a110.postScale(f, f, f15 / 2.0f, zoomImageViewKotlin.this.f10216aV / 2.0f);
            if (f < 1.0f) {
                i2 = -1;
            } else if (f == 1.0f) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 < 0) {
                return true;
            }
            zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
            f17 = zoomImageViewKotlin.this.f10204aJ[2];
            f18 = zoomImageViewKotlin.this.f10204aJ[5];
            if (i2 < 0) {
                return true;
            }
            if (Math.round(zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10217aW) < zoomImageViewKotlin.this.f10215aU) {
                f19 = -zoomImageViewKotlin.this.f10248ba;
                if (f18 < f19) {
                    i5 = -1;
                } else if (f18 == f19) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                i6 = i5;
                if (i6 >= 0) {
                    a19 = zoomImageViewKotlin.this.getMatrix$app_release();
                    f18 += zoomImageViewKotlin.this.f10248ba;
                } else {
                    if (f18 <= 0.0f) {
                        return true;
                    }
                    a19 = zoomImageViewKotlin.this.getMatrix$app_release();
                }
                a19.postTranslate(0.0f, -f18);
                return true;
            }
            f20 = -zoomImageViewKotlin.this.f10220aZ;
            if (f17 < f20) {
                i3 = -1;
            } else if (f17 == f20) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            i4 = i3;
            if (i4 >= 0) {
                a20 = zoomImageViewKotlin.this.getMatrix$app_release();
                f17 += zoomImageViewKotlin.this.f10220aZ;
            } else {
                if (f17 <= 0.0f) {
                    return true;
                }
                a20 = zoomImageViewKotlin.this.getMatrix$app_release();
            }
            a20.postTranslate(-f17, 0.0f);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            Intrinsics.checkParameterIsNotNull(detector, "detector");
            System.out.println("ScaleGestureDetector - onScaleBegin");
            if (zoomImageViewKotlin.this.f10269d) {
                return false;
            }
            zoomImageViewKotlin.this.f10268c = zoomImageViewKotlin.f10167a.m11040c();
            return true;
        }
    }

    final class C2272c implements Function1<C2276d<zoomImageViewKotlin>, Unit> {
        final double f10296b;
        final Ref.ObjectRef f10297c;
        final Ref.ObjectRef f10298d;
        final Ref.DoubleRef f10299e;
        final Ref.BooleanRef f10300f;
        final double f10301g;

        final class AnonymousClass1 implements Function1<zoomImageViewKotlin, Unit> {
            final int f10303b;

            AnonymousClass1(int i) {
                this.f10303b = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(zoomImageViewKotlin zoomimageviewkotlin) {
                a2(zoomimageviewkotlin);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a2(zoomImageViewKotlin it) {
                zoomImageViewKotlin zoomimageviewkotlin2;
                float f;
                float f2;
                double d;
                double d2;
                Intrinsics.checkParameterIsNotNull(it, "it");
                if (this.f10303b < C2272c.this.f10296b / 8.0d || this.f10303b > C2272c.this.f10296b - (C2272c.this.f10296b / 8.0d)) {
                    zoomimageviewkotlin2 = zoomImageViewKotlin.this;
                    f = ((int[]) C2272c.this.f10297c.element)[this.f10303b - 1];
                    f2 = ((int[]) C2272c.this.f10298d.element)[this.f10303b - 1];
                    d = C2272c.this.f10299e.element;
                } else {
                    if (this.f10303b < (C2272c.this.f10296b * 3.0d) / 8.0d || this.f10303b > C2272c.this.f10296b - ((C2272c.this.f10296b * 3.0d) / 8.0d)) {
                        zoomimageviewkotlin2 = zoomImageViewKotlin.this;
                        f = ((int[]) C2272c.this.f10297c.element)[this.f10303b - 1];
                        f2 = ((int[]) C2272c.this.f10298d.element)[this.f10303b - 1];
                        d2 = C2272c.this.f10299e.element;
                    } else {
                        zoomimageviewkotlin2 = zoomImageViewKotlin.this;
                        f = ((int[]) C2272c.this.f10297c.element)[this.f10303b - 1];
                        f2 = ((int[]) C2272c.this.f10298d.element)[this.f10303b - 1];
                        d2 = C2272c.this.f10299e.element * C2272c.this.f10299e.element;
                    }
                    d = C2272c.this.f10299e.element * d2;
                }
                zoomimageviewkotlin2.m11032a(f, f2, (float) d, C2272c.this.f10300f.element);
                zoomImageViewKotlin.this.setImageMatrix(zoomImageViewKotlin.this.getMatrix$app_release());
                zoomImageViewKotlin.this.invalidate();
            }
        }

        C2272c(double d, Ref.ObjectRef cVar, Ref.ObjectRef cVar2, Ref.DoubleRef bVar, Ref.BooleanRef aVar, double d2) {
            this.f10296b = d;
            this.f10297c = cVar;
            this.f10298d = cVar2;
            this.f10299e = bVar;
            this.f10300f = aVar;
            this.f10301g = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(C2276d<zoomImageViewKotlin> c2276d) {
            a2(c2276d);
            return Unit.INSTANCE;
        }

        public final void a2(C2276d<zoomImageViewKotlin> receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            int i = (int) this.f10296b;
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    C2277e.m11052a(receiver, new AnonymousClass1(i2));
                    try {
                        Thread.sleep((long) this.f10301g);
                        if (i2 == i) {
                            break;
                        } else {
                            i2++;
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            zoomImageViewKotlin.this.m11037b();
            zoomImageViewKotlin.this.f10284s = false;
            zoomImageViewKotlin.this.invalidate();
            if (zoomImageViewKotlin.this.f10285t != -1) {
                zoomImageViewKotlin.this.m11034a(zoomImageViewKotlin.this.f10285t, zoomImageViewKotlin.this.f10286u, zoomImageViewKotlin.this.f10287v, zoomImageViewKotlin.this.f10288w);
            }
        }
    }

    public zoomImageViewKotlin(Context context, AttributeSet attr) {
        super(context, attr);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attr, "attr");
        this.f10267bt = context;
        this.f10247b = new Matrix();
        this.f10268c = 0;
        this.f10281p = 1.0f;
        this.f10282q = new float[3];
        this.f10285t = -1;
        this.f10286u = -1;
        this.f10287v = -1.0f;
        this.f10179H = -1;
        this.f10180I = -1;
        this.f10183L = "";
        this.f10184M = "";
        this.f10185N = new Paint();
        this.f10186O = new Paint();
        this.f10187P = new Paint();
        this.f10188Q = new Paint();
        this.f10189R = new Paint();
        this.f10190S = new Paint();
        this.f10191T = new Paint();
        this.f10192U = new Paint();
        this.f10193V = new Paint();
        this.f10194W = new Paint();
        this.f10221aa = new Paint();
        this.f10222ab = new Paint();
        this.f10223ac = new Paint();
        this.f10224ad = new Path();
        this.f10225ae = new Paint();
        this.f10226af = new Paint();
        this.f10227ag = new Paint();
        this.f10228ah = new Paint();
        this.f10229ai = new Paint();
        this.f10230aj = 8.0f;
        this.f10233am = new Paint();
        this.f10234an = new Paint();
        this.f10235ao = new Paint();
        this.f10236ap = new Paint();
        this.f10237aq = new Paint();
        this.f10238ar = new Paint();
        this.f10239as = new Paint();
        this.f10240at = 8.0f;
        this.f10241au = 2.0f;
        this.f10242av = 5.0f;
        this.f10243aw = 2.5f;
        this.f10244ax = 10.0f;
        this.f10245ay = new Paint();
        this.f10246az = new Paint();
        this.f10195aA = new Paint();
        this.f10196aB = new Paint();
        this.f10197aC = 5.0f;
        this.f10198aD = new PointF();
        this.f10199aE = new PointF();
        this.f10200aF = new PointF();
        this.f10201aG = new PointF();
        this.f10202aH = 1.0f;
        this.f10203aI = 4.0f;
        this.f10205aK = 1.0f;
        this.f10206aL = 4.0f;
        this.f10207aM = 55.0f;
        this.f10208aN = 20.0f;
        this.f10209aO = new BlurMaskFilter(10.0f, BlurMaskFilter.Blur.NORMAL);
        this.f10211aQ = 500L;
        this.f10217aW = 1.0f;
        this.f10253bf = 0.5f;
        this.f10255bh = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10256bi = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10257bj = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f10258bk = "PROPERTY_DIAMETER";
        this.f10259bl = PropertyValuesHolder.ofFloat(this.f10258bk, 11.0f, 16.0f);
        this.f10260bm = "PROPERTY_DISTANCE";
        this.f10261bn = PropertyValuesHolder.ofFloat(this.f10260bm, 1.0f, 1.4f);
        this.f10262bo = 1.0f;
        this.f10263bp = 1.0f;
        this.f10264bq = 11.0f;
        this.f10266bs = new ValueAnimator();
        super.setClickable(true);
        this.f10254bg = new ScaleGestureDetector(this.f10267bt, new C2271b());
        this.f10247b.setTranslate(1.0f, 1.0f);
        this.f10204aJ = new float[9];
        setImageMatrix(this.f10247b);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f10210aP = new Date();
        this.f10186O.setStyle(Paint.Style.STROKE);
        this.f10186O.setStrokeWidth(5.0f);
        this.f10186O.setColor(SupportMenu.CATEGORY_MASK);
        this.f10186O.setAntiAlias(true);
        this.f10187P.setStyle(Paint.Style.STROKE);
        this.f10187P.setStrokeWidth(5.0f);
        this.f10187P.setColor(Color.argb(255, 180, 0, 0));
        this.f10187P.setAntiAlias(true);
        this.f10188Q.setStyle(Paint.Style.STROKE);
        this.f10188Q.setStrokeWidth(8.0f);
        this.f10188Q.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10188Q.setAntiAlias(true);
        this.f10189R.setStyle(Paint.Style.STROKE);
        this.f10189R.setStrokeWidth(8.0f);
        this.f10189R.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10189R.setAntiAlias(true);
        this.f10190S.setStyle(Paint.Style.STROKE);
        this.f10190S.setStrokeWidth(5.0f);
        this.f10190S.setAntiAlias(true);
        this.f10225ae.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10225ae.setStyle(Paint.Style.STROKE);
        this.f10225ae.setStrokeWidth(5.0f);
        this.f10225ae.setAntiAlias(true);
        this.f10190S.setColor(SupportMenu.CATEGORY_MASK);
        this.f10191T.setStyle(Paint.Style.STROKE);
        this.f10191T.setStrokeWidth(5.0f);
        this.f10191T.setColor(SupportMenu.CATEGORY_MASK);
        this.f10191T.setAntiAlias(true);
        this.f10192U.setStyle(Paint.Style.STROKE);
        this.f10192U.setStrokeWidth(5.0f);
        this.f10192U.setColor(SupportMenu.CATEGORY_MASK);
        this.f10192U.setAntiAlias(true);
        this.f10192U.setPathEffect(new DashPathEffect(new float[]{40.0f, 20.0f}, 0.0f));
        this.f10193V.setStyle(Paint.Style.STROKE);
        this.f10193V.setStrokeWidth(5.0f);
        this.f10193V.setColor(SupportMenu.CATEGORY_MASK);
        this.f10193V.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.f10193V.setAntiAlias(true);
        this.f10194W.setStrokeWidth(20.0f);
        this.f10194W.setStyle(Paint.Style.FILL);
        this.f10194W.setColor(SupportMenu.CATEGORY_MASK);
        this.f10194W.setAntiAlias(true);
        this.f10221aa.setStyle(Paint.Style.STROKE);
        this.f10221aa.setColor(SupportMenu.CATEGORY_MASK);
        this.f10221aa.setStrokeWidth(5.0f);
        this.f10221aa.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f}, 0.0f));
        this.f10221aa.setAntiAlias(true);
        this.f10222ab.setStrokeWidth(9.0f);
        this.f10222ab.setColor(SupportMenu.CATEGORY_MASK);
        this.f10222ab.setAntiAlias(true);
        this.f10223ac.setStrokeWidth(5.0f);
        this.f10223ac.setColor(SupportMenu.CATEGORY_MASK);
        this.f10223ac.setAntiAlias(true);
        this.f10228ah.setColor(-1);
        this.f10228ah.setAlpha(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f10228ah.setAntiAlias(true);
        this.f10229ai.setColor(Color.argb(70, 80, 80, 80));
        this.f10229ai.setAntiAlias(true);
        this.f10229ai.setMaskFilter(this.f10209aO);
        this.f10237aq.setColor(Color.argb(70, 80, 80, 80));
        this.f10237aq.setAntiAlias(true);
        this.f10237aq.setStyle(Paint.Style.STROKE);
        this.f10237aq.setStrokeWidth(5.0f);
        this.f10237aq.setMaskFilter(this.f10209aO);
        this.f10238ar.setColor(Color.argb(70, 80, 80, 80));
        this.f10238ar.setAntiAlias(true);
        this.f10238ar.setStyle(Paint.Style.STROKE);
        this.f10238ar.setStrokeWidth(5.0f);
        this.f10238ar.setPathEffect(new DashPathEffect(new float[]{40.0f, 20.0f}, 0.0f));
        this.f10238ar.setMaskFilter(this.f10209aO);
        this.f10227ag.setStyle(Paint.Style.STROKE);
        this.f10227ag.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10227ag.setStrokeWidth(3.0f);
        this.f10227ag.setAntiAlias(true);
        this.f10235ao.setStrokeWidth(14.0f);
        this.f10235ao.setStyle(Paint.Style.FILL);
        this.f10235ao.setColor(SupportMenu.CATEGORY_MASK);
        this.f10235ao.setAntiAlias(true);
        this.f10236ap.setStrokeWidth(14.0f);
        this.f10236ap.setStyle(Paint.Style.FILL);
        this.f10236ap.setColor(Color.argb(70, 80, 80, 80));
        this.f10236ap.setAntiAlias(true);
        this.f10236ap.setMaskFilter(this.f10209aO);
        this.f10239as.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10239as.setStyle(Paint.Style.FILL);
        this.f10239as.setStrokeWidth(5.0f);
        this.f10239as.setAntiAlias(true);
        this.f10233am.setStyle(Paint.Style.FILL);
        this.f10233am.setStrokeWidth(5.0f);
        this.f10233am.setColor(Color.argb(255, 180, 0, 0));
        this.f10233am.setAntiAlias(true);
        this.f10234an.setStyle(Paint.Style.FILL);
        this.f10234an.setStrokeWidth(5.0f);
        this.f10234an.setColor(Color.argb(255, 180, 0, 0));
        this.f10234an.setAntiAlias(true);
        this.f10245ay.setStyle(Paint.Style.STROKE);
        this.f10245ay.setColor(-16776961);
        this.f10245ay.setStrokeWidth(5.0f);
        this.f10245ay.setAntiAlias(true);
        this.f10246az.setColor(-1);
        this.f10246az.setAntiAlias(true);
        this.f10226af.setStyle(Paint.Style.FILL);
        this.f10226af.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10226af.setTypeface(Typeface.DEFAULT_BOLD);
        this.f10195aA.setStyle(Paint.Style.FILL);
        this.f10195aA.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10195aA.setTypeface(Typeface.DEFAULT_BOLD);
        this.f10196aB.setStyle(Paint.Style.FILL);
        this.f10196aB.setColor(Color.argb(50, 45, 105, 156));
        this.f10196aB.setAlpha(50);
        this.f10266bs.setValues(this.f10259bl, this.f10261bn);
        this.f10266bs.setDuration(800L);
        this.f10266bs.setRepeatCount(-1);
        this.f10266bs.setRepeatMode(2);
        this.f10266bs.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f10266bs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: guide.tailor.zoomImageViewKotlin.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (!zoomImageViewKotlin.this.f10269d) {
                    zoomImageViewKotlin zoomimageviewkotlin = zoomImageViewKotlin.this;
                    Object animatedValue = valueAnimator.getAnimatedValue(zoomImageViewKotlin.this.getPROPERTY_DISTANCE());
                    if (animatedValue == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    zoomimageviewkotlin.setShadowDistFactor(((Float) animatedValue).floatValue());
                    zoomImageViewKotlin zoomimageviewkotlin2 = zoomImageViewKotlin.this;
                    Object animatedValue2 = valueAnimator.getAnimatedValue(zoomImageViewKotlin.this.getPROPERTY_DIAMETER());
                    if (animatedValue2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    zoomimageviewkotlin2.setPaintpointStroke(((Float) animatedValue2).floatValue());
                } else {
                    zoomImageViewKotlin zoomimageviewkotlin3 = zoomImageViewKotlin.this;
                    if (zoomimageviewkotlin3.f10268c != zoomImageViewKotlin.f10167a.m11039b()) {
                        zoomImageViewKotlin zoomimageviewkotlin32 = zoomImageViewKotlin.this;
                        Object animatedValue3 = valueAnimator.getAnimatedValue(zoomImageViewKotlin.this.getPROPERTY_DISTANCE());
                        if (animatedValue3 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                        }
                        zoomimageviewkotlin32.setTriangleHeadDistFactor(((Float) animatedValue3).floatValue());
                    }
                }
                zoomImageViewKotlin.this.invalidate();
            }
        });
        this.f10266bs.start();
        setOnTouchListener(new View.OnTouchListener() { // from class: guide.tailor.zoomImageViewKotlin.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                zoomImageViewKotlin.this.f10254bg.onTouchEvent(event);
                zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
                float f2 = zoomImageViewKotlin.this.f10204aJ[2];
                float f3 = zoomImageViewKotlin.this.f10204aJ[5];
                Intrinsics.checkExpressionValueIsNotNull(event, "event");
                PointF pointF = new PointF(event.getX(), event.getY());
                boolean z = false;
                switch (event.getAction()) {
                    case 0:
                        ResultActivity.f9175ak = true;
                        zoomImageViewKotlin.this.f10198aD.set(event.getX(), event.getY());
                        zoomImageViewKotlin.this.f10199aE.set(zoomImageViewKotlin.this.f10198aD);
                        zoomImageViewKotlin.this.getMatrix$app_release().getValues(zoomImageViewKotlin.this.f10204aJ);
                        float f4 = zoomImageViewKotlin.this.f10204aJ[2];
                        float f5 = zoomImageViewKotlin.this.f10204aJ[5];
                        zoomImageViewKotlin.this.f10201aG.x = zoomImageViewKotlin.this.f10200aF.x;
                        zoomImageViewKotlin.this.f10201aG.y = zoomImageViewKotlin.this.f10200aF.y;
                        zoomImageViewKotlin.this.f10200aF.set(event.getX() - f4, event.getY() - f5);
                        zoomImageViewKotlin zoomimageviewkotlin2 = zoomImageViewKotlin.this;
                        if (new Date().getTime() - zoomImageViewKotlin.this.f10210aP.getTime() < zoomImageViewKotlin.this.f10211aQ && new Date().getTime() - zoomImageViewKotlin.this.f10210aP.getTime() > 10) {
                            z = true;
                        }
                        zoomimageviewkotlin2.f10212aR = z;
                        zoomImageViewKotlin.this.f10210aP = new Date();
                        zoomImageViewKotlin zoomimageviewkotlin = zoomImageViewKotlin.this;
                        int m11039b = zoomImageViewKotlin.f10167a.m11039b();
                        zoomimageviewkotlin.f10268c = m11039b;
                        break;
                    case 1:
                        ResultActivity.f9175ak = false;
                        zoomImageViewKotlin.this.f10268c = zoomImageViewKotlin.f10167a.m11038a();
                        int abs = (int) Math.abs(pointF.x - zoomImageViewKotlin.this.f10199aE.x);
                        int abs2 = (int) Math.abs(pointF.y - zoomImageViewKotlin.this.f10199aE.y);
                        if (abs < zoomImageViewKotlin.f10167a.m11041d() && abs2 < zoomImageViewKotlin.f10167a.m11041d()) {
                            if (!zoomImageViewKotlin.this.f10212aR) {
                                zoomImageViewKotlin.this.performClick();
                                break;
                            } else {
                                zoomImageViewKotlin.this.performLongClick();
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (zoomImageViewKotlin.this.f10268c == zoomImageViewKotlin.f10167a.m11040c() || (zoomImageViewKotlin.this.f10268c == zoomImageViewKotlin.f10167a.m11039b() && zoomImageViewKotlin.this.f10217aW > zoomImageViewKotlin.this.f10202aH)) {
                            float f6 = pointF.x - zoomImageViewKotlin.this.f10198aD.x;
                            float f7 = pointF.y - zoomImageViewKotlin.this.f10198aD.y;
                            if (zoomImageViewKotlin.this.f10269d) {
                                f6 *= zoomImageViewKotlin.this.f10253bf;
                                f7 *= zoomImageViewKotlin.this.f10253bf;
                            }
                            float round = Math.round(zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10217aW);
                            float round2 = Math.round(zoomImageViewKotlin.this.f10250bc * zoomImageViewKotlin.this.f10217aW);
                            if (zoomImageViewKotlin.this.f10269d) {
                                if (zoomImageViewKotlin.this.f10289x + f6 > zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10249bb * zoomImageViewKotlin.this.f10291z) {
                                    f6 = ((zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10249bb) * zoomImageViewKotlin.this.f10291z) - zoomImageViewKotlin.this.f10289x;
                                } else if (zoomImageViewKotlin.this.f10289x + f6 < (-(zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10249bb * (1.0f - zoomImageViewKotlin.this.f10291z)))) {
                                    f6 = -(zoomImageViewKotlin.this.f10289x + (zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10249bb * (1.0f - zoomImageViewKotlin.this.f10291z)));
                                }
                                if (zoomImageViewKotlin.this.f10290y + f7 > zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10250bc * zoomImageViewKotlin.this.f10172A) {
                                    f7 = ((zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10250bc) * zoomImageViewKotlin.this.f10172A) - zoomImageViewKotlin.this.f10290y;
                                } else if (zoomImageViewKotlin.this.f10290y + f7 < (-(zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10250bc * (1.0f - zoomImageViewKotlin.this.f10172A)))) {
                                    f7 = -(zoomImageViewKotlin.this.f10290y + (zoomImageViewKotlin.this.f10203aI * zoomImageViewKotlin.this.f10250bc * (1.0f - zoomImageViewKotlin.this.f10172A)));
                                }
                                zoomImageViewKotlin.access$3116(zoomImageViewKotlin.this, f6);
                                zoomImageViewKotlin.access$3316(zoomImageViewKotlin.this, f7);
                                float f8 = zoomImageViewKotlin.this.f10204aJ[0];
                                ((int[]) zoomImageViewKotlin.m10983H(zoomImageViewKotlin.this).get(zoomImageViewKotlin.this.f10276k))[0] = zoomImageViewKotlin.this.f10271f - ((int) (zoomImageViewKotlin.this.f10289x / f8));
                                ((int[]) zoomImageViewKotlin.m10983H(zoomImageViewKotlin.this).get(zoomImageViewKotlin.this.f10276k))[1] = zoomImageViewKotlin.this.f10272g - ((int) (zoomImageViewKotlin.this.f10290y / f8));
                                if (((int[]) zoomImageViewKotlin.m10987L(zoomImageViewKotlin.this).get(zoomImageViewKotlin.this.f10276k))[2] != -1) {
                                    ((int[]) zoomImageViewKotlin.m10983H(zoomImageViewKotlin.this).get(((int[]) zoomImageViewKotlin.m10987L(zoomImageViewKotlin.this).get(zoomImageViewKotlin.this.f10276k))[2]))[1] = zoomImageViewKotlin.this.f10272g - ((int) (zoomImageViewKotlin.this.f10290y / f8));
                                }
                            } else if (round < zoomImageViewKotlin.this.f10215aU) {
                                float f9 = f3 + f7;
                                if (f9 <= 0.0f) {
                                    if (f9 < (-zoomImageViewKotlin.this.f10248ba)) {
                                        f7 = -(f3 + zoomImageViewKotlin.this.f10248ba);
                                    }
                                    f6 = 0.0f;
                                } else {
                                    f7 = -f3;
                                    f6 = 0.0f;
                                }
                            } else if (round2 < zoomImageViewKotlin.this.f10216aV) {
                                float f10 = f2 + f6;
                                if (f10 <= 0.0f) {
                                    if (f10 < (-zoomImageViewKotlin.this.f10220aZ)) {
                                        f6 = -(f2 + zoomImageViewKotlin.this.f10220aZ);
                                    }
                                    f7 = 0.0f;
                                } else {
                                    f6 = -f2;
                                    f7 = 0.0f;
                                }
                            } else {
                                float f11 = f2 + f6;
                                if (f11 <= 0.0f) {
                                    if (f11 < (-zoomImageViewKotlin.this.f10220aZ)) {
                                        f6 = -(f2 + zoomImageViewKotlin.this.f10220aZ);
                                    }
                                    float f = f3 + f7;
                                    if (f > 0.0f) {
                                        f7 = -f3;
                                    } else if (f < (-zoomImageViewKotlin.this.f10248ba)) {
                                        f7 = -(f3 + zoomImageViewKotlin.this.f10248ba);
                                    }
                                } else {
                                    f6 = -f2;
                                    float f12 = f3 + f7;
                                }
                            }
                            zoomImageViewKotlin.this.getMatrix$app_release().postTranslate(f6, f7);
                            zoomImageViewKotlin.this.f10198aD.set(pointF.x, pointF.y);
                            break;
                        }
                        break;
                    case 5:
                        zoomImageViewKotlin zoomimageviewkotlin3 = zoomImageViewKotlin.this;
                        if (!zoomimageviewkotlin3.f10269d) {
                            zoomImageViewKotlin.this.f10198aD.set(event.getX(), event.getY());
                            zoomImageViewKotlin.this.f10199aE.set(zoomImageViewKotlin.this.f10198aD);
                            zoomImageViewKotlin zoomimageviewkotlin4 = zoomImageViewKotlin.this;
                            int m11039b2 = zoomImageViewKotlin.f10167a.m11040c();
                            zoomimageviewkotlin4.f10268c = m11039b2;
                            break;
                        }
                        break;
                    case 6:
                        zoomImageViewKotlin zoomimageviewkotlin5 = zoomImageViewKotlin.this;
                        int m11039b3 = zoomImageViewKotlin.f10167a.m11038a();
                        zoomimageviewkotlin5.f10268c = m11039b3;
                        break;
                }
                zoomImageViewKotlin.this.setImageMatrix(zoomImageViewKotlin.this.getMatrix$app_release());
                zoomImageViewKotlin.this.invalidate();
                return true;
            }
        });
    }

    public static final ArrayList m10983H(zoomImageViewKotlin zoomimageviewkotlin) {
        ArrayList<int[]> arrayList = zoomimageviewkotlin.f10277l;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
        }
        return arrayList;
    }

    public static final ArrayList m10987L(zoomImageViewKotlin zoomimageviewkotlin) {
        ArrayList<int[]> arrayList = zoomimageviewkotlin.f10278m;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if (r6 <= r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0074  */
    private final void m10988a(float f, float f2, float f3) {
        float f3b = 0.0f;
        Matrix a0 = null;
        float f4 = this.f10217aW;
        this.f10217aW = this.f10217aW * f;
        float f5 = this.f10217aW;
        float f6 = this.f10203aI;
        int i0;
        if (f5 <= f6) {
            i0 = 1;
        } else if (f5 == f6) {
            i0 = 0;
        } else {
            i0 = -1;
        }
        float f7 = 0.0f;
        float f0;
        if (i0 > 0) {
            f10217aW = f10203aI;
            f7 = f10203aI;
            f0 = f7 / f4;
        } else {
            if (this.f10217aW < this.f10202aH) {
                this.f10217aW = this.f10202aH;
                f7 = this.f10202aH;
                f0 = f7 / f4;
            } else {
                f0 = f;
            }
        }
        this.f10220aZ = ((this.f10215aU * this.f10217aW) - this.f10215aU) - ((this.f10213aS * 2.0f) * this.f10217aW);
        this.f10248ba = ((this.f10216aV * this.f10217aW) - this.f10216aV) - ((this.f10214aT * 2.0f) * this.f10217aW);
        float f8 = this.f10249bb * this.f10217aW;
        float f9 = this.f10215aU;
        int i1;
        if (f8 < f9) {
            i1 = -1;
        } else if (f8 == f9) {
            i1 = 0;
        } else {
            i1 = 1;
        }
        float f10 = 0.0f;
        Matrix a1 = null;
        if (i1 > 0) {
            float f11 = this.f10250bc * this.f10217aW;
            float f12 = this.f10216aV;
            int i2;
            if (f11 < f12) {
                i2 = -1;
            } else if (f11 == f12) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 > 0) {
                this.f10247b.postScale(f0, f0, f2, f3);
                this.f10247b.getValues(this.f10204aJ);
                float f13 = this.f10204aJ[2];
                f3b = this.f10204aJ[5];
                if (f0 < 1.0f) {
                    float f14 = -this.f10220aZ;
                    int i3;
                    if (f13 < f14) {
                        i3 = -1;
                    } else if (f13 == f14) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    Matrix a2 = null;
                    float f13b = f13;
                    if (i3 < 0) {
                        a2 = this.f10247b;
                        f13b = f13 + this.f10220aZ;
                        a2.postTranslate(-f13b, 0.0f);
                    } else {
                        if (f13 > 0.0f) {
                            a2 = this.f10247b;
                            a2.postTranslate(-f13b, 0.0f);
                        }
                    }
                    if (f3b < -this.f10248ba) {
                        a0 = this.f10247b;
                        f3b = f3b + this.f10248ba;
                        a0.postTranslate(0.0f, -f3b);
                        return;
                    }
                    if (f3b > 0.0f) {
                        a0 = this.f10247b;
                        a0.postTranslate(0.0f, -f3b);
                        return;
                    }
                }
                return;
            }
        }
        Matrix a3 = this.f10247b;
        float f15 = this.f10215aU;
        float f16 = 2.0f;
        a3.postScale(f0, f0, f15 / f16, this.f10216aV / f16);
        float f17 = 1.0f;
        int i4;
        if (f0 < f17) {
            i4 = -1;
        } else if (f0 == f17) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (i4 >= 0) {
            return;
        }
        this.f10247b.getValues(this.f10204aJ);
        f10 = this.f10204aJ[2];
        f3b = this.f10204aJ[5];
        if (i4 >= 0) {
            return;
        }
        if (((float) Math.round(this.f10249bb * this.f10217aW)) < this.f10215aU) {
            if (f3b < -this.f10248ba) {
                a0 = this.f10247b;
                f3b = f3b + this.f10248ba;
                a0.postTranslate(0.0f, -f3b);
                return;
            }
            if (f3b > 0.0f) {
                a0 = this.f10247b;
                a0.postTranslate(0.0f, -f3b);
                return;
            }
            return;
        }
        float f18 = -this.f10220aZ;
        int i5;
        if (f10 < f18) {
            i5 = -1;
        } else if (f10 == f18) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        if (i5 < 0) {
            a1 = this.f10247b;
            f10 = f10 + this.f10220aZ;
            a1.postTranslate(-f10, 0.0f);
            return;
        }
        if (f10 > 0.0f) {
            a1 = this.f10247b;
            a1.postTranslate(-f10, 0.0f);
            return;
        }
        return;
    }

    private final void m10989a(float f, float f2, float f3, float f4, float f5, Canvas canvas, Paint paint) {
        double d;
        double sqrt2;
        double d3 = f3 - f;
        double d4 = f4 - f2;
        double d5 = f5;
        double pow = (Math.pow(Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d4, 2.0d)), 2.0d) / (8.0d * d5)) + (d5 / 2.0d);
        double d6 = d3 * 0.5d;
        double d32 = d4 * 0.5d;
        double sqrt = Math.sqrt(Math.pow(d6, 2.0d) + Math.pow(d32, 2.0d));
        double sqrt22 = Math.sqrt(Math.pow(pow, 2.0d) - Math.pow(sqrt, 2.0d)) / sqrt;
        double d8 = sqrt22 * d6;
        if (d8 < 0.0d) {
            double d2 = f + d6 + (sqrt22 * d32);
            double d7 = f2;
            double d9 = (d7 + d32) - d8;
            d = d2;
            sqrt2 = d9;
        } else {
            d = (f + d6) - (sqrt22 * d32);
            sqrt2 = f2 + d32 + d8;
        }
        double d72 = d - pow;
        this.f10257bj.left = (float) d72;
        double d92 = d + pow;
        this.f10257bj.right = (float) d92;
        this.f10257bj.top = (float) (sqrt2 - pow);
        this.f10257bj.bottom = (float) (sqrt2 + pow);
        float acos = (float) (3.141592653589793d - (Math.acos((Math.sqrt(Math.pow(d92 - f, 2.0d) + Math.pow(sqrt2 - f2, 2.0d)) * 0.5d) / pow) * 2.0d));
        canvas.drawArc(this.f10257bj, 360.0f - (acos * 57.2957f), (acos - ((float) (3.141592653589793d - (Math.acos((Math.sqrt(Math.pow(d92 - f3, 2.0d) + Math.pow(sqrt2 - f4, 2.0d)) * 0.5d) / pow) * 2.0d)))) * 57.2957f, false, paint);
    }

    private final void m10990a(float f, float f2, float f3, float f4, String str, float f5, Canvas canvas, Paint paint, Paint paint2, Paint paint3) {
        float f6 = f5 * 0.75f;
        float f7 = f6 / 5.0f;
        canvas.drawLine(f, f2, f3, f4, paint);
        canvas.drawCircle(f3 + f7, f4 + f7, f6, this.f10229ai);
        canvas.drawCircle(f3, f4, f6, paint2);
        canvas.drawCircle(f3, f4, f6, paint);
        paint3.setTextSize(f5);
        canvas.drawText(str, f3 - (paint3.measureText(str) * 0.52f), (0.36f * f5) + f4, paint3);
    }

    public final void m11030a() {
        ArrayList<int[]> arrayList = this.f10277l;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
        }
        arrayList.get(this.f10276k)[0] = this.f10271f;
        ArrayList<int[]> arrayList2 = this.f10277l;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
        }
        arrayList2.get(this.f10276k)[1] = this.f10272g;
        ArrayList<int[]> arrayList3 = this.f10278m;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
        }
        if (arrayList3.get(this.f10276k)[2] != -1) {
            ArrayList<int[]> arrayList4 = this.f10277l;
            if (arrayList4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
            }
            ArrayList<int[]> arrayList5 = this.f10278m;
            if (arrayList5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
            }
            arrayList4.get(arrayList5.get(this.f10276k)[2])[1] = this.f10272g;
        }
        this.f10203aI = this.f10206aL;
        this.f10269d = false;
        this.f10270e = false;
        m11034a(0, 0, this.f10202aH, true);
    }

    public final void m11031a(float f) {
        float f2 = (f / this.f10206aL) * 1.5f;
        float f3 = this.f10252be / 1500.0f;
        if (this.f10252be < 1280.0f) {
            f2 *= f3;
        }
        float f4 = f2 * 5.0f;
        this.f10190S.setStrokeWidth(f4);
        this.f10225ae.setStrokeWidth(f4);
        this.f10191T.setStrokeWidth(f4);
        this.f10192U.setStrokeWidth(f4);
        float f5 = 40.0f * f2;
        float f6 = 20.0f * f2;
        this.f10192U.setPathEffect(new DashPathEffect(new float[]{f5, f6}, 0.0f));
        this.f10193V.setStrokeWidth(f4);
        float f7 = 10.0f * f2;
        this.f10193V.setPathEffect(new DashPathEffect(new float[]{f7, f7}, 0.0f));
        this.f10194W.setStrokeWidth(f6);
        this.f10222ab.setStrokeWidth(9.0f * f2);
        this.f10223ac.setStrokeWidth(f4);
        this.f10237aq.setStrokeWidth(f4);
        this.f10242av = f2 * 3.0f;
        this.f10265br = this.f10242av * this.f10263bp;
        this.f10238ar.setPathEffect(new DashPathEffect(new float[]{f5, f6}, 0.0f));
        this.f10241au = 3.0f - (this.f10263bp * 3.0f);
        if (this.f10269d) {
            float f8 = 11.0f * f2;
            this.f10235ao.setStrokeWidth(f8);
            this.f10236ap.setStrokeWidth(f8);
            this.f10239as.setStrokeWidth(3.08f * f2);
        } else {
            this.f10235ao.setStrokeWidth(this.f10264bq * f2);
            this.f10236ap.setStrokeWidth(this.f10264bq * f2);
            this.f10239as.setStrokeWidth(this.f10264bq * 0.28f * f2);
        }
        this.f10189R.setStrokeWidth(5.0f);
        this.f10187P.setStrokeWidth(5.0f);
        this.f10245ay.setStrokeWidth(4.0f * f2);
        this.f10244ax = 60.0f * f2;
        this.f10197aC = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* JADX WARN: Code duplicated, block: B:100:0x026f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0275  */
    /* JADX WARN: Code duplicated, block: B:103:0x0278  */
    /* JADX WARN: Code duplicated, block: B:104:0x027e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0291  */
    /* JADX WARN: Code duplicated, block: B:108:0x029b  */
    /* JADX WARN: Code duplicated, block: B:109:0x029e  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:90:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:94:0x0260  */
    /* JADX WARN: Code duplicated, block: B:95:0x0263  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Code duplicated, block: B:98:0x026a  */
    public final void m11032a(float f0, float f1, float f2, boolean b0) {
        float f3;
        int i0;
        float f6 = 0.0f;
        float f7;
        float f8 = 0.0f;
        int i1;
        int i;
        int i2;
        float f25;
        float f26;
        float f28;
        int i3;
        int i6;
        Matrix a5 = null;
        float f29;
        float f30;
        float f31;
        float f32;
        float f27;
        int i5;
        Matrix a4 = null;
        float f19;
        float f20;
        float f21;
        float f10;
        float f11;
        float f24;
        int i4;
        int i7;
        Matrix a3 = null;
        float f23;
        int i8;
        float f22 = 0.0f;
        Matrix a2 = null;
        float f4 = this.f10217aW;
        if (b0) {
            f3 = f2;
        } else {
            f3 = 1.0f / f2;
        }
        this.f10217aW *= f3;
        float f5 = this.f10217aW;
        float f9 = this.f10203aI;
        if (f5 > f9) {
            i0 = 1;
        } else {
            i0 = f5 == f9 ? 0 : -1;
        }
        if (i0 > 0) {
            this.f10217aW = this.f10203aI;
            f6 = this.f10203aI;
        } else {
            if (this.f10217aW < this.f10202aH) {
                this.f10217aW = this.f10202aH;
                f6 = this.f10202aH;
            }
            PrintStream a0 = System.out;
            a0.println("onManualScale ZoomIn: " + b0 + " origScale: " + f4 + " newScale: " + this.f10217aW);
            this.f10220aZ = ((this.f10215aU * this.f10217aW) - this.f10215aU) - ((this.f10213aS * 2.0f) * this.f10217aW);
            this.f10248ba = ((this.f10216aV * this.f10217aW) - this.f10216aV) - ((this.f10214aT * 2.0f) * this.f10217aW);
            this.f10205aK = f3;
            f7 = this.f10249bb * this.f10217aW;
            f8 = this.f10215aU;
            if (f7 < f8) {
                i1 = -1;
            } else if (f7 == f8) {
                i1 = 0;
            } else {
                i1 = 1;
            }
            if (i1 > 0 || this.f10250bc * this.f10217aW <= this.f10216aV) {
                if (f3 < 1.0f) {
                    i = -1;
                } else if (f3 == 1.0f) {
                    i = 0;
                } else {
                    i = 1;
                }
                i2 = i;
                if (i2 <= 0) {
                    System.out.println("zoomImage is smaller than screen");
                    this.f10247b.postScale(f3, f3, f0, f1);
                    if (i2 <= 0) {
                        this.f10247b.getValues(this.f10204aJ);
                        f25 = this.f10204aJ[2];
                        f26 = this.f10204aJ[5];
                        if (Math.round(this.f10249bb * this.f10217aW) < this.f10215aU) {
                            f27 = -this.f10248ba;
                            if (f26 < f27) {
                                i5 = -1;
                            } else if (f26 == f27) {
                                i5 = 0;
                            } else {
                                i5 = 1;
                            }
                            if (i5 >= 0) {
                                Matrix a6 = this.f10247b;
                                f26 += this.f10248ba;
                                a4 = a6;
                            } else if (f26 <= 0.0f) {
                                a4 = this.f10247b;
                            }
                            a4.postTranslate(0.0f, -f26);
                        } else {
                            f28 = -this.f10220aZ;
                            if (f25 < f28) {
                                i3 = -1;
                            } else if (f25 == f28) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            i6 = i3;
                            if (i6 >= 0) {
                                Matrix a7 = this.f10247b;
                                f25 += this.f10220aZ;
                                a5 = a7;
                            } else if (f25 > 0.0f) {
                                a5 = this.f10247b;
                            }
                            a5.postTranslate(-f25, 0.0f);
                        }
                        Matrix a8 = this.f10247b;
                        a8.getValues(this.f10204aJ);
                        f29 = this.f10204aJ[2];
                        f30 = this.f10204aJ[5];
                        f31 = this.f10204aJ[0];
                        f32 = this.f10204aJ[4];
                        if (f30 > this.f10214aT / f32) {
                            this.f10247b.postTranslate(0.0f, -(f30 - (this.f10214aT / f32)));
                        }
                        if (f29 < (-(this.f10213aS / f31))) {
                            this.f10247b.postTranslate(f29 - (this.f10213aS / f31), 0.0f);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f10247b.postScale(f3, f3, f0, f1);
            this.f10247b.getValues(this.f10204aJ);
            float f12 = this.f10204aJ[2];
            float f13 = this.f10204aJ[5];
            float f14 = this.f10217aW;
            float f15 = this.f10217aW;
            float f16 = this.f10215aU;
            float f17 = f16 / 2.0f;
            float f18 = this.f10216aV;
            float f110 = f18 / 2.0f;
            this.f10247b.postTranslate(-(f12 + ((f0 * f14) - f17)), -(f13 + ((f1 * f15) - f110)));
            if (f3 > 1.0f) {
                this.f10247b.getValues(this.f10204aJ);
                f19 = this.f10204aJ[2];
                f20 = this.f10204aJ[5];
                f21 = this.f10204aJ[4];
                f10 = this.f10249bb;
                f11 = this.f10217aW;
                if (Math.round(f10 * f11) < this.f10215aU) {
                    f23 = -this.f10248ba;
                    if (f20 < f23) {
                        i8 = -1;
                    } else if (f20 == f23) {
                        i8 = 0;
                    } else {
                        i8 = 1;
                    }
                    if (i8 >= 0) {
                        Matrix a9 = this.f10247b;
                        f22 = -(this.f10248ba + f20);
                        a2 = a9;
                    } else if (f20 <= 0.0f) {
                        a2 = this.f10247b;
                        f22 = -f20;
                    }
                    a2.postTranslate(0.0f, f22);
                } else {
                    f24 = -this.f10220aZ;
                    if (f19 < f24) {
                        i4 = -1;
                    } else if (f19 == f24) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    i7 = i4;
                    if (i7 >= 0) {
                        Matrix a10 = this.f10247b;
                        f19 += this.f10220aZ;
                        a3 = a10;
                    } else if (f19 > 0.0f) {
                        a3 = this.f10247b;
                    }
                    a3.postTranslate(-f19, 0.0f);
                }
                if (f20 <= this.f10214aT / f21) {
                    this.f10247b.postTranslate(0.0f, -(f20 - (this.f10214aT / f21)));
                }
            }
        }
        f3 = f6 / f4;
        PrintStream a1 = System.out;
        a1.println("onManualScale ZoomIn: " + b0 + " origScale: " + f4 + " newScale: " + this.f10217aW);
        this.f10220aZ = ((this.f10215aU * this.f10217aW) - this.f10215aU) - ((this.f10213aS * 2.0f) * this.f10217aW);
        this.f10248ba = ((this.f10216aV * this.f10217aW) - this.f10216aV) - ((this.f10214aT * 2.0f) * this.f10217aW);
        this.f10205aK = f3;
        f7 = this.f10249bb * this.f10217aW;
        f8 = this.f10215aU;
        if (f7 < f8) {
            i1 = -1;
        } else if (f7 == f8) {
            i1 = 0;
        } else {
            i1 = 1;
        }
        if (i1 > 0) {
            if (f3 < 1.0f) {
                i = -1;
            } else if (f3 == 1.0f) {
                i = 0;
            } else {
                i = 1;
            }
            i2 = i;
            if (i2 <= 0) {
                System.out.println("zoomImage is smaller than screen");
                this.f10247b.postScale(f3, f3, f0, f1);
                if (i2 <= 0) {
                    this.f10247b.getValues(this.f10204aJ);
                    f25 = this.f10204aJ[2];
                    f26 = this.f10204aJ[5];
                    if (Math.round(this.f10249bb * this.f10217aW) < this.f10215aU) {
                        f27 = -this.f10248ba;
                        if (f26 < f27) {
                            i5 = -1;
                        } else if (f26 == f27) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        if (i5 >= 0) {
                            Matrix a11 = this.f10247b;
                            f26 += this.f10248ba;
                            a4 = a11;
                        } else if (f26 <= 0.0f) {
                            a4 = this.f10247b;
                        }
                        a4.postTranslate(0.0f, -f26);
                    } else {
                        f28 = -this.f10220aZ;
                        if (f25 < f28) {
                            i3 = -1;
                        } else if (f25 == f28) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        i6 = i3;
                        if (i6 >= 0) {
                            Matrix a12 = this.f10247b;
                            f25 += this.f10220aZ;
                            a5 = a12;
                        } else if (f25 > 0.0f) {
                            a5 = this.f10247b;
                        }
                        a5.postTranslate(-f25, 0.0f);
                    }
                    Matrix a13 = this.f10247b;
                    a13.getValues(this.f10204aJ);
                    f29 = this.f10204aJ[2];
                    f30 = this.f10204aJ[5];
                    f31 = this.f10204aJ[0];
                    f32 = this.f10204aJ[4];
                    if (f30 > this.f10214aT / f32) {
                        this.f10247b.postTranslate(0.0f, -(f30 - (this.f10214aT / f32)));
                    }
                    if (f29 < (-(this.f10213aS / f31))) {
                        this.f10247b.postTranslate(f29 - (this.f10213aS / f31), 0.0f);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.f10247b.postScale(f3, f3, f0, f1);
        this.f10247b.getValues(this.f10204aJ);
        float f111 = this.f10204aJ[2];
        float f112 = this.f10204aJ[5];
        float f113 = this.f10217aW;
        float f114 = this.f10217aW;
        float f115 = this.f10215aU;
        float f116 = f115 / 2.0f;
        float f117 = this.f10216aV;
        float f118 = f117 / 2.0f;
        this.f10247b.postTranslate(-(f111 + ((f0 * f113) - f116)), -(f112 + ((f1 * f114) - f118)));
        if (f3 > 1.0f) {
            this.f10247b.getValues(this.f10204aJ);
            f19 = this.f10204aJ[2];
            f20 = this.f10204aJ[5];
            f21 = this.f10204aJ[4];
            f10 = this.f10249bb;
            f11 = this.f10217aW;
            if (Math.round(f10 * f11) < this.f10215aU) {
                f23 = -this.f10248ba;
                if (f20 < f23) {
                    i8 = -1;
                } else if (f20 == f23) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                if (i8 >= 0) {
                    Matrix a14 = this.f10247b;
                    f22 = -(this.f10248ba + f20);
                    a2 = a14;
                } else if (f20 <= 0.0f) {
                    a2 = this.f10247b;
                    f22 = -f20;
                }
                a2.postTranslate(0.0f, f22);
            } else {
                f24 = -this.f10220aZ;
                if (f19 < f24) {
                    i4 = -1;
                } else if (f19 == f24) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                i7 = i4;
                if (i7 >= 0) {
                    Matrix a15 = this.f10247b;
                    f19 += this.f10220aZ;
                    a3 = a15;
                } else if (f19 > 0.0f) {
                    a3 = this.f10247b;
                }
                a3.postTranslate(-f19, 0.0f);
            }
            if (f20 <= this.f10214aT / f21) {
                this.f10247b.postTranslate(0.0f, -(f20 - (this.f10214aT / f21)));
            }
        }
    }

    public final void m11033a(int i, float f) {
        ArrayList<int[]> arrayList = this.f10277l;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
        }
        int i2 = arrayList.get(i)[0];
        ArrayList<int[]> arrayList2 = this.f10277l;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
        }
        int i3 = arrayList2.get(i)[1];
        this.f10281p = this.f10217aW;
        this.f10289x = 0.0f;
        this.f10290y = 0.0f;
        this.f10276k = i;
        ArrayList<int[]> arrayList3 = this.f10278m;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
        }
        this.f10273h = arrayList3.get(i)[3] == 1;
        this.f10271f = i2;
        this.f10272g = i3;
        this.f10291z = i2 / this.f10251bd;
        this.f10172A = i3 / this.f10252be;
        this.f10270e = true;
        if (f > this.f10217aW) {
            this.f10203aI = f;
        }
        m11034a(i2, i3, f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, int[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, int[]] */
    public final void m11034a(int i0, int i1, float f0, boolean b0) {
        float f1;
        int i3;
        int i2;
        float f12;
        if (!this.f10284s) {
            this.f10285t = -1;
            this.f10286u = -1;
            this.f10287v = -1.0f;
            this.f10288w = false;
            this.f10284s = true;
            int i22 = (int) Math.round((i0 / this.f10251bd) * this.f10249bb);
            int i32 = (int) Math.round((i1 / this.f10252be) * this.f10250bc);
            if (b0) {
                float f2 = this.f10251bd;
                int i23 = ((int) (f2 / 2.0f)) + ((int) this.f10213aS);
                int i33 = ((int) (this.f10252be / 2.0f)) + ((int) this.f10214aT);
                f1 = this.f10202aH;
                i3 = i33;
                i2 = i23;
            } else {
                f1 = f0;
                i3 = i32;
                i2 = i22;
            }
            Ref.BooleanRef a0 = new Ref.BooleanRef();
            a0.element = f0 >= this.f10217aW;
            PrintStream a1 = System.out;
            StringBuilder a2 = new StringBuilder();
            a2.append("This is a zoom in : ");
            a2.append(a0.element);
            a1.println(a2.toString());
            if (f1 < this.f10202aH) {
                f1 = this.f10202aH;
            }
            if (f1 <= this.f10203aI) {
                f12 = f1;
            } else {
                float f13 = this.f10203aI;
                f12 = f13;
            }
            PrintStream a3 = System.out;
            a3.println("Zoomscale : " + f0 + " and currents scale : " + this.f10217aW);
            this.f10247b.getValues(this.f10204aJ);
            float f4 = (-this.f10204aJ[2]) / this.f10204aJ[0];
            float f5 = (-this.f10204aJ[5]) / this.f10204aJ[4];
            float f6 = ((this.f10251bd + (this.f10213aS * 2.0f)) / this.f10217aW) / 2.0f;
            float f7 = ((this.f10252be + (this.f10214aT * 2.0f)) / this.f10217aW) / 2.0f;
            float f8 = Math.round(((f6 + f4) / this.f10251bd) * this.f10249bb);
            float f9 = Math.round(((f7 + f5) / this.f10252be) * this.f10250bc);
            float f10 = i2;
            float f11 = i3;
            float f132 = (f10 - f8) / 70.0f;
            float f14 = (f11 - f9) / 70.0f;
            Ref.ObjectRef a5 = new Ref.ObjectRef();
            int[] r2 = new int[35];
            int i5 = r2.length;
            for (int i6 = 0; i6 < i5; i6++) {
                r2[i6] = i2;
            }
            a5.element = r2;
            Ref.ObjectRef a7 = new Ref.ObjectRef();
            int[] r22 = new int[35];
            int i52 = r22.length;
            for (int i62 = 0; i62 < i52; i62++) {
                r22[i62] = i3;
            }
            a7.element = r22;
            int i9 = 35 - 1;
            if (i9 >= 0) {
                int i10 = 0;
                while (true) {
                    StringBuilder a22 = a2;
                    PrintStream a12 = a1;
                    double d1 = i10;
                    double d3 = 35.0d / 8.0d;
                    int i11 = d1 < d3 ? -1 : d1 == d3 ? 0 : 1;
                    if (i11 >= 0) {
                        double d4 = 105.0d / 8.0d;
                        int i12 = d1 < d4 ? -1 : d1 == d4 ? 0 : 1;
                        if (i12 < 0) {
                            f8 += f132 * 2.0f;
                            f9 += f14 * 2.0f;
                            ((int[]) a5.element)[i10] = (int) f8;
                            ((int[]) a7.element)[i10] = (int) f9;
                        } else if (d1 < 175.0d / 8.0d) {
                            f8 += f132 * 3.0f;
                            f9 += 3.0f * f14;
                            ((int[]) a5.element)[i10] = (int) f8;
                            ((int[]) a7.element)[i10] = (int) f9;
                        } else if (d1 < 245.0d / 8.0d) {
                            f8 += f132 * 2.0f;
                            f9 += f14 * 2.0f;
                            ((int[]) a5.element)[i10] = (int) f8;
                            ((int[]) a7.element)[i10] = (int) f9;
                        } else if (i10 >= i9) {
                            ((int[]) a5.element)[i10] = i2;
                            ((int[]) a7.element)[i10] = i3;
                        } else {
                            f8 += f132 * 1.0f;
                            f9 += 1.0f * f14;
                            ((int[]) a5.element)[i10] = (int) f8;
                            ((int[]) a7.element)[i10] = (int) f9;
                        }
                    } else {
                        f8 += f132 * 1.0f;
                        f9 += 1.0f * f14;
                        ((int[]) a5.element)[i10] = (int) f8;
                        ((int[]) a7.element)[i10] = (int) f9;
                    }
                    if (i10 == i9) {
                        break;
                    }
                    i10++;
                    a1 = a12;
                    a2 = a22;
                }
            }
            Ref.DoubleRef a9 = new Ref.DoubleRef();
            a9.element = Math.pow(a0.element ? f12 / this.f10217aW : this.f10217aW / f12, 0.014492753623188406d);
            C2277e.m11051a(this, null, new C2272c(35.0d, a5, a7, a9, a0, 14.285714285714286d), 1, null);
            return;
        }
        this.f10285t = i0;
        this.f10286u = i1;
        this.f10287v = f0;
        this.f10288w = b0;
    }

    public final void m11035a(ArrayList<int[]> arrayList, ArrayList<int[]> _connectionList, int[] XpointList, ArrayList<int[]> _verticalLineList, ArrayList<int[]> _numericIndicatorList, String head_str, String feet_str) {
        ArrayList<int[]> _pointList = arrayList;
        Intrinsics.checkParameterIsNotNull(_pointList, "_pointList");
        Intrinsics.checkParameterIsNotNull(_connectionList, "_connectionList");
        Intrinsics.checkParameterIsNotNull(XpointList, "XpointList");
        Intrinsics.checkParameterIsNotNull(_verticalLineList, "_verticalLineList");
        Intrinsics.checkParameterIsNotNull(_numericIndicatorList, "_numericIndicatorList");
        Intrinsics.checkParameterIsNotNull(head_str, "head_str");
        Intrinsics.checkParameterIsNotNull(feet_str, "feet_str");
        Object clone = _connectionList.clone();
        if (clone != null) {
            this.f10278m = (ArrayList) clone;
            Object clone2 = _verticalLineList.clone();
            if (clone2 != null) {
                this.f10279n = (ArrayList) clone2;
                Object clone3 = _numericIndicatorList.clone();
                if (clone3 != null) {
                    this.f10280o = (ArrayList) clone3;
                    this.f10179H = XpointList[6];
                    this.f10180I = XpointList[7];
                    String upperCase = head_str.toUpperCase();
                    Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
                    this.f10183L = upperCase;
                    String upperCase2 = feet_str.toUpperCase();
                    Intrinsics.checkExpressionValueIsNotNull(upperCase2, "(this as java.lang.String).toUpperCase()");
                    this.f10184M = upperCase2;
                    this.f10277l = new ArrayList<>();
                    int[] iArr2 = new int[2];
                    if (arrayList.size() > 0) {
                        int size = arrayList.size() - 1;
                        int size2 = size;
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                iArr2[0] = _pointList.get(i)[0];
                                iArr2[1] = _pointList.get(i)[1];
                                Object clone4 = clone;
                                System.out.println("Added point: " + iArr2[0] + " " + iArr2[1]);
                                ArrayList<int[]> arrayList5 = this.f10277l;
                                if (arrayList5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
                                }
                                arrayList5.add((int[]) iArr2.clone());
                                int size3 = size2;
                                if (i == size3) {
                                    break;
                                }
                                i++;
                                _pointList = arrayList;
                                size2 = size3;
                                clone = clone4;
                            }
                        }
                    }
                    this.f10173B = XpointList[0];
                    this.f10174C = XpointList[1];
                    this.f10175D = XpointList[2];
                    this.f10176E = XpointList[3];
                    if (XpointList[4] != 0) {
                        this.f10177F = XpointList[4];
                        this.f10178G = XpointList[5];
                    } else {
                        this.f10177F = 0.0f;
                        this.f10178G = 0.0f;
                    }
                    this.f10181J = 0.0f;
                    this.f10182K = this.f10251bd;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.IntArray>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.IntArray>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.IntArray>");
    }

    public final int[] m11036a(boolean z) {
        this.f10247b.getValues(this.f10204aJ);
        float f = this.f10204aJ[0];
        int[] iArr = {this.f10271f - Math.round(this.f10289x / f), this.f10272g - Math.round(this.f10290y / f)};
        this.f10203aI = this.f10206aL;
        this.f10269d = false;
        this.f10270e = false;
        if (z) {
            m11034a(0, 0, this.f10202aH, true);
        }
        invalidate();
        return iArr;
    }

    public final void m11037b() {
        System.out.println("toggle editMode to " + this.f10270e);
        this.f10269d = this.f10270e;
    }

    public final float getAnimatedShadowOff() {
        return this.f10265br;
    }

    public final Context getContext$app_release() {
        return this.f10267bt;
    }

    public final float getCurScale() {
        return this.f10205aK;
    }

    public final float getEditcircleBlackOff() {
        return this.f10243aw;
    }

    public final RectF getFeetRect() {
        return this.f10256bi;
    }

    public final RectF getHeadRect() {
        return this.f10255bh;
    }

    public final PointF getImageCoordinates() {
        float min = Math.min(this.f10218aX, this.f10219aY);
        PointF pointF = new PointF();
        pointF.x = this.f10200aF.x / (this.f10217aW * min);
        pointF.y = this.f10200aF.y / (this.f10217aW * min);
        return pointF;
    }

    public final float getImageDisplayScale() {
        return (this.f10217aW * Math.min(this.f10218aX, this.f10219aY)) / this.f10215aU;
    }

    public final Matrix getMatrix$app_release() {
        return this.f10247b;
    }

    public final float getMaxTextSize() {
        return this.f10207aM;
    }

    public final float getMinTextSize() {
        return this.f10208aN;
    }

    public final String getPROPERTY_DIAMETER() {
        return this.f10258bk;
    }

    public final String getPROPERTY_DISTANCE() {
        return this.f10260bm;
    }

    public final Paint getPaintCircleMove$app_release() {
        return this.f10187P;
    }

    public final float getPaintpointStroke() {
        return this.f10264bq;
    }

    public final float getPointShadowOff() {
        return this.f10242av;
    }

    public final PropertyValuesHolder getPropertyDiameter() {
        return this.f10259bl;
    }

    public final PropertyValuesHolder getPropertyDistance() {
        return this.f10261bn;
    }

    public final float getScaleX$app_release() {
        return this.f10218aX;
    }

    public final float getScaleY$app_release() {
        return this.f10219aY;
    }

    public final BlurMaskFilter getShadowBlur() {
        return this.f10209aO;
    }

    public final float getShadowDistFactor() {
        return this.f10263bp;
    }

    public final float getShadowOff() {
        return this.f10240at;
    }

    public final float getTextOff() {
        return this.f10241au;
    }

    public final float getTriangleHeadDistFactor() {
        return this.f10262bo;
    }

    public final ValueAnimator getValueAnimator() {
        return this.f10266bs;
    }

    public final float[] getZoomAndFocus() {
        float[] fArr = {this.f10217aW, this.f10274i, this.f10275j};
        System.out.println((Object) ("Getting zoom " + fArr[0] + " and focus " + fArr[1] + "," + fArr[2]));
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x1071  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x1094  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x10fd  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x118a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x120f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* JADX WARN: Code duplicated, block: B:385:0x1071  */
    /* JADX WARN: Code duplicated, block: B:388:0x1094  */
    /* JADX WARN: Code duplicated, block: B:391:0x10fd  */
    /* JADX WARN: Code duplicated, block: B:394:0x1116  */
    /* JADX WARN: Code duplicated, block: B:397:0x1171  */
    /* JADX WARN: Code duplicated, block: B:400:0x118a  */
    /* JADX WARN: Code duplicated, block: B:403:0x11e5  */
    /* JADX WARN: Code duplicated, block: B:406:0x120f  */
    /* JADX WARN: Code duplicated, block: B:409:0x1232  */
    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        String str;
        int i9;
        float f151;
        float f149;
        float f84 = 0.0f;
        float f85 = 0.0f;
        float f86 = 0.0f;
        int b2 = 0;
        float f87 = 0.0f;
        float f88 = 0.0f;
        float f89 = 0.0f;
        Paint a90 = null;
        float f810 = 0.0f;
        ArrayList<int[]> arrayList;
        ArrayList<int[]> arrayList2;
        ArrayList<int[]> arrayList3;
        ArrayList<int[]> arrayList4;
        ArrayList<int[]> arrayList5;
        ArrayList<int[]> arrayList6;
        ArrayList<int[]> arrayList7;
        ArrayList<int[]> arrayList8;
        RectF a88 = null;
        ArrayList<int[]> arrayList9;
        float f79 = 0.0f;
        int b3;
        float f811;
        Path a91;
        float f83;
        float f82;
        float f80;
        float f812;
        Paint a89;
        int i6;
        int i7;
        float f48;
        float f49;
        float f50;
        float f52;
        float f51;
        Paint a47;
        Path a1;
        Paint a2;
        int i0;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        System.out.println("onDraw");
        this.f10247b.getValues(this.f10204aJ);
        float f0 = this.f10204aJ[2];
        float f1 = this.f10204aJ[5];
        float f2 = Math.min(this.f10204aJ[0], this.f10204aJ[4]);
        m11031a(f2);
        if (!this.f10269d) {
            str = "MeasPointList";
        } else {
            boolean b0 = this.f10273h;
            if (!b0) {
                str = "MeasPointList";
                if (this.f10268c != 1) {
                    float f3 = this.f10215aU;
                    float f5 = f3 / 2.0f;
                    float f6 = this.f10216aV / 2.0f;
                    float f7 = this.f10215aU;
                    canvas.drawCircle(f5, f6, (f7 / 13.0f) + this.f10243aw, this.f10188Q);
                    canvas.drawCircle(this.f10215aU / 2.0f, this.f10216aV / 2.0f, this.f10215aU / 13.0f, this.f10186O);
                    float f9 = this.f10262bo * ((int) (this.f10215aU / 8.0f));
                    int i1 = (int) (this.f10215aU / 40.0f);
                    this.f10224ad.reset();
                    Path path = this.f10224ad;
                    float f = this.f10215aU / 2.0f;
                    float f4 = this.f10216aV;
                    path.moveTo(f, (f4 / 2.0f) - f9);
                    Path a3 = this.f10224ad;
                    float f10 = this.f10215aU / 2.0f;
                    float f11 = i1;
                    float f8 = f10 - f11;
                    a3.lineTo(f8, ((this.f10216aV / 2.0f) - f9) + f11);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) + f11, ((this.f10216aV / 2.0f) - f9) + f11);
                    this.f10224ad.lineTo(this.f10215aU / 2.0f, (this.f10216aV / 2.0f) - f9);
                    this.f10224ad.offset(this.f10242av, this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10236ap);
                    this.f10224ad.offset(-this.f10242av, -this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10233am);
                    this.f10224ad.reset();
                    this.f10224ad.moveTo(this.f10215aU / 2.0f, (this.f10216aV / 2.0f) + f9);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) - f11, ((this.f10216aV / 2.0f) + f9) - f11);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) + f11, ((this.f10216aV / 2.0f) + f9) - f11);
                    this.f10224ad.lineTo(this.f10215aU / 2.0f, (this.f10216aV / 2.0f) + f9);
                    this.f10224ad.offset(this.f10242av, this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10236ap);
                    this.f10224ad.offset(-this.f10242av, -this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10233am);
                    this.f10224ad.reset();
                    this.f10224ad.moveTo((this.f10215aU / 2.0f) - f9, this.f10216aV / 2.0f);
                    this.f10224ad.lineTo(((this.f10215aU / 2.0f) - f9) + f11, (this.f10216aV / 2.0f) - f11);
                    this.f10224ad.lineTo(((this.f10215aU / 2.0f) - f9) + f11, (this.f10216aV / 2.0f) + f11);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) - f9, this.f10216aV / 2.0f);
                    this.f10224ad.offset(this.f10242av, this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10236ap);
                    this.f10224ad.offset(-this.f10242av, -this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10233am);
                    this.f10224ad.reset();
                    this.f10224ad.moveTo((this.f10215aU / 2.0f) + f9, this.f10216aV / 2.0f);
                    this.f10224ad.lineTo(((this.f10215aU / 2.0f) + f9) - f11, (this.f10216aV / 2.0f) - f11);
                    this.f10224ad.lineTo(((this.f10215aU / 2.0f) + f9) - f11, (this.f10216aV / 2.0f) + f11);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) + f9, this.f10216aV / 2.0f);
                    this.f10224ad.offset(this.f10242av, this.f10242av);
                    canvas.drawPath(this.f10224ad, this.f10236ap);
                    this.f10224ad.offset(-this.f10242av, -this.f10242av);
                    a1 = this.f10224ad;
                    Paint a4 = this.f10233am;
                    a2 = a4;
                    canvas.drawPath(a1, a2);
                } else {
                    this.f10224ad.reset();
                    Path a10 = this.f10224ad;
                    float f22 = this.f10215aU;
                    a10.moveTo(f22 / 2.0f, this.f10216aV / 2.0f);
                    this.f10224ad.lineTo((this.f10215aU / 2.0f) + this.f10289x, (this.f10216aV / 2.0f) + this.f10290y);
                    canvas.drawPath(this.f10224ad, this.f10221aa);
                    float f24 = this.f10215aU / 2.0f;
                    float f25 = this.f10216aV / 2.0f;
                    float f26 = this.f10215aU;
                    canvas.drawCircle(f24, f25, (f26 / 13.0f) + this.f10243aw, this.f10189R);
                    canvas.drawCircle(this.f10215aU / 2.0f, this.f10216aV / 2.0f, this.f10215aU / 13.0f, this.f10187P);
                }
            } else if (!this.f10269d || this.f10268c == 1) {
                str = "MeasPointList";
            } else {
                ArrayList<int[]> arrayList10 = this.f10277l;
                if (arrayList10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("MeasPointList");
                }
                int i2 = (int) ((arrayList10.get(this.f10276k)[1] * f2) + f1);
                if (this.f10276k != this.f10180I) {
                    if (this.f10276k == this.f10179H) {
                        this.f10231ak = Math.round(this.f10226af.measureText(this.f10183L));
                        i0 = (this.f10231ak / 2) + 10;
                        i2 -= (int) ((this.f10230aj / 2.0f) + 15.0f);
                    } else {
                        i0 = 10;
                    }
                } else {
                    this.f10232al = Math.round(this.f10226af.measureText(this.f10184M));
                    i0 = (this.f10232al / 2) + 10;
                    i2 += (int) ((this.f10230aj / 2.0f) + 15.0f);
                }
                float f12 = this.f10262bo * ((int) (this.f10215aU / 12.0f));
                int i3 = (int) (this.f10215aU / 40.0f);
                this.f10224ad.reset();
                Path a5 = this.f10224ad;
                float f13 = i0;
                float f14 = i2;
                float f15 = f14 - f12;
                a5.moveTo(f13, f15);
                Path a6 = this.f10224ad;
                float f16 = i0 - i3;
                float f17 = i3;
                float f18 = f15 + f17;
                a6.lineTo(f16, f18);
                Path a7 = this.f10224ad;
                str = "MeasPointList";
                float f19 = i0 + i3;
                a7.lineTo(f19, f18);
                Path a8 = this.f10224ad;
                a8.lineTo(f13, f15);
                this.f10224ad.offset(this.f10242av, this.f10242av);
                canvas.drawPath(this.f10224ad, this.f10236ap);
                this.f10224ad.offset(-this.f10242av, -this.f10242av);
                canvas.drawPath(this.f10224ad, this.f10234an);
                this.f10224ad.reset();
                Path a9 = this.f10224ad;
                float f20 = f14 + f12;
                a9.moveTo(f13, f20);
                Path a11 = this.f10224ad;
                float f110 = f20 - f17;
                a11.lineTo(f16, f110);
                Path a12 = this.f10224ad;
                a12.lineTo(f19, f110);
                this.f10224ad.lineTo(f13, f20);
                Path path2 = this.f10224ad;
                float f21 = this.f10242av;
                path2.offset(f21, this.f10242av);
                canvas.drawPath(this.f10224ad, this.f10236ap);
                this.f10224ad.offset(-this.f10242av, -this.f10242av);
                a1 = this.f10224ad;
                a2 = this.f10234an;
                canvas.drawPath(a1, a2);
            }
        }
        if (!this.f10269d) {
            this.f10191T.setColor(-16776961);
            this.f10193V.setColor(-16776961);
            ArrayList<int[]> arrayList11 = this.f10279n;
            if (arrayList11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
            }
            int i4 = arrayList11.size();
            int i5 = 0;
            while (i5 < i4) {
                this.f10224ad.reset();
                Path a13 = this.f10224ad;
                ArrayList<int[]> arrayList12 = this.f10279n;
                if (arrayList12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f28 = arrayList12.get(i5)[0];
                ArrayList<int[]> arrayList13 = this.f10279n;
                if (arrayList13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                a13.moveTo((f28 * f2) + f0, (arrayList13.get(i5)[1] * f2) + f1);
                Path a15 = this.f10224ad;
                ArrayList<int[]> arrayList14 = this.f10279n;
                if (arrayList14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f29 = arrayList14.get(i5)[2];
                ArrayList<int[]> arrayList15 = arrayList11;
                ArrayList<int[]> arrayList16 = this.f10279n;
                if (arrayList16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                a15.lineTo((f29 * f2) + f0, (arrayList16.get(i5)[3] * f2) + f1);
                canvas.drawPath(this.f10224ad, this.f10193V);
                ArrayList<int[]> arrayList17 = this.f10279n;
                if (arrayList17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f30 = arrayList17.get(i5)[2];
                ArrayList<int[]> arrayList18 = this.f10279n;
                if (arrayList18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f31 = arrayList18.get(i5)[3];
                ArrayList<int[]> arrayList19 = this.f10279n;
                if (arrayList19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f32 = arrayList19.get(i5)[6];
                ArrayList<int[]> arrayList20 = this.f10279n;
                if (arrayList20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f33 = (f30 * f2) + f0;
                float f210 = (f31 * f2) + f1;
                canvas.drawLine(f33, f210, (f32 * f2) + f0, (arrayList20.get(i5)[7] * f2) + f1, this.f10191T);
                ArrayList<int[]> arrayList21 = this.f10279n;
                if (arrayList21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f34 = arrayList21.get(i5)[2];
                float f35 = this.f10197aC;
                ArrayList<int[]> arrayList22 = this.f10279n;
                if (arrayList22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f36 = arrayList22.get(i5)[3];
                ArrayList<int[]> arrayList23 = this.f10279n;
                if (arrayList23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f37 = arrayList23.get(i5)[2];
                float f38 = this.f10197aC;
                int i8 = i4;
                ArrayList<int[]> arrayList24 = this.f10279n;
                if (arrayList24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f39 = (f36 * f2) + f1;
                float f310 = f38 + (f37 * f2) + f0;
                canvas.drawLine(((f34 * f2) + f0) - f35, f39, f310, (arrayList24.get(i5)[3] * f2) + f1, this.f10191T);
                ArrayList<int[]> arrayList25 = this.f10279n;
                if (arrayList25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f311 = arrayList25.get(i5)[6];
                float f312 = this.f10197aC;
                ArrayList<int[]> arrayList26 = this.f10279n;
                if (arrayList26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f40 = arrayList26.get(i5)[7];
                ArrayList<int[]> arrayList27 = this.f10279n;
                if (arrayList27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f41 = arrayList27.get(i5)[6];
                float f313 = this.f10197aC;
                ArrayList<int[]> arrayList28 = this.f10279n;
                if (arrayList28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f314 = (f40 * f2) + f1;
                float f315 = f313 + (f41 * f2) + f0;
                canvas.drawLine(((f311 * f2) + f0) - f312, f314, f315, (arrayList28.get(i5)[7] * f2) + f1, this.f10191T);
                this.f10224ad.reset();
                Path a30 = this.f10224ad;
                ArrayList<int[]> arrayList29 = this.f10279n;
                if (arrayList29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f43 = arrayList29.get(i5)[4];
                ArrayList<int[]> arrayList30 = this.f10279n;
                if (arrayList30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                a30.moveTo((f43 * f2) + f0, (arrayList30.get(i5)[5] * f2) + f1);
                Path a33 = this.f10224ad;
                ArrayList<int[]> arrayList31 = this.f10279n;
                if (arrayList31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                float f44 = arrayList31.get(i5)[6];
                ArrayList<int[]> arrayList32 = this.f10279n;
                if (arrayList32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("VerticalLineList");
                }
                a33.lineTo((f44 * f2) + f0, (arrayList32.get(i5)[7] * f2) + f1);
                canvas.drawPath(this.f10224ad, this.f10193V);
                i5++;
                arrayList11 = arrayList15;
                i4 = i8;
            }
            this.f10193V.setColor(SupportMenu.CATEGORY_MASK);
            this.f10191T.setColor(SupportMenu.CATEGORY_MASK);
        }
        ArrayList<int[]> arrayList33 = this.f10278m;
        String str2 = "MeasPointConnections";
        if (arrayList33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
        }
        int i10 = arrayList33.size();
        int i11 = 0;
        while (i11 < i10) {
            this.f10185N = this.f10191T;
            ArrayList<int[]> arrayList34 = this.f10278m;
            if (arrayList34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
            }
            if (arrayList34.get(i11)[3] == -1) {
                this.f10185N = this.f10192U;
            }
            ArrayList<int[]> arrayList35 = this.f10278m;
            if (arrayList35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
            }
            if (arrayList35.get(i11)[0] != -1) {
                ArrayList<int[]> arrayList36 = this.f10278m;
                if (arrayList36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                }
                if (arrayList36.get(i11)[1] > 0) {
                    int i12 = i10;
                    ArrayList<int[]> arrayList37 = this.f10278m;
                    if (arrayList37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                    }
                    if (arrayList37.get(i11)[2] != -1) {
                        i7 = i11;
                        ArrayList<int[]> arrayList38 = this.f10277l;
                        if (arrayList38 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f65 = arrayList38.get(i7)[0];
                        float f66 = this.f10265br;
                        ArrayList<int[]> arrayList39 = this.f10277l;
                        if (arrayList39 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f67 = arrayList39.get(i7)[1];
                        float f68 = this.f10265br;
                        ArrayList<int[]> arrayList40 = this.f10278m;
                        if (arrayList40 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f69 = arrayList40.get(i7)[1];
                        ArrayList<int[]> arrayList41 = this.f10277l;
                        if (arrayList41 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList42 = this.f10278m;
                        if (arrayList42 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f70 = arrayList41.get(arrayList42.get(i7)[0])[0];
                        float f71 = this.f10265br;
                        ArrayList<int[]> arrayList43 = this.f10277l;
                        if (arrayList43 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList44 = this.f10278m;
                        if (arrayList44 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f72 = arrayList43.get(arrayList44.get(i7)[0])[1];
                        float f73 = this.f10265br;
                        ArrayList<int[]> arrayList45 = this.f10278m;
                        if (arrayList45 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f74 = f66 + (f65 * f2) + f0;
                        float f610 = f71 + (f70 * f2) + f0;
                        i6 = i12;
                        canvas.drawArc(f74, (((f67 * f2) + f1) + f68) - ((f69 * f2) * 0.95f), f610, (arrayList45.get(i7)[1] * f2 * 0.95f) + (f72 * f2) + f1 + f73, 180.0f, 180.0f, false, this.f10237aq);
                        ArrayList<int[]> arrayList46 = this.f10277l;
                        if (arrayList46 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f75 = arrayList46.get(i7)[0];
                        ArrayList<int[]> arrayList47 = this.f10277l;
                        if (arrayList47 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f76 = arrayList47.get(i7)[1];
                        ArrayList<int[]> arrayList48 = this.f10278m;
                        if (arrayList48 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f77 = arrayList48.get(i7)[1];
                        ArrayList<int[]> arrayList49 = this.f10277l;
                        if (arrayList49 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList50 = this.f10278m;
                        if (arrayList50 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f78 = arrayList49.get(arrayList50.get(i7)[0])[0];
                        ArrayList<int[]> arrayList51 = this.f10277l;
                        if (arrayList51 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList52 = this.f10278m;
                        if (arrayList52 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f710 = arrayList51.get(arrayList52.get(i7)[0])[1];
                        ArrayList<int[]> arrayList53 = this.f10278m;
                        if (arrayList53 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f711 = (arrayList53.get(i7)[1] * f2) + (f710 * f2) + f1;
                        canvas.drawArc((f75 * f2) + f0, ((f76 * f2) + f1) - (f77 * f2), (f78 * f2) + f0, f711, 180.0f, 180.0f, false, this.f10185N);
                    } else {
                        ArrayList<int[]> arrayList54 = this.f10278m;
                        if (arrayList54 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        if (arrayList54.get(i11)[3] != -1) {
                            ArrayList<int[]> arrayList55 = this.f10277l;
                            if (arrayList55 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f53 = arrayList55.get(i11)[0];
                            float f410 = this.f10265br + (f53 * f2) + f0;
                            f48 = f410;
                            ArrayList<int[]> arrayList56 = this.f10277l;
                            if (arrayList56 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f54 = arrayList56.get(i11)[1];
                            float f55 = this.f10265br;
                            float f411 = f55 + (f54 * f2) + f1;
                            ArrayList<int[]> arrayList57 = this.f10277l;
                            if (arrayList57 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            ArrayList<int[]> arrayList58 = this.f10278m;
                            if (arrayList58 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f56 = arrayList57.get(arrayList58.get(i11)[0])[0];
                            f49 = f411;
                            float f412 = this.f10265br;
                            float f57 = f412 + (f56 * f2) + f0;
                            ArrayList<int[]> arrayList59 = this.f10277l;
                            if (arrayList59 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            ArrayList<int[]> arrayList60 = this.f10278m;
                            if (arrayList60 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f58 = arrayList59.get(arrayList60.get(i11)[0] != 0 ? 1 : 0)[1];
                            float f59 = this.f10265br;
                            float f510 = f59 + (f58 * f2) + f1;
                            ArrayList<int[]> arrayList61 = this.f10278m;
                            if (arrayList61 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f511 = arrayList61.get(i11)[1] * f2 * 0.95f;
                            Paint a48 = this.f10237aq;
                            f52 = f511;
                            f51 = f510;
                            a47 = a48;
                            f50 = f57;
                        } else {
                            ArrayList<int[]> arrayList62 = this.f10277l;
                            if (arrayList62 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f512 = arrayList62.get(i11)[0];
                            float f413 = this.f10265br + (f512 * f2) + f0;
                            f48 = f413;
                            ArrayList<int[]> arrayList63 = this.f10277l;
                            if (arrayList63 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f513 = arrayList63.get(i11)[1];
                            float f514 = this.f10265br;
                            float f414 = f514 + (f513 * f2) + f1;
                            ArrayList<int[]> arrayList64 = this.f10277l;
                            if (arrayList64 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            ArrayList<int[]> arrayList65 = this.f10278m;
                            if (arrayList65 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f515 = arrayList64.get(arrayList65.get(i11)[0])[0];
                            f49 = f414;
                            float f415 = this.f10265br;
                            float f516 = f415 + (f515 * f2) + f0;
                            ArrayList<int[]> arrayList66 = this.f10277l;
                            if (arrayList66 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            ArrayList<int[]> arrayList67 = this.f10278m;
                            if (arrayList67 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f60 = arrayList66.get(arrayList67.get(i11)[0])[1];
                            f50 = f516;
                            float f517 = this.f10265br;
                            float f518 = f517 + (f60 * f2) + f1;
                            ArrayList<int[]> arrayList68 = this.f10278m;
                            if (arrayList68 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                            }
                            float f519 = arrayList68.get(i11)[1] * f2 * 0.95f;
                            f52 = f519;
                            f51 = f518;
                            a47 = this.f10238ar;
                        }
                        i7 = i11;
                        m10989a(f48, f49, f50, f51, f52, canvas, a47);
                        ArrayList<int[]> arrayList69 = this.f10277l;
                        if (arrayList69 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f61 = arrayList69.get(i7)[0];
                        ArrayList<int[]> arrayList70 = this.f10277l;
                        if (arrayList70 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f62 = arrayList70.get(i7)[1];
                        ArrayList<int[]> arrayList71 = this.f10277l;
                        if (arrayList71 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList72 = this.f10278m;
                        if (arrayList72 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f63 = arrayList71.get(arrayList72.get(i7)[0])[0];
                        ArrayList<int[]> arrayList73 = this.f10277l;
                        if (arrayList73 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        ArrayList<int[]> arrayList74 = this.f10278m;
                        if (arrayList74 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f64 = arrayList73.get(arrayList74.get(i7)[0])[1];
                        ArrayList<int[]> arrayList75 = this.f10278m;
                        if (arrayList75 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                        }
                        float f611 = (f61 * f2) + f0;
                        float f612 = (f63 * f2) + f0;
                        float f613 = f2 * arrayList75.get(i7)[1];
                        m10989a(f611, (f62 * f2) + f1, f612, (f64 * f2) + f1, f613, canvas, this.f10185N);
                        i6 = i12;
                    }
                } else {
                    ArrayList<int[]> arrayList76 = this.f10277l;
                    if (arrayList76 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f45 = arrayList76.get(i11)[0];
                    ArrayList<int[]> arrayList77 = this.f10277l;
                    if (arrayList77 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f46 = arrayList77.get(i11)[1];
                    ArrayList<int[]> arrayList78 = this.f10277l;
                    if (arrayList78 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    int i13 = i10;
                    ArrayList<int[]> arrayList79 = this.f10278m;
                    if (arrayList79 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                    }
                    float f47 = arrayList78.get(arrayList79.get(i11)[0])[0];
                    ArrayList<int[]> arrayList80 = this.f10277l;
                    if (arrayList80 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    ArrayList<int[]> arrayList81 = this.f10278m;
                    if (arrayList81 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("MeasPointConnections");
                    }
                    canvas.drawLine((f45 * f2) + f0, (f46 * f2) + f1, (f47 * f2) + f0, (arrayList80.get(arrayList81.get(i11)[0])[1] * f2) + f1, this.f10185N);
                    i6 = i13;
                    i7 = i11;
                }
            } else {
                i6 = i10;
                i7 = i11;
            }
            i11 = i7 + 1;
            i10 = i6;
            arrayList33 = arrayList33;
        }
        int i14 = i11;
        ArrayList<int[]> arrayList82 = this.f10277l;
        if (arrayList82 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        int i15 = arrayList82.size();
        int i16 = 0;
        while (i16 < i15) {
            ArrayList<int[]> arrayList83 = this.f10278m;
            if (arrayList83 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            if (arrayList83.get(i16)[3] != 0) {
                int i17 = this.f10180I;
                if (i16 == i17) {
                    i9 = i16;
                    boolean b1 = this.f10269d;
                    if (b1) {
                        if (this.f10276k == i9) {
                            float f813 = this.f10181J;
                            f84 = (f813 * f2) + f0;
                            ArrayList<int[]> arrayList84 = this.f10277l;
                            if (arrayList84 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f814 = (arrayList84.get(i9)[1] * f2) + f1;
                            float f815 = (this.f10182K * f2) + f0;
                            ArrayList<int[]> arrayList85 = this.f10277l;
                            if (arrayList85 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            int b4 = arrayList85.get(i9)[1];
                            f85 = f814;
                            f86 = f815;
                            b2 = b4;
                        } else {
                            float f816 = (this.f10181J * f2) + f0;
                            ArrayList<int[]> arrayList86 = this.f10277l;
                            if (arrayList86 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f817 = (arrayList86.get(i9)[1] * f2) + f1;
                            float f818 = (this.f10182K * f2) + f0;
                            ArrayList<int[]> arrayList87 = this.f10277l;
                            if (arrayList87 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            float f819 = (arrayList87.get(i9)[1] * f2) + f1;
                            f87 = f817;
                            f88 = f818;
                            f89 = f819;
                            a90 = this.f10223ac;
                            f810 = f816;
                        }
                        canvas.drawLine(f810, f87, f88, f89, a90);
                        this.f10232al = Math.round(this.f10226af.measureText(this.f10184M));
                        float f93 = Math.max((this.f10181J * f2) + 10.0f + f0, 10.0f);
                        float f94 = this.f10240at;
                        float f95 = this.f10263bp;
                        arrayList = this.f10277l;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f96 = arrayList.get(i9)[1];
                        float f97 = this.f10240at;
                        float f98 = this.f10263bp;
                        float f99 = f93 - 10.0f;
                        float f100 = this.f10232al + 30;
                        float f101 = this.f10240at;
                        float f102 = this.f10263bp;
                        arrayList2 = this.f10277l;
                        if (arrayList2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f103 = arrayList2.get(i9)[1];
                        float f104 = this.f10230aj;
                        float f105 = f93 + (f94 * f95);
                        float f910 = (f101 * f102) + f99 + f100;
                        float f106 = this.f10240at;
                        float f107 = this.f10263bp;
                        float f911 = (f106 * f107) + (f103 * f2) + f1 + 30.0f + f104;
                        canvas.drawRoundRect(f105, (f97 * f98) + (f96 * f2) + f1 + 20.0f, f910, f911, 5.0f, 5.0f, this.f10229ai);
                        float f108 = this.f10241au;
                        arrayList3 = this.f10277l;
                        if (arrayList3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f109 = arrayList3.get(i9)[1];
                        float f1010 = this.f10241au;
                        float f1011 = this.f10232al + 30;
                        float f1012 = this.f10241au;
                        arrayList4 = this.f10277l;
                        if (arrayList4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f111 = arrayList4.get(i9)[1];
                        float f112 = this.f10230aj;
                        float f1013 = f93 + f108;
                        float f1014 = f1010 + (f109 * f2) + f1 + 20.0f;
                        float f1015 = f1012 + f99 + f1011;
                        float f1016 = this.f10241au + (f111 * f2) + f1 + 30.0f + f112;
                        canvas.drawRoundRect(f1013, f1014, f1015, f1016, 3.0f, 3.0f, this.f10228ah);
                        float f113 = this.f10241au;
                        arrayList5 = this.f10277l;
                        if (arrayList5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f114 = arrayList5.get(i9)[1];
                        float f115 = this.f10241au;
                        float f116 = this.f10232al + 30;
                        float f117 = this.f10241au;
                        arrayList6 = this.f10277l;
                        if (arrayList6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f118 = arrayList6.get(i9)[1];
                        float f119 = this.f10230aj;
                        float f1110 = f93 + f113;
                        float f1111 = f115 + (f114 * f2) + f1 + 20.0f;
                        float f1112 = f99 + f116 + f117;
                        float f1113 = this.f10241au + (f118 * f2) + f1 + 30.0f + f119;
                        canvas.drawRoundRect(f1110, f1111, f1112, f1113, 3.0f, 3.0f, this.f10227ag);
                        String s0 = this.f10184M;
                        arrayList7 = this.f10277l;
                        if (arrayList7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        canvas.drawText(s0, f93 + 10.0f, (arrayList7.get(i9)[1] * f2) + f1 + this.f10230aj + 20.0f, this.f10226af);
                        this.f10256bi.left = (10.0f - f0) / f2;
                        RectF a111 = this.f10256bi;
                        arrayList8 = this.f10277l;
                        if (arrayList8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        a111.top = arrayList8.get(i9)[1] + (20.0f / f2);
                        this.f10256bi.right = ((this.f10232al + 30) - f0) / f2;
                        a88 = this.f10256bi;
                        arrayList9 = this.f10277l;
                        if (arrayList9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        f79 = ((this.f10230aj + 30.0f) / f2) + arrayList9.get(i9)[1];
                    } else {
                        this.f10224ad.reset();
                        Path a94 = this.f10224ad;
                        float f820 = this.f10181J;
                        ArrayList<int[]> arrayList88 = this.f10277l;
                        if (arrayList88 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        a94.moveTo((f820 * f2) + f0, (arrayList88.get(i9)[1] * f2) + f1);
                        if (this.f10177F == 0.0f) {
                            Path a92 = this.f10224ad;
                            float f821 = (this.f10176E * f2) + f0;
                            ArrayList<int[]> arrayList89 = this.f10277l;
                            if (arrayList89 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            int b5 = arrayList89.get(i9)[1];
                            b3 = b5;
                            f811 = f821;
                            a91 = a92;
                        } else {
                            Path a93 = this.f10224ad;
                            float f822 = (this.f10178G * f2) + f0;
                            ArrayList<int[]> arrayList90 = this.f10277l;
                            if (arrayList90 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            b3 = arrayList90.get(i9)[1];
                            f811 = f822;
                            a91 = a93;
                        }
                        a91.lineTo(f811, (b3 * f2) + f1);
                        canvas.drawPath(this.f10224ad, this.f10193V);
                        float f90 = this.f10175D;
                        ArrayList<int[]> arrayList91 = this.f10277l;
                        if (arrayList91 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f91 = arrayList91.get(i9)[1];
                        float f92 = this.f10176E;
                        ArrayList<int[]> arrayList92 = this.f10277l;
                        if (arrayList92 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f823 = (f92 * f2) + f0;
                        canvas.drawLine((f90 * f2) + f0, (f91 * f2) + f1, f823, (arrayList92.get(i9)[1] * f2) + f1, this.f10222ab);
                        if (this.f10177F != 0.0f) {
                            f84 = (this.f10177F * f2) + f0;
                            ArrayList<int[]> arrayList93 = this.f10277l;
                            if (arrayList93 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            f85 = (arrayList93.get(i9)[1] * f2) + f1;
                            f86 = (this.f10178G * f2) + f0;
                            ArrayList<int[]> arrayList94 = this.f10277l;
                            if (arrayList94 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                            }
                            b2 = arrayList94.get(i9)[1];
                        }
                        this.f10232al = Math.round(this.f10226af.measureText(this.f10184M));
                        float f912 = Math.max((this.f10181J * f2) + 10.0f + f0, 10.0f);
                        float f913 = this.f10240at;
                        float f914 = this.f10263bp;
                        arrayList = this.f10277l;
                        if (arrayList == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f915 = arrayList.get(i9)[1];
                        float f916 = this.f10240at;
                        float f917 = this.f10263bp;
                        float f918 = f912 - 10.0f;
                        float f1017 = this.f10232al + 30;
                        float f1018 = this.f10240at;
                        float f1019 = this.f10263bp;
                        arrayList2 = this.f10277l;
                        if (arrayList2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1020 = arrayList2.get(i9)[1];
                        float f1021 = this.f10230aj;
                        float f1022 = f912 + (f913 * f914);
                        float f919 = (f1018 * f1019) + f918 + f1017;
                        float f1023 = this.f10240at;
                        float f1024 = this.f10263bp;
                        float f9110 = (f1023 * f1024) + (f1020 * f2) + f1 + 30.0f + f1021;
                        canvas.drawRoundRect(f1022, (f916 * f917) + (f915 * f2) + f1 + 20.0f, f919, f9110, 5.0f, 5.0f, this.f10229ai);
                        float f1025 = this.f10241au;
                        arrayList3 = this.f10277l;
                        if (arrayList3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1026 = arrayList3.get(i9)[1];
                        float f10110 = this.f10241au;
                        float f10111 = this.f10232al + 30;
                        float f10112 = this.f10241au;
                        arrayList4 = this.f10277l;
                        if (arrayList4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1114 = arrayList4.get(i9)[1];
                        float f1115 = this.f10230aj;
                        float f10113 = f912 + f1025;
                        float f10114 = f10110 + (f1026 * f2) + f1 + 20.0f;
                        float f10115 = f10112 + f918 + f10111;
                        float f10116 = this.f10241au + (f1114 * f2) + f1 + 30.0f + f1115;
                        canvas.drawRoundRect(f10113, f10114, f10115, f10116, 3.0f, 3.0f, this.f10228ah);
                        float f1116 = this.f10241au;
                        arrayList5 = this.f10277l;
                        if (arrayList5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1117 = arrayList5.get(i9)[1];
                        float f1118 = this.f10241au;
                        float f1119 = this.f10232al + 30;
                        float f1120 = this.f10241au;
                        arrayList6 = this.f10277l;
                        if (arrayList6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1121 = arrayList6.get(i9)[1];
                        float f1122 = this.f10230aj;
                        float f11110 = f912 + f1116;
                        float f11111 = f1118 + (f1117 * f2) + f1 + 20.0f;
                        float f11112 = f918 + f1119 + f1120;
                        float f11113 = this.f10241au + (f1121 * f2) + f1 + 30.0f + f1122;
                        canvas.drawRoundRect(f11110, f11111, f11112, f11113, 3.0f, 3.0f, this.f10227ag);
                        String s1 = this.f10184M;
                        arrayList7 = this.f10277l;
                        if (arrayList7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        canvas.drawText(s1, f912 + 10.0f, (arrayList7.get(i9)[1] * f2) + f1 + this.f10230aj + 20.0f, this.f10226af);
                        this.f10256bi.left = (10.0f - f0) / f2;
                        RectF a112 = this.f10256bi;
                        arrayList8 = this.f10277l;
                        if (arrayList8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        a112.top = arrayList8.get(i9)[1] + (20.0f / f2);
                        this.f10256bi.right = ((this.f10232al + 30) - f0) / f2;
                        a88 = this.f10256bi;
                        arrayList9 = this.f10277l;
                        if (arrayList9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        f79 = ((this.f10230aj + 30.0f) / f2) + arrayList9.get(i9)[1];
                    }
                    float f824 = b2;
                    float f825 = (f824 * f2) + f1;
                    Paint a95 = this.f10222ab;
                    f89 = f825;
                    f87 = f85;
                    f88 = f86;
                    a90 = a95;
                    f810 = f84;
                    canvas.drawLine(f810, f87, f88, f89, a90);
                    this.f10232al = Math.round(this.f10226af.measureText(this.f10184M));
                    float f9111 = Math.max((this.f10181J * f2) + 10.0f + f0, 10.0f);
                    float f9112 = this.f10240at;
                    float f9113 = this.f10263bp;
                    arrayList = this.f10277l;
                    if (arrayList == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f9114 = arrayList.get(i9)[1];
                    float f9115 = this.f10240at;
                    float f9116 = this.f10263bp;
                    float f9117 = f9111 - 10.0f;
                    float f10117 = this.f10232al + 30;
                    float f10118 = this.f10240at;
                    float f10119 = this.f10263bp;
                    arrayList2 = this.f10277l;
                    if (arrayList2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f1027 = arrayList2.get(i9)[1];
                    float f1028 = this.f10230aj;
                    float f1029 = f9111 + (f9112 * f9113);
                    float f9118 = (f10118 * f10119) + f9117 + f10117;
                    float f10210 = this.f10240at;
                    float f10211 = this.f10263bp;
                    float f9119 = (f10210 * f10211) + (f1027 * f2) + f1 + 30.0f + f1028;
                    canvas.drawRoundRect(f1029, (f9115 * f9116) + (f9114 * f2) + f1 + 20.0f, f9118, f9119, 5.0f, 5.0f, this.f10229ai);
                    float f10212 = this.f10241au;
                    arrayList3 = this.f10277l;
                    if (arrayList3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f10213 = arrayList3.get(i9)[1];
                    float f101110 = this.f10241au;
                    float f101111 = this.f10232al + 30;
                    float f101112 = this.f10241au;
                    arrayList4 = this.f10277l;
                    if (arrayList4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f11114 = arrayList4.get(i9)[1];
                    float f11115 = this.f10230aj;
                    float f101113 = f9111 + f10212;
                    float f101114 = f101110 + (f10213 * f2) + f1 + 20.0f;
                    float f101115 = f101112 + f9117 + f101111;
                    float f101116 = this.f10241au + (f11114 * f2) + f1 + 30.0f + f11115;
                    canvas.drawRoundRect(f101113, f101114, f101115, f101116, 3.0f, 3.0f, this.f10228ah);
                    float f11116 = this.f10241au;
                    arrayList5 = this.f10277l;
                    if (arrayList5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f11117 = arrayList5.get(i9)[1];
                    float f11118 = this.f10241au;
                    float f11119 = this.f10232al + 30;
                    float f1123 = this.f10241au;
                    arrayList6 = this.f10277l;
                    if (arrayList6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f1124 = arrayList6.get(i9)[1];
                    float f1125 = this.f10230aj;
                    float f111110 = f9111 + f11116;
                    float f111111 = f11118 + (f11117 * f2) + f1 + 20.0f;
                    float f111112 = f9117 + f11119 + f1123;
                    float f111113 = this.f10241au + (f1124 * f2) + f1 + 30.0f + f1125;
                    canvas.drawRoundRect(f111110, f111111, f111112, f111113, 3.0f, 3.0f, this.f10227ag);
                    String s2 = this.f10184M;
                    arrayList7 = this.f10277l;
                    if (arrayList7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    canvas.drawText(s2, f9111 + 10.0f, (arrayList7.get(i9)[1] * f2) + f1 + this.f10230aj + 20.0f, this.f10226af);
                    this.f10256bi.left = (10.0f - f0) / f2;
                    RectF a113 = this.f10256bi;
                    arrayList8 = this.f10277l;
                    if (arrayList8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    a113.top = arrayList8.get(i9)[1] + (20.0f / f2);
                    this.f10256bi.right = ((this.f10232al + 30) - f0) / f2;
                    a88 = this.f10256bi;
                    arrayList9 = this.f10277l;
                    if (arrayList9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    f79 = ((this.f10230aj + 30.0f) / f2) + arrayList9.get(i9)[1];
                } else if (i16 != this.f10179H) {
                    i15 = i15;
                    str2 = str2;
                    arrayList82 = arrayList82;
                    i14 = i14;
                    i9 = i16;
                } else {
                    if (this.f10269d) {
                        float f81 = (this.f10181J * f2) + f0;
                        ArrayList<int[]> arrayList95 = this.f10277l;
                        if (arrayList95 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f826 = (arrayList95.get(i16)[1] * f2) + f1;
                        float f827 = (this.f10182K * f2) + f0;
                        ArrayList<int[]> arrayList96 = this.f10277l;
                        if (arrayList96 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        f80 = f81;
                        float f828 = (arrayList96.get(i16)[1] * f2) + f1;
                        Paint a810 = this.f10223ac;
                        f83 = f828;
                        a89 = a810;
                        f812 = f826;
                        f82 = f827;
                    } else {
                        this.f10224ad.reset();
                        Path a116 = this.f10224ad;
                        float f1126 = this.f10181J;
                        ArrayList<int[]> arrayList97 = this.f10277l;
                        if (arrayList97 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        a116.moveTo((f1126 * f2) + f0, (arrayList97.get(i16)[1] * f2) + f1);
                        Path a118 = this.f10224ad;
                        float f120 = this.f10174C;
                        ArrayList<int[]> arrayList98 = this.f10277l;
                        if (arrayList98 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f1127 = (f120 * f2) + f0;
                        a118.lineTo(f1127, (arrayList98.get(i16)[1] * f2) + f1);
                        canvas.drawPath(this.f10224ad, this.f10193V);
                        float f829 = (this.f10173B * f2) + f0;
                        ArrayList<int[]> arrayList99 = this.f10277l;
                        if (arrayList99 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f830 = (arrayList99.get(i16)[1] * f2) + f1;
                        float f831 = this.f10174C;
                        float f832 = (f831 * f2) + f0;
                        ArrayList<int[]> arrayList100 = this.f10277l;
                        if (arrayList100 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                        }
                        float f833 = (arrayList100.get(i16)[1] * f2) + f1;
                        f83 = f833;
                        f82 = f832;
                        f80 = f829;
                        f812 = f830;
                        a89 = this.f10222ab;
                    }
                    canvas.drawLine(f80, f812, f82, f83, a89);
                    this.f10231ak = Math.round(this.f10226af.measureText(this.f10183L));
                    float f121 = Math.max((this.f10181J * f2) + 10.0f + f0, 10.0f);
                    float f122 = this.f10240at;
                    float f123 = this.f10263bp;
                    ArrayList<int[]> arrayList101 = this.f10277l;
                    if (arrayList101 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f124 = arrayList101.get(i16)[1];
                    float f125 = this.f10230aj;
                    float f126 = this.f10240at;
                    float f127 = this.f10263bp;
                    float f128 = f121 - 10.0f;
                    float f129 = this.f10231ak + 30;
                    float f130 = this.f10240at;
                    float f131 = this.f10263bp;
                    ArrayList<int[]> arrayList102 = this.f10277l;
                    if (arrayList102 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f132 = arrayList102.get(i16)[1];
                    float f1210 = f121 + (f122 * f123);
                    float f133 = (f126 * f127) + ((((f124 * f2) + f1) - 20.0f) - f125);
                    float f1211 = (f130 * f131) + f128 + f129;
                    float f1212 = this.f10240at;
                    float f1213 = this.f10263bp;
                    float f1214 = (f1212 * f1213) + (((f132 * f2) + f1) - 10.0f);
                    i9 = i16;
                    canvas.drawRoundRect(f1210, f133, f1211, f1214, 5.0f, 5.0f, this.f10229ai);
                    float f134 = this.f10241au;
                    ArrayList<int[]> arrayList103 = this.f10277l;
                    if (arrayList103 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f135 = arrayList103.get(i9)[1];
                    float f136 = this.f10230aj;
                    float f137 = this.f10241au;
                    float f138 = this.f10231ak + 30;
                    float f139 = this.f10241au;
                    ArrayList<int[]> arrayList104 = this.f10277l;
                    if (arrayList104 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f140 = arrayList104.get(i9)[1];
                    float f1310 = f121 + f134;
                    float f1311 = f139 + f128 + f138;
                    float f1312 = this.f10241au;
                    float f1313 = f1312 + (((f140 * f2) + f1) - 10.0f);
                    canvas.drawRoundRect(f1310, f137 + ((((f135 * f2) + f1) - 20.0f) - f136), f1311, f1313, 3.0f, 3.0f, this.f10228ah);
                    float f141 = this.f10241au;
                    ArrayList<int[]> arrayList105 = this.f10277l;
                    if (arrayList105 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f142 = arrayList105.get(i9)[1];
                    float f143 = this.f10230aj;
                    float f144 = this.f10241au;
                    float f145 = this.f10231ak + 30;
                    float f146 = this.f10241au;
                    ArrayList<int[]> arrayList106 = this.f10277l;
                    if (arrayList106 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f147 = arrayList106.get(i9)[1];
                    float f148 = f121 + f141;
                    float f1410 = f128 + f145 + f146;
                    float f1411 = this.f10241au;
                    float f1412 = f1411 + (((f147 * f2) + f1) - 10.0f);
                    canvas.drawRoundRect(f148, f144 + ((((f142 * f2) + f1) - 20.0f) - f143), f1410, f1412, 3.0f, 3.0f, this.f10227ag);
                    String s3 = this.f10183L;
                    ArrayList<int[]> arrayList107 = this.f10277l;
                    if (arrayList107 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    canvas.drawText(s3, f121 + 10.0f, ((arrayList107.get(i9)[1] * f2) + f1) - 20.0f, this.f10226af);
                    this.f10255bh.left = (10.0f - f0) / f2;
                    RectF a129 = this.f10255bh;
                    ArrayList<int[]> arrayList108 = this.f10277l;
                    if (arrayList108 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    a129.top = arrayList108.get(i9)[1] - ((this.f10230aj + 20.0f) / f2);
                    this.f10255bh.right = ((this.f10231ak + 30) - f0) / f2;
                    a88 = this.f10255bh;
                    ArrayList<int[]> arrayList109 = this.f10277l;
                    if (arrayList109 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    f79 = arrayList109.get(i9)[1] - (10.0f / f2);
                }
                a88.bottom = f79;
            } else {
                i15 = i15;
                str2 = str2;
                arrayList82 = arrayList82;
                i14 = i14;
                i9 = i16;
                int i18 = this.f10276k;
                if (i9 == i18 && this.f10269d) {
                    float f1413 = this.f10215aU;
                    canvas.drawCircle((f1413 / 2.0f) + this.f10242av, (this.f10216aV / 2.0f) + this.f10242av, this.f10235ao.getStrokeWidth(), this.f10236ap);
                    canvas.drawCircle(this.f10215aU / 2.0f, this.f10216aV / 2.0f, this.f10235ao.getStrokeWidth(), this.f10235ao);
                    float f1414 = this.f10215aU / 2.0f;
                    f149 = this.f10216aV / 2.0f;
                    f151 = f1414;
                } else {
                    ArrayList<int[]> arrayList110 = this.f10277l;
                    if (arrayList110 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f152 = arrayList110.get(i9)[0];
                    float f153 = this.f10265br;
                    ArrayList<int[]> arrayList111 = this.f10277l;
                    if (arrayList111 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    canvas.drawCircle((f152 * f2) + f0 + f153, (arrayList111.get(i9)[1] * f2) + f1 + this.f10265br, this.f10235ao.getStrokeWidth(), this.f10236ap);
                    ArrayList<int[]> arrayList112 = this.f10277l;
                    if (arrayList112 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    float f154 = arrayList112.get(i9)[0];
                    ArrayList<int[]> arrayList113 = this.f10277l;
                    if (arrayList113 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    canvas.drawCircle((f154 * f2) + f0, (arrayList113.get(i9)[1] * f2) + f1, this.f10235ao.getStrokeWidth(), this.f10235ao);
                    ArrayList<int[]> arrayList114 = this.f10277l;
                    if (arrayList114 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    f151 = (arrayList114.get(i9)[0] * f2) + f0;
                    ArrayList<int[]> arrayList115 = this.f10277l;
                    if (arrayList115 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                    }
                    f149 = (arrayList115.get(i9)[1] * f2) + f1;
                }
                canvas.drawCircle(f151, f149, this.f10239as.getStrokeWidth(), this.f10239as);
            }
            i16 = i9 + 1;
            i15 = i15;
            str2 = str2;
            arrayList82 = arrayList82;
            i14 = i14;
        }
        int i19 = i16;
        if (!this.f10269d) {
            ArrayList<int[]> arrayList116 = this.f10280o;
            if (arrayList116 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
            }
            int i110 = arrayList116.size();
            int i111 = 0;
            while (i111 < i110) {
                ArrayList<int[]> arrayList117 = this.f10280o;
                if (arrayList117 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                float f155 = arrayList117.get(i111)[0];
                ArrayList<int[]> arrayList118 = this.f10280o;
                if (arrayList118 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                float f156 = arrayList118.get(i111)[1];
                ArrayList<int[]> arrayList119 = this.f10280o;
                if (arrayList119 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                int i112 = arrayList119.get(i111)[0];
                ArrayList<int[]> arrayList120 = this.f10280o;
                if (arrayList120 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                float f157 = i112 + arrayList120.get(i111)[2];
                int i20 = i19;
                ArrayList<int[]> arrayList121 = this.f10280o;
                if (arrayList121 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                int i113 = arrayList121.get(i111)[1];
                ArrayList<int[]> arrayList122 = this.f10280o;
                if (arrayList122 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                float f158 = i113 + arrayList122.get(i111)[3];
                ArrayList<int[]> arrayList123 = this.f10280o;
                if (arrayList123 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("NumericIndicatorList");
                }
                float f159 = (f158 * f2) + f1;
                m10990a((f155 * f2) + f0, (f156 * f2) + f1, (f157 * f2) + f0, f159, String.valueOf(arrayList123.get(i111)[4]), this.f10244ax, canvas, this.f10245ay, this.f10246az, this.f10195aA);
                i111++;
                i19 = i20;
                i110 = i110;
                f2 = f2;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        System.out.println("ScaleGestureDetector - onMeasure");
        super.onMeasure(i, i2);
        if (this.f10269d) {
            return;
        }
        this.f10215aU = View.MeasureSpec.getSize(i);
        this.f10216aV = View.MeasureSpec.getSize(i2);
        f10171bx = (int) (this.f10215aU / 8.0d);
        this.f10230aj = this.f10215aU * 0.035f;
        System.out.println("textSize = " + this.f10230aj);
        if (this.f10230aj <= this.f10207aM) {
            if (this.f10230aj < this.f10208aN) {
                this.f10240at = 6.0f;
                this.f10243aw = 1.0f;
            }
            this.f10226af.setTextSize(this.f10230aj);
            this.f10218aX = this.f10215aU / this.f10251bd;
            this.f10219aY = this.f10216aV / this.f10252be;
            float min = Math.min(this.f10218aX, this.f10219aY);
            this.f10247b.setScale(min, min);
            setImageMatrix(this.f10247b);
            this.f10217aW = 1.0f;
            this.f10214aT = this.f10216aV - (this.f10252be * min);
            this.f10213aS = this.f10215aU - (this.f10251bd * min);
            this.f10214aT /= 2.0f;
            this.f10213aS /= 2.0f;
            this.f10247b.postTranslate(this.f10213aS, this.f10214aT);
            this.f10249bb = this.f10215aU - (this.f10213aS * 2.0f);
            this.f10250bc = this.f10216aV - (this.f10214aT * 2.0f);
            this.f10220aZ = ((this.f10215aU * this.f10217aW) - this.f10215aU) - ((this.f10213aS * 2.0f) * this.f10217aW);
            this.f10248ba = ((this.f10216aV * this.f10217aW) - this.f10216aV) - ((this.f10214aT * 2.0f) * this.f10217aW);
            setImageMatrix(this.f10247b);
        }
        this.f10230aj = this.f10207aM;
        this.f10226af.setTextSize(this.f10230aj);
        this.f10218aX = this.f10215aU / this.f10251bd;
        this.f10219aY = this.f10216aV / this.f10252be;
        float min2 = Math.min(this.f10218aX, this.f10219aY);
        this.f10247b.setScale(min2, min2);
        setImageMatrix(this.f10247b);
        this.f10217aW = 1.0f;
        this.f10214aT = this.f10216aV - (this.f10252be * min2);
        this.f10213aS = this.f10215aU - (this.f10251bd * min2);
        this.f10214aT /= 2.0f;
        this.f10213aS /= 2.0f;
        this.f10247b.postTranslate(this.f10213aS, this.f10214aT);
        this.f10249bb = this.f10215aU - (this.f10213aS * 2.0f);
        this.f10250bc = this.f10216aV - (this.f10214aT * 2.0f);
        this.f10220aZ = ((this.f10215aU * this.f10217aW) - this.f10215aU) - ((this.f10213aS * 2.0f) * this.f10217aW);
        this.f10248ba = ((this.f10216aV * this.f10217aW) - this.f10216aV) - ((this.f10214aT * 2.0f) * this.f10217aW);
        setImageMatrix(this.f10247b);
    }

    public final void setAnimatedShadowOff(float f) {
        this.f10265br = f;
    }

    public final void setContext$app_release(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.f10267bt = context;
    }

    public final void setCurScale(float f) {
        this.f10205aK = f;
    }

    public final void setEditcircleBlackOff(float f) {
        this.f10243aw = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null) {
            Intrinsics.throwNpe();
        }
        this.f10251bd = bitmap.getWidth();
        this.f10252be = bitmap.getHeight();
        System.out.println("set bitmap of size: " + this.f10251bd + " " + this.f10252be);
    }

    public final void setMatrix$app_release(Matrix matrix) {
        Intrinsics.checkParameterIsNotNull(matrix, "<set-?>");
        this.f10247b = matrix;
    }

    public final void setMaxZoom(float f) {
        this.f10203aI = f;
    }

    public final void setPaintCircleMove$app_release(Paint paint) {
        Intrinsics.checkParameterIsNotNull(paint, "<set-?>");
        this.f10187P = paint;
    }

    public final void setPaintpointStroke(float f) {
        this.f10264bq = f;
    }

    public final void setPendingZoomAndFocus(float[] _f) {
        Intrinsics.checkParameterIsNotNull(_f, "_f");
        System.out.println((Object) "Setting pending zoom");
        this.f10283r = true;
        this.f10282q = (float[]) _f.clone();
    }

    public final void setPointShadowOff(float f) {
        this.f10242av = f;
    }

    public final void setPropertyDiameter(PropertyValuesHolder propertyValuesHolder) {
        this.f10259bl = propertyValuesHolder;
    }

    public final void setPropertyDistance(PropertyValuesHolder propertyValuesHolder) {
        this.f10261bn = propertyValuesHolder;
    }

    public final void setScaleX$app_release(float f) {
        this.f10218aX = f;
    }

    public final void setScaleY$app_release(float f) {
        this.f10219aY = f;
    }

    public final void setShadowBlur(BlurMaskFilter blurMaskFilter) {
        Intrinsics.checkParameterIsNotNull(blurMaskFilter, "<set-?>");
        this.f10209aO = blurMaskFilter;
    }

    public final void setShadowDistFactor(float f) {
        this.f10263bp = f;
    }

    public final void setShadowOff(float f) {
        this.f10240at = f;
    }

    public final void setTextOff(float f) {
        this.f10241au = f;
    }

    public final void setTriangleHeadDistFactor(float f) {
        this.f10262bo = f;
    }

    public final void setValueAnimator(ValueAnimator valueAnimator) {
        Intrinsics.checkParameterIsNotNull(valueAnimator, "<set-?>");
        this.f10266bs = valueAnimator;
    }

    public final void setZoomAndFocus(float[] _f) {
        Intrinsics.checkParameterIsNotNull(_f, "_f");
        System.out.println((Object) ("Setting zoom to " + _f[0] + " and focus to " + _f[1] + "," + _f[2]));
        m10988a(_f[0], 0.0f, 0.0f);
        this.f10274i = _f[1];
        this.f10275j = _f[2];
        this.f10247b.postTranslate(-this.f10274i, -this.f10275j);
        this.f10247b.postTranslate(-this.f10274i, -this.f10275j);
        setImageMatrix(this.f10247b);
        invalidate();
    }
}
