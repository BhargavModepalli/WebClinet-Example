package com.example.WebClinetExample

import org.springframework.web.reactive.function.client.WebClient

class WebClinetGroovy {

    String retriever(){

        WebClient webClient = WebClient.create()

        String responses =  webClient.get().uri("").retrieve().bodyToMono(String.class).block()



        return responses
    }
}
