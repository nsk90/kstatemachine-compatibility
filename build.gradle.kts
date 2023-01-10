import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"// 1.7.0 ok 1.5.0 fail
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {

    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    //implementation(fileTree("libs") { include("*.jar") })
    testImplementation(kotlin("test"))
    //implementation("io.github.nsk90:kstatemachine:0.17.0")
    implementation("com.github.nsk90:kstatemachine:jitpack2-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

// JavaVersion.VERSION_11 ok with kotlin 1.6 1.7
// JavaVersion.VERSION_1_8 ok with kotlin 1.6 1.7 - fixed