package com.alaa.qurba.components.comment_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.CommentColor
import com.alaa.qurba.ui.theme.QurbaTheme
import com.alaa.qurba.ui.theme.ShimmerColor

@Composable
fun CommentListItem() = Row(
    Modifier
        .padding(16.dp)
        .wrapContentHeight()
) {
    Image(
        painter = painterResource(id = R.drawable.ic_user_image),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(end = 8.dp)
            .size(40.dp)
            .clip(CircleShape)
    )
    Column {
        Box(
            modifier = Modifier
                .background(shape = RoundedCornerShape(8.dp), color = CommentColor)
                .padding(8.dp)
        ) {
            Column {
                Text(text = "Jaxson Schleifer", fontSize = (14.sp), fontWeight = FontWeight.Bold)
                Text(text = "Lorem ipsum", fontSize = (12.sp))
            }
        }

        SocialDataRow()
    }
}

@Composable
fun SocialDataRow() = Row(
    modifier = Modifier.padding(top = 8.dp),
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    verticalAlignment = Alignment.CenterVertically
) {
    Text(text = "1h", fontSize = 14.sp, fontWeight = FontWeight.Light)

    ClickableText(
        text = AnnotatedString("Like"),
        onClick = {},
        style = TextStyle(color = Color.Black, fontSize = 14.sp)
    )

    ClickableText(
        text = AnnotatedString("Reply"),
        onClick = {},
        style = TextStyle(color = Color.Black, fontSize = 14.sp)
    )

    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 4.dp)) {
        Text(text = "2", Modifier.padding(end = 4.dp), fontSize = 14.sp)
        Image(painter = painterResource(id = R.drawable.ic_comment_like), contentDescription = "")
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        CommentListItem()
    }
}