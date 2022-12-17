package ir.kaaveh.list.preview_provider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ir.kaaveh.person.model.Person

class PersonProvider: PreviewParameterProvider<Person> {
    override val values = sequenceOf(
        Person("Kaaveh", false)
    )
}