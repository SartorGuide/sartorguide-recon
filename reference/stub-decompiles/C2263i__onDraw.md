## evidence_id

ev_5747b19439510b345eb07bb09868dd272a54d149b961f9ee5d1025457821136a

## subject.name

app-debug.apk

## subject.digest

| Key    | Value                                                            |
|--------|------------------------------------------------------------------|
| sha256 | 313a1848ae39f00cbea6be2679f274af566885a9f3e7bc65e3aebde2867d09bb |

## subject.format

apk

## subject.architecture

null

## subject.local_path

/home/sartorFit/app-debug.apk

## provider

| Key     | Value         |
|---------|---------------|
| id      | jadx          |
| name    | JADX headless |
| version | 0.7.1         |

## analysis_profile

null

## predicate_type

rea.analysis

## operation

inspect_android_method

## parameters

| Key         | Value                         |
|-------------|-------------------------------|
| path        | /home/sartorFit/app-debug.apk |
| class_name  | guide.tailor.C2263i           |
| method_name | onDraw                        |

## raw_result.server

| Key     | Value           |
|---------|-----------------|
| name    | rea-jadx-bridge |
| version | 1               |

## raw_result.bridge_sha256

5a5a4e32264fbe597a329d7ad4b06a6266b7b31243e86b0263dbddcecaf351a1

## raw_result.jar_sha256

cefe693bb71b87338b309ec8b7ed474752f38bc109d825f947ea42c139abd10e

## raw_result.loaded

| Key            | Value                              |
|----------------|------------------------------------|
| state          | LOADED                             |
| apk_path       | /tmp/rea-android-9Yy3T0/target.apk |
| class_count    | 6652                               |
| resource_count | 948                                |
| threads        | 1                                  |
| resources      | full                               |

## raw_result.calls

| operation         | input           | response        |
|-------------------|-----------------|-----------------|
| rea_jvm_status    | [object Object] | [object Object] |
| load_apk          | [object Object] | [object Object] |
| get_class_summary | [object Object] | [object Object] |
| get_method_body   | [object Object] | [object Object] |

## normalized_result.engine

| Key             | Value                                                            |
|-----------------|------------------------------------------------------------------|
| name            | jadx-headless-mcp                                                |
| version         | 0.7.1                                                            |
| artifact_sha256 | cefe693bb71b87338b309ec8b7ed474752f38bc109d825f947ea42c139abd10e |
| source_revision | null                                                             |
| worker_count    | 1                                                                |
| heap_limit_mib  | 1986                                                             |

## normalized_result.class_name

guide.tailor.C2263i

## normalized_result.method

| Key                | Value                                 |
|--------------------|---------------------------------------|
| name               | onDraw                                |
| reported_signature | onDraw(android.graphics.Canvas): void |
| overload_index     | 0                                     |
| is_constructor     | false                                 |
| dex_descriptor     | null                                  |

## normalized_result.overload_count

1

## normalized_result.representation

java

## normalized_result.body_status

available

## normalized_result.fell_back

false

## normalized_result.markers



## normalized_result.source

| Key                  | Value                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| status               | complete                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| text                 |     /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas a0) {
        Paint a1;
        String s0;
        String s1;
        float f0;
        int i2;
        if (this.f10127w != 0) {
            super.onDraw(a0);
            int i0 = this.f10111g;
            if (i0 == 0) {
                int i1 = this.f10112h;
                if (i1 == 0) {
                    if (this.f10114j) {
                        Paint a2 = this.f10097A;
                        a2.setStrokeWidth(4.0f);
                        this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                        this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    }
                } else {
                    this.f10097A.setStrokeWidth(10.0f);
                    this.f10097A.setStyle(Paint.Style.STROKE);
                    if (this.f10114j) {
                        a1 = this.f10097A;
                        s0 = "#950404";
                    } else {
                        a1 = this.f10097A;
                        s0 = "#022A44";
                    }
                    a1.setColor(Color.parseColor(s0));
                    a0.drawArc(this.f10111g, this.f10110f, this.f10112h, this.f10109e, 0.0f, 360.0f, true, this.f10097A);
                    if (this.f10114j) {
                        Paint a3 = this.f10097A;
                        a3.setStrokeWidth(4.0f);
                        this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                        this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    }
                }
            } else {
                this.f10097A.setStrokeWidth(10.0f);
                this.f10097A.setStyle(Paint.Style.STROKE);
                if (this.f10114j) {
                    a1 = this.f10097A;
                    s0 = "#950404";
                } else {
                    a1 = this.f10097A;
                    s0 = "#022A44";
                }
                a1.setColor(Color.parseColor(s0));
                a0.drawArc(this.f10111g, this.f10110f, this.f10112h, this.f10109e, 0.0f, 360.0f, true, this.f10097A);
                if (this.f10114j) {
                    Paint a4 = this.f10097A;
                    a4.setStrokeWidth(4.0f);
                    this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, Color.parseColor("#73798c"));
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                }
            }
            if (this.f10100D < 0.0d) {
                int i3 = ((int) (this.f10100D * (-1.0d))) - 1;
                this.f10097A.setTextSize(300.0f);
                this.f10097A.setStrokeWidth(20.0f);
                this.f10097A.setTextAlign(Paint.Align.CENTER);
                this.f10097A.setStyle(Paint.Style.STROKE);
                this.f10097A.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f10097A.setShadowLayer(1.0f, 1.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
                if (this.f10114j) {
                    a0.drawText(String.valueOf(i3), this.f10128x / 2, (this.f10127w / 2) + 150, this.f10097A);
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.f10097A.setStrokeWidth(0.0f);
                    this.f10097A.setColor(-1);
                    s1 = String.valueOf(i3);
                    f0 = this.f10128x / 2;
                    i2 = (this.f10127w / 2) + 150;
                } else {
                    a0.drawText(String.valueOf(i3), (this.f10128x * 4) / 5, ((int) (((double) this.f10127w) * 0.9d)) + 33, this.f10097A);
                    this.f10097A.setStyle(Paint.Style.FILL_AND_STROKE);
                    this.f10097A.setStrokeWidth(0.0f);
                    this.f10097A.setColor(-1);
                    s1 = String.valueOf(i3);
                    f0 = (this.f10128x * 4) / 5;
                    i2 = ((int) (((double) this.f10127w) * 0.9d)) + 33;
                }
                a0.drawText(s1, f0, i2, this.f10097A);
            }
        }
    } |
| reported_total_bytes | null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |

## confidence

derived

## authority

shipped-artifact

## environment

null

## limitations

Static decompiler observations do not establish runtime behavior; the APK is never executed.,Method signatures use provider display types; exact DEX descriptors and instruction offsets are unavailable. Overload indices are local to this engine and artifact.,Class inventories use parsed metadata before code generation, including synthetic members that may be omitted from decompiled source. Source positions remain unknown.,Manifest summary fields are extracted by the upstream engine; decoded XML is retained for verification. APK signatures, split APKs, native libraries and Android runtime capture are not verified by this provider.

## locations



## evidence_links

