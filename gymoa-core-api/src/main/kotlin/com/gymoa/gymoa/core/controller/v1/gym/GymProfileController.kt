package com.gymoa.gymoa.core.controller.v1.gym

import com.gymoa.gymoa.core.controller.v1.gym.request.GymProfileCreateRequestDto
import com.gymoa.gymoa.core.domain.gym.gymprofile.GymProfileService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/gym")
class GymProfileController(private val gymProfileService: GymProfileService) {

    @PostMapping("/create")
    fun create(@RequestBody dto: GymProfileCreateRequestDto) {
        gymProfileService.createProfile(dto.toCreateRequest())
    }

    
}