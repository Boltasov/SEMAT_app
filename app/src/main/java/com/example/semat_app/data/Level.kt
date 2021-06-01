package com.example.semat_app.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Level(
    @SerialName("description")
    val description: String?,
    @SerialName("level")
    val level: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("questions")
    val questions: List<Question>?
)