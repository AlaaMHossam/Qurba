package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.alaa.qurba.components.comment_list_item.CommentListItem
import com.alaa.qurba.components.common_ui.RestaurantLikeCommentShare
import com.alaa.qurba.model.Restaurant
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantListItem(restaurant: Restaurant) {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.White)
    ) {
        RestaurantNameDescription(
            restaurant.name,
            restaurant.lastPost,
            restaurant.description
        )
        RestaurantImage()
        RestaurantTypeMenu()
        RestaurantLikeCommentShare(restaurant.social, true, true)
        Column {
            CommentListItem()
        }
    }
}


@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantListItem(restaurant = Restaurant())
    }
}