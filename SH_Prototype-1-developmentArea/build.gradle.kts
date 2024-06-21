buildscript {
    repositories {
        google() // Add Google's Maven repository
        mavenCentral() // Add Maven Central repository
        maven(url = "https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2") // Update to the latest version if needed
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22") // Update to the latest version if needed
        classpath("com.google.gms:google-services:4.4.1")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
}
