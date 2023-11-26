package com.gymoa.gymoa.db.core.gym.profile

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.Comment

@Comment("gym의 프로필 정보")
@Entity
@Table(name = "gym_profile")
data class GymProfileEntity(
    @Comment("gym 에 대한 간단 설명")
    @Column()
    val bio: String,
) : BaseEntity()
