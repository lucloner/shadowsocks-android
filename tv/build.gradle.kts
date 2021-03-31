plugins {
    id("com.android.application")
    id("com.google.android.gms.oss-licenses-plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    kotlin("android")
    kotlin("kapt")
}

setupApp()
android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    compileSdkVersion = "android-S"
    buildToolsVersion = "30.0.2"
    ndkVersion = "20.1.5948944"
}

android.defaultConfig.applicationId = "com.github.shadowsocks.tv"

dependencies {
    implementation("androidx.leanback:leanback-preference:1.1.0-beta01")
}
