package com.example.semat_app.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Question(
    @SerialName("order")
    val order: Int?,
    @SerialName("text")
    val text: String?
)