import com.amazonaws.services.lambda.runtime.Context
import com.kotlin.example.cdk.lambda.LambdaHandler
import io.github.serpro69.kfaker.Faker
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class LambdaHandlerTest {

    @RelaxedMockK
    lateinit var context: Context

    @Test
    fun handleRequest() {
        val faker = Faker()
        val name = faker.name.unique.firstName()
        @MockK val lambdaHandler = LambdaHandler()
        val input = mapOf<String, Any>("message" to name)
        val result = lambdaHandler.handleRequest(input, context)
        assertEquals("{\"message\":\"Echoing $name\"}", result)
    }
}
