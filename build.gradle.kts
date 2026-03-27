plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.intellij.platform")
}

dependencies {
    intellijPlatform {
        pluginModule(implementation(project(":shared")))
        pluginModule(implementation(project(":css")))
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Minimal Plugin Template"
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
    plugins.apply("org.jetbrains.kotlin.jvm")
    plugins.apply("org.jetbrains.intellij.platform.module")
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
