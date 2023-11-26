package com.gymoa.gymoa.db.core.post

import com.gymoa.gymoa.db.core.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post")
data class PostEntity(
    @Column
    val title: String
) : BaseEntity() {


}