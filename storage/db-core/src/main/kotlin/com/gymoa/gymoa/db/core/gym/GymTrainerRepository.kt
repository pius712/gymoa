package com.gymoa.gymoa.db.core.gym

import org.springframework.data.jpa.repository.JpaRepository

interface GymTrainerRepository : JpaRepository<GymTrainerEntity, Long> {

    fun findByGymId(gymId: Long): List<GymTrainerEntity>

    // TODO: unique 제약
    fun findByGymIdAndTrainerId(gymId: Long, trainerId: Long): GymTrainerEntity?

}