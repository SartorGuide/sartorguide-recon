package guide.tailor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ResultActivity extends AppCompatActivity {
    private int f9202aM = -1;
    Button f9203ap;
    TextView f9204aq;
    public static String f9127A = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9128B = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9129C = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9130D = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9131E = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9132F = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9133G = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9134H = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9135I = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9136J = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9137K = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9138L = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9139M = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9140N = "Male";
    public static float f9141O = 0.0f;
    public static float f9142P = 0.0f;
    public static float f9143Q = 0.0f;
    public static float f9144R = 0.0f;
    public static float f9145S = 0.0f;
    public static float f9146T = 0.0f;
    public static float f9147U = 0.0f;
    public static float f9148V = 0.0f;
    public static float f9149W = 0.0f;
    public static float f9150X = 0.0f;
    public static float f9151Y = 0.0f;
    public static float f9152Z = 0.0f;
    private static NonSwipeableViewPager f9153aA = null;
    private static int f9154aB = 0;
    private static Snackbar f9155aC = null;
    private static Snackbar f9156aD = null;
    private static String f9157aE = "";
    private static int f9158aF = -1;
    private static int f9159aG = 1;
    private static boolean f9160aH = false;
    private static boolean f9162aJ = false;
    private static Toast f9164aL = null;
    public static float f9165aa = 0.0f;
    public static float f9166ab = 0.0f;
    public static float f9167ac = 0.0f;
    public static float f9168ad = 0.0f;
    public static float f9169ae = 0.0f;
    public static float f9170af = 0.0f;
    public static float f9171ag = 0.0f;
    public static float f9172ah = 0.0f;
    public static float f9173ai = 0.0f;
    public static float f9174aj = 0.0f;
    static boolean f9175ak = false;
    static boolean f9176al = false;
    static boolean f9177am = false;
    public static String[] f9178an = null;
    public static String[] f9179ao = null;
    static LinearLayout f9180ar = null;
    static ArrayList<String> f9181as = null;
    static ArrayList<String> f9182at = null;
    static float f9183au = 0.5f;
    static int[] f9184av = null;
    static int[] f9185aw = null;
    static int f9186ax = 0;
    static boolean f9187ay = false;
    private static C2223c f9188az = null;
    public static boolean f9189n = false;
    public static boolean f9190o = false;
    public static boolean f9191p = false;
    public static int f9192q = -1;
    static boolean f9193r = false;
    public static String f9194s = "";
    public static String f9195t = "ID";
    public static String f9196u = "";
    public static String f9197v = "False";
    public static String f9198w = "Regular";
    public static float f9199x = 0.0f;
    public static String f9200y = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public static String f9201z = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private static float[] f9161aI = new float[3];
    private static float[] f9163aK = new float[3];

    static /* synthetic */ int access$1208() {
        int i = f9154aB;
        f9154aB = i + 1;
        return i;
    }

    public static class C2221a extends Fragment {
        View f9212ae;
        LottieAnimationView f9213af;
        LottieAnimationView f9214ag;
        ArrayList<String> f9215ah;
        float[] f9216ai;
        ArrayList<int[]> f9217aj;
        ArrayList<int[]> f9218ak;
        int[] f9219al;
        RectF f9220am;
        RectF f9221an;
        ArrayList<int[]> f9222ao;
        ArrayList<int[]> f9223ap;
        private Handler f9226as;
        Runnable f9227b;
        zoomImageViewKotlin f9228c;
        Button f9229d;
        ImageButton f9230e;
        TextView f9231f;
        ImageView f9232g;
        LinearLayout f9233h;
        CoordinatorLayout f9234i;
        int f9211a = 0;
        int f9224aq = 0;
        final float f9225ar = 0.1f;

        /* JADX INFO: Access modifiers changed from: private */
        public void m10560a(boolean b0) {
            if (!b0) {
                int[] a0 = this.f9228c.m11036a(ResultActivity.f9158aF == -1);
                if (a0[0] < 5) {
                    a0[0] = 5;
                }
                if (a0[0] > C2262h.f10079m - 5) {
                    a0[0] = C2262h.f10079m - 5;
                }
                if (a0[1] < 5) {
                    a0[1] = 5;
                }
                if (a0[1] > C2262h.f10080n - 5) {
                    a0[1] = C2262h.f10080n - 5;
                }
                ResultActivity.f9180ar.setVisibility(0);
                this.f9229d.setVisibility(8);
                this.f9230e.setVisibility(8);
                this.f9214ag.setVisibility(8);
                this.f9213af.setVisibility(0);
                this.f9212ae.setVisibility(8);
                ResultActivity.f9153aA.setPagingEnabled(true);
                m10561a(this.f9224aq, a0[0], a0[1]);
            } else {
                this.f9228c.m11030a();
                this.f9231f.setText("");
                ResultActivity.f9180ar.setVisibility(0);
                this.f9229d.setVisibility(8);
                this.f9230e.setVisibility(8);
                this.f9214ag.setVisibility(8);
                this.f9213af.setVisibility(0);
                this.f9212ae.setVisibility(8);
                ResultActivity.f9153aA.setPagingEnabled(true);
            }
            ResultActivity.f9191p = false;
        }

        private boolean m10561a(int i, int i2, int i3) {
            try {
                if (this.f9211a != 1) {
                    switch (i) {
                        case 0:
                            C2262h.f9860ai = i2;
                            C2262h.f9861aj = i3;
                            break;
                        case 1:
                            C2262h.f9920bp = i2;
                            C2262h.f9921bq = i3;
                            break;
                        case 2:
                            C2262h.f9828aC = i2;
                            C2262h.f9829aD = i3;
                            break;
                        case 3:
                            C2262h.f9817S = i2;
                            C2262h.f9818T = i3;
                            C2262h.f9820V = i3;
                            break;
                        case 4:
                            C2262h.f9819U = i2;
                            C2262h.f9820V = i3;
                            C2262h.f9818T = i3;
                            break;
                        case 5:
                            C2262h.f9876ay = i2;
                            C2262h.f9877az = i3;
                            C2262h.f9827aB = i3;
                            break;
                        case 6:
                            C2262h.f9826aA = i2;
                            C2262h.f9827aB = i3;
                            C2262h.f9877az = i3;
                            break;
                        case 7:
                            C2262h.f9868aq = i2;
                            C2262h.f9869ar = i3;
                            C2262h.f9871at = i3;
                            break;
                        case 8:
                            C2262h.f9870as = i2;
                            C2262h.f9871at = i3;
                            C2262h.f9869ar = i3;
                            break;
                        case 9:
                            C2262h.f9835aJ = i2;
                            C2262h.f9836aK = i3;
                            C2262h.f9838aM = i3;
                            break;
                        case 10:
                            C2262h.f9837aL = i2;
                            C2262h.f9836aK = i3;
                            C2262h.f9838aM = i3;
                            break;
                        case 11:
                            C2262h.f9807I = i3;
                            break;
                        case 12:
                            C2262h.f9808J = i3;
                            break;
                    }
                } else {
                    switch (i) {
                        case 0:
                            C2262h.f9853ab = i2;
                            C2262h.f9854ac = i3;
                            break;
                        case 1:
                            C2262h.f9855ad = i2;
                            C2262h.f9856ae = i3;
                            break;
                        case 2:
                            C2262h.f9813O = i2;
                            C2262h.f9814P = i3;
                            break;
                        case 3:
                            C2262h.f9815Q = i2;
                            C2262h.f9816R = i3;
                            break;
                        case 4:
                            C2262h.f9872au = i2;
                            C2262h.f9873av = i3;
                            C2262h.f9875ax = i3;
                            break;
                        case 5:
                            C2262h.f9874aw = i2;
                            C2262h.f9875ax = i3;
                            C2262h.f9873av = i3;
                            break;
                        case 6:
                            C2262h.f9864am = i2;
                            C2262h.f9865an = i3;
                            C2262h.f9867ap = i3;
                            break;
                        case 7:
                            C2262h.f9866ao = i2;
                            C2262h.f9867ap = i3;
                            C2262h.f9865an = i3;
                            break;
                        case 8:
                            C2262h.f9812N = i2;
                            C2262h.f9811M = i3;
                            break;
                        case 9:
                            C2262h.f9831aF = i2;
                            C2262h.f9832aG = i3;
                            C2262h.f9834aI = i3;
                            break;
                        case 10:
                            C2262h.f9833aH = i2;
                            C2262h.f9834aI = i3;
                            C2262h.f9832aG = i3;
                            break;
                        case 11:
                            C2262h.f9822X = i2;
                            C2262h.f9824Z = i3;
                            int i4 = C2262h.f9852aa;
                            C2262h.f9821W = (int) Math.round((i4 + i3) / 2.0d);
                            break;
                        case 12:
                            C2262h.f9823Y = i2;
                            C2262h.f9852aa = i3;
                            int i42 = C2262h.f9824Z;
                            C2262h.f9821W = (int) Math.round((i42 + i3) / 2.0d);
                            break;
                        case 13:
                            C2262h.f9803E = i3;
                            C2262h.f9804F = i3;
                            break;
                        case 14:
                            C2262h.f9805G = i3;
                            C2262h.f9806H = i3;
                            if (C2262h.f9824Z > i3) {
                                C2262h.f9824Z = i3;
                                C2262h.f9821W = (int) Math.round((C2262h.f9852aa + i3) / 2.0d);
                            }
                            if (C2262h.f9852aa > i3) {
                                C2262h.f9852aa = i3;
                                int i43 = C2262h.f9824Z;
                                C2262h.f9821W = (int) Math.round((i43 + i3) / 2.0d);
                                break;
                            }
                            break;
                    }
                }
                if (!C2262h.m10913a(77, true, true)) {
                    return false;
                }
                ResultActivity.f9189n = true;
                ResultActivity.f9190o = true;
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m10563b() {
            this.f9215ah = new ArrayList<>();
            this.f9217aj = new ArrayList<>();
            this.f9219al = new int[8];
            this.f9218ak = new ArrayList<>();
            this.f9222ao = new ArrayList<>();
            this.f9223ap = new ArrayList<>();
            Resources resources = getActivity().getApplicationContext().getResources();
            int[] iArr = new int[2];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[8];
            int[] iArr4 = new int[5];
            if (this.f9211a == 1) {
                this.f9215ah.add(resources.getString(R.string.meas_point_shoulderL));
                iArr[0] = C2262h.f9853ab;
                iArr[1] = C2262h.f9854ac;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 1;
                iArr2[1] = C2262h.f9845aT / 2;
                iArr2[2] = -1;
                iArr2[3] = -1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_shoulderR));
                iArr[0] = C2262h.f9855ad;
                iArr[1] = C2262h.f9856ae;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9845aT / 2;
                iArr2[2] = -1;
                iArr2[3] = -1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_armpitL));
                iArr[0] = C2262h.f9813O;
                iArr[1] = C2262h.f9814P;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 3;
                iArr2[1] = C2262h.f9845aT;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_armpitR));
                iArr[0] = C2262h.f9815Q;
                iArr[1] = C2262h.f9816R;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9845aT;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_waistL));
                iArr[0] = C2262h.f9872au;
                iArr[1] = C2262h.f9873av;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 5;
                iArr2[1] = C2262h.f9843aR;
                iArr2[2] = 5;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_waistR));
                iArr[0] = C2262h.f9874aw;
                iArr[1] = C2262h.f9875ax;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9843aR;
                iArr2[2] = 4;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_seatL));
                iArr[0] = C2262h.f9864am;
                iArr[1] = C2262h.f9865an;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 7;
                iArr2[1] = C2262h.f9841aP;
                iArr2[2] = 7;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_seatR));
                iArr[0] = C2262h.f9866ao;
                iArr[1] = C2262h.f9867ap;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9841aP;
                iArr2[2] = 6;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_crotch));
                iArr[0] = C2262h.f9812N;
                iArr[1] = C2262h.f9811M;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 11;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_thighL));
                iArr[0] = C2262h.f9831aF;
                iArr[1] = C2262h.f9832aG;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 10;
                iArr2[1] = C2262h.f9847aV;
                iArr2[2] = 10;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_thighR));
                iArr[0] = C2262h.f9833aH;
                iArr[1] = C2262h.f9834aI;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9847aV;
                iArr2[2] = 9;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_heelL));
                iArr[0] = C2262h.f9822X;
                iArr[1] = C2262h.f9824Z;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_heelR));
                iArr[0] = C2262h.f9823Y;
                iArr[1] = C2262h.f9852aa;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 8;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_head));
                iArr[0] = C2262h.f9800B;
                iArr[1] = C2262h.f9803E;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_feet));
                iArr[0] = C2262h.f9812N;
                iArr[1] = C2262h.f9805G;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9219al[0] = C2262h.f9800B - C2262h.f10091y;
                this.f9219al[1] = C2262h.f9800B + C2262h.f10091y;
                this.f9219al[2] = C2262h.f9822X - (C2262h.f10091y * 2);
                this.f9219al[3] = C2262h.f9822X;
                this.f9219al[4] = C2262h.f9823Y;
                this.f9219al[5] = C2262h.f9823Y + (C2262h.f10091y * 2);
                this.f9219al[6] = 13;
                this.f9219al[7] = 14;
                int i = (int) ((C2262h.f9854ac + C2262h.f9856ae) * 0.5d);
                iArr3[0] = C2262h.f9855ad;
                iArr3[1] = i;
                iArr3[2] = C2262h.f9855ad + (C2262h.f9799A * 4);
                iArr3[3] = i;
                iArr3[4] = C2262h.f9800B + (C2262h.f9799A * 2) + C2262h.f9862ak + C2262h.f9863al;
                iArr3[5] = C2262h.f9806H;
                iArr3[6] = C2262h.f9855ad + (C2262h.f9799A * 4);
                iArr3[7] = C2262h.f9806H;
                this.f9222ao.add((int[]) iArr3.clone());
                int i2 = (int) (C2262h.f10091y * 0.6d);
                iArr4[0] = C2262h.f9855ad;
                iArr4[1] = C2262h.f9856ae;
                iArr4[2] = i2;
                iArr4[3] = -i2;
                iArr4[4] = 1;
                this.f9223ap.add((int[]) iArr4.clone());
                int i3 = (C2262h.f9814P + C2262h.f9816R) / 2;
                iArr4[0] = (int) ((C2262h.f9813O + C2262h.f9815Q) * 0.5f);
                iArr4[1] = i3 - C2262h.f9845aT;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 4;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = C2262h.f9812N;
                iArr4[1] = (int) ((C2262h.f9811M + C2262h.f9806H) * 0.5d);
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 8;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9864am + C2262h.f9866ao) * 0.5f);
                iArr4[1] = C2262h.f9865an - C2262h.f9841aP;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 6;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9872au + C2262h.f9874aw) * 0.5f);
                iArr4[1] = C2262h.f9873av - C2262h.f9841aP;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 5;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9831aF + C2262h.f9833aH) * 0.5d);
                iArr4[1] = C2262h.f9832aG - C2262h.f9847aV;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 7;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = C2262h.f9855ad + (C2262h.f9799A * 4);
                iArr4[1] = (int) ((C2262h.f9806H + i) * 0.5d);
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 10;
            } else {
                this.f9215ah.add(resources.getString(R.string.meas_point_neckB));
                iArr[0] = C2262h.f9860ai;
                iArr[1] = C2262h.f9861aj;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_wristFL));
                iArr[0] = C2262h.f9920bp;
                iArr[1] = C2262h.f9921bq;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 2;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_shoulderS));
                iArr[0] = C2262h.f9828aC;
                iArr[1] = C2262h.f9829aD;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_chestF));
                iArr[0] = C2262h.f9817S;
                iArr[1] = C2262h.f9818T;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 4;
                iArr2[1] = C2262h.f9846aU;
                iArr2[2] = 4;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_chestB));
                iArr[0] = C2262h.f9819U;
                iArr[1] = C2262h.f9820V;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9846aU;
                iArr2[2] = 3;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_waistF));
                iArr[0] = C2262h.f9876ay;
                iArr[1] = C2262h.f9877az;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 6;
                iArr2[1] = C2262h.f9844aS;
                iArr2[2] = 6;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_waistB));
                iArr[0] = C2262h.f9826aA;
                iArr[1] = C2262h.f9827aB;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9844aS;
                iArr2[2] = 5;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_seatF));
                iArr[0] = C2262h.f9868aq;
                iArr[1] = C2262h.f9869ar;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 8;
                iArr2[1] = C2262h.f9842aQ;
                iArr2[2] = 8;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_seatB));
                iArr[0] = C2262h.f9870as;
                iArr[1] = C2262h.f9871at;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9842aQ;
                iArr2[2] = 7;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_thighF));
                iArr[0] = C2262h.f9835aJ;
                iArr[1] = C2262h.f9836aK;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = 10;
                iArr2[1] = C2262h.f9848aW;
                iArr2[2] = 10;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_thighB));
                iArr[0] = C2262h.f9837aL;
                iArr[1] = C2262h.f9838aM;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = C2262h.f9848aW;
                iArr2[2] = 9;
                iArr2[3] = 0;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_head));
                iArr[0] = C2262h.f10092z;
                iArr[1] = C2262h.f9807I;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9215ah.add(resources.getString(R.string.meas_point_feet_side));
                iArr[0] = C2262h.f10092z;
                iArr[1] = C2262h.f9808J;
                this.f9217aj.add((int[]) iArr.clone());
                iArr2[0] = -1;
                iArr2[1] = 0;
                iArr2[2] = -1;
                iArr2[3] = 1;
                this.f9218ak.add((int[]) iArr2.clone());
                this.f9219al[0] = C2262h.f10092z - C2262h.f10091y;
                this.f9219al[1] = C2262h.f10092z + C2262h.f10091y;
                this.f9219al[2] = C2262h.f9802D - (C2262h.f10091y * 3);
                this.f9219al[3] = C2262h.f9802D + ((int) (C2262h.f10091y * 1.5d));
                this.f9219al[4] = 0;
                this.f9219al[5] = 0;
                this.f9219al[6] = 11;
                this.f9219al[7] = 12;
                iArr3[0] = C2262h.f9860ai;
                iArr3[1] = C2262h.f9861aj;
                iArr3[2] = C2262h.f9860ai + C2262h.f9799A;
                iArr3[3] = C2262h.f9861aj;
                iArr3[4] = C2262h.f9826aA;
                iArr3[5] = C2262h.f9827aB;
                iArr3[6] = C2262h.f9826aA + C2262h.f9799A;
                iArr3[7] = C2262h.f9827aB;
                this.f9222ao.add((int[]) iArr3.clone());
                iArr3[0] = C2262h.f9826aA;
                iArr3[1] = C2262h.f9827aB;
                iArr3[2] = C2262h.f9826aA + ((int) (C2262h.f9799A * 1.5d));
                iArr3[3] = C2262h.f9827aB;
                iArr3[4] = C2262h.f9802D;
                iArr3[5] = C2262h.f9808J;
                iArr3[6] = C2262h.f9826aA + ((int) (C2262h.f9799A * 1.5d));
                iArr3[7] = C2262h.f9808J;
                this.f9222ao.add((int[]) iArr3.clone());
                iArr4[0] = (int) ((C2262h.f9920bp + C2262h.f9828aC) * 0.5f);
                iArr4[1] = (int) ((C2262h.f9921bq + C2262h.f9829aD) * 0.5f);
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 2;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9817S + C2262h.f9819U) * 0.5f);
                iArr4[1] = C2262h.f9818T - C2262h.f9846aU;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 4;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9876ay + C2262h.f9826aA) * 0.5f);
                iArr4[1] = C2262h.f9877az - C2262h.f9844aS;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 5;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9868aq + C2262h.f9870as) * 0.5f);
                iArr4[1] = C2262h.f9869ar - C2262h.f9842aQ;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 6;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = (int) ((C2262h.f9835aJ + C2262h.f9837aL) * 0.5f);
                iArr4[1] = C2262h.f9836aK - C2262h.f9848aW;
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 7;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = ((int) ((C2262h.f9860ai + C2262h.f9826aA) * 0.5f)) + (C2262h.f9799A * 2);
                iArr4[1] = (int) ((C2262h.f9861aj + C2262h.f9827aB) * 0.5f);
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 3;
                this.f9223ap.add((int[]) iArr4.clone());
                iArr4[0] = C2262h.f9826aA + ((int) (C2262h.f9799A * 2.5d));
                iArr4[1] = (int) ((C2262h.f9827aB + C2262h.f9808J) * 0.5f);
                iArr4[2] = 0;
                iArr4[3] = 0;
                iArr4[4] = 9;
            }
            this.f9223ap.add((int[]) iArr4.clone());
            this.f9216ai = new float[this.f9217aj.size()];
            if (this.f9211a == 1) {
                ResultActivity.f9181as = this.f9215ah;
            } else {
                ResultActivity.f9182at = this.f9215ah;
            }
            m10564c();
        }

        private void m10564c() {
            Resources resources = getActivity().getApplicationContext().getResources();
            if (this.f9211a == 1) {
                this.f9228c.m11035a(this.f9217aj, this.f9218ak, this.f9219al, this.f9222ao, this.f9223ap, resources.getString(R.string.meas_point_head), resources.getString(R.string.meas_point_feet));
            } else {
                this.f9228c.m11035a(this.f9217aj, this.f9218ak, this.f9219al, this.f9222ao, this.f9223ap, resources.getString(R.string.meas_point_head), resources.getString(R.string.meas_point_feet_side));
            }
        }

        public static C2221a m10565d(int i) {
            C2221a c2221a = new C2221a();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", i);
            c2221a.setArguments(bundle);
            return c2221a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m10566e(int i) {
            zoomImageViewKotlin zoomimageviewkotlin;
            float f;
            LottieAnimationView lottieAnimationView;
            int i2;
            if (ResultActivity.f9156aD != null && ResultActivity.f9156aD.isShown()) {
                ResultActivity.f9156aD.dismiss();
            }
            ResultActivity.f9175ak = false;
            ResultActivity.f9176al = false;
            ResultActivity.f9177am = false;
            this.f9224aq = i;
            this.f9231f.setText(getActivity().getApplicationContext().getResources().getString(R.string.Edit_point_instructions) + " " + this.f9215ah.get(i).toLowerCase() + " " + getActivity().getApplicationContext().getResources().getString(R.string.Edit_point_instructions2));
            if (i == this.f9219al[7]) {
                zoomimageviewkotlin = this.f9228c;
                f = 2.0f;
            } else {
                zoomimageviewkotlin = this.f9228c;
                f = 4.0f;
            }
            zoomimageviewkotlin.m11033a(i, f);
            ResultActivity.f9180ar.setVisibility(8);
            this.f9212ae.setVisibility(0);
            if (this.f9211a == 1) {
                lottieAnimationView = this.f9214ag;
                i2 = ResultActivity.f9184av[this.f9224aq];
            } else {
                lottieAnimationView = this.f9214ag;
                i2 = ResultActivity.f9185aw[this.f9224aq];
            }
            lottieAnimationView.setAnimation(i2);
            this.f9214ag.playAnimation();
            this.f9214ag.setVisibility(0);
            this.f9213af.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((getView().getWidth() * 4) / 10, (getView().getWidth() * 4) / 10);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(getView().getWidth(), (getView().getWidth() * 4) / 10);
            this.f9214ag.setLayoutParams(layoutParams);
            this.f9233h.setLayoutParams(layoutParams2);
            this.f9229d.setVisibility(0);
            this.f9230e.setVisibility(0);
            if (ResultActivity.f9164aL != null) {
                ResultActivity.f9164aL.cancel();
            }
            ResultActivity.f9153aA.setPagingEnabled(false);
            ResultActivity.f9191p = true;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.fragment_result, viewGroup, false);
            this.f9231f = (TextView) inflate.findViewById(R.id.textView_editName);
            this.f9228c = (zoomImageViewKotlin) inflate.findViewById(R.id.imageView_tab);
            getActivity().setVolumeControlStream(3);
            this.f9229d = (Button) inflate.findViewById(R.id.edit_point_confirm_btn);
            this.f9230e = (ImageButton) inflate.findViewById(R.id.edit_point_cancel_btn);
            this.f9211a = getArguments().getInt("section_number");
            this.f9232g = (ImageView) inflate.findViewById(R.id.corner_info_image);
            this.f9233h = (LinearLayout) inflate.findViewById(R.id.info_grid);
            this.f9234i = (CoordinatorLayout) inflate.findViewById(R.id.coordinatorL);
            this.f9212ae = inflate.findViewById(R.id.shadow_point_edit);
            this.f9212ae.setVisibility(8);
            this.f9213af = (LottieAnimationView) inflate.findViewById(R.id.info_animation_view);
            this.f9213af.setImageAssetsFolder("info_animation");
            this.f9213af = (LottieAnimationView) inflate.findViewById(R.id.info_animation_view);
            this.f9214ag = (LottieAnimationView) inflate.findViewById(R.id.corner_info_animation);
            this.f9214ag.setImageAssetsFolder("shared_anim");
            getResources().getInteger(android.R.integer.config_shortAnimTime);
            switch (this.f9211a) {
                case 1:
                    if (C2262h.f10073g != null) {
                        zoomImageViewKotlin zoomimageviewkotlin = this.f9228c;
                        Bitmap bitmap = C2262h.f10075i;
                        zoomimageviewkotlin.setImageBitmap(bitmap);
                        break;
                    }
                    break;
                case 2:
                    if (C2262h.f10074h != null) {
                        zoomImageViewKotlin zoomimageviewkotlin2 = this.f9228c;
                        Bitmap bitmap2 = C2262h.f10076j;
                        zoomimageviewkotlin2.setImageBitmap(bitmap2);
                        break;
                    }
                    break;
            }
            m10563b();
            this.f9226as = new Handler();
            this.f9227b = new Runnable() { // from class: guide.tailor.ResultActivity.C2221a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ResultActivity.f9153aA.getCurrentItem() > 1 && ResultActivity.f9155aC != null && ResultActivity.f9155aC.isShown()) {
                        ResultActivity.f9155aC.dismiss();
                    }
                    if (ResultActivity.f9192q + 1 == C2221a.this.f9211a) {
                        ResultActivity.f9192q = -1;
                        if (ResultActivity.f9191p) {
                            C2221a.this.m10560a(true);
                        }
                    }
                    if (ResultActivity.f9158aF >= 0 && ResultActivity.f9159aG == C2221a.this.f9211a && ResultActivity.f9159aG == ResultActivity.f9153aA.getCurrentItem() + 1 && !ResultActivity.f9189n && !ResultActivity.f9190o) {
                        C2221a.this.m10566e(ResultActivity.f9158aF);
                        int unused = ResultActivity.f9158aF = -1;
                    }
                    if (ResultActivity.f9175ak) {
                        if (C2221a.this.f9214ag.getAlpha() != ResultActivity.f9183au && !ResultActivity.f9177am) {
                            LottieAnimationView lottieAnimationView = C2221a.this.f9214ag;
                            float f = ResultActivity.f9183au;
                            lottieAnimationView.setAlpha(f);
                        }
                    } else if (C2221a.this.f9214ag.getAlpha() != 1.0f && !ResultActivity.f9176al) {
                        LottieAnimationView lottieAnimationView2 = C2221a.this.f9214ag;
                        lottieAnimationView2.setAlpha(1.0f);
                    }
                    if (C2221a.this.f9211a == 1) {
                        if (ResultActivity.f9189n) {
                            ResultActivity.f9189n = false;
                            C2221a.this.m10563b();
                        }
                    } else if (ResultActivity.f9190o) {
                        ResultActivity.f9190o = false;
                        C2221a.this.m10563b();
                        ResultActivity.f9187ay = true;
                    }
                    C2221a.this.f9226as.postDelayed(this, 100L);
                }
            };
            this.f9226as.postDelayed(this.f9227b, 100L);
            if (this.f9229d != null) {
                this.f9229d.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C2221a.this.m10560a(false);
                    }
                });
            }
            if (this.f9230e != null) {
                this.f9230e.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C2221a.this.m10560a(true);
                    }
                });
            }
            this.f9213af.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent(C2221a.this.getActivity(), (Class<?>) VideoActivity.class);
                    intent.putExtra("closing_activity", "nothing");
                    C2221a.this.startActivity(intent);
                }
            });
            this.f9228c.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Snackbar setActionTextColor;
                    String string;
                    View.OnClickListener onClickListener;
                    Snackbar setAction;
                    Snackbar setActionTextColor2;
                    String string2;
                    View.OnClickListener onClickListener2;
                    if (WebStart.f9379D || ResultActivity.f9193r) {
                        int i = C2221a.this.f9211a;
                        PointF imageCoordinates = C2221a.this.f9228c.getImageCoordinates();
                        if (C2221a.this.f9216ai != null) {
                            for (int i2 = 0; i2 < C2221a.this.f9216ai.length; i2++) {
                                C2221a.this.f9216ai[i2] = (float) Math.sqrt(Math.pow(C2221a.this.f9217aj.get(i2)[0] - imageCoordinates.x, 2.0d) + Math.pow(C2221a.this.f9217aj.get(i2)[1] - imageCoordinates.y, 2.0d));
                            }
                            float f = 1000000.0f;
                            int i3 = -1;
                            for (int i4 = 0; i4 < C2221a.this.f9216ai.length; i4++) {
                                if (C2221a.this.f9216ai[i4] < f) {
                                    f = C2221a.this.f9216ai[i4];
                                    i3 = i4;
                                }
                            }
                            if (C2221a.this.f9228c.getImageDisplayScale() * f < 0.1f) {
                                Resources resources = C2221a.this.getActivity().getApplicationContext().getResources();
                                String str = resources.getString(R.string.ResultActivity_move_point_confirm1) + " " + C2221a.this.f9215ah.get(i3).toLowerCase() + resources.getString(R.string.ResultActivity_move_point_confirm2);
                                final int currentItem = ResultActivity.f9153aA.getCurrentItem();
                                if (!ResultActivity.f9191p) {
                                    if (ResultActivity.f9156aD != null) {
                                        if (ResultActivity.f9157aE.equals(str)) {
                                            if (ResultActivity.f9156aD.isShown()) {
                                                return;
                                            }
                                        } else if (ResultActivity.f9156aD.isShown()) {
                                            ResultActivity.f9156aD.dismiss();
                                        }
                                    }
                                    String unused = ResultActivity.f9157aE = str;
                                    setActionTextColor2 = Snackbar.make(C2221a.this.f9234i, str, 0).setActionTextColor(Color.parseColor("#C0DAEC"));
                                    string2 = C2221a.this.getActivity().getApplicationContext().getResources().getString(R.string.ResultActivity_move_point_yes);
                                    final int finalI = i3;
                                    onClickListener2 = new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.5.1
                                        @Override // android.view.View.OnClickListener
                                        public void onClick(View view2) {
                                            if (ResultActivity.f9153aA.getCurrentItem() != currentItem) {
                                                ResultActivity.f9153aA.setCurrentItem(currentItem);
                                            }
                                            C2221a.this.m10566e(finalI);
                                        }
                                    };
                                } else {
                                    if (C2221a.this.f9224aq == i3) {
                                        return;
                                    }
                                    String str2 = resources.getString(R.string.ResultActivity_move_point_and_save) + " " + C2221a.this.f9215ah.get(i3).toLowerCase() + resources.getString(R.string.ResultActivity_move_point_confirm2);
                                    if (ResultActivity.f9156aD != null) {
                                        if (ResultActivity.f9157aE.equals(str2)) {
                                            if (ResultActivity.f9156aD.isShown()) {
                                                return;
                                            }
                                        } else if (ResultActivity.f9156aD.isShown()) {
                                            ResultActivity.f9156aD.dismiss();
                                        }
                                    }
                                    String unused2 = ResultActivity.f9157aE = str2;
                                    setActionTextColor2 = Snackbar.make(C2221a.this.f9234i, str2, 0).setActionTextColor(Color.parseColor("#C0DAEC"));
                                    string2 = C2221a.this.getActivity().getApplicationContext().getResources().getString(R.string.ResultActivity_move_point_yes);
                                    final int finalI1 = i3;
                                    onClickListener2 = new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.5.2
                                        @Override // android.view.View.OnClickListener
                                        public void onClick(View view2) {
                                            int unused3 = ResultActivity.f9159aG = C2221a.this.f9211a;
                                            int unused4 = ResultActivity.f9158aF = finalI1;
                                            C2221a.this.m10560a(false);
                                        }
                                    };
                                }
                                setAction = setActionTextColor2.setAction(string2, onClickListener2);
                            } else {
                                if (ResultActivity.f9191p) {
                                    return;
                                }
                                C2221a.this.f9220am = C2221a.this.f9228c.getHeadRect();
                                C2221a.this.f9221an = C2221a.this.f9228c.getFeetRect();
                                if (imageCoordinates.y < C2221a.this.f9220am.top || imageCoordinates.y > C2221a.this.f9220am.bottom) {
                                    if (imageCoordinates.y < C2221a.this.f9221an.top || imageCoordinates.y > C2221a.this.f9221an.bottom || imageCoordinates.x < C2221a.this.f9221an.left || imageCoordinates.x > C2221a.this.f9221an.right) {
                                        return;
                                    }
                                    Resources resources2 = C2221a.this.getActivity().getApplicationContext().getResources();
                                    String str3 = resources2.getString(R.string.ResultActivity_move_point_confirm1) + " " + C2221a.this.f9215ah.get(C2221a.this.f9219al[7]).toLowerCase() + resources2.getString(R.string.ResultActivity_move_point_confirm2);
                                    if (ResultActivity.f9156aD != null) {
                                        if (ResultActivity.f9157aE.equals(str3)) {
                                            if (ResultActivity.f9156aD.isShown()) {
                                                return;
                                            }
                                        } else if (ResultActivity.f9156aD.isShown()) {
                                            ResultActivity.f9156aD.dismiss();
                                        }
                                    }
                                    String unused3 = ResultActivity.f9157aE = str3;
                                    final int currentItem2 = ResultActivity.f9153aA.getCurrentItem();
                                    final int i5 = C2221a.this.f9219al[7];
                                    setActionTextColor = Snackbar.make(C2221a.this.f9234i, str3, 0).setActionTextColor(Color.parseColor("#C0DAEC"));
                                    string = C2221a.this.getActivity().getApplicationContext().getResources().getString(R.string.ResultActivity_move_point_yes);
                                    onClickListener = new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.5.3
                                        @Override // android.view.View.OnClickListener
                                        public void onClick(View view2) {
                                            if (ResultActivity.f9153aA.getCurrentItem() != currentItem2) {
                                                ResultActivity.f9153aA.setCurrentItem(currentItem2);
                                            }
                                            C2221a.this.m10566e(i5);
                                        }
                                    };
                                } else {
                                    if (imageCoordinates.x < C2221a.this.f9220am.left || imageCoordinates.x > C2221a.this.f9220am.right) {
                                        return;
                                    }
                                    Resources resources3 = C2221a.this.getActivity().getApplicationContext().getResources();
                                    String str4 = resources3.getString(R.string.ResultActivity_move_point_confirm1) + " " + C2221a.this.f9215ah.get(C2221a.this.f9219al[6]).toLowerCase() + resources3.getString(R.string.ResultActivity_move_point_confirm2);
                                    if (ResultActivity.f9156aD != null) {
                                        if (ResultActivity.f9157aE.equals(str4)) {
                                            if (ResultActivity.f9156aD.isShown()) {
                                                return;
                                            }
                                        } else if (ResultActivity.f9156aD.isShown()) {
                                            ResultActivity.f9156aD.dismiss();
                                        }
                                    }
                                    String unused4 = ResultActivity.f9157aE = str4;
                                    final int currentItem3 = ResultActivity.f9153aA.getCurrentItem();
                                    final int i6 = C2221a.this.f9219al[6];
                                    setActionTextColor = Snackbar.make(C2221a.this.f9234i, str4, 0).setActionTextColor(Color.parseColor("#C0DAEC"));
                                    string = C2221a.this.getActivity().getApplicationContext().getResources().getString(R.string.ResultActivity_move_point_yes);
                                    onClickListener = new View.OnClickListener() { // from class: guide.tailor.ResultActivity.C2221a.5.4
                                        @Override // android.view.View.OnClickListener
                                        public void onClick(View view2) {
                                            if (ResultActivity.f9153aA.getCurrentItem() != currentItem3) {
                                                ResultActivity.f9153aA.setCurrentItem(currentItem3);
                                            }
                                            C2221a.this.m10566e(i6);
                                        }
                                    };
                                }
                                setAction = setActionTextColor.setAction(string, onClickListener);
                            }
                            Snackbar unused5 = ResultActivity.f9156aD = setAction;
                            ResultActivity.f9156aD.show();
                        }
                    }
                }
            });
            this.f9228c.setOnLongClickListener(new View.OnLongClickListener() { // from class: guide.tailor.ResultActivity.C2221a.6
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    if (!WebStart.f9379D && !ResultActivity.f9193r) {
                        return true;
                    }
                    int i = C2221a.this.f9211a;
                    PointF imageCoordinates = C2221a.this.f9228c.getImageCoordinates();
                    if (C2221a.this.f9216ai != null) {
                        for (int i3 = 0; i3 < C2221a.this.f9216ai.length; i3++) {
                            C2221a.this.f9216ai[i3] = (float) Math.sqrt(Math.pow(C2221a.this.f9217aj.get(i3)[0] - imageCoordinates.x, 2.0d) + Math.pow(C2221a.this.f9217aj.get(i3)[1] - imageCoordinates.y, 2.0d));
                        }
                        float f = 1000000.0f;
                        int i4 = -1;
                        for (int i5 = 0; i5 < C2221a.this.f9216ai.length; i5++) {
                            if (C2221a.this.f9216ai[i5] < f) {
                                f = C2221a.this.f9216ai[i5];
                                i4 = i5;
                            }
                        }
                        if (C2221a.this.f9228c.getImageDisplayScale() * f < 0.1f) {
                            if (ResultActivity.f9156aD != null && ResultActivity.f9156aD.isShown()) {
                                ResultActivity.f9156aD.dismiss();
                            }
                            if (ResultActivity.f9191p) {
                                int unused = ResultActivity.f9159aG = C2221a.this.f9211a;
                                int unused2 = ResultActivity.f9158aF = i4;
                                C2221a.this.m10560a(false);
                                return true;
                            }
                            C2221a.this.m10566e(i4);
                            return true;
                        }
                        if (!ResultActivity.f9191p) {
                            C2221a.this.f9220am = C2221a.this.f9228c.getHeadRect();
                            C2221a.this.f9221an = C2221a.this.f9228c.getFeetRect();
                            if (imageCoordinates.y < C2221a.this.f9220am.top || imageCoordinates.y > C2221a.this.f9220am.bottom) {
                                if (imageCoordinates.y >= C2221a.this.f9221an.top && imageCoordinates.y <= C2221a.this.f9221an.bottom && imageCoordinates.x >= C2221a.this.f9221an.left && imageCoordinates.x <= C2221a.this.f9221an.right) {
                                    if (ResultActivity.f9156aD != null && ResultActivity.f9156aD.isShown()) {
                                        ResultActivity.f9156aD.dismiss();
                                    }
                                    C2221a c2221a = C2221a.this;
                                    int i2 = C2221a.this.f9219al[7];
                                    c2221a.m10566e(i2);
                                    return true;
                                }
                            } else if (imageCoordinates.x >= C2221a.this.f9220am.left && imageCoordinates.x <= C2221a.this.f9220am.right) {
                                if (ResultActivity.f9156aD != null && ResultActivity.f9156aD.isShown()) {
                                    ResultActivity.f9156aD.dismiss();
                                }
                                C2221a c2221a2 = C2221a.this;
                                int i6 = C2221a.this.f9219al[6];
                                c2221a2.m10566e(i6);
                                return true;
                            }
                        }
                    }
                    return true;
                }
            });
            return inflate;
        }

        @Override // androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            try {
                this.f9226as.postDelayed(this.f9227b, 100L);
            } catch (Exception e) {
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroyView() {
            super.onDestroyView();
            try {
                this.f9226as.removeCallbacksAndMessages(null);
            } catch (Exception e) {
            }
        }
    }

    public static class C2222b extends Fragment {
        public View f9252a;
        TextView f9253aA;
        TextView f9254aB;
        TextView f9255aC;
        TextView f9256aD;
        TextView f9257aE;
        TextView f9258aF;
        TextView f9259aG;
        TextView f9260aH;
        double f9261aI;
        double f9262aJ;
        double f9263aK;
        double f9264aL;
        double f9265aM;
        double f9266aN;
        double f9267aO;
        double f9268aP;
        double f9269aQ;
        double f9270aR;
        double f9271aS;
        double f9272aT;
        double f9273aU;
        double f9274aV;
        double f9275aW;
        double f9276aX;
        double f9277aY;
        double f9278aZ;
        EditText f9279ae;
        EditText f9280af;
        EditText f9281ag;
        EditText f9282ah;
        EditText f9283ai;
        EditText f9284aj;
        EditText f9285ak;
        EditText f9286al;
        EditText f9287am;
        TextView f9288an;
        TextView f9289ao;
        TextView f9290ap;
        TextView f9291aq;
        TextView f9292ar;
        TextView f9293as;
        TextView f9294at;
        TextView f9295au;
        TextView f9296av;
        TextView f9297aw;
        TextView f9298ax;
        TextView f9299ay;
        TextView f9300az;
        EditText f9301b;
        double f9304ba;
        TextView f9330c;
        EditText f9331d;
        EditText f9332e;
        EditText f9333f;
        EditText f9334g;
        EditText f9335h;
        EditText f9336i;
        double f9305bb = 0.0d;
        double f9306bc = 0.0d;
        double f9307bd = 0.0d;
        double f9308be = 0.0d;
        double f9309bf = 0.0d;
        double f9310bg = 0.0d;
        double f9311bh = 0.0d;
        double f9312bi = 0.0d;
        double f9313bj = 0.0d;
        double f9314bk = 0.0d;
        double f9315bl = 0.0d;
        double f9316bm = 0.0d;
        double f9317bn = 0.0d;
        double f9318bo = 0.0d;
        double f9319bp = 0.0d;
        double f9320bq = 0.0d;
        double f9321br = 0.0d;
        double f9322bs = 0.0d;
        double f9323bt = 0.0d;
        double f9324bu = 0.0d;
        double f9325bv = 1.0d;
        double f9326bw = 1.0d;
        double f9327bx = 0.0d;
        double f9328by = 0.0d;
        double f9329bz = 0.0d;
        double f9302bA = 0.0d;
        double f9303bB = 0.0d;

        private float m10568b(float f) {
            if (f < 80.0f) {
                return 80.0f;
            }
            if (f > 250.0f) {
                return 250.0f;
            }
            return f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String m10569b(String str) {
            return String.valueOf(m10568b(Float.parseFloat(str)));
        }

        public static C2222b m10570d(int i) {
            C2222b c2222b = new C2222b();
            Bundle bundle = new Bundle();
            bundle.putInt("section_number", i);
            c2222b.setArguments(bundle);
            return c2222b;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f9252a = layoutInflater.inflate(R.layout.fragment_result_measurements, viewGroup, false);
            this.f9301b = (EditText) this.f9252a.findViewById(R.id.heightbox);
            this.f9330c = (TextView) this.f9252a.findViewById(R.id.measurements_textview);
            this.f9331d = (EditText) this.f9252a.findViewById(R.id.meas_chest3);
            this.f9332e = (EditText) this.f9252a.findViewById(R.id.meas_chestW3);
            this.f9333f = (EditText) this.f9252a.findViewById(R.id.meas_chestH3);
            this.f9334g = (EditText) this.f9252a.findViewById(R.id.meas_waist3);
            this.f9335h = (EditText) this.f9252a.findViewById(R.id.meas_waistW3);
            this.f9336i = (EditText) this.f9252a.findViewById(R.id.meas_waistH3);
            this.f9279ae = (EditText) this.f9252a.findViewById(R.id.meas_seat3);
            this.f9280af = (EditText) this.f9252a.findViewById(R.id.meas_seatW3);
            this.f9281ag = (EditText) this.f9252a.findViewById(R.id.meas_seatH3);
            this.f9282ah = (EditText) this.f9252a.findViewById(R.id.meas_shoulder3);
            this.f9283ai = (EditText) this.f9252a.findViewById(R.id.meas_inseam3);
            this.f9284aj = (EditText) this.f9252a.findViewById(R.id.meas_outseam3);
            this.f9285ak = (EditText) this.f9252a.findViewById(R.id.meas_arm3);
            this.f9286al = (EditText) this.f9252a.findViewById(R.id.meas_back3);
            this.f9287am = (EditText) this.f9252a.findViewById(R.id.meas_neck3);
            this.f9288an = (TextView) this.f9252a.findViewById(R.id.meas_chest2);
            this.f9289ao = (TextView) this.f9252a.findViewById(R.id.meas_chestW2);
            this.f9290ap = (TextView) this.f9252a.findViewById(R.id.meas_chestH2);
            this.f9291aq = (TextView) this.f9252a.findViewById(R.id.meas_waist2);
            this.f9292ar = (TextView) this.f9252a.findViewById(R.id.meas_waistW2);
            this.f9293as = (TextView) this.f9252a.findViewById(R.id.meas_waistH2);
            this.f9294at = (TextView) this.f9252a.findViewById(R.id.meas_seat2);
            this.f9295au = (TextView) this.f9252a.findViewById(R.id.meas_seatW2);
            this.f9296av = (TextView) this.f9252a.findViewById(R.id.meas_seatH2);
            this.f9297aw = (TextView) this.f9252a.findViewById(R.id.meas_shoulder2);
            this.f9298ax = (TextView) this.f9252a.findViewById(R.id.meas_inseam2);
            this.f9299ay = (TextView) this.f9252a.findViewById(R.id.meas_outseam2);
            this.f9300az = (TextView) this.f9252a.findViewById(R.id.meas_arm2);
            this.f9253aA = (TextView) this.f9252a.findViewById(R.id.meas_back2);
            this.f9254aB = (TextView) this.f9252a.findViewById(R.id.meas_neck2);
            this.f9255aC = (TextView) this.f9252a.findViewById(R.id.meas_shoulderheel2);
            this.f9256aD = (TextView) this.f9252a.findViewById(R.id.meas_shouldercrotch2);
            this.f9257aE = (TextView) this.f9252a.findViewById(R.id.meas_longarm2);
            this.f9258aF = (TextView) this.f9252a.findViewById(R.id.meas_thigh2);
            this.f9259aG = (TextView) this.f9252a.findViewById(R.id.meas_thighW2);
            this.f9260aH = (TextView) this.f9252a.findViewById(R.id.meas_thighH2);
            m10572b();
            this.f9301b.setFilters(new InputFilter[]{new C2260f()});
            if (this.f9301b != null && this.f9330c != null) {
                this.f9301b.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        try {
                            if (C2222b.this.f9301b.getText().toString().length() <= 0) {
                                C2222b.this.m10571a(0.0f);
                            } else {
                                C2222b.this.m10571a(Float.parseFloat(C2222b.this.f9301b.getText().toString()));
                            }
                        } catch (Exception e) {
                            C2222b.this.f9330c.setText(C2222b.this.getActivity().getApplicationContext().getResources().getString(R.string.measurements_empty));
                            ResultActivity.f9199x = 0.0f;
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }
                });
                this.f9301b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: guide.tailor.ResultActivity.C2222b.2
                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z) {
                        if (z) {
                            return;
                        }
                        if (C2222b.this.f9301b.getText().toString().length() > 0) {
                            String m10569b = C2222b.this.m10569b(C2222b.this.f9301b.getText().toString());
                            if (m10569b.equals(C2222b.this.f9301b.getText().toString())) {
                                return;
                            }
                            C2222b.this.f9301b.setText(m10569b);
                            return;
                        }
                        C2222b.this.m10571a(0.0f);
                    }
                });
                this.f9301b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: guide.tailor.ResultActivity.C2222b.3
                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 3 && i != 6) {
                            return false;
                        }
                        if (C2222b.this.f9301b.getText().toString().length() > 0) {
                            String m10569b = C2222b.this.m10569b(C2222b.this.f9301b.getText().toString());
                            if (m10569b.equals(C2222b.this.f9301b.getText().toString())) {
                                return false;
                            }
                            C2222b.this.f9301b.setText(m10569b);
                            return false;
                        }
                        C2222b.this.m10571a(0.0f);
                        return false;
                    }
                });
                if (this.f9331d != null) {
                    this.f9331d.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.4
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9200y = C2222b.this.f9331d.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9200y = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9332e != null) {
                    this.f9332e.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.5
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9201z = C2222b.this.f9332e.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9201z = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9333f != null) {
                    this.f9333f.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.6
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9127A = C2222b.this.f9333f.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9127A = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9334g != null) {
                    this.f9334g.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.7
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9128B = C2222b.this.f9334g.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9128B = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9335h != null) {
                    this.f9335h.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.8
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9129C = C2222b.this.f9335h.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9129C = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9336i != null) {
                    this.f9336i.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.9
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9130D = C2222b.this.f9336i.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9130D = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9279ae != null) {
                    this.f9279ae.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.10
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9131E = C2222b.this.f9279ae.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9131E = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9280af != null) {
                    this.f9280af.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.11
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9132F = C2222b.this.f9280af.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9132F = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9281ag != null) {
                    this.f9281ag.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.12
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9133G = C2222b.this.f9281ag.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9133G = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9282ah != null) {
                    this.f9282ah.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.13
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9134H = C2222b.this.f9282ah.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9134H = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9283ai != null) {
                    this.f9283ai.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.14
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9135I = C2222b.this.f9283ai.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9135I = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9284aj != null) {
                    this.f9284aj.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.15
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9136J = C2222b.this.f9284aj.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9136J = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9285ak != null) {
                    this.f9285ak.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.16
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9138L = C2222b.this.f9285ak.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9138L = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9286al != null) {
                    this.f9286al.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.17
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9139M = C2222b.this.f9286al.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9139M = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (this.f9287am != null) {
                    this.f9287am.addTextChangedListener(new TextWatcher() { // from class: guide.tailor.ResultActivity.C2222b.18
                        @Override // android.text.TextWatcher
                        public void afterTextChanged(Editable editable) {
                            try {
                                ResultActivity.f9137K = C2222b.this.f9287am.getText().toString();
                            } catch (Exception e) {
                                ResultActivity.f9137K = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            }
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }
                    });
                }
                if (ResultActivity.f9199x > 0.0f) {
                    this.f9301b.setText(String.valueOf(ResultActivity.f9199x));
                }
            }
            return this.f9252a;
        }

        void m10571a(float f) {
            try {
                if (f <= 0.0f) {
                    this.f9330c.setText(getActivity().getApplicationContext().getResources().getString(R.string.measurements_empty));
                    this.f9288an.setText("");
                    this.f9289ao.setText("");
                    this.f9290ap.setText("");
                    this.f9291aq.setText("");
                    this.f9292ar.setText("");
                    this.f9293as.setText("");
                    this.f9294at.setText("");
                    this.f9295au.setText("");
                    this.f9296av.setText("");
                    this.f9258aF.setText("");
                    this.f9259aG.setText("");
                    this.f9260aH.setText("");
                    this.f9297aw.setText("");
                    this.f9298ax.setText("");
                    this.f9299ay.setText("");
                    this.f9300az.setText("");
                    this.f9253aA.setText("");
                    this.f9254aB.setText("");
                    this.f9256aD.setText("");
                    this.f9255aC.setText("");
                    this.f9257aE.setText("");
                    ResultActivity.f9199x = 0.0f;
                    ResultActivity.f9141O = 0.0f;
                    ResultActivity.f9142P = 0.0f;
                    ResultActivity.f9143Q = 0.0f;
                    ResultActivity.f9144R = 0.0f;
                    ResultActivity.f9145S = 0.0f;
                    ResultActivity.f9146T = 0.0f;
                    ResultActivity.f9147U = 0.0f;
                    ResultActivity.f9148V = 0.0f;
                    ResultActivity.f9149W = 0.0f;
                    ResultActivity.f9171ag = 0.0f;
                    ResultActivity.f9172ah = 0.0f;
                    ResultActivity.f9173ai = 0.0f;
                    ResultActivity.f9150X = 0.0f;
                    ResultActivity.f9151Y = 0.0f;
                    ResultActivity.f9166ab = 0.0f;
                    ResultActivity.f9167ac = 0.0f;
                    ResultActivity.f9152Z = 0.0f;
                    ResultActivity.f9165aa = 0.0f;
                    ResultActivity.f9169ae = 0.0f;
                    ResultActivity.f9170af = 0.0f;
                    ResultActivity.f9168ad = 0.0f;
                    ResultActivity.f9174aj = 0.0f;
                    return;
                }
                double d = f;
                this.f9312bi = this.f9265aM * d;
                this.f9313bj = this.f9266aN * d;
                this.f9314bk = this.f9261aI * d;
                this.f9315bl = this.f9262aJ * d;
                this.f9316bm = this.f9263aK * d;
                this.f9317bn = this.f9264aL * d;
                this.f9310bg = this.f9278aZ * d;
                this.f9311bh = this.f9304ba * d;
                this.f9324bu = this.f9273aU * d;
                this.f9328by = this.f9275aW * d;
                this.f9329bz = this.f9276aX * d;
                this.f9327bx = this.f9274aV * d;
                this.f9318bo = Math.round((this.f9267aO * d) * 10.0d) / 10.0d;
                this.f9319bp = Math.round((this.f9268aP * d) * 10.0d) / 10.0d;
                this.f9320bq = Math.round((this.f9269aQ * d) * 10.0d) / 10.0d;
                this.f9322bs = Math.round((this.f9271aS * d) * 10.0d) / 10.0d;
                this.f9323bt = Math.round((this.f9272aT * d) * 10.0d) / 10.0d;
                this.f9327bx = Math.round((this.f9274aV * d) * 10.0d) / 10.0d;
                this.f9328by = Math.round((this.f9275aW * d) * 10.0d) / 10.0d;
                this.f9329bz = Math.round((this.f9276aX * d) * 10.0d) / 10.0d;
                this.f9308be = C2262h.f10081o * ((Math.sqrt((Math.pow(this.f9312bi * 0.5d, 2.0d) + Math.pow(this.f9313bj * C2262h.f10082p, 2.0d)) * 0.5d) * 3.141592653589793d) + (Math.sqrt((Math.pow(this.f9312bi * 0.5d, 2.0d) + Math.pow(this.f9313bj * (1.0d - C2262h.f10082p), 2.0d)) * 0.5d) * 3.141592653589793d));
                this.f9305bb = C2262h.f10083q * ((Math.sqrt((Math.pow(this.f9314bk * 0.5d, 2.0d) + Math.pow(this.f9315bl * C2262h.f10084r, 2.0d)) * 0.5d) * 3.141592653589793d) + (Math.sqrt((Math.pow(this.f9314bk * 0.5d, 2.0d) + Math.pow(this.f9315bl * (1.0d - C2262h.f10084r), 2.0d)) * 0.5d) * 3.141592653589793d));
                this.f9307bd = C2262h.f10085s * ((Math.sqrt((Math.pow(this.f9316bm * 0.5d, 2.0d) + Math.pow(this.f9317bn * C2262h.f10086t, 2.0d)) * 0.5d) * 3.141592653589793d) + (Math.sqrt((Math.pow(this.f9316bm * 0.5d, 2.0d) + Math.pow(this.f9317bn * (1.0d - C2262h.f10086t), 2.0d)) * 0.5d) * 3.141592653589793d));
                this.f9309bf = C2262h.f10089w * ((Math.sqrt((Math.pow(this.f9310bg * 0.5d, 2.0d) + Math.pow(this.f9311bh * C2262h.f10090x, 2.0d)) * 0.5d) * 3.141592653589793d) + (Math.sqrt((Math.pow(this.f9310bg * 0.5d, 2.0d) + Math.pow(this.f9311bh * (1.0d - C2262h.f10090x), 2.0d)) * 0.5d) * 3.141592653589793d));
                this.f9324bu = C2262h.f10087u * ((this.f9324bu * C2262h.f10088v * 3.141592653589793d) + (this.f9324bu * (1.0d - C2262h.f10088v) * 3.141592653589793d));
                this.f9321br = this.f9270aR * d * this.f9277aY;
                this.f9308be = Math.round(this.f9308be * 10.0d) / 10.0d;
                this.f9307bd = Math.round(this.f9307bd * 10.0d) / 10.0d;
                this.f9305bb = Math.round(this.f9305bb * 10.0d) / 10.0d;
                this.f9309bf = Math.round(this.f9309bf * 10.0d) / 10.0d;
                this.f9324bu = Math.round(this.f9324bu * 10.0d) / 10.0d;
                this.f9312bi = Math.round(this.f9312bi * 10.0d) / 10.0d;
                this.f9313bj = Math.round(this.f9313bj * 10.0d) / 10.0d;
                this.f9314bk = Math.round(this.f9314bk * 10.0d) / 10.0d;
                this.f9315bl = Math.round(this.f9315bl * 10.0d) / 10.0d;
                this.f9316bm = Math.round(this.f9316bm * 10.0d) / 10.0d;
                this.f9317bn = Math.round(this.f9317bn * 10.0d) / 10.0d;
                this.f9310bg = Math.round(this.f9310bg * 10.0d) / 10.0d;
                this.f9311bh = Math.round(this.f9311bh * 10.0d) / 10.0d;
                this.f9321br = Math.round(this.f9321br * 0.1d) / 10.0d;
                this.f9288an.setText(String.valueOf(this.f9308be));
                ResultActivity.f9141O = (float) this.f9308be;
                this.f9289ao.setText(String.valueOf(this.f9312bi));
                ResultActivity.f9142P = (float) this.f9312bi;
                this.f9290ap.setText(String.valueOf(this.f9313bj));
                ResultActivity.f9143Q = (float) this.f9313bj;
                this.f9291aq.setText(String.valueOf(this.f9305bb));
                ResultActivity.f9144R = (float) this.f9305bb;
                this.f9292ar.setText(String.valueOf(this.f9314bk));
                ResultActivity.f9145S = (float) this.f9314bk;
                this.f9293as.setText(String.valueOf(this.f9315bl));
                ResultActivity.f9146T = (float) this.f9315bl;
                this.f9294at.setText(String.valueOf(this.f9307bd));
                ResultActivity.f9147U = (float) this.f9307bd;
                this.f9295au.setText(String.valueOf(this.f9316bm));
                ResultActivity.f9148V = (float) this.f9316bm;
                this.f9296av.setText(String.valueOf(this.f9317bn));
                ResultActivity.f9149W = (float) this.f9317bn;
                this.f9297aw.setText(String.valueOf(this.f9318bo));
                ResultActivity.f9150X = (float) this.f9318bo;
                this.f9298ax.setText(String.valueOf(this.f9319bp));
                ResultActivity.f9151Y = (float) this.f9319bp;
                this.f9299ay.setText(String.valueOf(this.f9320bq));
                ResultActivity.f9166ab = (float) this.f9320bq;
                this.f9300az.setText(String.valueOf(this.f9323bt));
                ResultActivity.f9167ac = (float) this.f9323bt;
                this.f9253aA.setText(String.valueOf(this.f9322bs));
                ResultActivity.f9152Z = (float) this.f9322bs;
                this.f9254aB.setText(String.valueOf(this.f9324bu));
                ResultActivity.f9165aa = (float) this.f9324bu;
                this.f9256aD.setText(String.valueOf(this.f9329bz));
                ResultActivity.f9169ae = (float) this.f9329bz;
                this.f9255aC.setText(String.valueOf(this.f9328by));
                ResultActivity.f9170af = (float) this.f9328by;
                this.f9257aE.setText(String.valueOf(this.f9327bx));
                ResultActivity.f9168ad = (float) this.f9327bx;
                this.f9258aF.setText(String.valueOf(this.f9309bf));
                ResultActivity.f9171ag = (float) this.f9309bf;
                this.f9259aG.setText(String.valueOf(this.f9310bg));
                ResultActivity.f9172ah = (float) this.f9310bg;
                this.f9260aH.setText(String.valueOf(this.f9311bh));
                ResultActivity.f9173ai = (float) this.f9311bh;
                this.f9330c.setText(getActivity().getApplicationContext().getResources().getString(R.string.measurements_filled));
                ResultActivity.f9199x = f;
            } catch (Exception e) {
                this.f9330c.setText(getActivity().getApplicationContext().getResources().getString(R.string.measurements_empty));
                ResultActivity.f9199x = 0.0f;
            }
        }

        void m10572b() {
            this.f9261aI = C2262h.f9930bz;
            this.f9262aJ = C2262h.f9879bA;
            this.f9263aK = C2262h.f9884bF;
            this.f9264aL = C2262h.f9885bG;
            this.f9265aM = C2262h.f9928bx;
            this.f9266aN = C2262h.f9929by;
            this.f9267aO = C2262h.f9880bB;
            this.f9268aP = C2262h.f9881bC;
            this.f9269aQ = C2262h.f9886bH;
            this.f9270aR = C2262h.f9882bD;
            this.f9271aS = C2262h.f9887bI;
            this.f9272aT = C2262h.f9891bM;
            this.f9273aU = C2262h.f9892bN;
            this.f9274aV = C2262h.f9896bR;
            this.f9275aW = C2262h.f9894bP;
            this.f9276aX = C2262h.f9893bO;
            this.f9277aY = C2262h.f9883bE;
            this.f9278aZ = C2262h.f9897bS;
            this.f9304ba = C2262h.f9898bT;
        }

        @Override // androidx.fragment.app.Fragment
        public void setUserVisibleHint(boolean z) {
            super.setUserVisibleHint(z);
            if (z && ResultActivity.f9187ay) {
                ResultActivity.f9187ay = false;
                m10572b();
                if (ResultActivity.f9199x > 0.0f) {
                    this.f9301b.setText(String.valueOf(ResultActivity.f9199x));
                }
            }
        }
    }

    public class C2223c extends FragmentPagerAdapter {
        public C2223c(FragmentManager abstractC0216n) {
            super(abstractC0216n);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return i == 2 ? C2222b.m10570d(i + 1) : C2221a.m10565d(i + 1);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 3;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            switch (i) {
                case 0:
                    return "Page 1/4 : Front view";
                case 1:
                    return "Page 2/4 : Side view";
                case 2:
                    return "Page 3/4 : Measurements";
                default:
                    return null;
            }
        }
    }

    private void m10555u() {
        int[] iArr;
        if (!WebStart.f9382G.equals("male")) {
            f9184av = new int[]{R.raw.point_shoulder_left_woman, R.raw.point_shoulder_right_woman, R.raw.point_chest_left_woman, R.raw.point_chest_right_woman, R.raw.point_waist_left_woman, R.raw.point_waist_right_woman, R.raw.point_hip_left_woman, R.raw.point_hip_right_woman, R.raw.point_crotch_woman, R.raw.point_thigh_left_woman, R.raw.point_thigh_right_woman, R.raw.point_heel_left_woman, R.raw.point_heel_right_woman, R.raw.head_woman, R.raw.feet_woman};
            iArr = new int[]{R.raw.point_side_neck_woman, R.raw.point_side_wrist_woman, R.raw.point_side_shoulder_woman, R.raw.point_side_chest_left_woman, R.raw.point_side_chest_right_woman, R.raw.point_side_waist_left_woman, R.raw.point_side_waist_right_woman, R.raw.point_side_hip_left_woman, R.raw.point_side_hip_right_woman, R.raw.point_side_thigh_left_woman, R.raw.point_side_thigh_right_woman, R.raw.side_head_woman, R.raw.side_feet_woman};
        } else {
            f9184av = new int[]{R.raw.point_shoulder_left_man, R.raw.point_shoulder_right_man, R.raw.point_chest_left_man, R.raw.point_chest_right_man, R.raw.point_waist_left_man, R.raw.point_waist_right_man, R.raw.point_hip_left_man, R.raw.point_hip_right_man, R.raw.point_crotch_man, R.raw.point_thigh_left_man, R.raw.point_thigh_right_man, R.raw.point_heel_left_man, R.raw.point_heel_right_man, R.raw.head_man, R.raw.feet_man};
            iArr = new int[]{R.raw.point_side_neck_man, R.raw.point_side_wrist_man, R.raw.point_side_shoulder_man, R.raw.point_side_chest_left_man, R.raw.point_side_chest_right_man, R.raw.point_side_waist_left_man, R.raw.point_side_waist_right_man, R.raw.point_side_hip_left_man, R.raw.point_side_hip_right_man, R.raw.point_side_thigh_left_man, R.raw.point_side_thigh_right_man, R.raw.side_head_man, R.raw.side_feet_man};
        }
        f9185aw = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m10556v() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            if (f9191p) {
                f9192q = f9153aA.getCurrentItem();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getApplicationContext().getResources().getString(R.string.meas_exit_dialog));
            builder.setPositiveButton(getApplicationContext().getResources().getString(R.string.meas_exit_dialog_yes), new DialogInterface.OnClickListener() { // from class: guide.tailor.ResultActivity.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    ResultActivity.f9194s = "";
                    ResultActivity.f9199x = 0.0f;
                    ResultActivity.f9179ao = null;
                    ResultActivity.f9178an = null;
                    ResultActivity.f9197v = "false";
                    ResultActivity.f9196u = "";
                    ResultActivity.f9140N = "Male";
                    ResultActivity.this.finish();
                }
            });
            builder.setNeutralButton(getApplicationContext().getResources().getString(R.string.ResultActivity_Confirm_cancel), new DialogInterface.OnClickListener() { // from class: guide.tailor.ResultActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        } catch (Exception e) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        TextView textView;
        Resources resources;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        f9188az = new C2223c(getSupportFragmentManager());
        m10555u();
        f9153aA = (NonSwipeableViewPager) findViewById(R.id.containerResults);
        f9153aA.setAdapter(f9188az);
        this.f9203ap = (Button) findViewById(R.id.donebtn);
        this.f9204aq = (TextView) findViewById(R.id.result_guide_text);
        f9180ar = (LinearLayout) findViewById(R.id.result_continue_view);
        f9186ax = 0;
        f9154aB = 0;
        f9193r = false;
        if (WebStart.f9379D) {
            textView = this.f9204aq;
            resources = getApplicationContext().getResources();
            i = R.string.Result_quide_0;
        } else {
            textView = this.f9204aq;
            resources = getApplicationContext().getResources();
            i = R.string.Result_quide_0_alt;
        }
        textView.setText(resources.getString(i));
        this.f9203ap.setText(getApplicationContext().getResources().getString(R.string.Result_quide_next_btn));
        if (!C2261g.f9797c && WebStart.f9381F) {
            C2261g.m10874a().m10877b();
        }
                this.f9203ap.setOnClickListener(new View.OnClickListener() { // from class: guide.tailor.ResultActivity.3
                    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View a0) {
                        switch (ResultActivity.f9186ax) {
                            case 0:
                                if (ResultActivity.f9153aA.getCurrentItem() != 1) {
                                    ResultActivity.f9153aA.setCurrentItem(1);
                                    break;
                                }
                                break;
                            case 1:
                                if (ResultActivity.f9153aA.getCurrentItem() != 2) {
                                    ResultActivity.f9153aA.setCurrentItem(2);
                                }
                                break;
                            case 2:
                                float f = ResultActivity.f9199x;
                                int i2 = f < 80.0f ? -1 : f == 80.0f ? 0 : 1;
                                if (i2 >= 0) {
                                    if (ResultActivity.f9199x < 80.0f || ResultActivity.f9199x > 250.0f) {
                                        if (ResultActivity.f9153aA.getCurrentItem() != 2) {
                                            ResultActivity.f9153aA.setCurrentItem(2);
                                        }
                                        String s2 = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Edit_height_missing);
                                        if (ResultActivity.f9164aL != null) {
                                            ResultActivity.f9164aL.cancel();
                                        }
                                        Toast unused = ResultActivity.f9164aL = Toast.makeText(ResultActivity.this, s2, 1);
                                        ResultActivity.f9164aL.show();
                                        if (!WebStart.f9379D) {
                                            ResultActivity.access$1208();
                                            if (ResultActivity.f9154aB > 4) {
                                                if (ResultActivity.f9164aL != null) {
                                                    ResultActivity.f9164aL.cancel();
                                                }
                                            }
                                        }
                                    } else {
                                        String s0 = ResultActivity.this.getApplicationContext().getResources().getString(R.string.ResultActivity_done_exit_alt);
                                        String s1 = ResultActivity.this.getApplicationContext().getResources().getString(R.string.ResultActivity_done_exit_message);
                                        AlertDialog.Builder a1 = new AlertDialog.Builder(ResultActivity.this);
                                        a1.setTitle(s0);
                                        a1.setMessage(s1);
                                        a1.setPositiveButton(ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_ok_str), new DialogInterface.OnClickListener() { // from class: guide.tailor.ResultActivity.3.1
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public void onClick(DialogInterface dialogInterface, int i3) {
                                                C2262h.m10905a(false);
                                                WebStart.f9398s = C2262h.m10899a(ResultActivity.f9199x);
                                                WebStart.f9395p = true;
                                                C2262h.m10930c();
                                                ResultActivity.this.m10556v();
                                                WebStart.m10620d("measurements_returned");
                                                ResultActivity.this.finish();
                                            }
                                        });
                                        a1.setNegativeButton(ResultActivity.this.getApplicationContext().getResources().getString(R.string.ResultActivity_Confirm_cancel), new DialogInterface.OnClickListener() { // from class: guide.tailor.ResultActivity.3.2
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public void onClick(DialogInterface dialogInterface, int i3) {
                                            }
                                        });
                                        a1.show();
                                        break;
                                    }
                                } else {
                                    if (ResultActivity.f9153aA.getCurrentItem() != 2) {
                                        ResultActivity.f9153aA.setCurrentItem(2);
                                    }
                                    String s = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Edit_height_missing);
                                    if (ResultActivity.f9164aL != null) {
                                        ResultActivity.f9164aL.cancel();
                                    }
                                    Toast unused2 = ResultActivity.f9164aL = Toast.makeText(ResultActivity.this, s, 1);
                                    ResultActivity.f9164aL.show();
                                    if (!WebStart.f9379D) {
                                        ResultActivity.access$1208();
                                        if (ResultActivity.f9154aB > 4) {
                                            if (ResultActivity.f9164aL != null) {
                                                ResultActivity.f9164aL.cancel();
                                            }
                                        }
                                    }
                                }
                                Toast unused3 = ResultActivity.f9164aL = Toast.makeText(ResultActivity.this, "Editing enabled", 1);
                                ResultActivity.f9164aL.show();
                                ResultActivity.f9193r = true;
                                break;
                        }
                    }
        });
        f9153aA.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: guide.tailor.ResultActivity.4
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                TextView textView2;
                String string;
                TextView textView3;
                String string2;
                TextView textView4;
                Resources resources3;
                int i4;
                ResultActivity resultActivity = null;
                Resources resources2 = null;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        ResultActivity.f9186ax = 0;
                        if (WebStart.f9379D || ResultActivity.f9193r) {
                            textView2 = ResultActivity.this.f9204aq;
                            string = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_0);
                        } else {
                            textView2 = ResultActivity.this.f9204aq;
                            string = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_0_alt);
                        }
                        textView2.setText(string);
                        ResultActivity.this.f9203ap.setText(ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_next_btn));
                        resultActivity = ResultActivity.this;
                        resources2 = ResultActivity.this.getApplicationContext().getResources();
                        i3 = R.string.Result_page1;
                        break;
                    case 1:
                        ResultActivity.f9186ax = 1;
                        if (WebStart.f9379D || ResultActivity.f9193r) {
                            textView3 = ResultActivity.this.f9204aq;
                            string2 = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_0);
                        } else {
                            textView3 = ResultActivity.this.f9204aq;
                            string2 = ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_0_alt);
                        }
                        textView3.setText(string2);
                        ResultActivity.this.f9203ap.setText(ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_next_btn));
                        resultActivity = ResultActivity.this;
                        resources2 = ResultActivity.this.getApplicationContext().getResources();
                        i3 = R.string.Result_page2;
                        break;
                    case 2:
                        ResultActivity.f9186ax = 2;
                        if (ResultActivity.f9199x > 0.0f) {
                            textView4 = ResultActivity.this.f9204aq;
                            resources3 = ResultActivity.this.getApplicationContext().getResources();
                            i4 = R.string.Result_quide_3;
                        } else {
                            textView4 = ResultActivity.this.f9204aq;
                            resources3 = ResultActivity.this.getApplicationContext().getResources();
                            i4 = R.string.Result_quide_2;
                        }
                        textView4.setText(resources3.getString(i4));
                        ResultActivity.this.f9203ap.setText(ResultActivity.this.getApplicationContext().getResources().getString(R.string.Result_quide_done_btn));
                        resultActivity = ResultActivity.this;
                        resources2 = ResultActivity.this.getApplicationContext().getResources();
                        i3 = R.string.Result_page3;
                        break;
                    default:
                        ResultActivity.this.invalidateOptionsMenu();
                        break;
                }
                resultActivity.setTitle(resources2.getString(i3));
                ResultActivity.this.invalidateOptionsMenu();
            }
        });
        setTitle(getApplicationContext().getResources().getString(R.string.Result_page1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Runtime.getRuntime().gc();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C2262h.f10073g == null || C2262h.f10074h == null) {
            finish();
        }
    }
}
