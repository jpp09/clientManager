package br.com.martins.clientManager.rotes

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("helloApplication")
class HelloApplication {

    @GetMapping
    fun hello():String{
        return "Hello"
    }
}