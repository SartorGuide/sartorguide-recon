package guide.tailor;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class C2260f implements InputFilter {
    private int f9792a = 3;
    private int f9793b = 1;
    private Pattern f9794c = Pattern.compile("-?[0-9]{0," + this.f9792a + "}+((\\.[0-9]{0," + this.f9793b + "})?)||(\\.)?");

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.toString().contains(".") && spanned.length() == 0 && (charSequence.toString().length() <= 1 || charSequence.toString().startsWith("."))) {
            return "";
        }
        if (this.f9794c.matcher(spanned.subSequence(0, i3).toString() + charSequence.subSequence(i, i2).toString() + spanned.subSequence(i4, spanned.length()).toString()).matches()) {
            return null;
        }
        return TextUtils.isEmpty(charSequence) ? spanned.subSequence(i3, i4) : "";
    }
}
