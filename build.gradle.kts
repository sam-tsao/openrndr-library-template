import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    id("maven-publish")
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}


publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "com.example"
            artifactId = "openrndr-library-template"
            version = "1.0.0-SNAPSHOT"

            from(components["java"])
        }
    }
}


dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("org.openrndr:openrndr:0.3.47")
    implementation("org.openrndr:openrndr-core:0.3.47")
    implementation("org.openrndr:openrndr-color:0.3.47")
    implementation("org.openrndr:openrndr-shape:0.3.47")
    implementation("org.openrndr:openrndr-math:0.3.47")
    implementation("org.openrndr:openrndr-gl3:0.3.47")
}

tasks.test{
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
