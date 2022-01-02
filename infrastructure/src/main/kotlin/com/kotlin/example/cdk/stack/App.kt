package com.kotlin.example.cdk.stack

import software.amazon.awscdk.core.App
import software.amazon.awscdk.core.Environment
import software.amazon.awscdk.core.StackProps

fun main() {
    val app = App()
    Stack(
        app, "sample-kotlin-stack",
        StackProps.builder()
            .env(
                Environment.builder()
                    .region("us-west-2").build()
            ).build()
    )
    app.synth()
}