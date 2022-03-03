package com.alaa.qurba.model


import com.google.gson.annotations.SerializedName

data class Social(
    @SerializedName("comments")
    val comments: Int? = 950,
    @SerializedName("likes")
    val likes: Int? = 950,
    @SerializedName("shares")
    val shares: Int? = 0
)