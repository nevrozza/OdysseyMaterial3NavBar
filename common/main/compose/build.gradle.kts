plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}
dependencies {
    implementation("androidx.compose.ui:ui:1.4.1")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common:utils"))

                implementation(Dependencies.Other.ViewModel.core)
                implementation(Dependencies.Other.ViewModel.compose)
                implementation(Dependencies.Other.ViewModel.odyssey)

                implementation(Dependencies.Other.Navigation.core)
                implementation(Dependencies.Other.Navigation.compose)
            }
        }
    }
}