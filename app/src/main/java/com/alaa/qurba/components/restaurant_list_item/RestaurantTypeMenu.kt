package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.Purple100
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantTypeMenu() {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 8.dp)
    ) {
        Row(verticalAlignment = CenterVertically) {
            RestaurantIconName()
        }
        RestaurantMenuButton()
    }
}

@Composable
private fun RestaurantIconName() {
    Image(
        painter = painterResource(id = R.drawable.ic_food),
        contentDescription = "",
        contentScale = ContentScale.Inside,
        modifier = Modifier
            .size(40.dp)
            .background(shape = CircleShape, color = Purple100)
    )

    Column(Modifier.padding(start = 8.dp)) {
        Text(text = "Chicken Chester", fontWeight = FontWeight.SemiBold)
        Text(text = "Cafe & Restaurant")
    }
}

@Composable
private fun RestaurantMenuButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        Button(
            shape = CircleShape,
            onClick = {},
            modifier = Modifier.fillMaxSize(),
            elevation = ButtonDefaults.elevation(0.dp),
            content = {}
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(alignment = Center)
                .background(shape = CircleShape, brush = gradientBrush)
        )
        Text(
            modifier = Modifier.align(Center),
            text = "View Menu",
            color = Color(0xFF8A50DE),
        )
    }
}

val gradientBrush = Brush.linearGradient(
    colors = listOf(Color(0x66406AE7), Color(0x668A50DE)),
    start = Offset(0f, Float.POSITIVE_INFINITY),
    end = Offset(Float.POSITIVE_INFINITY, 0f)
)

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantTypeMenu()
    }
}