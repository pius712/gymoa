package com.gymoa.gymoa.core.domain.trainer

data class TrainerReview(
    val trainerId: Long,
    val reviewId: Long,
    val comment: String,
    val rating: Long,
)
