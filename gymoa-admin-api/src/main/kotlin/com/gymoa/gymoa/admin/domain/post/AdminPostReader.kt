package com.gymoa.gymoa.admin.domain.post

import com.gymoa.gymoa.admin.storage.post.AdminPostEntity
import com.gymoa.gymoa.admin.storage.post.AdminPostRepository
import org.springframework.stereotype.Component

@Component
class AdminPostReader (private val adminPostRepository: AdminPostRepository){

    fun findAll():List<Post> {
        return adminPostRepository.findAll().map(::toPost)
    }

    private fun toPost(adminPostEntity: AdminPostEntity): Post {
        return Post(
            adminPostEntity.id!!,
            adminPostEntity.title
        )
    }
}