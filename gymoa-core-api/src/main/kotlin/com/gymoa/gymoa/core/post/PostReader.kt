package com.gymoa.gymoa.core.post

import com.gymoa.gymoa.db.core.post.PostEntity
import com.gymoa.gymoa.db.core.post.PostRepository
import org.springframework.stereotype.Component


@Component
class PostReader(
    private val postRepository: PostRepository
) {

    fun readAll():List<Post> {
        val entities = postRepository.findAll()
        return entities.map(::toPost)
    }

    fun readById(id: Long) {
        val found = postRepository.findById(id)
    }


    private fun toPost(postEntity: PostEntity): Post {
        return Post(
            postEntity.id!!,
            postEntity.title
        )
    }
}