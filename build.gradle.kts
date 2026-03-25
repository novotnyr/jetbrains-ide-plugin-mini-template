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
            sinceBuild = "2024.1"
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
        intellijIdea("2024.1")
    }
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}