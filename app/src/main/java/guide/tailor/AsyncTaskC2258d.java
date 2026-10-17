package guide.tailor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Bundle;
import java.io.File;

/* loaded from: classes4.dex */
class AsyncTaskC2258d extends AsyncTask<Object, Integer, Boolean> {
    private static BitmapFactory.Options f9505b;
    private int f9506a = 0;
    private Bitmap f9507c;
    private Bitmap f9508d;
    private Bitmap f9509e;
    private String f9510f;

    public AsyncTaskC2258d() {
        FragmentC2259e.f9538i = 1;
        f9505b = new BitmapFactory.Options();
        f9505b.inScaled = false;
        // Keep full resolution: C2262h contour analysis needs pixel-level edge detail
        // for accurate body measurement. Memory pressure is handled by recycling the
        // transient bitmaps in doInBackground instead.
        f9505b.inSampleSize = 1;
        f9505b.inPreferQualityOverSpeed = true;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x04f3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY] A[D('a1' int[])]), block:B:183:0x04f3 */
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x04f3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY] A[D('a1' int[])]), block:B:170:0x04f3 */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Object[] a0) {
        String s;
        try {
            this.f9510f = (String) a0[0];
            this.f9506a = ((Integer) a0[1]).intValue();
            try {
                if (this.f9506a == -1) {
                    return false;
                }
                System.gc();
                this.f9507c = BitmapFactory.decodeFile(this.f9510f, f9505b);
                if (this.f9507c == null) {
                    return false;
                }
                int i = this.f9507c.getWidth();
                int i0 = this.f9507c.getHeight();
                Matrix a2 = new Matrix();
                a2.postRotate(FragmentC2259e.f9536g ? 90 : 270);
                // createScaledBitmap with identical dims returns the same instance; only
                // recycle it if we actually got a new object.
                Bitmap scaled = Bitmap.createScaledBitmap(this.f9507c, i, i0, true);
                if (scaled != this.f9507c) {
                    this.f9507c.recycle();
                }
                this.f9507c = null;
                this.f9508d = scaled;
                this.f9509e = Bitmap.createBitmap(scaled, 0, 0, i, i0, a2, true);
                if (this.f9509e != scaled) {
                    scaled.recycle();
                }
                this.f9508d = null;
                if (isCancelled()) {
                    return false;
                }
                try {
                    try {
                        switch (this.f9506a) {
                            case 0:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: test shot\n";
                                int[] a1 = C2262h.m10922a(this.f9509e, FragmentC2259e.f9518aa[0], FragmentC2259e.f9518aa[1], FragmentC2259e.f9515Z);
                                FragmentC2259e.f9514Y = a1[0];
                                int b1 = a1[1];
                                try {
                                    s = FragmentC2259e.f9541l + System.currentTimeMillis() + ":Test process time per million pixels = " + String.valueOf(b1) + " and brightness value: " + String.valueOf(a1[0]) + "\n";
                                    FragmentC2259e.f9541l = s;
                                    try {
                                        FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                        this.f9507c = null;
                                        this.f9508d = null;
                                        this.f9509e = null;
                                        System.gc();
                                        return true;
                                    } catch (Exception ignoredException2) {
                                        ignoredException2.printStackTrace();
                                    }
                                } catch (Exception e) {
                                }
                                break;
                            case 1:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set person front\n";
                                if (!C2262h.m10910a(this.f9509e, this.f9510f, true)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 2:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set person side\n";
                                if (!C2262h.m10909a(this.f9509e, this.f9510f)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 3:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 0\n";
                                if (!C2262h.m10908a(this.f9509e, 0)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 4:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 1\n";
                                if (!C2262h.m10908a(this.f9509e, 1)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 5:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 2\n";
                                if (!C2262h.m10908a(this.f9509e, 2)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 6:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 3\n";
                                if (!C2262h.m10908a(this.f9509e, 3)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 7:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 4\n";
                                if (!C2262h.m10908a(this.f9509e, 4)) {
                                    return false;
                                }
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                            case 8:
                                Integer[] a3 = {5};
                                publishProgress(a3);
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Set background 5 : BENCHMARK START\n";
                                double d0 = System.currentTimeMillis();
                                boolean b0 = C2262h.m10908a(this.f9509e, 5);
                                if (b0 && !isCancelled()) {
                                    Integer[] a13 = {30};
                                    publishProgress(a13);
                                    FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements: Process start\n";
                                    if (!C2262h.m10913a(1, false, false)) {
                                        return false;
                                    }
                                    Integer[] a15 = {50};
                                    publishProgress(a15);
                                    if (isCancelled()) {
                                        return false;
                                    }
                                    double d1 = (System.currentTimeMillis() - d0) / 1000.0d;
                                    FragmentC2259e.f9541l += System.currentTimeMillis() + ":Halfway processing time: " + String.valueOf(d1) + " s \n";
                                    if ((d1 > 120.0d ? (byte) 1 : d1 == 120.0d ? (byte) 0 : (byte) -1) > 0) {
                                        try {
                                            Bundle a17 = new Bundle();
                                            a17.putString("halfwaytime", String.valueOf(d1));
                                            WebStart.f9394o.logEvent("long_process_time", a17);
                                            break;
                                        } catch (Exception e2) {
                                        }
                                    }
                                    if (!C2262h.m10913a(2, false, false)) {
                                        return false;
                                    }
                                    Integer[] a18 = {57};
                                    publishProgress(a18);
                                    if (!isCancelled() && C2262h.m10913a(3, false, false)) {
                                        Integer[] a19 = {65};
                                        publishProgress(a19);
                                        if (!isCancelled() && C2262h.m10913a(4, false, false)) {
                                            Integer[] a20 = new Integer[1];
                                            try {
                                                a20[0] = 80;
                                                publishProgress(a20);
                                                if (!isCancelled() && C2262h.m10913a(5, false, false)) {
                                                    Integer[] a21 = new Integer[1];
                                                    a21[0] = 88;
                                                    publishProgress(a21);
                                                    if (!isCancelled() && C2262h.m10913a(6, false, false)) {
                                                        Integer[] a22 = {92};
                                                        publishProgress(a22);
                                                        if (!isCancelled() && C2262h.m10913a(7, false, false)) {
                                                            Integer[] a23 = {100};
                                                            publishProgress(a23);
                                                            if (!isCancelled() && C2262h.m10913a(8, false, false)) {
                                                                Integer[] a24 = {100};
                                                                publishProgress(a24);
                                                                if (!isCancelled() && C2262h.m10913a(9, false, false)) {
                                                                    double d2 = (System.currentTimeMillis() - d0) / 1000.0d;
                                                                    s = FragmentC2259e.f9541l + System.currentTimeMillis() + ":Async ImageMeasurements: Process finished : BENCHMARK END - Processing time: " + String.valueOf(d2) + " s \n";
                                                                    FragmentC2259e.f9541l = s;
                                                                    FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                                                    this.f9507c = null;
                                                                    this.f9508d = null;
                                                                    this.f9509e = null;
                                                                    System.gc();
                                                                    return true;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            } catch (Exception e3) {
                                            }
                                            break;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            default:
                                FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task finished\n";
                                this.f9507c = null;
                                this.f9508d = null;
                                this.f9509e = null;
                                System.gc();
                                return true;
                        }
                    } catch (Exception e4) {
                    }
                } catch (Exception e5) {
                }
            } catch (Exception e6) {
            }
        } catch (Exception e7) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        int i;
        if (bool.booleanValue()) {
            FragmentC2259e.f9538i = 0;
        } else {
            FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task FAIL\n";
            if (this.f9506a > 1) {
                WebStart.m10620d("fail_bg");
                i = 2;
            } else {
                int i2 = this.f9506a;
                if (i2 == 0) {
                    WebStart.m10620d("fail_front");
                    i = 3;
                } else {
                    WebStart.m10620d("fail_side");
                    i = 4;
                }
            }
            FragmentC2259e.f9538i = i;
        }
        FragmentC2259e.f9537h = false;
        try {
            File file = new File(this.f9510f);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onProgressUpdate(Integer... numArr) {
        FragmentC2259e.m10763a(numArr[0].intValue());
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        FragmentC2259e.f9541l += System.currentTimeMillis() + ":Async ImageMeasurements task cancelled\n";
        FragmentC2259e.f9538i = this.f9506a > 1 ? 2 : this.f9506a == 0 ? 3 : 4;
    }
}
