package com.gymoa.gymoa.core.domain.gym.post

import com.gymoa.gymoa.db.core.gym.post.GymPostEntity
import com.gymoa.gymoa.db.core.gym.post.GymPostRepository
import org.springframework.stereotype.Component


@Component
class GymPostReader(
    private val gymPostRepository: GymPostRepository
) {

    fun readAll(): List<GymPost> {
        val entities = gymPostRepository.findAll()
        return entities.map(::toPost)
    }

    fun readById(id: Long) {
        val found = gymPostRepository.findById(id)
    }


    private fun toPost(gymPostEntity: GymPostEntity): GymPost {
        return GymPost(
            gymPostEntity.id!!,
            gymPostEntity.title
        )
    }
}