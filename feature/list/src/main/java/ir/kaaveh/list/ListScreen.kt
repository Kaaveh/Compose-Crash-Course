package ir.kaaveh.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.kaaveh.designsystem.preview_provider.DevicesPreview
import ir.kaaveh.designsystem.preview_provider.ThemePreview
import ir.kaaveh.designsystem.theme.MyApplicationTowTheme
import ir.kaaveh.list.component.NameItem
import ir.kaaveh.person.model.Person

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

@ThemePreview
@DevicesPreview
@Composable
fun DefaultPreview() {
    MyApplicationTowTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ListScreen()
        }
    }
}