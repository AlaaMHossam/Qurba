package com.alaa.qurba.components.review_list_item

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.components.common_ui.RestaurantBasicInfo
import com.alaa.qurba.components.restaurant_list_item.RestaurantImage
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun ReviewItem(isVerified: Boolean) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .border(
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Color.LightGray)
            )
    ) {
        Row(Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_user_image_4),
                contentDescription = "",
                modifier = Modifier.size(40.dp)
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "Rayna Rhiel Madsen")
                    if (isVerified == true)
                        Image(
                            painter = painterResource(id = R.drawable.ic_check),
                            contentDescription = "",
                            Modifier.padding(start = 8.dp)
                        )
                }

                Text(text = "2 days ago", style = TextStyle(fontWeight = FontWeight.Light))
            }
        }
        RestaurantImage()
        RestaurantBasicInfo()
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        ReviewItem(true)
    }
}