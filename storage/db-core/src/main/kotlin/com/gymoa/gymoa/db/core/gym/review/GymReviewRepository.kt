package com.gymoa.gymoa.db.core.gym.review

import org.springframework.data.jpa.repository.JpaRepository

interface GymReviewRepository : JpaRepository<GymReviewEntity, Long> {
}