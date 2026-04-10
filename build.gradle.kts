plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.intellij.platform")
}

group = "com.github.novotnyr"
version = "1.0-SNAPSHOT"

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.intellij.platform.module")
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":css"))
    intellijPlatform {
        intellijIdea("2025.2")
    }
}
