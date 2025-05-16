package br.com.martins.clientManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientManagerApplication

fun main(args: Array<String>) {
	runApplication<ClientManagerApplication>(*args)
}
