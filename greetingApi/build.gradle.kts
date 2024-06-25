plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("io.github.jeadyx.sonatype-uploader") version "1.0"
    id("org.jetbrains.dokka") version "1.9.20"
}
group = "io.github.jeady5"
version = "1.0"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
//    withJavadocJar()
    withSourcesJar()
}

apply{
    from("publish.gradle")
}