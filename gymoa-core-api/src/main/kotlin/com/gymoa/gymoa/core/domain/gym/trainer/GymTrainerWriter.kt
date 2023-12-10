package com.gymoa.gymoa.core.domain.gym.trainer

import com.gymoa.gymoa.db.core.gym.GymTrainerRepository
import org.springframework.stereotype.Component

@Component
class GymTrainerWriter(
    private val gymTrainerRepository: GymTrainerRepository
) {
}