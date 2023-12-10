package com.gymoa.gymoa.db.core.gym

import com.gymoa.gymoa.db.core.BaseEntity
import com.gymoa.gymoa.enum.TrainerBelongStatus
import jakarta.persistence.*

@Entity
@Table(name = "gym_trainer")
data class GymTrainerEntity(
    @Column(name = "ref_gym_id")
    val gymId: Long,
    @Column(name = "ref_trainer_id")
    val trainerId: Long,

    @Enumerated(EnumType.STRING)
    val status: TrainerBelongStatus
) : BaseEntity()
