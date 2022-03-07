package com.alaa.qurba.components.post_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun PostImages() {
    Row(
        Modifier
            .height(192.dp)
            .fillMaxWidth()
    ) {
        Image(
            modifier = Modifier
                .padding(end = 4.dp)
                .fillMaxWidth(0.5F)
                .fillMaxHeight(),

            painter = painterResource(id = R.drawable.img_post_image_1),
            contentDescription = "", contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.img_post_image_2),
                contentDescription = "", contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5F).padding(bottom = 2.dp)
                )
            Image(
                painter = painterResource(id = R.drawable.img_post_image_3),
                contentDescription = "", contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 2.dp)
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        PostImages()
    }
}