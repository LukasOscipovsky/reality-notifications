package oscipovsky.lukas.reality.notifications.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component
import oscipovsky.lukas.reality.notifications.config.Config
import java.io.File

@Component
class ConfigMutation(val objectMapper: ObjectMapper) : GraphQLMutationResolver {

    fun updateConfig(urls: List<String>?): String {
        val config: Config = Config(urls)
        File("./src/main/resources/config.json").writeText(objectMapper.writeValueAsString(config))
        return "OK"
    }
}