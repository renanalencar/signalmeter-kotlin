# SignalMeter Android App - Codebase Guide

## Project Overview

SignalMeter is an Android application written in Kotlin that monitors and displays real-time cellular signal information. The app uses modern Android development practices with Jetpack Compose for UI and follows the MVVM architectural pattern.

**Key Features:**
- Real-time LTE signal strength monitoring
- Display of cellular signal metrics (Level, RSRP, RSRQ, RSSI)
- Modern Material 3 UI with edge-to-edge design
- Permission handling for phone state and location access

## Project Structure

```
signalmeter-kotlin/
├── app/
│   ├── build.gradle.kts                    # App-level build configuration
│   ├── proguard-rules.pro                  # ProGuard configuration
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml         # App manifest with permissions
│       │   ├── java/br/com/renanalencar/signalmeter/
│       │   │   ├── MainActivity.kt         # Main activity and entry point
│       │   │   └── ui/
│       │   │       ├── screen/
│       │   │       │   └── SignalInfoScreen.kt    # Main UI screen
│       │   │       ├── theme/
│       │   │       │   ├── Color.kt        # Material 3 color definitions
│       │   │       │   ├── Theme.kt        # App theme configuration
│       │   │       │   └── Type.kt         # Typography definitions
│       │   │       └── viewmodel/
│       │   │           └── SignalInfoViewModel.kt  # Business logic & state
│       │   └── res/                        # Android resources
│       ├── test/                           # Unit tests
│       └── androidTest/                    # Instrumented tests
├── gradle/
│   └── libs.versions.toml                  # Version catalog for dependencies
├── build.gradle.kts                        # Project-level build configuration
├── settings.gradle.kts                     # Project settings
└── CLAUDE.md                               # Development instructions
```

## Architecture & Key Components

### 1. MainActivity (`MainActivity.kt:20`)
**Purpose:** Main entry point and permission handler
- Extends `ComponentActivity` for Compose integration
- Handles runtime permissions (`READ_PHONE_STATE`, `ACCESS_FINE_LOCATION`)
- Initializes `SignalInfoViewModel` using `by viewModels()`
- Sets up edge-to-edge UI with proper theme

**Key Responsibilities:**
- Permission request flow using `ActivityResultContracts.RequestMultiplePermissions()`
- ViewModel initialization and permission-based startup logic
- Compose UI setup with `SignalMeterTheme`

### 2. SignalInfoViewModel (`SignalInfoViewModel.kt:21`)
**Purpose:** Core business logic for signal monitoring
- Extends `AndroidViewModel` for application context access
- Uses `TelephonyManager` and `TelephonyCallback` for signal monitoring
- Maintains signal state using Compose's `mutableStateOf`

**Key Features:**
- **Data Model:** `SignalInfo` data class with nullable signal metrics
- **Signal Monitoring:** Registers `TelephonyCallback.SignalStrengthsListener`
- **LTE Focus:** Filters for `CellInfoLte` and registered cells only
- **State Management:** Updates signal info reactively with logging

**Signal Metrics Tracked:**
- `level`: Overall signal strength level (0-4)
- `rsrp`: Reference Signal Received Power (dBm)
- `rsrq`: Reference Signal Received Quality (dB)
- `rssi`: Received Signal Strength Indicator (dBm)

### 3. SignalInfoScreen (`SignalInfoScreen.kt:28`)
**Purpose:** Compose UI for displaying signal information
- Material 3 Card-based layout
- Responsive design with proper insets handling
- Real-time data display with fallback for unknown values

**UI Structure:**
- Centered Column with Card container
- Signal level as title, detailed metrics below
- Proper spacing and typography using Material 3 design system
- Edge-to-edge support with window insets padding

### 4. Theme System (`ui/theme/`)
**Components:**
- **Color.kt:** Material 3 color palette (Purple/Pink based)
- **Theme.kt:** Dynamic color support for Android 12+ with fallback schemes
- **Type.kt:** Typography definitions following Material 3 guidelines

**Features:**
- Dynamic theming support for Android 12+
- Dark/light theme variants
- System theme detection

## Build Configuration

### App-level (`app/build.gradle.kts`)
**Target Configuration:**
- **Namespace:** `br.com.renanalencar.signalmeter`
- **SDK Versions:** Min 35, Target 35, Compile 35 (Android 14+)
- **Java Version:** 11
- **Version:** 1.0 (versionCode: 1)

**Key Features:**
- Kotlin Compose plugin enabled
- ProGuard disabled for debug builds
- Standard Android test runner configuration

### Dependencies (`gradle/libs.versions.toml`)
**Core Dependencies:**
- **Kotlin:** 2.0.21
- **Android Gradle Plugin:** 8.10.1
- **Compose BOM:** 2024.09.00
- **Core KTX:** 1.16.0
- **Activity Compose:** 1.10.1
- **Lifecycle Runtime:** 2.9.1

**Testing:**
- JUnit 4.13.2 for unit tests
- AndroidX Test (JUnit, Espresso) for instrumented tests
- Compose UI testing support

## Permissions & Manifest

### Required Permissions (`AndroidManifest.xml`)
```xml
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```

**Activity Configuration:**
- Portrait orientation locked
- Exported main activity with launcher intent
- Material theme applied

## Data Flow

1. **App Launch:** MainActivity checks permissions
2. **Permission Grant:** ViewModel starts telephony listening
3. **Signal Detection:** TelephonyCallback receives signal strength updates
4. **LTE Processing:** App filters for LTE cells and extracts metrics
5. **State Update:** ViewModel updates mutable state with new signal data
6. **UI Recomposition:** Compose UI automatically updates based on state changes

## Testing Structure

### Unit Tests (`src/test/`)
- **ExampleUnitTest.kt:** Basic JUnit test template
- **Framework:** JUnit 4 with standard assertions

### Instrumented Tests (`src/androidTest/`)
- **ExampleInstrumentedTest.kt:** Android context validation
- **Framework:** AndroidX Test with JUnit runner
- **Compose Testing:** UI testing support via Compose BOM

## Development Guidelines

### Code Patterns
- **MVVM Architecture:** Clean separation between UI and business logic
- **Compose State:** Reactive UI updates using `mutableStateOf`
- **Permission Handling:** Modern `ActivityResultContracts` API
- **Resource Management:** Proper lifecycle-aware telephony callback registration

### Signal Processing Logic
- **LTE Only:** App specifically targets LTE networks (`CellInfoLte`)
- **Registered Cells:** Only processes actively registered cells
- **Null Safety:** All signal values are nullable with proper fallback handling
- **Logging:** Comprehensive signal state logging for debugging

### UI Guidelines
- **Material 3:** Consistent use of Material 3 design system
- **Edge-to-Edge:** Proper window insets handling for modern Android
- **Responsive Design:** Scrollable content with proper spacing
- **Accessibility:** Standard Material components for accessibility support

## Build Commands

- **Build:** `./gradlew build`
- **Unit Tests:** `./gradlew test`
- **Instrumented Tests:** `./gradlew connectedAndroidTest`
- **Debug APK:** `./gradlew assembleDebug`
- **Clean:** `./gradlew clean`

## Notes & Limitations

- **Android Version:** Requires Android 14+ (API 35)
- **Network Support:** LTE networks only
- **Permissions:** Critical dependency on phone state and location permissions
- **Real-time Updates:** Signal updates depend on system telephony callbacks
- **Debug Logging:** Extensive logging for development and debugging purposes