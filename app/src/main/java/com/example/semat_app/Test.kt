package com.example.semat_app


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Test(
    val name: String,
    val number: Int
) : Parcelable