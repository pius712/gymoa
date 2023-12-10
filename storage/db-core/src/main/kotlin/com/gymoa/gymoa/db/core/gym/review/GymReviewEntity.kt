package com.gymoa.gymoa.db.core.gym.review

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import org.hibernate.annotations.Comment

@Comment("Gym 게시글에 작성되는 리뷰")
@Entity
data class GymReviewEntity(
    @Column(name = "ref_gym_post_id")
    val gymPostId: Long,

    @Column(name = "ref_user_profile_id")
    val userProfileId: Long,

    val content: String,

    val rating: Long,
) : BaseEntity()
