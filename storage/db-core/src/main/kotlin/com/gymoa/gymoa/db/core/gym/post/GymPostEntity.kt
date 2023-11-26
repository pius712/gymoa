package com.gymoa.gymoa.db.core.gym.post

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "gym_post")
data class GymPostEntity(
    @Column
    val title: String
) : BaseEntity() {
}