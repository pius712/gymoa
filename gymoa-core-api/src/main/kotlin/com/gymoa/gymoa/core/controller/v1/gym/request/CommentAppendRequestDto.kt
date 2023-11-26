package com.gymoa.gymoa.core.controller.v1.gym.request

data class CommentAppendRequestDto(
    val profileId: Long,
    val content: String
)
