package com.gymoa.gymoa.core.domain.gym.gymprofile

import org.springframework.stereotype.Service

@Service
class GymProfileService(
    private val gymProfileWriter: GymProfileWriter,
    private val gymProfileReader: GymProfileReader
) {

    fun createProfile(createRequest: CreateGymProfileRequest) {
        gymProfileWriter.write(createRequest);
    }

    fun readAllGym(): List<GymProfile> {
        return gymProfileReader.readAll()
    }
}