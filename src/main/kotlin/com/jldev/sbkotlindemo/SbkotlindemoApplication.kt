package com.jldev.sbkotlindemo

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springdoc.core.customizers.OpenApiBuilderCustomizer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SbkotlindemoApplication {
    /**
     * Add general description to the openAPI doc.
     */
    @Bean
    fun customOpenApi(): OpenAPI {
        return OpenAPI().info(
            Info().title("Learning Spring Boot with Kotlin")
                .contact(Contact().name("Jacob Lin").email("jacoblindev@gmail.com"))
                .version("1.0.0")
                .description("Demo project of Spring Boot + Kotlin + H2 + JDBC")
                .license(License().name("MIT"))
        )
    }
}

fun main(args: Array<String>) {
    runApplication<SbkotlindemoApplication>(*args)
}
