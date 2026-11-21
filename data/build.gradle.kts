plugins {
    kotlin("jvm") version "2.4.0"
}

dependencies {
    implementation(project(":domain"))
    implementation(ktorLibs.client.core)
    implementation(ktorLibs.client.cio)
    implementation(libs.logback.classic)
}