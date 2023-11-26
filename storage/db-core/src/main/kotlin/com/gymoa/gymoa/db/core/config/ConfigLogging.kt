package com.gymoa.gymoa.db.core.config

import com.zaxxer.hikari.HikariConfig
import jakarta.annotation.PostConstruct
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ConfigLogging(
    val hikariConfig: HikariConfig
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("maximumPoolSize ${hikariConfig.maximumPoolSize}");
    }

    @PostConstruct
    fun init2() {
        println("init maximumPoolSize ${hikariConfig.maximumPoolSize}");
    }
}