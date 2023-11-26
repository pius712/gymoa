package com.gymoa.gymoa.db.core.gym.review

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
data class GymReviewEntity(
    @Column(name = "ref_post_id")
    val postId: Long,

    @Column(name = "ref_profile_id")
    val profileId: Long,

    val content: String
) : BaseEntity()
