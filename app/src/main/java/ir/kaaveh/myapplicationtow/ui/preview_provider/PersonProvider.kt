package ir.kaaveh.myapplicationtow.ui.preview_provider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ir.kaaveh.myapplicationtow.domain.model.Person

class PersonProvider: PreviewParameterProvider<Person> {
    override val values = sequenceOf(
        Person("Kaaveh", false)
    )
}