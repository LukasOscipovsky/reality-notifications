package oscipovsky.lukas.reality.notifications.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class TextQuery : GraphQLQueryResolver {
    fun text(): String = "text2"
}