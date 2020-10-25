package com.sqbrains.asciiduck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AsciiduckApplication

fun main(args: Array<String>) {
	runApplication<AsciiduckApplication>(*args)
}
