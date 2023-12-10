package com.gymoa.gymoa.core.domain.trainer

import com.gymoa.gymoa.db.core.trainer.TrainerRepository
import com.gymoa.gymoa.db.core.trainer.TrainerReviewEntity
import com.gymoa.gymoa.db.core.trainer.TrainerReviewRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class TrainerReviewWriter(
    private val trainerRepository: TrainerRepository,
    private val trainerReviewRepository: TrainerReviewRepository,
) {

    fun write(trainerId: Long, profileId: Long, comment: String, rating: Long) {
        trainerRepository.findByIdOrNull(trainerId) ?: throw RuntimeException("")

        trainerReviewRepository.save(
            TrainerReviewEntity(
                trainerId,
                profileId,
                comment,
                rating
            )
        )
    }
}