package com.alaa.qurba.model

import com.google.gson.annotations.SerializedName

data class RestaurantsList(
    @SerializedName("restaurants")
    val restaurants: List<Restaurant>? = List(5) { Restaurant(id = it) }
)