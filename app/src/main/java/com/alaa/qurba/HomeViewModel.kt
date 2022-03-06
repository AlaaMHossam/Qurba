package com.alaa.qurba

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alaa.qurba.model.Restaurant
import com.alaa.qurba.model.RestaurantsList
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _restaurantsData = MutableLiveData<RestaurantsList>()
    val restaurantsList : LiveData<RestaurantsList> = _restaurantsData

    fun fetchRestaurants() {
        viewModelScope.launch {
   //         _restaurantsData.postValue(RestaurantsList())
            delay(5000)
            _restaurantsData.postValue(RestaurantsList(restaurants()))
        }
    }

    private fun restaurants() = mutableListOf<Restaurant>().apply { repeat(5) { add(Restaurant()) } }
}