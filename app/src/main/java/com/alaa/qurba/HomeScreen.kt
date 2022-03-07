package com.alaa.qurba

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.components.bottom_bar.BottomBar
import com.alaa.qurba.components.Search
import com.alaa.qurba.components.TopBar
import com.alaa.qurba.components.post_list_item.PostListItem
import com.alaa.qurba.components.restaurant_list_item.RestaurantListItem
import com.alaa.qurba.components.restaurant_shimmer_item.ShimmerAnimation
import com.alaa.qurba.model.RestaurantsList
import com.alaa.qurba.ui.theme.QurbaTheme
import com.alaa.qurba.ui.theme.ShimmerColor
import com.google.gson.Gson
import java.util.*

@Composable
fun HomeScreen() {
    val homeViewModel = HomeViewModel()

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            TopBar()
            Search()
            RestaurantsLazyColumn(homeViewModel)
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) { BottomBar() }
    }
}

@Composable
fun RestaurantsLazyColumn(homeViewModel: HomeViewModel) {
    val data = homeViewModel.restaurantsList.observeAsState().value
    homeViewModel.fetchRestaurants()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 64.dp)
    ) {
        if (data?.restaurants?.isNotEmpty() == true) {
            itemsIndexed(data.restaurants) { index, restaurant ->
                RestaurantListItem(restaurant = restaurant)
                Divider(color = ShimmerColor, thickness = 4.dp)
                PostListItem()
                if (index < data.restaurants.lastIndex)
                    Divider(color = ShimmerColor, thickness = 4.dp)
            }
        } else items(2) {
            ShimmerAnimation()
            Divider(color = ShimmerColor, thickness = 4.dp)
        }
    }
}

@Composable
fun apiResponse(): RestaurantsList {
    val jsonResponse = getJson(path = "restaurants_api_response.json")
    return Gson().fromJson(jsonResponse, RestaurantsList::class.java)
}

@Composable
fun getJson(path: String): String {
    val context = LocalContext.current
    val inputStream = context.assets.open(path)
    val scanner = Scanner(inputStream).useDelimiter("\\A")
    return if (scanner.hasNext()) scanner.next() else ""
}

@Preview
@Composable
fun HomePreview() {
    QurbaTheme {
        HomeScreen()
    }
}