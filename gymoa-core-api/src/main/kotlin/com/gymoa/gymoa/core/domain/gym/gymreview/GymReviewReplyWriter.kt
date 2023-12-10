package com.gymoa.gymoa.core.domain.gym.gymreview

import com.gymoa.gymoa.db.core.gym.review.GymReviewReplyEntity
import com.gymoa.gymoa.db.core.gym.review.GymReviewReplyRepository
import com.gymoa.gymoa.db.core.gym.review.GymReviewRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class GymReviewReplyWriter(
    private val reviewRepository: GymReviewRepository,
    private val reviewReplyRepository: GymReviewReplyRepository,
) {

    fun reply(reviewId: Long, content: String) {
        val reviewEntity = reviewRepository.findByIdOrNull(reviewId) ?: throw RuntimeException("review not found")

        reviewReplyRepository.save(
            GymReviewReplyEntity(
                reviewId = reviewId, content = content
            )
        )
    }
}