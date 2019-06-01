plugins {
    id(BuildPlugins.android_library)
    id(BuildPlugins.kotlin_android)
    id(BuildPlugins.navigation_safe_args)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
    }
}

dependencies {
    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation(Libraries.kotlin_stdlib_jdk8)
    implementation(Libraries.android_ktx)

    // UI
    implementation(Libraries.appcompat)
    implementation(Libraries.constraint_layout)
    implementation(Libraries.material)

    //testImplementation 'junit:junit:4.12'
    //androidTestImplementation 'androidx.test:runner:1.1.1'
    //androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
}