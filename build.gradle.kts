plugins {
    id("org.jetbrains.intellij.platform")
}

group = "com.github.novotnyr"
version = "1.0-SNAPSHOT"

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

dependencies {
    intellijPlatform {
        pluginModule(implementation(project(":shared")))
        pluginModule(implementation(project(":css")))
        intellijIdea("2025.3")
    }
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}