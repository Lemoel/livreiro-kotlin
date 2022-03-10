package com.livreiro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LivroApplication

fun main(args: Array<String>) {
	runApplication<LivroApplication>(*args)
}
