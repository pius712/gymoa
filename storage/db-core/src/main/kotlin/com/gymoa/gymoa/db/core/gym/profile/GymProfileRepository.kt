package com.gymoa.gymoa.db.core.gym.profile

import org.springframework.data.jpa.repository.JpaRepository

interface GymProfileRepository : JpaRepository<GymProfileEntity, Long> {
}