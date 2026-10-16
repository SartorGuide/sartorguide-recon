package guide.tailor;

import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class C2261g {
    static ArrayList<C2266l> f9795a;
    public static boolean f9796b;
    public static boolean f9797c;
    private static C2261g f9798d;

    private C2261g() {
        System.out.println("Event class instance created");
        f9795a = new ArrayList<>();
    }

    public static C2261g m10874a() {
        if (f9798d == null) {
            f9798d = new C2261g();
        }
        return f9798d;
    }

    private String m10875d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("cid")) {
                jSONObject.put("cid", WebStart.f9402w);
                return jSONObject.toString();
            }
            if (!jSONObject.get("cid").equals("")) {
                return str;
            }
            jSONObject.remove("cid");
            jSONObject.put("cid", WebStart.f9402w);
            return jSONObject.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            return str;
        }
    }

    void m10876a(String str) {
        f9795a.add(new C2266l(2, m10875d(str)));
    }

    void m10877b() {
        if (f9797c) {
            return;
        }
        f9797c = true;
        f9796b = false;
        new AsyncTaskC2265k().execute(new Void[0]);
    }

    void m10878b(String str) {
        f9795a.add(new C2266l(1, m10875d(str)));
    }

    void m10879c(String str) {
        f9795a.add(new C2266l(0, m10875d(str)));
    }
}
