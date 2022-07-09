// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("com.vanniktech.maven.publish") version "0.20.0" apply true
}

buildscript {
    dependencies {
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.20.0")
    }
}

//tasks.register("clean", Delete::class) {
//    delete(rootProject.buildDir)
//}
