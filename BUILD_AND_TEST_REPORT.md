# Build and Test Report

## Toolchain
- Gradle wrapper 8.9 (bootstrapped from cached dist `~/.gradle/wrapper/dists/gradle-8.9-bin`)
- Android Gradle Plugin 8.5.2, Kotlin 1.9.24
- compileSdk 34, minSdk 21, targetSdk 34, JDK 17 target (JDK 21 host)
- SDK at ~/Android/Sdk (platforms android-34, build-tools 34.0.0)

## Build log
### 2026-10-14 — M1 skeleton
Command: `./gradlew :app:assembleDebug`
Project: appcompat + androidx core, single WebStart placeholder activity.
Result: **BUILD SUCCESSFUL in 50s** — 34 actionable tasks executed, zero errors.
Artifact: `app/build/outputs/apk/debug/app-debug.apk` (3,270,292 bytes) + output-metadata.json.

### 2026-10-14 — M2 web bundle + WebStart bridge
Command: `./gradlew :app:assembleDebug`
Change: copied `assets/www` (7.8MB Ionic build) into `app/src/main/assets/`; replaced placeholder
WebStart with full 722-line port (dual-WebView host, `gT2xsRbt8.#r` prompt-key bridge,
`m10659a` dispatcher with all 10 commands, window.tg inbound injection, UUID bootstrap,
lifecycle + popup WebView handling). New layout `res/layout/activity_web_start.xml`.
Result: **BUILD SUCCESSFUL** — app-debug.apk now 8,891,114 bytes (web assets bundled).
Stubs (logged, not crashing): startFilming/read_qr via reflection, OAuth login, Firebase token init.

## Test log
(pending — emulator tests begin at M4)
