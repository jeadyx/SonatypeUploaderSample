plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("io.github.jeadyx.sonatype-uploader") version "2.0"
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "io.github.jeady5"
version = "1.0"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
apply{ from("publish.gradle") }
//val tokenUser: String by project
//val tokenUserPasswd: String by project
//sonatypeUploader {
//    tokenName = tokenUser
//    tokenPasswd = tokenUserPasswd
//    pom = Action<MavenPom>{
//        name = "My Library"
//        description = "A concise description of my library greennbg"
//        url = "http://www.example111.com/library"
//        licenses {
//            license {
//                name = "The Apache License, Version 2.0"
//                url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
//            }
//        }
//        developers {
//            developer {
//                id = "jeady"
//                name = "jeady"
//                email = "jeady@example.com"
//            }
//        }
//        scm {
//            connection = "scm:git:git://example.com/my-library.git"
//            developerConnection = "scm:git:ssh://example.com/my-library.git"
//            url = "http://example.com/my-library/"
//        }
//    }
//}