package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantLikeCommentShare() {
    Box(modifier = Modifier.padding(16.dp)) {
        Column {
            Divider(color = Color(0xFF979797))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                RestaurantLike()
                RestaurantComment()
                RestaurantShare()
            }
            Divider(color = Color(0xFF979797))
        }
    }
}

@Composable
private fun RestaurantLike() {
    Row {
        Text(text = "32K", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_like), contentDescription = ""
        )
    }
}

@Composable
private fun RestaurantComment() {
    Row {
        Text(text = "567", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_comment), contentDescription = ""
        )
    }
}

@Composable
private fun RestaurantShare() {
    Row {
        Text(text = "12.3K", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_share), contentDescription = ""
        )
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantLikeCommentShare()
    }
}