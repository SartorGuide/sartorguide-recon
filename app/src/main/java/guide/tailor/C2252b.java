package guide.tailor;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import guide.tailor.barcode.GraphicOverlay;

/* loaded from: classes4.dex */
class C2252b extends Tracker<Barcode> {
    private GraphicOverlay<C2251a> f9459a;
    private C2251a f9460b;

    C2252b(GraphicOverlay<C2251a> graphicOverlay, C2251a c2251a) {
        this.f9459a = graphicOverlay;
        this.f9460b = c2251a;
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onDone() {
        this.f9459a.m10678b(this.f9460b);
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onNewItem(int i, Barcode Barcode) {
        this.f9460b.m10661a(i);
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onMissing(Detector.Detections<Barcode> aVar) {
        this.f9459a.m10678b(this.f9460b);
    }

    @Override // com.google.android.gms.vision.Tracker
    public void onUpdate(Detector.Detections<Barcode> aVar, Barcode Barcode) {
        this.f9459a.m10677a(this.f9460b);
        this.f9460b.m10663a(Barcode);
    }
}
