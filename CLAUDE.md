# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

- **Build the project**: `./gradlew build`
- **Run unit tests**: `./gradlew test`
- **Run instrumented tests**: `./gradlew connectedAndroidTest`
- **Clean build**: `./gradlew clean`
- **Assemble debug APK**: `./gradlew assembleDebug`
- **Assemble release APK**: `./gradlew assembleRelease`

## Architecture Overview

This is an Android application written in Kotlin that monitors and displays real-time cellular signal information using Jetpack Compose for the UI.

### Key Components:

- **MainActivity** (`app/src/main/java/br/com/renanalencar/signalmeter/MainActivity.kt:20`): Entry point that handles permissions (READ_PHONE_STATE, ACCESS_FINE_LOCATION) and initializes the SignalInfoViewModel
- **SignalInfoViewModel** (`app/src/main/java/br/com/renanalencar/signalmeter/ui/viewmodel/SignalInfoViewModel.kt:21`): Core business logic that registers TelephonyCallback to listen for signal strength changes and processes LTE cell information
- **SignalInfoScreen** (`app/src/main/java/br/com/renanalencar/signalmeter/ui/screen/SignalInfoScreen.kt:28`): Compose UI that displays signal metrics (Level, RSRP, RSRQ, RSSI) in a Card layout

### Signal Data Structure:
The app tracks four signal metrics via the `SignalInfo` data class (`SignalInfoViewModel.kt:14`):
- `level`: Overall signal strength level
- `rsrp`: Reference Signal Received Power (dBm)
- `rsrq`: Reference Signal Received Quality (dB) 
- `rssi`: Received Signal Strength Indicator (dBm)

### UI Architecture:
- Uses **Jetpack Compose** with Material 3 theming
- Follows **MVVM pattern** with ViewModels managing state
- **Edge-to-edge** UI with proper window insets handling
- Theme files in `ui/theme/` for colors, typography, and theming

### Dependencies Management:
- **Version catalog**: All dependency versions managed in `gradle/libs.versions.toml`
- **Target SDK**: 35 (Android 14+)
- **Min SDK**: 35 (requires latest Android version)
- **Java Version**: 11

### Testing:
- **Unit tests**: `app/src/test/java/br/com/renanalencar/signalmeter/ExampleUnitTest.kt`
- **Instrumented tests**: `app/src/androidTest/java/br/com/renanalencar/signalmeter/ExampleInstrumentedTest.kt`

## Development Notes

- App requires phone state and location permissions to access cellular signal information
- Only works with LTE networks (filters for `CellInfoLte` and registered cells)
- Uses `TelephonyManager` and `TelephonyCallback` for real-time signal monitoring
- Signal updates are logged for debugging purposes
- ProGuard rules are minimal (standard Android defaults in `app/proguard-rules.pro`)