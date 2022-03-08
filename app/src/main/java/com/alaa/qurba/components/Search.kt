package com.alaa.qurba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun Search() {
    val searchValue = remember { mutableStateOf("") }
    Box(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(start = 16.dp, top = 20.dp, end = 16.dp, bottom = 13.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            UserImage()
            Field(searchValue)
        }
    }
}

@Composable
private fun UserImage() = Image(
    painter = painterResource(id = R.drawable.ic_user_image),
    contentDescription = "",
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .size(40.dp)
        .clip(CircleShape)
)

@Composable
private fun Field(searchValue: MutableState<String>) {
    TextField(
        value = searchValue.value,
        onValueChange = { searchValue.value = it },
        Modifier
            .fillMaxWidth()
            .height(46.dp)
            .padding(start = 16.dp)
            .shadow(6.dp, CircleShape, clip = true)
            .wrapContentHeight(),
        placeholder = { SearchPlaceHolder() },
        singleLine = true,
        colors = transparentFieldColors(),
        textStyle = MaterialTheme.typography.caption
    )
}

@Composable
private fun SearchPlaceHolder() = Text(
    fontSize = 12.sp,
    text = "Share your food experiences",
    color = Color(0xFF363636),
    modifier = Modifier.alpha(0.5F)
)


@Composable
fun transparentFieldColors() = TextFieldDefaults.outlinedTextFieldColors(
    focusedBorderColor = Color.Transparent,
    unfocusedBorderColor = Color.Transparent,
    backgroundColor = Color.White
)

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        Search()
    }
}