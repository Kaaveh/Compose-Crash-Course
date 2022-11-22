package ir.kaaveh.myapplicationtow.ui.list_screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.kaaveh.myapplicationtow.ui.list_screen.component.NameItem

val names = listOf("aaa", "bbb", "cccc", "dddd")

@Composable
fun ListScreen(
    nameList: List<String> = names
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        items(items = nameList) {
            NameItem(name = it)
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ListScreen()
}

@Preview(
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun DefaultPreviewDark() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        ListScreen()
    }
}