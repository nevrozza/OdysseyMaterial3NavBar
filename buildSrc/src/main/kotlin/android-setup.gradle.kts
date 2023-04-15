plugins {
    id("com.android.library")
}

android {
//    namespace = "com.simplyIt.doneAppKmm"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }

    sourceSets {
        named("main") {
//            dependencies {
//                implementation("androidx.activity:activity-ktx:1.7.0")
//            }
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
        }
    }
}