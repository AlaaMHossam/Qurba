package com.alaa.qurba.components.bottom_bar

import androidx.annotation.StringRes
import com.alaa.qurba.R

sealed class BottomNavigationItem(@StringRes val resourceId: Int, val icon: Int) {
    object Home : BottomNavigationItem(R.string.home, R.drawable.ic_home)
    object Food : BottomNavigationItem(R.string.food, R.drawable.ic_food)
    object Discount : BottomNavigationItem(R.string.discount, R.drawable.ic_discount)
    object Friends : BottomNavigationItem(R.string.friends, R.drawable.ic_friends)
    object User : BottomNavigationItem(R.string.user, R.drawable.ic_user)
}
