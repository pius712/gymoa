package com.gymoa.gymoa.core.domain.gym.post

import com.gymoa.gymoa.db.core.gym.post.GymPostEntity
import com.gymoa.gymoa.db.core.gym.post.GymPostRepository
import org.springframework.stereotype.Component

@Component
class GymPostWriter(
    private val gymPostRepository: GymPostRepository
) {


    fun write(title: String) {
        gymPostRepository.save(
            GymPostEntity(
                title = title
            )
        )
    }
}