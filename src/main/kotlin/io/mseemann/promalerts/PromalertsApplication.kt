package io.mseemann.promalerts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PromalertsApplication

fun main(args: Array<String>) {
	runApplication<PromalertsApplication>(*args)
}
