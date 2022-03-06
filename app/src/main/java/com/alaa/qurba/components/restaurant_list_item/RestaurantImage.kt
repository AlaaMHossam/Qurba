package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.model.Restaurant
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantImage() {
    Image(
        modifier = Modifier
            .height(height = 192.dp)
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.img_chicken_chester),
        contentDescription = "", contentScale = ContentScale.FillBounds
    )
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantImage()
    }
}