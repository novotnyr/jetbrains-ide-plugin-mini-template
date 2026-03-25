import org.jetbrains.intellij.platform.gradle.IntelliJPlatformType.IntellijIdea

plugins {
    kotlin("jvm") version "2.3.20"
    id("org.jetbrains.intellij.platform")
}

group = "com.github.novotnyr"
version = "1.0-SNAPSHOT"

dependencies {
    intellijPlatform {
        pluginModule(implementation(project(":shared")))
        pluginModule(implementation(project(":css")))
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Minimal Plugin Template"
        version = project.version.toString()
        description = "Minimal plugin template with barebones Gradle setup"
        ideaVersion {
            sinceBuild = "253"
        }
    }
    pluginVerification {
        ides {
            recommended()
        }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.intellij.platform.module")
}

allprojects {
    kotlin {
        jvmToolchain(21)
    }
    dependencies {
        intellijPlatform {
            intellijIdea("2025.3")
        }
    }
}

val runIde261 by intellijPlatformTesting.runIde.registering {
    type = IntellijIdea
    version = "2026.1"
}