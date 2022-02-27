package com.alaa.qurba.components.restaurant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.alaa.qurba.R
import com.alaa.qurba.components.BottomBar
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantNameDescription() {
    Row() {
     //   Image(painter = painterResource(id = R.drawable.img_chicken_chester), contentDescription = )
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantNameDescription()
    }
}