package com.example.demo.controller

import com.example.demo.model.DemoDTO
import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("native_demo/v1")
class DemoController {

    @GetMapping(value = ["/{id}"])
    suspend fun getSomething(@PathVariable("id") id: Int): ResponseEntity<DemoDTO> {
        logger.info { "in getSomething id = $id" }

        return ResponseEntity.ok(
            DemoDTO(
                id = id,
                name = "test",
            )
        )
    }
}