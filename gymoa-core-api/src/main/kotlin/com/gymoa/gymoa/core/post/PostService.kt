package com.gymoa.gymoa.core.post

import org.springframework.stereotype.Service

@Service
class PostService(private val postReader: PostReader,
                  private val postWriter: PostWriter
) {

    fun getAll():List<Post> {
        return postReader.readAll()
    }

    fun write(title:String) {
        postWriter.write(title)
    }
}