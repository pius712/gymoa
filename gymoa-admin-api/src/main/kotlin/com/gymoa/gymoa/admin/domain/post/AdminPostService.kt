package com.gymoa.gymoa.admin.domain.post

import org.springframework.stereotype.Service

@Service
class AdminPostService(private val postWriter: AdminPostWriter,
                       private val postReader: AdminPostReader
) {
    fun editTitle(postId:Long, title:String) {
        postWriter.updateTitle(postId,title)
    }

    fun readAll():List<Post> {
        return postReader.findAll();
    }
}