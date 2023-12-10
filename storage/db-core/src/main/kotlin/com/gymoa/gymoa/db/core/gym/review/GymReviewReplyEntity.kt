package com.gymoa.gymoa.db.core.gym.review

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

// TODO: 리뷰에 대한 reply 는 하나만 허용한다.
@Entity
@Table(name = "review_reply")
data class GymReviewReplyEntity(
    @Column(name = "ref_gym_review_id")
    private val reviewId: Long,
    private val content: String
) : BaseEntity() {
}