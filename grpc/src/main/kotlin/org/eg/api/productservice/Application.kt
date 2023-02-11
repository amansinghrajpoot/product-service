package org.eg.api.productservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class Application


fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    (runApplication<Application>(*args))
}

