package com.gymoa.gymoa.core.domain.trainer

import com.gymoa.gymoa.db.core.trainer.TrainerEntity
import com.gymoa.gymoa.db.core.trainer.TrainerRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class TrainerReader(
    private val trainerRepository: TrainerRepository,
) {

    fun readById(trainerId: Long): Trainer {
        return trainerRepository.findByIdOrNull(trainerId)?.let {
            toTrainer(it)
        } ?: throw RuntimeException("찾는 트레이터가 없습니다.")
    }

    private fun toTrainer(trainerEntity: TrainerEntity): Trainer {
        return Trainer(
            trainerId = trainerEntity.id!!,
            name = trainerEntity.name,
            nickname = trainerEntity.nickname,
            contact = trainerEntity.contact
        )
    }
}