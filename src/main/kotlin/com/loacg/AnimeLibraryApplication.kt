package com.loacg

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AnimeLibraryApplication {

    companion object {
        val logger: String = AnimeLibraryApplication::class.java.name

        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(AnimeLibraryApplication::class.java, *args)
        }
    }
}
