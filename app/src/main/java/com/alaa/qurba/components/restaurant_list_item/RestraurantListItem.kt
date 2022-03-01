package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantListItem() {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.White)
    ) {
        RestaurantNameDescription()
        Image(
            modifier = Modifier
                .height(height = 192.dp)
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.img_chicken_chester),
            contentDescription = ""
        )
        RestaurantTypeMenu()
        RestaurantLikeCommentShare()
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantListItem()
    }
}