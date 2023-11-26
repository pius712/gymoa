package com.gymoa.gymoa.db.core.gym.post

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.Comment

@Comment("gym에서 올리는 게시글")
@Entity
@Table(name = "gym_post")
data class GymPostEntity(
    @Column
    val title: String,

    @Column(name = "ref_gym_profile_id")
    val gymProfileId: Long
) : BaseEntity() {
}