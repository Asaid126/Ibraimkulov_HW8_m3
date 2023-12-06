package com.example.hw8m3

import java.io.Serializable

data class Hero(
    val picture: Int = 0,
    val life: String? = "dead",
    val name: String? = "rick"
):Serializable