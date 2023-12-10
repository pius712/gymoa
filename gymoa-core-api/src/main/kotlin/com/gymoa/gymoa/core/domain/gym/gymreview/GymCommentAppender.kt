package com.gymoa.gymoa.core.domain.gym.gymreview

import com.gymoa.gymoa.db.core.gym.review.GymReviewEntity
import com.gymoa.gymoa.db.core.gym.review.GymReviewRepository
import org.springframework.stereotype.Component

@Component
class GymCommentAppender(private val gymReviewRepository: GymReviewRepository) {

    fun append(postId: Long, userProfileId: Long, content: String, rating: Long): Long {
        return gymReviewRepository.save(
            GymReviewEntity(
                gymPostId = postId,
                userProfileId = userProfileId,
                content = content,
                rating = rating,
            )
        ).id!!
    }

}