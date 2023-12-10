package com.gymoa.gymoa.core.domain.trainer

import org.springframework.stereotype.Component

@Component
class TrainerReviewService(
    private val trainerReviewReader: TrainerReviewReader,
) {

    fun readByTrainer(trainerId: Long): List<TrainerReview> {
        return trainerReviewReader.readByTrainer(trainerId)

    }

    fun readReviewsByTrainer(trainerIds: List<Long>): Map<Long, List<TrainerReview>> {
        return trainerReviewReader.readReviews(trainerIds).groupBy { it.trainerId }
    }
}