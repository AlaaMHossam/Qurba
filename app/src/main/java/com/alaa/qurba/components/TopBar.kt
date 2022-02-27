package com.alaa.qurba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun TopBar() {
    TopAppBar(
        modifier = Modifier
            .shadow(
                6.dp,
                RoundedCornerShape(bottomEnd = 8.dp, bottomStart = 8.dp),
                clip = true
            )
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_img_logo),
            contentDescription = "",
            Modifier.padding(start = 16.dp)
        )
        TopBarIcons()
    }
}

@Composable
private fun TopBarIcons() {
    Box(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .align(Alignment.CenterEnd)
                .wrapContentWidth()
        ) {
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = ""
                )
            }
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = ""
                )
            }
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(id = R.drawable.ic_cart),
                    contentDescription = ""
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview(){
    QurbaTheme {
        TopBar()
    }
}