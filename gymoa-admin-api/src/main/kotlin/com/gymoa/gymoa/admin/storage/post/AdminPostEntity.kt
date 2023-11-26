package com.gymoa.gymoa.admin.storage.post

import com.gymoa.gymoa.admin.storage.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post")
data class AdminPostEntity(
    @Column
    var title: String
) : BaseEntity() {


}
