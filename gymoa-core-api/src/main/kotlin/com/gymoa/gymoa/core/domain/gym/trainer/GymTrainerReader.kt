package com.gymoa.gymoa.core.domain.gym.trainer

import com.gymoa.gymoa.db.core.gym.GymTrainerRepository
import com.gymoa.gymoa.db.core.trainer.TrainerEntity
import com.gymoa.gymoa.db.core.trainer.TrainerRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class GymTrainerReader(
    private val gymTrainerRepository: GymTrainerRepository, private val trainerRepository: TrainerRepository
) {

    fun readByGym(gymId: Long): List<GymTrainer> {
        val trainerIds = gymTrainerRepository.findByGymId(gymId).map { it.trainerId }

        return trainerRepository.findByIdIn(trainerIds).map { toGymTrainer(it) }
    }

    fun read(gymId: Long, trainerId: Long): GymTrainer {
        gymTrainerRepository.findByGymIdAndTrainerId(gymId, trainerId) ?: throw RuntimeException("")

        return trainerRepository.findByIdOrNull(trainerId)?.let {
            toGymTrainer(it)
        } ?: throw RuntimeException("");
    }

    private fun toGymTrainer(entity: TrainerEntity): GymTrainer {
        return GymTrainer(
            trainerId = entity.id!!,
            name = entity.name,
            nickname = entity.nickname,
            contact = entity.contact
        )
    }

}