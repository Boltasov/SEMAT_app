package com.example.semat_app.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AllResponse(
    @SerialName("area")
    val area: List<Area>?
)