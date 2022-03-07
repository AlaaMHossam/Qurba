package com.alaa.qurba.components.post_list_item

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alaa.qurba.components.common_ui.RestaurantBasicInfo
import com.alaa.qurba.components.common_ui.RestaurantLikeCommentShare
import com.alaa.qurba.model.Social
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun PostListItem() {
    Column {
        PostNameDescription(name = "Rayna Rosser", type = "", lastPost = "2 days ago", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet")
        PostImages()
        RestaurantBasicInfo()
        RestaurantLikeCommentShare(social = Social(), showBottomLine = false)
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        PostListItem()
    }
}