import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform

plugins {
    kotlin("jvm")
    id("org.jetbrains.intellij.platform.module")
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    testImplementation(kotlin("test"))
    intellijPlatform {
        intellijIdea("2024.1")
    }
}

intellijPlatform {
    buildSearchableOptions = false
}