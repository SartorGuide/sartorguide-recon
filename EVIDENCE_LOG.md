# Evidence Log

## 2026-10-14 — Stage 1 environment
- REA v6.4.0 cloned at ~/rea (fork of morluto/rea), built with npm.
- REA rejected the audited jadx-headless-mcp 0.7.1 JAR: "Artifact path collision:
  META-INF/LICENSE.txt". The JAR's sha256 matches REA's pinned digest
  (6e5eacf5...). Root cause: shadow-JAR duplicate ZIP entries; REA's
  ZipArtifactReader treats duplicate names as fatal. Workaround: repacked JAR
  with duplicate entries dropped (jar -xf / jar -cf). REA accepts it;
  source_revision reported as null (unknown digest) but engine works.
- REA inspect-android-package on app-debug.apk: SUCCESS — manifest, permissions,
  component list extracted (see RECOVERY_INVENTORY.md).
- Android SDK installed at ~/Android/Sdk; KVM present (/dev/kvm, vmx x4).
- Fresh apktool + jadx CLI decompiles at ~/apk-rebuild/ (prior output had been wiped).

## Confidence levels
- Manifest/permissions/components: OBSERVED (REA, confidence: observed)
- Stub method bodies: OBSERVED — ALL 24 decompiled via REA (2026-10-14)
- JS↔native bridge contract: OBSERVED (prompt-key protocol + window.tg surfaces)

## 2026-10-14 — Stub de-stubbing complete (24/24)
REA `inspect-android-method` decompiled every method jadx CLI could not.
Output: `reference/stub-decompiles/*.md` (24 files, all verified non-error).
- C2262h (measurement engine): 10 methods — all OK (largest ~2.8MB)
- FragmentC2259e (Camera2): 5 — outer m10725A/m10803c/m10809d + AnonymousClass4.m10871a,
  AnonymousClass6.run (dot-form names required: `FragmentC2259e.AnonymousClassN`)
- zoomImageViewKotlin: 4 — m10988a/m11032a/onDraw + C2271b.onScale
- ResultActivity: AnonymousClass3.onClick
- AngleCalibrationActivity: C2211a.a2
- AsyncTaskC2258d: doInBackground overloads [0] and [1]
- C2263i.onDraw

Lessons for REA inner-class lookup:
- Named inner classes: `Outer.C2211a` (dot + obfuscated suffix)
- Anonymous inner classes: `Outer.AnonymousClass3` (matches jadx `Outer$3`)
- `inspect-android-class` lists inner classes but does NOT inline their method bodies;
  use `search_android_classes` / class inventory to discover the dot-form name, then
  `inspect-android-method` on it.

## 2026-10-14 — JS↔native bridge contract reverse-engineered
- **Native→JS (inbound):** WebStart calls `webView.loadUrl("javascript:window.tg.<surface>.<method>(...)")`.
  Surfaces: notifications.{notify,picker,updateToken,setUUID,socialsignin}, navigation.{locale,goBack},
  measurements.add, auth.qr, version. Two WebViews: f9407T (main), f9408U (secondary).
- **JS→native (outbound):** NO cordova.exec, NO addJavascriptInterface. The web app calls
  `prompt("gT2xsRbt8.#r", JSON.stringify({method:...}))`; WebStart's WebChromeClient.onJsPrompt
  intercepts PROMPT_KEY `"gT2xsRbt8.#r"` and dispatches on `method`.
  Commands observed in main.js: event(type:data|ga|pageview), external_url, startFilming,
  login(provider), get_token, get_measurements, read_qr, platformReady, get_info, quit.
  API_VERSION=4, API_VERSION_ENDPOINT=https://static... (see main.js X class).
- This is THE contract the reconstructed WebStart must implement for the app to be "full working."
