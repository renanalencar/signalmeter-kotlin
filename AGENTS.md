# AGENTS.md

## Build/Test Commands
- Build: `./gradlew build`
- Run tests: `./gradlew test`
- Run single test: `./gradlew test --tests "ClassName.methodName"`
- Android instrumented tests: `./gradlew connectedAndroidTest`
- Lint: `./gradlew lint`
- Clean: `./gradlew clean`

## Code Style Guidelines
- Package structure: `br.com.renanalencar.signalmeter.ui.{screen|theme|viewmodel}`
- Use data classes for simple data containers
- ViewModels extend AndroidViewModel for Android-specific dependencies
- Use mutableStateOf for Compose state management
- Named parameters for multi-parameter functions
- Trailing commas in multiline parameter lists
- No explicit return types for simple functions
- Use explicit types for public API and complex expressions
- Use `val` over `var` when possible
- Android permissions checked before telephony operations

## Dependencies
- Jetpack Compose with Material3
- AndroidX libraries via version catalog (libs.versions.toml)
- Target SDK: 35, Min SDK: 35, Kotlin: 2.0.21