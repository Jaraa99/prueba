package com.example.arpi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArpiApplication

fun main(args: Array<String>) {
	runApplication<ArpiApplication>(*args)
}
