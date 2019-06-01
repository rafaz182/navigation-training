// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(Project.android_build_tools)
        classpath(Project.kotlin_gradle_plugin)
        classpath(Project.navigation_safe_args)
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
