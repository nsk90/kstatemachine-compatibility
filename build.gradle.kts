import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"// 1.7.0 ok 1.4.0 ok, 1.6.0 ok
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //implementation(fileTree("libs") { include("*.jar") })
    testImplementation(kotlin("test"))
    implementation("io.github.nsk90:kstatemachine:0.15.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}