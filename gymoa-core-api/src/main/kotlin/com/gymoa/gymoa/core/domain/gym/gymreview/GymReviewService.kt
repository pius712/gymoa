package com.gymoa.gymoa.core.domain.gym.gymreview

import org.springframework.stereotype.Service

@Service
class GymReviewService(private val gymCommentAppender: GymCommentAppender) {

    fun append(postId: Long, profileId: Long, content: String, rating: Long): Long {
        return gymCommentAppender.append(postId, profileId, content, rating)
    }
}