package com.jldev.sbkotlindemo.controller

import com.jldev.sbkotlindemo.model.HelloDTO
import com.jldev.sbkotlindemo.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "Hello Kotlin!"
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }

    @GetMapping("/hello-dto")
    fun helloDto(): HelloDTO {
        return HelloDTO("Hello from the DTO!")
    }
}