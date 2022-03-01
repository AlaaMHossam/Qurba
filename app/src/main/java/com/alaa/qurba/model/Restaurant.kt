package com.alaa.qurba.model


import com.google.gson.annotations.SerializedName

data class Restaurant(
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("last_post")
    val lastPost: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("social")
    val social: Social? = Social(),
    @SerializedName("type")
    val type: String? = ""
)