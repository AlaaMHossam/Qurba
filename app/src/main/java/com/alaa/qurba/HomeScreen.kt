package com.alaa.qurba

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.alaa.qurba.components.Search
import com.alaa.qurba.components.TopBar
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun HomeScreen() {
    Column(Modifier.fillMaxSize().background(color = Color.White)) {
        TopBar()
        Search()
    }
}

@Preview
@Composable
fun HomePreview() {
    QurbaTheme {
        HomeScreen()
    }
}