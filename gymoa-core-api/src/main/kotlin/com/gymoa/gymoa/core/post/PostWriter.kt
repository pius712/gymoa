package com.gymoa.gymoa.core.post

import com.gymoa.gymoa.db.core.post.PostEntity
import com.gymoa.gymoa.db.core.post.PostRepository
import org.springframework.stereotype.Component

@Component
class PostWriter(
    private val postRepository: PostRepository
) {


    fun write(title: String) {
        postRepository.save(
            PostEntity(
            title = title
        )
        )
    }
}