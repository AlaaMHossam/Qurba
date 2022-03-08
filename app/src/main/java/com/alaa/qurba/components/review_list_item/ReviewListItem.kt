package com.alaa.qurba.components.review_list_item

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alaa.qurba.components.common_ui.RestaurantLikeCommentShare
import com.alaa.qurba.model.Social
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun ReviewListItem() = Column {
    ReviewName(
        "Skylarani  Arcand",
        "2 days ago",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet"
    )
    ReviewItem(isVerified = true)
    RestaurantLikeCommentShare(social = Social(), showTopLine = false, showBottomLine = false)
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        ReviewListItem()
    }
}