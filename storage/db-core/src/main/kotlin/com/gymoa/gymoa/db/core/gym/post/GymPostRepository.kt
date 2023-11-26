package com.gymoa.gymoa.db.core.gym.post

import org.springframework.data.jpa.repository.JpaRepository

interface GymPostRepository : JpaRepository<GymPostEntity, Long> {
}