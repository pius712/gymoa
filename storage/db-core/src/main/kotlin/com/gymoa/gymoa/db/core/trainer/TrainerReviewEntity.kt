package com.gymoa.gymoa.db.core.trainer

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "trainer_review")
data class TrainerReviewEntity(
    @Column(name = "ref_trainer_id")
    val trainerId: Long,
    @Column(name = "ref_user_profile_id")
    val userProfileId: Long,
    val comment: String,
    val rating: Long
) : BaseEntity()
