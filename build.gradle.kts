// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(BuildPlugins.android_build_tools)
        classpath(BuildPlugins.kotlin_gradle_plugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

tasks.register("clear") {
    delete(buildDir)
}
