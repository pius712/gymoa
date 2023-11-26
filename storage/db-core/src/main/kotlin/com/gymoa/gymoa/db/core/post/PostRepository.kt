package com.gymoa.gymoa.db.core.post

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<PostEntity, Long> {
}