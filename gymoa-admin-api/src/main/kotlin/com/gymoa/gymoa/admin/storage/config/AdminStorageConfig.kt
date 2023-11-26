package com.gymoa.gymoa.admin.storage.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = ["com.gymoa.gymoa.admin"])
@EntityScan(basePackages = ["com.gymoa.gymoa.admin"])
class AdminStorageConfig {
}