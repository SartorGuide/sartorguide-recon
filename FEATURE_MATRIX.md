# Feature Matrix

Status legend: ✅ reconstructed+tested · 🔶 implemented, untested · ⏳ pending · ❌ blocked/limited

| # | Original feature | Evidence | Status | Notes |
|---|---|---|---|---|
| 1 | App launch (WebStart) | manifest + WebStart.java | 🔶 | full 722-line port compiling |
| 2 | WebView host (dual WebView) | WebStart f9407T/f9408U | 🔶 | ported: main + popup onCreateWindow/onCloseWindow |
| 3 | JS→native bridge (prompt-key) | main.js + WebStart.onJsPrompt | 🔶 | all 10 commands wired; 4 need M3 native classes |
| 4 | Login (Firebase/Google/Facebook) | main.js login(provider) cmd | ⏳ | needs credentials |
| 5 | Angle calibration (sensors) | AngleCalibrationActivity | ⏳ | 2 stubs decompiled |
| 6 | Camera2 capture (front photo) | FragmentC2259e, CaptureActivity | ⏳ | 5 stubs decompiled |
| 7 | Body measurement algorithm | C2262h (10 methods) | ⏳ | all 10 decompiled — port pending |
| 8 | Barcode / QR scan | BarCodeCaptureActivity + read_qr cmd | ⏳ | GMS Vision |
| 9 | Result display (zoom image) | ResultActivity, zoomImageViewKotlin | ⏳ | 4 stubs decompiled |
| 10 | Video filming | VideoActivity + startFilming cmd | ⏳ | recovered |
| 11 | Push notifications | MyFirebaseMessagingService | ⏳ | needs Firebase config |
| 12 | AdMob ads | GMS ads pkg | ⏳ | needs ad unit id |
