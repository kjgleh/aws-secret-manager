package me.kjgleh.awssecretmanager

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController{

    @Value(value = "\${application.id}")
    private lateinit var applicationId: String

    @GetMapping("/api/id")
    fun getMyProperty(): String {
        return applicationId
    }
}