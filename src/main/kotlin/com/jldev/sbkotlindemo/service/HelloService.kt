package com.jldev.sbkotlindemo.service

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getHello(): String {
        return "Hello Kotlin Service"
    }
}