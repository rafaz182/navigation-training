plugins {
    id(BuildPlugins.android_library)
    id(BuildPlugins.kotlin_android)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
    }
}

dependencies {

    implementation(Libraries.constraint_layout)
    implementation(Libraries.kotlin_stdlib_jdk8)
}