object BuildPlugins {
    object Version {
        val android_buid_tools =  "3.4.0"
        val kotlin_gradle_plugin = "1.3.30"
    }

    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin_gradle_plugin}"
    val android_build_tools = "com.android.tools.build:gradle:${Version.android_buid_tools}"

    val android_application = "com.android.application"
    val kotlin_android = "kotlin-android"
    val kotlin_android_extensions = "kotlin-android-extensions"
}

object AndroidSdk {

    val compile = 28
    val min = 19
    val target = 28
}

object Libraries {
    object Version {
        val kotlin_stdlib_jdk8 = "1.3.30"
        val androidx_appcompat = "1.0.2"
        val android_ktx = "1.0.1"
    }

    val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin_stdlib_jdk8}"
    val androidx_appcompat = "androidx.appcompat:appcompat:${Version.androidx_appcompat}"
    val android_ktx = "androidx.core:core-ktx:${Version.android_ktx}"
}
