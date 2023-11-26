package com.gymoa.gymoa.core.domain.gym.gymreview

import org.springframework.stereotype.Service

@Service
class GymReviewService(private val gymCommentAppender: GymCommentAppender) {

    fun append(postId: Long, profileId: Long, content: String):Long {
        return gymCommentAppender.append(postId, postId, content)
    }
}