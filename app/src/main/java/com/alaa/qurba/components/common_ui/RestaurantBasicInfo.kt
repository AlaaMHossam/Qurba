package com.alaa.qurba.components.common_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun RestaurantBasicInfo() {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.img_mc_icon),
            contentDescription = "",
            modifier = Modifier.size(40.dp)
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(
                text = "Chicken MACDO, Carmel Sandae, Big Tasty, Mc Royal",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.SemiBold
            )
            Text(text = "Mcdonald's", style = TextStyle(fontWeight = FontWeight.Light))
        }
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantBasicInfo()
    }
}