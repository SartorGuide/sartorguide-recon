# Recovery Inventory

## APK facts (REA inspect-android-package, 2026-10-14)
- package: guide.tailor, versionName 1.0, versionCode 1
- minSdk 21 / targetSdk 35, debuggable=true (debug build)
- 6,652 classes, 948 resources
- Permissions: CAMERA, INTERNET, ACCESS_NETWORK_STATE, WAKE_LOCK,
  HIGH_SAMPLING_RATE_SENSORS, BIND_GET_INSTALL_REFERRER_SERVICE, c2dm.RECEIVE
- Required feature: accelerometer. Camera + front camera (optional)

## App components (guide.tailor)
| Component | Type | Source status |
|---|---|---|
| WebStart | Activity (launcher) | recovered (jadx) |
| CaptureActivity | Activity | recovered |
| BarCodeCaptureActivity | Activity | recovered |
| ResultActivity | Activity | 1 stub method |
| AngleCalibrationActivity | Activity | 2 stub methods |
| VideoActivity | Activity | recovered |
| MyFirebaseMessagingService | Service | recovered |
| MyFirebaseInstanceIDService | Service | recovered |
| C2262h (image processing core) | class | 12 stub methods |
| FragmentC2259e (Camera2 fragment) | class | 5 stub methods |
| zoomImageViewKotlin | View | 4 stub methods |
| AsyncTaskC2258d | AsyncTask | 1 stub method |
| C2263i (overlay draw) | class | 1 stub method |

## Web layer
- `~/apk-rebuild/decompiled/assets/www` — Ionic 3 + Angular build output (to be inventoried)

## Third-party SDKs
- Cordova (plugins TBD from config.xml)
- Firebase: Auth, Messaging, InstanceID, Analytics/Measurement
- Facebook SDK (login + marketing)
- Google Sign-In, AdMob, GMS Vision (face deps declared)

## Stub method counts (jadx UnsupportedOperationException)
- C2262h: 12 (largest ~8,290 instructions — the measurement engine)
- FragmentC2259e: 5 (~4,900 max)
- zoomImageViewKotlin: 4 (~5,195 max)
- AngleCalibrationActivity: 2
- ResultActivity: 1 (404)
- AsyncTaskC2258d: 1 (1,354)
- C2263i: 1 (305)
- Total: 26
