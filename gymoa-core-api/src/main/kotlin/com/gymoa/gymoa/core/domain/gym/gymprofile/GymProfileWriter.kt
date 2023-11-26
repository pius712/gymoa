package com.gymoa.gymoa.core.domain.gym.gymprofile

import com.gymoa.gymoa.db.core.gym.profile.GymProfileEntity
import com.gymoa.gymoa.db.core.gym.profile.GymProfileRepository
import org.springframework.stereotype.Component

@Component
class GymProfileWriter(private val gymProfileRepository: GymProfileRepository) {

    fun write(request: CreateGymProfileRequest) {
        gymProfileRepository.save(GymProfileEntity(bio = request.bio))
    }
}