package com.cubetiqs.mykotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyKotlinAppApplication

fun main(args: Array<String>) {
	runApplication<MyKotlinAppApplication>(*args)
}
