# Known Limitations

## Backend / credentials required (NOT fabricatable)
- **Firebase**: google-services.json (project id, API keys) needed for Auth, Messaging,
  Analytics. Original app embeds these; reconstruction requires the owner's Firebase project.
- **Google Sign-In**: OAuth client id tied to the original signing cert + package.
- **Facebook Login/Share/Marketing**: Facebook App ID + key hash of the original cert.
- **AdMob**: original ad unit ids.
- **Backend API base URL**: referenced in web bundle (`API_VERSION_ENDPOINT` points to a
  static host). The app's data endpoints must be documented, not invented.

## Signing
- Original APK is a debug build (debuggable=true). Reconstruction signs with the local
  debug keystore; Google/Facebook OAuth that pins a cert fingerprint will not match.

## Deferred / pending verification
- Measurement algorithm numeric parity vs original (ported from decompiled C2262h;
  needs M4/M5 runtime comparison).
- Camera2 front-photo flow on emulator (emulator camera is virtual; angles are simulated).
