## evidence_id

ev_52a101ad9075d0742c2a1582f487654117f3c05d9a74e48be46212e459d378a1

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

| Key         | Value                                       |
|-------------|---------------------------------------------|
| path        | /home/sartorFit/app-debug.apk               |
| class_name  | guide.tailor.ResultActivity.AnonymousClass3 |
| method_name | onClick                                     |

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
| apk_path       | /tmp/rea-android-whTFkd/target.apk |
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

guide.tailor.ResultActivity.AnonymousClass3

## normalized_result.method

| Key                | Value                            |
|--------------------|----------------------------------|
| name               | onClick                          |
| reported_signature | onClick(android.view.View): void |
| overload_index     | 0                                |
| is_constructor     | false                            |
| dex_descriptor     | null                             |

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

| Key                  | Value                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| status               | complete                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| text                 |     @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
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
            } |
| reported_total_bytes | null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |

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
