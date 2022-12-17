package ir.kaaveh.designsystem.preview_provider

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview


@Preview(name = "Light", showBackground = true, showSystemUi = true)
@Preview(
    name = "Dark",
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
annotation class ThemePreview

@Preview(locale = "en", name = "English")
@Preview(locale = "fa", name = "Persian")
annotation class MultiLanguagePreview

@Preview(name = "Phone", device = "spec:width=411dp,height=891dp")
@Preview(name = "Foldable", device = "spec:width=673.5dp,height=841dp,dpi=480")
@Preview(name = "Tablet", device = "spec:width=1280dp,height=800dp,dpi=480")
@Preview(name = "Desktop", device = "spec:width=1920dp,height=1080dp,dpi=480")
annotation class DevicesPreview