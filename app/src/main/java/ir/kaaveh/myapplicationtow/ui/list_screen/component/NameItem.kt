package ir.kaaveh.myapplicationtow.ui.list_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NameItem(
    name: String,
    fontSize: TextUnit = 20.sp,
) {

    var backgroundColor by remember {
        mutableStateOf(Color.White)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .clickable {
                backgroundColor = Color.Red
            }
    ) {
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name,
            fontSize = fontSize,
        )
        Spacer(modifier = Modifier.height(4.dp))
        Divider()
    }
}


@Preview(showBackground = true)
@Composable
private fun NameItemPrev() {
    NameItem(name = "Kaaveh")
}