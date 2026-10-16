# TailorGuide APK Reconstruction Plan

## Target
- APK: `/home/sartorFit/app-debug.apk` (sha256 `313a1848...` per REA)
- Package: `guide.tailor`, version 1.0 (code 1)
- minSdk 21, targetSdk 35
- Architecture: Ionic 3 + Cordova hybrid (web app in `assets/www`) + native Android layer
  (camera, calibration, measurement algorithm)

## Toolchain (Stage 1 — DONE)
- REA v6.4.0 at `~/rea` with JADX headless engine
  (`~/tools/jadx/jadx-headless-mcp-0.7.1-dedup.jar` — repacked from the audited
  0.7.1 JAR to remove duplicate ZIP entries that REA's strict reader rejected;
  contents byte-identical except ZIP metadata)
- apktool output: `~/apk-rebuild/decompiled`
- jadx CLI output: `~/apk-rebuild/java-source`
- Android SDK: `~/Android/Sdk` (platforms 30/34, build-tools 34, emulator, system image android-30 x86_64)
- KVM available → headless emulator viable

## Reconstruction approach
1. Web layer: copy `assets/www` (Ionic build output) into the Cordova WebView project as-is.
2. Native layer: recover the 25 classes under `guide.tailor` from jadx/REA.
3. The 26 jadx-stub methods (7 files): attempt REA `inspect-android-method` first;
   fall back to manual Smali translation (`~/apk-rebuild/decompiled/smali*/`).
4. Dependencies: Cordova plugins from `config.xml`/`package.json` in APK;
   legacy support libs (appcompat-v7 27.1.1 etc.) pinned to match the APK's build.
5. Backend: Firebase/Facebook/Google Sign-In — document required config,
   mark as needing owner's project credentials. No fabricated endpoints.

## Milestones
- [x] M1: Gradle project skeleton builds — BUILD SUCCESSFUL, app-debug.apk 3.27MB (2026-10-14)
- [x] M2: Web app loads in WebView — assets/www bundled (8.89MB APK), WebStart prompt-key bridge ported+compiling (2026-10-14)
- [x] M3: All stub methods de-stubbed and compiling — javac 0 errors, `:app:assembleDebug` BUILD SUCCESSFUL (2026-10-15)
- [ ] M4: Calibration → Capture → Result flow works on emulator
- [ ] M5: Full regression pass vs original APK

## Key architecture discoveries (2026-10-14)
- NO Cordova in APK. WebView bridge is fully custom.
- Inbound (native→JS): webView.loadUrl("javascript:window.tg.<surface>.<method>(...)")
- Outbound (JS→native): prompt("gT2xsRbt8.#r", JSON) intercepted by WebChromeClient.onJsPrompt
- androidx (not legacy support). GMS vision/ads/signin, Firebase auth/messaging/iid/analytics, Facebook login/share/marketing.
- Toolchain: gradle wrapper 8.9 (cached dist), AGP 8.5.2, kotlin 1.9.24, compileSdk 34, minSdk 21, JDK 17 target.

## Component map (from REA manifest inspection)
- `WebStart` (launcher, Cordova WebView host)
- `CaptureActivity` (Camera2 photo capture)
- `BarCodeCaptureActivity` (GMS Vision barcode)
- `ResultActivity` (measurement results)
- `AngleCalibrationActivity` (sensor calibration)
- `VideoActivity`
- `MyFirebaseMessagingService`, `MyFirebaseInstanceIDService`
