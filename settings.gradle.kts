import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "2.3.20"
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    id("org.jetbrains.intellij.platform.settings") version "2.14.0"
}

rootProject.name = "jetbrains-ide-plugin-mini-template"

include("shared")
include("css")

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS

    repositories {
        mavenCentral()

        intellijPlatform {
            defaultRepositories()
        }
    }
}