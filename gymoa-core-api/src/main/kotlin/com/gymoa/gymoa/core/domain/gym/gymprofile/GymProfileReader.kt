package com.gymoa.gymoa.core.domain.gym.gymprofile

import com.gymoa.gymoa.db.core.gym.profile.GymProfileEntity
import com.gymoa.gymoa.db.core.gym.profile.GymProfileRepository
import org.springframework.stereotype.Component

@Component
class GymProfileReader(private val gymProfileRepository: GymProfileRepository) {

    fun readAll(): List<GymProfile> {
        val entities = gymProfileRepository.findAll();
        return entities.map(::toGymProfile)
    }

    fun toGymProfile(entity: GymProfileEntity): GymProfile {
        return GymProfile(id = entity.id!!, bio = entity.bio)
    }
}