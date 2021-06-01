package com.example.semat_app.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Area(
    @SerialName("alpha")
    val alpha: List<Alpha>?,
    @SerialName("color")
    val color: String?,
    @SerialName("title")
    val title: String?
)