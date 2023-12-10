package com.gymoa.gymoa.core.domain.gym.trainer

import org.springframework.stereotype.Service

@Service
class GymTrainerService(private val gymTrainerReader: GymTrainerReader) {

    fun getTrainer(gymId: Long, trainerId: Long): GymTrainer {
        return gymTrainerReader.read(gymId, trainerId)
    }

    fun getTrainers(gymId: Long): List<GymTrainer> {
        return gymTrainerReader.readByGym(gymId)
    }
}