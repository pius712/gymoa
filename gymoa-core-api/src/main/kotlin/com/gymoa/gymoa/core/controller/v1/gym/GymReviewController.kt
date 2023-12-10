package com.gymoa.gymoa.core.controller.v1.gym

import com.gymoa.gymoa.core.controller.v1.gym.request.CommentAppendRequestDto
import com.gymoa.gymoa.core.domain.gym.gymreview.GymReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/post/{postId}/comment")
class GymReviewController(private val gymReviewService: GymReviewService) {

    @PostMapping
    fun appendComment(@PathVariable postId: Long, @RequestBody dto: CommentAppendRequestDto): Long {
        return gymReviewService.append(postId, dto.profileId, dto.content, dto.rating);
    }


}