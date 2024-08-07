//import io.github.jeadyx.UploaderSigning

plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
//    `maven-publish`
//    signing
    id("org.jetbrains.dokka") version "1.9.20"
    id("io.github.jeadyx.sonatype-uploader") version "2.8"
}

group = "io.github.jeady5"
version = "1.7"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

//apply{ from("publish.gradle") }
val tokenUser: String by project
val tokenUserPasswd: String by project
sonatypeUploader {
//    repositoryPath = project.layout.buildDirectory.dir("repo").get().asFile.path
//    repositoryPath = project.layout.projectDirectory.dir("repo").asFile.path
//    repositoryPath = "E:\\repo"
    tokenName = tokenUser
    tokenPasswd = tokenUserPasswd
//    signing = Action<UploaderSigning> {
//        keyId="F56168C8"
//        keyPasswd=""
//        secretKeyPath="E:\\wjd\\gpg\\jeady_0xF56168C8_SECRET.gpg"
//    }
    pom = Action<MavenPom>{
        name = "My Library"
        description = "A concise description of my library greennbg"
        url = "http://www.example.com/library"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "jeady"
                name = "jeady"
                email = "jeady@example.com"
            }
        }
        scm {
            connection = "scm:git:git://example.com/my-library.git"
            developerConnection = "scm:git:ssh://example.com/my-library.git"
            url = "http://example.com/my-library/"
        }

        scm {
            connection = "scm:git:git://example.com/my-library.git"
            developerConnection = "scm:git:ssh://example.com/my-library.git"
            url = "http://example.com/my-library/"
        }
//        withXml {
//            val dependenciesNode = asNode().appendNode("dependencies")
//            val dependencyNode = dependenciesNode.appendNode("dependency")
//            dependencyNode.appendNode("groupId", "com.test.groupId")
//            dependencyNode.appendNode("artifactId", "artifactId")
//            dependencyNode.appendNode("version", "1.0")
//        }
    }
}