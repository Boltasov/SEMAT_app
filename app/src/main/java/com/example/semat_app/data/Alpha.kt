package com.example.semat_app.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Alpha(
    @SerialName("levels")
    val levels: List<Level>?,
    @SerialName("name")
    val name: String?,
    @SerialName("text")
    val text: String?
)