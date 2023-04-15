pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "material3BottomBar"
include(":androidApp")
include(":common:umbrella-compose")
include(":common:utils")
include(":common:main:compose")
