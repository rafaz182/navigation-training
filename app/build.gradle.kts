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
        versionCode = Project.versionCode
        versionName = Project.versionName
        applicationId = Project.applicationId
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
    implementation(Libraries.android_ktx)

    implementation(project(Modules.login))
    //testImplementation 'junit:junit:4.12'
    //androidTestImplementation 'androidx.test:runner:1.1.1'
    //androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
}
