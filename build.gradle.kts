plugins {
    kotlin("jvm") version "2.3.20"
    id("org.jetbrains.intellij.platform") version "2.13.1"
}

group = "com.github.novotnyr"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(21)
}

dependencies {
    intellijPlatform {
        intellijIdea("2024.1")
        pluginModule(implementation(project(":shared")))
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Minimal Plugin Template"
        version = project.version.toString()
        description = "Minimal plugin template with barebones Gradle setup"
        ideaVersion {
            sinceBuild = "2024.1"
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
    kotlin {
        jvmToolchain(21)
    }
    dependencies {
        intellijPlatform {
            intellijIdea("2024.1")
        }
    }
}

allprojects {
    repositories {
        mavenCentral()
        intellijPlatform {
            defaultRepositories()
        }
        maven("https://packages.jetbrains.team/maven/p/ij/intellij-dependencies/")
    }
}