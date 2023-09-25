package com.example.SpringWithMango.webClient

import com.example.SpringWithMango.Modal.employee
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono
@Service
class WebClientService(private val webClientBuilder: WebClient.Builder) {

    fun fetchDataFromProjectB(endpoint:String,
                              employeeData:employee?,
                              methodName:HttpMethod): Mono<String> {
        println(1)
        val token =
          "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY5NTY1MDkxM30.Kc7qnlk_HSKP6oxH_-AbwT5lkm-3TYBVH50Ny8J5qGM"
        return webClientBuilder.build()
            .method(methodName)
            .uri(endpoint)
            .apply {
                if (employeeData != null) {
                    body(BodyInserters.fromValue(employeeData))
                }
//                body(BodyInserters.fromValue(employeeData!!))
                body(BodyInserters.empty<String>())
//                body(BodyInserters.fromFormData(bodyValues))
                contentType(MediaType.APPLICATION_JSON)
                header("Authorization", "Bearer $token")
            }
            .retrieve()
            .bodyToMono(String::class.java)
    }
}