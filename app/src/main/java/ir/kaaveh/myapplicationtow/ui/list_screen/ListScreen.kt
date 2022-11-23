package ir.kaaveh.myapplicationtow.ui.list_screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.kaaveh.myapplicationtow.ui.list_screen.component.NameItem

data class Person(
    val name: String,
    var isSelected: Boolean,
)

@Composable
fun ListScreen() {

    var persons by rememberSaveable {
        mutableStateOf(
            listOf(
                Person("aaa", false),
                Person("bbb", false),
                Person("cccc", false),
                Person("dddd", false),
            )
        )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        item {
            Text(
                text = "Title",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        items(items = persons) { person ->
            NameItem(
                person = person,
                onPersonCheckedChange = {
                    persons = persons.map { person ->
                        if (person.name == it)
                            person.copy(isSelected = !person.isSelected)
                        else
                            person
                    }
                }
            )
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