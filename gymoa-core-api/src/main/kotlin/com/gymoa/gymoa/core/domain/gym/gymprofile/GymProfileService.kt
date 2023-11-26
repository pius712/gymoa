package com.gymoa.gymoa.core.domain.gym.gymprofile

import org.springframework.stereotype.Service

@Service
class GymProfileService(private val gymProfileWriter: GymProfileWriter) {

    fun createProfile(createRequest: CreateGymProfileRequest) {
        gymProfileWriter.write(createRequest);
    }
}