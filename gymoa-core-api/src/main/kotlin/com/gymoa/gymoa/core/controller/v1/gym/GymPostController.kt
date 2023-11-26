package com.gymoa.gymoa.core.controller.v1.gym

import com.gymoa.gymoa.core.controller.v1.gym.request.PostCreateRequestDto
import com.gymoa.gymoa.core.domain.gym.post.GymPost
import com.gymoa.gymoa.core.domain.gym.post.GymPostService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/post")
class GymPostController(
    private val gymPostService: GymPostService,
) {

    @GetMapping("/all")
    fun getPosts(): List<GymPost> {
        return gymPostService.getAll()
    }

    @PostMapping
    fun writePost(@RequestBody dto: PostCreateRequestDto) {
        gymPostService.write(dto.title)
    }

}