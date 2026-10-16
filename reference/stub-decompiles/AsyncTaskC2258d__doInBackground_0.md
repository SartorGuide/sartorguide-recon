## evidence_id

ev_4a302bed043c412c4248a646cddc0d6c32c4d8c7142dc771faf618f9f95c39a2

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

| Key            | Value                         |
|----------------|-------------------------------|
| path           | /home/sartorFit/app-debug.apk |
| class_name     | guide.tailor.AsyncTaskC2258d  |
| method_name    | doInBackground                |
| overload_index | 0                             |

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
| apk_path       | /tmp/rea-android-AWlzZD/target.apk |
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

guide.tailor.AsyncTaskC2258d

## normalized_result.method

| Key                | Value                                                 |
|--------------------|-------------------------------------------------------|
| name               | doInBackground                                        |
| reported_signature | doInBackground(java.lang.Object[]): java.lang.Boolean |
| overload_index     | 0                                                     |
| is_constructor     | false                                                 |
| dex_descriptor     | null                                                  |

## normalized_result.overload_count

2

## normalized_result.representation

java

## normalized_result.body_status

not_available

## normalized_result.fell_back

false

## normalized_result.markers



## normalized_result.source

| Key                  | Value                                                         |
|----------------------|---------------------------------------------------------------|
| status               | complete                                                      |
| text                 | // method exists but has no decompiled body (native/abstract) |
| reported_total_bytes | null                                                          |

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

