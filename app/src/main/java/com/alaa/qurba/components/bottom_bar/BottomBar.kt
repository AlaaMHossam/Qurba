package com.alaa.qurba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.components.bottom_bar.BottomNavigationItem
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun BottomBar() {
    val navigationItems = listOf<BottomNavigationItem>(
        BottomNavigationItem.Home,
        BottomNavigationItem.Food,
        BottomNavigationItem.Discount,
        BottomNavigationItem.Friends,
        BottomNavigationItem.User
    )

    BottomNavigation(
        modifier = Modifier
            .shadow(
                6.dp,
                RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp),
                clip = true
            )
            .fillMaxWidth()
    ) {
        navigationItems.forEach {
            BottomNavigationItem(selected = true, onClick = { }, icon = {
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(id = it.icon),
                        contentDescription = ""
                    )
                }
            })
        }
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        BottomBar()
    }
}