package com.gymoa.gymoa.core.controller.v1.post

import com.gymoa.gymoa.core.controller.v1.post.request.PostCreateRequestDto
import com.gymoa.gymoa.core.post.Post
import com.gymoa.gymoa.core.post.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/post")
class PostController (private val postService: PostService){

    @GetMapping("/all")
    fun getPosts():List<Post> {
        return postService.getAll()
    }

    @PostMapping
    fun writePost(@RequestBody dto: PostCreateRequestDto) {
        postService.write(dto.title)
    }
}