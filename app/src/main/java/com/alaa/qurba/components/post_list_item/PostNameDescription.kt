package com.alaa.qurba.components.post_list_item

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alaa.qurba.R
import com.alaa.qurba.ui.theme.QurbaTheme

@Composable
fun PostNameDescription(
    name: String?,
    type: String?,
    lastPost: String?,
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
                PostData(name, lastPost)
            }
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = description ?: ""
            )
        }
    }
}

@Composable
private fun PostData(name: String?, lastPost: String?) {
    Image(
        painter = painterResource(id = R.drawable.ic_user_image_3),
        contentDescription = "",
        modifier = Modifier.size(40.dp)
    )
    Column(modifier = Modifier.padding(start = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = name ?: "")
            Image(
                painter = painterResource(id = R.drawable.ic_check),
                contentDescription = "",
                Modifier.padding(start = 8.dp)
            )
        }
        Row {
            Text(text = "Verified . ", style = TextStyle(fontWeight = FontWeight.Light))
            Text(text = lastPost ?: "", style = TextStyle(fontWeight = FontWeight.Light))
        }
    }
}

@Preview
@Composable
private fun Preview() {
    QurbaTheme {
        PostNameDescription(
            "Rayna Rosser",
            "Restaurant",
            "2 days ago",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eros est, blandit eu nunc sit amet"
        )
    }
}