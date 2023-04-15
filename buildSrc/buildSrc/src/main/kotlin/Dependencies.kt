object Dependencies {

    object Kotlin {
        private const val version = "1.8.0"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        object Coroutines {
            private const val version = "1.6.4"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }
    }

    object Compose {
        const val version = "1.4.0"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$version"
//        const val icons = "org.jetbrains.compose.material:material-icons-extended-desktop:$version"
    }

    object Android {
        private const val version = "7.2.2"
        const val gradlePlugin = "com.android.tools.build:gradle:$version"
        const val composeActivity = "androidx.activity:activity-compose:1.6.1"

        object Compose {
            private const val version = "1.4.0"
            const val ui = "androidx.compose.ui:ui:$version"
            const val material3 = "androidx.compose.material3:material3:1.0.1"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val icons  = "androidx.compose.material:material-icons-core:$version"
            const val iconsExtended  = "androidx.compose.material:material-icons-extended:$version"
        }
    }

    object Other {
        object ViewModel {
            private const val version = "0.14"
            const val core = "com.adeo:kviewmodel:$version"
            const val compose = "com.adeo:kviewmodel-compose:$version"
            const val odyssey = "com.adeo:kviewmodel-odyssey:$version"
        }

        object Navigation {
            private const val version = "1.3.1"
            const val core = "io.github.alexgladkov:odyssey-core:$version"
            const val compose = "io.github.alexgladkov:odyssey-compose:$version"
        }
    }
}