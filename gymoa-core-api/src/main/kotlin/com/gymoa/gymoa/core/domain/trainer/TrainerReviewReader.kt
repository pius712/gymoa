package com.gymoa.gymoa.core.domain.trainer

import com.gymoa.gymoa.db.core.trainer.TrainerReviewEntity
import com.gymoa.gymoa.db.core.trainer.TrainerReviewRepository
import org.springframework.stereotype.Component


@Component
class TrainerReviewReader(
    private val trainerReviewRepository: TrainerReviewRepository,
) {

    fun readByTrainer(trainerId: Long): List<TrainerReview> {
        return trainerReviewRepository.findByTrainerId(trainerId).map(::toTrainerReview)
    }

    private fun toTrainerReview(entity: TrainerReviewEntity): TrainerReview {
        return TrainerReview(
            reviewId = entity.id!!,
            comment = entity.comment,
            rating = entity.rating

        )
    }
}