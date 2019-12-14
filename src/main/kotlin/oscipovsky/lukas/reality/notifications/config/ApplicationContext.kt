package oscipovsky.lukas.reality.notifications.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@ComponentScan("oscipovsky.lukas.reality.notifications")
class ApplicationContext : WebMvcConfigurer