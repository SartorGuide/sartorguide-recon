package guide.tailor;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import guide.tailor.barcode.GraphicOverlay;

/* loaded from: classes4.dex */
class C2257c implements MultiProcessor.Factory<Barcode> {
    private GraphicOverlay<C2251a> f9504a;

    C2257c(GraphicOverlay<C2251a> graphicOverlay) {
        this.f9504a = graphicOverlay;
    }

    @Override // com.google.android.gms.vision.MultiProcessor.Factory
    public Tracker<Barcode> create(Barcode Barcode) {
        return new C2252b(this.f9504a, new C2251a(this.f9504a));
    }
}
