package me.kjgleh.awssecretmanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsSecretManagerApplication

fun main(args: Array<String>) {
    runApplication<AwsSecretManagerApplication>(*args)
}
