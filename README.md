<p align="center">
    <img src="https://img.icons8.com/?size=512&id=55494&format=png" align="center" width="30%">
</p>
<p align="center"><h1 align="center">SIGNALMETER-KOTLIN</h1></p>
<p align="center">
    <em>Empowering signals, amplifying connectivity, unlocking insights.</em>
</p>
<p align="center">
    <img src="https://img.shields.io/github/license/renanalencar/signalmeter-kotlin?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
    <img src="https://img.shields.io/github/last-commit/renanalencar/signalmeter-kotlin?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
    <img src="https://img.shields.io/github/languages/top/renanalencar/signalmeter-kotlin?style=default&color=0080ff" alt="repo-top-language">
    <img src="https://img.shields.io/github/languages/count/renanalencar/signalmeter-kotlin?style=default&color=0080ff" alt="repo-language-count">
</p>
<p align="center"><!-- default option, no dependency badges. -->
</p>
<p align="center">
    <!-- default option, no dependency badges. -->
</p>
<br>

##  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Project Structure](#-project-structure)
  - [ Project Index](#-project-index)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Testing](#-testing)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

SignalMeter-Kotlin is a powerful open-source project that simplifies monitoring and displaying real-time signal metrics on Android devices. It streamlines signal information updates, enhances user experience with a modern UI using Jetpack Compose, and ensures optimal performance. Ideal for developers seeking efficient signal tracking and visualization in their Android applications.

---

##  Features

|      | Feature         | Summary       |
| :--- | :---:           | :---          |
| ⚙️  | **Architecture**  | <ul><li>Utilizes **Kotlin** as the primary language for development.</li><li>Follows a modular architecture to promote code reusability and maintainability.</li><li>Centralizes repository management in **settings.gradle.kts** for consistent plugin and dependency resolution.</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Implements **ProGuard** rules in **app/proguard-rules.pro** for optimizing and securing the Android app.</li><li>Defines **typography styles** in **Type.kt** for consistent visual design.</li><li>Includes **unit tests** in **ExampleUnitTest.kt** to ensure code correctness.</li></ul> |
| 📄 | **Documentation** | <ul><li>Primary language is **Kotlin** with detailed language counts in various file types.</li><li>Manages project dependencies versions efficiently using **gradle/libs.versions.toml**.</li><li>Provides **usage commands** for building and running the project using **gradle**.</li></ul> |
| 🔌 | **Integrations**  | <ul><li>Uses **Gradle** as the build tool for managing project dependencies and tasks.</li><li>Integrates **Jetpack Compose** features for modern Android UI development.</li><li>Includes **Android-specific configurations** in **app/build.gradle.kts** for setting up namespaces, SDK versions, and build types.</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Organizes code into separate modules for better maintainability and scalability.</li><li>Utilizes **ViewModel** architecture in **SignalInfoViewModel.kt** for managing real-time signal updates.</li><li>Defines **themes** and **colors** in separate files for easy theming and styling modifications.</li></ul> |
| 🧪 | **Testing**       | <ul><li>Includes **instrumented tests** in **ExampleInstrumentedTest.kt** to verify app context on Android devices.</li><li>Employs **unit tests** in **ExampleUnitTest.kt** to validate code functionality.</li><li>Utilizes **Gradle** for running tests with the command `gradle test`.</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Optimizes app performance and security using **ProGuard** rules in **app/proguard-rules.pro**.</li><li>Ensures efficient signal information updates in **SignalInfoViewModel.kt** for real-time monitoring.</li><li>Utilizes **Jetpack Compose** for smooth UI rendering and interactions.</li></ul> |
| 🛡️ | **Security**      | <ul><li>Defines project-specific **ProGuard** rules in **app/proguard-rules.pro** to enhance app security during the build process.</li><li>Handles permissions securely in **MainActivity.kt** for phone state and location access.</li><li>Ensures secure data handling in the app to protect user privacy.</li></ul> |

---

##  Project Structure

```sh
└── signalmeter-kotlin/
    ├── LICENSE
    ├── README.md
    ├── app
    │   ├── .gitignore
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   └── src
    ├── build.gradle.kts
    ├── gradle
    │   ├── libs.versions.toml
    │   └── wrapper
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle.kts
    └── signal.svg
```


###  Project Index
<details open>
    <summary><b><code>SIGNALMETER-KOTLIN/</code></b></summary>
    <details> <!-- __root__ Submodule -->
        <summary><b>__root__</b></summary>
        <blockquote>
            <table>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
                <td>- Facilitates Gradle execution by setting up JVM options, locating Java, and running Gradle tasks<br>- Resolves paths and initializes necessary variables for the Gradle wrapper<br>- Ensures proper Java configuration and classpath setup for seamless Gradle operations.</td>
            </tr>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/build.gradle.kts'>build.gradle.kts</a></b></td>
                <td>- Configures common build options for all sub-projects/modules by disabling the application, Android, and Compose plugins<br>- This file sets up shared configurations for the entire codebase architecture.</td>
            </tr>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/settings.gradle.kts'>settings.gradle.kts</a></b></td>
                <td>- Manages plugin and dependency repositories for the Signal Meter project, ensuring access to essential libraries and tools<br>- Sets up repository configurations to streamline plugin and dependency resolution processes<br>- Centralizes repository management to maintain consistency and reliability across the codebase architecture.</td>
            </tr>
            </table>
        </blockquote>
    </details>
    <details> <!-- gradle Submodule -->
        <summary><b>gradle</b></summary>
        <blockquote>
            <table>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/gradle/libs.versions.toml'>libs.versions.toml</a></b></td>
                <td>Manage project dependencies versions efficiently using the gradle/libs.versions.toml file.</td>
            </tr>
            </table>
        </blockquote>
    </details>
    <details> <!-- app Submodule -->
        <summary><b>app</b></summary>
        <blockquote>
            <table>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/build.gradle.kts'>build.gradle.kts</a></b></td>
                <td>- Configures Android application settings, dependencies, and build features<br>- Sets up namespaces, SDK versions, and build types<br>- Includes dependencies for core functionality, UI components, testing, and debugging<br>- Enables Kotlin and Jetpack Compose features for modern Android development.</td>
            </tr>
            <tr>
                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/proguard-rules.pro'>proguard-rules.pro</a></b></td>
                <td>- Defines project-specific ProGuard rules to optimize and secure the Android app during the build process<br>- Controls configuration files applied in the build.gradle<br>- Preserves line number information for debugging stack traces and hides the original source file name if needed<br>- Helps enhance app performance and security.</td>
            </tr>
            </table>
            <details>
                <summary><b>src</b></summary>
                <blockquote>
                    <details>
                        <summary><b>main</b></summary>
                        <blockquote>
                            <details>
                                <summary><b>java</b></summary>
                                <blockquote>
                                    <details>
                                        <summary><b>br</b></summary>
                                        <blockquote>
                                            <details>
                                                <summary><b>com</b></summary>
                                                <blockquote>
                                                    <details>
                                                        <summary><b>renanalencar</b></summary>
                                                        <blockquote>
                                                            <details>
                                                                <summary><b>signalmeter</b></summary>
                                                                <blockquote>
                                                                    <table>
                                                                    <tr>
                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/SignalInfoViewModel.kt'>SignalInfoViewModel.kt</a></b></td>
                                                                        <td>- Manages real-time signal information updates by listening to telephony signals and updating signal details accordingly<br>- Handles permissions, registers callbacks, and updates signal metrics like level, RSRP, RSRQ, and RSSI<br>- Logs previous and current signal values for monitoring.</td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/MainActivity.kt'>MainActivity.kt</a></b></td>
                                                                        <td>- Manages the main activity lifecycle and user permissions for the Signal Meter app<br>- Initializes the SignalInfoViewModel and sets up the UI to display signal information<br>- Handles permission requests for phone state and location access, ensuring proper functionality of the app.</td>
                                                                    </tr>
                                                                    </table>
                                                                    <details>
                                                                        <summary><b>ui</b></summary>
                                                                        <blockquote>
                                                                            <table>
                                                                            <tr>
                                                                                <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/ui/SignalInfoScreen.kt'>SignalInfoScreen.kt</a></b></td>
                                                                                <td>- Displays the Signal Information Screen using Jetpack Compose to present signal metrics like RSRP, RSRQ, and RSSI<br>- The screen layout is structured with a Card containing the signal details aligned in a Column<br>- The design ensures a user-friendly interface for viewing and understanding signal strength information.</td>
                                                                            </tr>
                                                                            </table>
                                                                            <details>
                                                                                <summary><b>theme</b></summary>
                                                                                <blockquote>
                                                                                    <table>
                                                                                    <tr>
                                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/ui/theme/Theme.kt'>Theme.kt</a></b></td>
                                                                                        <td>- Defines the theme for the SignalMeter app based on system settings and Android version<br>- Determines color scheme dynamically for Android 12+ and sets predefined colors for dark and light themes<br>- Composable function to apply MaterialTheme with specified color scheme and typography to the app UI.</td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/ui/theme/Type.kt'>Type.kt</a></b></td>
                                                                                        <td>Define typography styles for the Compose UI framework to establish consistent visual design across the application.</td>
                                                                                    </tr>
                                                                                    <tr>
                                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/main/java/br/com/renanalencar/signalmeter/ui/theme/Color.kt'>Color.kt</a></b></td>
                                                                                        <td>Define color constants for the app's theme to maintain consistency and provide easy access to predefined colors throughout the codebase.</td>
                                                                                    </tr>
                                                                                    </table>
                                                                                </blockquote>
                                                                            </details>
                                                                        </blockquote>
                                                                    </details>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                </blockquote>
                                            </details>
                                        </blockquote>
                                    </details>
                                </blockquote>
                            </details>
                        </blockquote>
                    </details>
                    <details>
                        <summary><b>androidTest</b></summary>
                        <blockquote>
                            <details>
                                <summary><b>java</b></summary>
                                <blockquote>
                                    <details>
                                        <summary><b>br</b></summary>
                                        <blockquote>
                                            <details>
                                                <summary><b>com</b></summary>
                                                <blockquote>
                                                    <details>
                                                        <summary><b>renanalencar</b></summary>
                                                        <blockquote>
                                                            <details>
                                                                <summary><b>signalmeter</b></summary>
                                                                <blockquote>
                                                                    <table>
                                                                    <tr>
                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/androidTest/java/br/com/renanalencar/signalmeter/ExampleInstrumentedTest.kt'>ExampleInstrumentedTest.kt</a></b></td>
                                                                        <td>- Verifies the app context on an Android device by running an instrumented test<br>- The test ensures that the correct package name is associated with the app under test<br>- This file is crucial for validating the app's context during testing on Android devices within the project architecture.</td>
                                                                    </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                </blockquote>
                                            </details>
                                        </blockquote>
                                    </details>
                                </blockquote>
                            </details>
                        </blockquote>
                    </details>
                    <details>
                        <summary><b>test</b></summary>
                        <blockquote>
                            <details>
                                <summary><b>java</b></summary>
                                <blockquote>
                                    <details>
                                        <summary><b>br</b></summary>
                                        <blockquote>
                                            <details>
                                                <summary><b>com</b></summary>
                                                <blockquote>
                                                    <details>
                                                        <summary><b>renanalencar</b></summary>
                                                        <blockquote>
                                                            <details>
                                                                <summary><b>signalmeter</b></summary>
                                                                <blockquote>
                                                                    <table>
                                                                    <tr>
                                                                        <td><b><a href='https://github.com/renanalencar/signalmeter-kotlin/blob/master/app/src/test/java/br/com/renanalencar/signalmeter/ExampleUnitTest.kt'>ExampleUnitTest.kt</a></b></td>
                                                                        <td>Verifies correctness of addition operation in a local unit test for the SignalMeter project.</td>
                                                                    </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                </blockquote>
                                            </details>
                                        </blockquote>
                                    </details>
                                </blockquote>
                            </details>
                        </blockquote>
                    </details>
                </blockquote>
            </details>
        </blockquote>
    </details>
</details>

---
##  Getting Started

###  Prerequisites

Before getting started with signalmeter-kotlin, ensure your runtime environment meets the following requirements:

- **Programming Language:** Kotlin
- **Package Manager:** Gradle


###  Installation

Install signalmeter-kotlin using one of the following methods:

**Build from source:**

1. Clone the signalmeter-kotlin repository:
```sh
❯ git clone https://github.com/renanalencar/signalmeter-kotlin
```

2. Navigate to the project directory:
```sh
❯ cd signalmeter-kotlin
```

3. Install the project dependencies:


**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle build
```




###  Usage
Run signalmeter-kotlin using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle run
```


###  Testing
Run the test suite using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle test
```


---
##  Project Roadmap

- [X] **`Task 1`**: <strike>Implement feature one.</strike>
- [ ] **`Task 2`**: Implement feature two.
- [ ] **`Task 3`**: Implement feature three.

---

##  Contributing

- **💬 [Join the Discussions](https://github.com/renanalencar/signalmeter-kotlin/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/renanalencar/signalmeter-kotlin/issues)**: Submit bugs found or log feature requests for the `signalmeter-kotlin` project.
- **💡 [Submit Pull Requests](https://github.com/renanalencar/signalmeter-kotlin/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/renanalencar/signalmeter-kotlin
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/renanalencar/signalmeter-kotlin/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=renanalencar/signalmeter-kotlin">
   </a>
</p>
</details>

---

##  License

This project is protected under the [SELECT-A-LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

---
