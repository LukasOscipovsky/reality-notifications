package oscipovsky.lukas.reality.notifications.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health/check")
    @ResponseBody
    fun hello(): String = "OK"
}