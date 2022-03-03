package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R

@Composable
fun RestaurantImage() {
    Image(
        modifier = Modifier
            .height(height = 192.dp)
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.img_chicken_chester),
        contentDescription = ""
    )
}