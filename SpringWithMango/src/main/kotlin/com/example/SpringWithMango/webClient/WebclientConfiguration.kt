package com.example.SpringWithMango.webClient

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebclientConfiguration {

    @Bean
    fun webClient(): WebClient.Builder {
        return WebClient.builder()
           // .baseUrl("http://localhost:8080") //Change to the base URL of Project A
            .baseUrl("http://localhost:8080")

    }
}