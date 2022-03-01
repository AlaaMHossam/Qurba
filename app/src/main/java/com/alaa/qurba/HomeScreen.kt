package com.alaa.qurba

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.components.BottomBar
import com.alaa.qurba.components.Search
import com.alaa.qurba.components.TopBar
import com.alaa.qurba.components.restaurant_list_item.RestaurantListItem
import com.alaa.qurba.model.RestaurantsList
import com.alaa.qurba.ui.theme.QurbaTheme
import com.google.gson.Gson
import java.util.*

@Composable
fun HomeScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            TopBar()
            Search()
            val listModel = apiResponse().restaurants
            LazyColumn(
               // contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                modifier = Modifier.fillMaxHeight()
            ) {
                items(5) { RestaurantListItem() }
            }
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            BottomBar()
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