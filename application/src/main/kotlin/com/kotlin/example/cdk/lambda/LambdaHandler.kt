package com.kotlin.example.cdk.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class LambdaHandler : RequestHandler<Map<String, Any>, String> {
    private val json = Json

    override fun handleRequest(input: Map<String, Any>, context: Context): String {
        val logger = context.logger
        val message = input["message"]
        logger.log("EVENT: parsed message: [$message]")
        return json.encodeToString(mapOf("message" to "Echoing $message"))
    }
}
