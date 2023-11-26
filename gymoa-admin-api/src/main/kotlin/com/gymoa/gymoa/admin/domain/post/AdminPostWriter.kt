package com.gymoa.gymoa.admin.domain.post

import com.gymoa.gymoa.admin.storage.post.AdminPostRepository
import jakarta.transaction.Transactional
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class AdminPostWriter(private val adminPostRepository: AdminPostRepository) {
    @Transactional
    fun updateTitle(postId:Long, title:String) {
        val postEntity = adminPostRepository.findByIdOrNull(postId) ?: throw RuntimeException()
        postEntity.title  = title;
    }
}