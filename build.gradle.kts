import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "com.github.lisomartinez"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Versions  {
    const val kotlin = "1.7.21"
    const val mockk = "1.13.2"
    const val kotest = "5.5.4"
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.mockk:mockk:${Versions.mockk}")
    testImplementation("io.kotest:kotest-runner-junit5:${Versions.kotest}")
    testImplementation("io.kotest:kotest-assertions-core:${Versions.kotest}")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}