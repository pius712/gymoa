package com.gymoa.gymoa.core.controller.v1.gym.request

import com.gymoa.gymoa.core.domain.gym.gymprofile.CreateGymProfileRequest

data class GymProfileCreateRequestDto(
    private val bio: String,

    ) {
    fun toCreateRequest(): CreateGymProfileRequest {
        return CreateGymProfileRequest(bio)
    }
}
