package com.alaa.qurba.model


import com.google.gson.annotations.SerializedName

data class Social(
    @SerializedName("comments")
    val comments: Int? = 0,
    @SerializedName("likes")
    val likes: Int? = 0,
    @SerializedName("shares")
    val shares: Int? = 0
)