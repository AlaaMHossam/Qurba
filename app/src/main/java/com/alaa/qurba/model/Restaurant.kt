package com.alaa.qurba.model


import com.google.gson.annotations.SerializedName

data class Restaurant(
    @SerializedName("description")
    val description: String? = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("last_post")
    val lastPost: String? = "2 Days ago",
    @SerializedName("name")
    val name: String? = "Chicken Chester",
    @SerializedName("social")
    val social: Social? = Social(),
    @SerializedName("type")
    val type: String? = ""
)