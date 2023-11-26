package com.gymoa.gymoa.db.core.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "gymoa.datasource")
    fun hikariConfig(): HikariConfig {
        return HikariConfig()
    }

    @Bean
    fun dataSource(): HikariDataSource {
        return HikariDataSource(hikariConfig())
    }
}