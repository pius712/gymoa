package com.gymoa.gymoa.core.domain.gym.gymreview

import com.gymoa.gymoa.db.core.gym.review.GymReviewEntity
import com.gymoa.gymoa.db.core.gym.review.GymReviewRepository
import org.springframework.stereotype.Component

@Component
class GymCommentAppender(private val gymReviewRepository: GymReviewRepository) {

    fun append(postId: Long, profileId: Long, content: String): Long {
        return gymReviewRepository.save(
            GymReviewEntity(
                postId = postId, profileId = profileId, content = content
            )
        ).id!!
    }

}