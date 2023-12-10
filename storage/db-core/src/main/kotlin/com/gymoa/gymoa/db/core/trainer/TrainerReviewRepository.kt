package com.gymoa.gymoa.db.core.trainer

import org.springframework.data.jpa.repository.JpaRepository

interface TrainerReviewRepository : JpaRepository<TrainerReviewEntity, Long> {

    fun findByTrainerId(trainerId: Long): List<TrainerReviewEntity>
    fun findByTrainerIdIn(trainerIds: List<Long>): List<TrainerReviewEntity>

}