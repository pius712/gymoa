package com.gymoa.gymoa.core.controller.v1.gym.response

data class GymTrainerReviewResponseDto(
    val reviewId: Long,
    val comment: String,
    val rating: Long,
)
