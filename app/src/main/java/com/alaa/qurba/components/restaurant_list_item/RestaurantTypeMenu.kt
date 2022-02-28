package com.alaa.qurba.components.restaurant_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.Purple100
import com.alaa.qurba.ui.theme.Purple200
import com.alaa.qurba.ui.theme.Purple500
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantTypeMenu() {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
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
        Text(text = "Chicken Chester")
        Text(text = "Cafe & Restaurant")
    }
}

@Composable
private fun RestaurantMenuButton() {
    Box(modifier = Modifier.padding(top = 8.dp)) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = Transparent),
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues())
                .background(shape = CircleShape, brush = gradientBrush),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Text(
                text = "View Menu",
                color = Color(0xFF8A50DE),
            )
        }
    }
}

val gradientBrush = Brush.horizontalGradient(
    colors = listOf(
        Color(0xFF406AE7),
        Color(0xFF8A50DE)
    )
)

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantTypeMenu()
    }
}