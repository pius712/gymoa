package com.gymoa.gymoa.core.domain.gym.post

import org.springframework.stereotype.Service

@Service
class GymPostService(private val gymPostReader: GymPostReader,
                     private val gymPostWriter: GymPostWriter
) {

    fun getAll():List<GymPost> {
        return gymPostReader.readAll()
    }

    fun write(title:String) {
        gymPostWriter.write(title)
    }
}