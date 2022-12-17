package ir.kaaveh.list.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.kaaveh.list.preview_provider.PersonProvider
import ir.kaaveh.person.model.Person

@Composable
fun NameItem(
    person: Person,
    fontSize: TextUnit = 20.sp,
    onPersonCheckedChange: (personName: String) -> Unit,
) {

//    var backgroundColor by remember {
//        mutableStateOf(Color.White)
//    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
//            .background(backgroundColor)
//            .clickable {
//                backgroundColor = Color.Red
//            }
    ) {
        Spacer(modifier = Modifier.height(4.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(
                checked = person.isSelected,
                onCheckedChange = {
                    onPersonCheckedChange(person.name)
                }
            )
            Text(
                text = person.name,
                fontSize = fontSize,
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Divider()
    }
}


@Preview(showBackground = true)
@Composable
private fun NameItemPrev(
    @PreviewParameter(PersonProvider::class)
    person: Person,
) {
    NameItem(person = person, onPersonCheckedChange = {})
}