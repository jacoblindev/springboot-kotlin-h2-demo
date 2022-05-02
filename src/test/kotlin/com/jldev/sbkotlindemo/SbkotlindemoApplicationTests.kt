package com.jldev.sbkotlindemo

import com.jldev.sbkotlindemo.model.HelloDTO
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest
class SbkotlindemoApplicationTests {

	var testRestTemplate: TestRestTemplate = TestRestTemplate()

	@Test
	fun contextLoads() {
	}

	@Test
	fun whenCalled_shouldReturnHello() {
		val rs = testRestTemplate.getForEntity("http://localhost:8080/hello", String::class.java)

		assert(rs?.body.equals("Hello Kotlin!"))
	}

	@Test
	fun whenCalled_shouldReturnHelloService() {
		val rs = testRestTemplate.getForEntity("http://localhost:8080/hello-service", String::class.java)

		assert(rs?.body.equals("Hello Kotlin Service"))
	}

	@Test
	fun whenCalled_shouldReturnJSON() {
		val rs = testRestTemplate.getForEntity("http://localhost:8080/hello-dto", HelloDTO::class.java)

		assert(rs?.body is HelloDTO)
		assert(rs?.body == HelloDTO("Hello from the DTO!"))
	}

}
