package com.alaa.qurba.components.common_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.model.Social
import com.alaa.qurba.ui.theme.QurbaTheme
import kotlin.math.ln
import kotlin.math.pow

@Composable
fun RestaurantLikeCommentShare(social: Social?, showTopLine: Boolean, showBottomLine: Boolean) {
    Box(modifier = Modifier.padding(16.dp)) {
        Column {
            if (showTopLine)
                Divider(color = Color(0xFF979797))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                RestaurantLike(social?.likes)
                RestaurantComment()
                RestaurantShare()
            }

            if (showBottomLine)
                Divider(color = Color(0xFF979797))
        }
    }
}

@Composable
private fun RestaurantLike(likes: Int?) {
    Row {
        Text(text = getFormattedNumber(likes), modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_like), contentDescription = ""
        )
    }
}

@Composable
private fun RestaurantComment() {
    Row {
        Text(text = "567", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_comment), contentDescription = ""
        )
    }
}

@Composable
private fun RestaurantShare() {
    Row {
        Text(text = "12.3K", modifier = Modifier.padding(end = 4.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_share), contentDescription = ""
        )
    }
}

fun getFormattedNumber(count: Int?): String {
    if (count != null) {
        if (count < 1000) return "" + count
        val exp = (ln(count.toDouble()) / ln(1000.0)).toInt()
        return String.format("%.1f %c", count / 1000.0.pow(exp.toDouble()), "kMGTPE"[exp - 1])
    }
    return ""
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        RestaurantLikeCommentShare(Social(), true, true)
    }
}