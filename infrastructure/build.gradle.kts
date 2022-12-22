plugins {
    application
    id("kotlin-example.common-conventions")
}
application {
    // Define the main class for the application.
    mainClass.set("com.kotlin.example.cdk.stack.AppKt")
}
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    val cdkVersion = "1.184.0"
    implementation("software.amazon.awscdk:core:${cdkVersion}")
    implementation("software.amazon.awscdk:lambda:${cdkVersion}")
    implementation("software.amazon.awscdk:apigateway:${cdkVersion}")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}
