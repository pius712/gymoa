package com.gymoa.gymoa.core.controller.v1.gym

import com.gymoa.gymoa.core.controller.v1.gym.response.GymTrainerListResponseDto
import com.gymoa.gymoa.core.controller.v1.gym.response.GymTrainerResponseDto
import com.gymoa.gymoa.core.domain.gym.trainer.GymTrainerService
import com.gymoa.gymoa.core.domain.trainer.TrainerReviewService
import com.gymoa.gymoa.core.support.response.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/gym/{gymId}/trainer")
class GymTrainerController(
    private val gymTrainerService: GymTrainerService,
    private val trainerReviewService: TrainerReviewService,
) {

    @GetMapping("/{trainerId}")
    fun getTrainer(
        @PathVariable gymId: Long,
        @PathVariable trainerId: Long,
    ): ApiResponse<GymTrainerResponseDto> {
        val trainer = gymTrainerService.getTrainer(gymId, trainerId)
        val trainerReviews = trainerReviewService.readByTrainer(trainerId)
        return ApiResponse.ok(GymTrainerResponseDto(trainer, trainerReviews))
    }

    @GetMapping("/list")
    fun getTrainers(@PathVariable gymId: Long): ApiResponse<GymTrainerListResponseDto> {
        val trainers = gymTrainerService.getTrainers(gymId)
        val trainerReviews = trainerReviewService.readReviewsByTrainer(trainers.map { it.trainerId })
        return ApiResponse.ok(GymTrainerListResponseDto(trainers.map {
            GymTrainerResponseDto(
                it,
                trainerReviews[it.trainerId] ?: emptyList()
            )
        }))
    }
}