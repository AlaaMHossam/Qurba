package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantNameDescription(
    name: String?,
    type: String?,
    lastPost: String?,
    description: String?
) {

    Box(modifier = Modifier.fillMaxWidth()) {

        IconButton(
            onClick = {}, modifier = Modifier
                .align(Alignment.TopEnd)
                .clipToBounds()
        ) {
            Image(
                modifier = Modifier.align(Alignment.TopEnd),
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = ""
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RestaurantData(name, lastPost)
            }
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = description ?: ""
            )
        }
    }
}

@Composable
private fun RestaurantData(name: String?, lastPost: String?) {
    Image(
        painter = painterResource(id = R.drawable.img_chicken_chester_restaurant),
        contentDescription = "",
        modifier = Modifier.size(40.dp)
    )
    Column(modifier = Modifier.padding(start = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = name ?: "")
            Image(
                painter = painterResource(id = R.drawable.ic_food_list_item),
                contentDescription = "",
                Modifier.padding(start = 8.dp)
            )
        }
        Text(text = lastPost ?: "")
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantNameDescription(
            "Chicken Chester",
            "Restaurant",
            "2 days ago",
            "restaurant.description"
        )
    }
}