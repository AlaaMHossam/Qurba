package com.alaa.qurba.components.restaurant_shimmer_item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.ui.theme.QurbaTheme
import com.alaa.qurba.ui.theme.ShimmerColorShades

@Composable
fun ShimmerItem(
    brush: Brush
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
        //.padding(16.dp)
    ) {
        Column {
            ShimmerLogoName(brush)
            ShimmerImage(brush)
            ShimmerDetails(brush)
        }
    }
}


@Composable
private fun ShimmerLogoName(brush: Brush) = Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp, top = 16.dp, start = 16.dp, end = 16.dp)
) {
    Spacer(
        modifier = Modifier
            .size(40.dp)
            .background(shape = CircleShape, brush = brush)
    )
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .height(40.dp)
            .padding(start = 16.dp)
    ) {
        Spacer(
            modifier = Modifier
                .background(shape = CircleShape, brush = brush)
                .height(10.dp)
                .width(120.dp)
        )

        Spacer(
            modifier = Modifier
                .background(shape = CircleShape, brush = brush)
                .height(6.dp)
                .width(64.dp)
        )
    }
}

@Composable
private fun ShimmerImage(brush: Brush) = Spacer(
    modifier = Modifier
        .padding(bottom = 8.dp)
        .fillMaxWidth()
        .height(192.dp)
        .background(brush = brush)

)

@Composable
private fun ShimmerDetails(brush: Brush) =
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp, top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(
            modifier = Modifier
                .width(51.dp)
                .height(10.dp)
                .background(shape = CircleShape, brush = brush)
        )

        Spacer(
            modifier = Modifier
                .width(51.dp)
                .height(10.dp)
                .background(shape = CircleShape, brush = brush)
        )

        Spacer(
            modifier = Modifier
                .width(51.dp)
                .height(10.dp)
                .background(shape = CircleShape, brush = brush)
        )
    }

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        ShimmerItem(
            Brush.linearGradient(
                colors = ShimmerColorShades,
                start = Offset(10f, 10f),
                end = Offset(1F, 1F)
            )
        )
    }
}