## Sample Kotlin Lambda using the AWS CDK
This is a simple lambda function that makes use
of the AWS CDK to deploy.  This is an example project that can be built upon.


### Directory Structure
```shell
├── application           # Directory which holds the application code
├── buildSrc              # The common gradle conventions for the project
├── gradle                # Gradle Wrapper
└── infrastructure        # Infrastructure Code
```

### Building the Lambda
```shell
./gradlew shadowJar
```

### Deploying the Lambda
First the CDK needs to be bootstrapped
```shell
cd infrastructure && cdk bootsrtap
```

If you run synth you can make sure that a cloudformation template can be generated.
```shell
cd infrastructure && cdk synth && cd ..
```

To deploy the application run cdk deploy
```shell
cd infrastructure && cdk deploy && cd ..
```


