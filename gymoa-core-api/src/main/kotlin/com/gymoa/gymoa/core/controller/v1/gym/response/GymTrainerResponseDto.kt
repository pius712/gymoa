package com.gymoa.gymoa.core.controller.v1.gym.response

import com.gymoa.gymoa.core.domain.gym.trainer.GymTrainer
import com.gymoa.gymoa.core.domain.trainer.TrainerReview

data class GymTrainerResponseDto(
    val trainerId: Long,
    val name: String,
    val nickname: String,
    val review: List<GymTrainerReviewResponseDto>
) {
    constructor(trainer: GymTrainer, trainerReviews: List<TrainerReview>) : this(
        trainer.trainerId,
        trainer.name,
        trainer.nickname,
        trainerReviews.map { GymTrainerReviewResponseDto(it.reviewId, it.comment, it.rating) }
    )
}
