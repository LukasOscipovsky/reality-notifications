package oscipovsky.lukas.reality.notifications

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import oscipovsky.lukas.reality.notifications.config.ApplicationContext

@SpringBootApplication
class RealityNotificationRunner

fun main(args: Array<String>) {
	SpringApplication.run(ApplicationContext::class.java, *args)
}