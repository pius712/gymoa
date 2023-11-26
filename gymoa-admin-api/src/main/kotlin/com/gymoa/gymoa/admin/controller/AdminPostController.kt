package com.gymoa.gymoa.admin.controller

import com.gymoa.gymoa.admin.controller.request.AdminPostEditTitleRequestDto
import com.gymoa.gymoa.admin.domain.post.AdminPostService
import com.gymoa.gymoa.admin.domain.post.Post
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/v1/post")
class AdminPostController (private val adminPostService: AdminPostService){

    @PostMapping("/{postId}/edit")
    fun editTitle(@PathVariable postId:Long,@RequestBody dto: AdminPostEditTitleRequestDto) {
        adminPostService.editTitle(postId,dto.title)
    }

    @GetMapping("/all")
    fun readAll():List<Post> {
         return adminPostService.readAll();
    }
}