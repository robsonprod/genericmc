package com.genericmc.genericmc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenericMcApplication

fun main(args: Array<String>) {
	runApplication<GenericMcApplication>(*args)
}
