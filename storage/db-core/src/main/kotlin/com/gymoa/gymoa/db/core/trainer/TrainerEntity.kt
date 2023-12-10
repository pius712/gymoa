package com.gymoa.gymoa.db.core.trainer

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "trainer")
data class TrainerEntity(
    val name: String,
    val nickname: String,
    val contact: String,
    @Column(name = "ref_gym_id")
    val gymId: Long,
) : BaseEntity()
