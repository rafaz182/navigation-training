plugins {
    id(BuildPlugins.android_application)
    id(BuildPlugins.kotlin_android)
    id(BuildPlugins.kotlin_android_extensions)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        applicationId = "com.example.navigation_training"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    /*buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }*/
}

dependencies {
    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation(Libraries.kotlin_stdlib_jdk8)
    implementation(Libraries.androidx_appcompat)
    implementation(Libraries.android_ktx)

    //testImplementation 'junit:junit:4.12'
    //androidTestImplementation 'androidx.test:runner:1.1.1'
    //androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
}
