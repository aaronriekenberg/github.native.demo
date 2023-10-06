package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class DemoDTO(
    @JsonProperty("id")
    val id: Int,

    @JsonProperty("name")
    val name: String,
)