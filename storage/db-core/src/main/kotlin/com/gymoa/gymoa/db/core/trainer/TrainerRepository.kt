package com.gymoa.gymoa.db.core.trainer

import org.springframework.data.jpa.repository.JpaRepository

interface TrainerRepository : JpaRepository<TrainerEntity, Long> {
    fun findByIdIn(trainerIds: List<Long>): List<TrainerEntity>
}