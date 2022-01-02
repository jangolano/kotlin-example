package com.kotlin.example.cdk.stack

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.core.Duration
import software.amazon.awscdk.core.StackProps
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.core.Stack
import software.amazon.awscdk.services.lambda.Code

class Stack(scope: Construct, id: String, props: StackProps) : Stack(scope, id, props) {

    init {
       Function.Builder.create(this, "sample-handler")
            .handler("com.kotlin.example.cdk.lambda.LambdaHandler")
            .code(Code.fromAsset("../application/build/libs/application-all.jar"))
            .timeout(Duration.seconds(5))
            .memorySize(1024)
            .runtime(Runtime.JAVA_11).build()
    }
}