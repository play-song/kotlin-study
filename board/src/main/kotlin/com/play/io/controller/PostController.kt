package com.play.io.controller

import com.play.io.dto.PostCreateRequest
import com.play.io.dto.PostUpdateRequest
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {

    @PostMapping("/posts")
    fun create(
        @RequestBody request: PostCreateRequest
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody request: PostUpdateRequest
    ): Long {
        return id
    }

    @DeleteMapping("/posts/{id}")
    fun delete(
        @PathVariable id: Long
    ): Long {
        return id
    }
}