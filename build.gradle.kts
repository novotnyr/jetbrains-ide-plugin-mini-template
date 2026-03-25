plugins {
    kotlin("jvm") version "2.3.20"
    id("org.jetbrains.intellij.platform") version "2.14.0"
}

group = "com.github.novotnyr"
version = "1.0-SNAPSHOT"

subprojects {
    apply(plugin = "org.jetbrains.intellij.platform.module")
    apply(plugin = "org.jetbrains.kotlin.jvm")
}

allprojects {
    repositories {
        mavenCentral()
        intellijPlatform {
            defaultRepositories()
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":css"))
    testImplementation(kotlin("test"))
    intellijPlatform {
        intellijIdea("2025.2")
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Minimal Plugin Template"
        version = project.version.toString()
        description = "Minimal plugin template with barebones Gradle setup"
    }
}

