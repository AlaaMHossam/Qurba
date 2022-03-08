package com.alaa.qurba.components.review_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun ReviewName(
    name: String?,
    time: String?,
    description: String?
) {

    Box(modifier = Modifier.fillMaxWidth()) {
        IconButton(
            onClick = {}, modifier = Modifier
                .align(Alignment.TopEnd)
                .clipToBounds()
        ) {
            Image(
                modifier = Modifier.align(Alignment.TopEnd),
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = ""
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                ReviewData(name, time)
            }
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = description ?: "",
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun ReviewData(name: String?, lastPost: String?) {
    Image(
        painter = painterResource(id = R.drawable.ic_user_image_3),
        contentDescription = "",
        modifier = Modifier.size(40.dp)
    )
    Column(modifier = Modifier.padding(start = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = name ?: "", fontWeight = FontWeight.SemiBold)
            Image(
                painter = painterResource(id = R.drawable.ic_right_chivron),
                contentDescription = "", Modifier.padding(start = 8.dp, end = 8.dp)
            )
            Text(modifier = Modifier.padding(end = 16.dp), maxLines = 1, text = "Chicken Chester", fontWeight = FontWeight.SemiBold, overflow = TextOverflow.Ellipsis)
        }
        Text(text = lastPost ?: "", style = TextStyle(fontWeight = FontWeight.Light))
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        ReviewName(
            "Skylarani  Arcand",
            "2 days ago",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet"
        )
    }
}