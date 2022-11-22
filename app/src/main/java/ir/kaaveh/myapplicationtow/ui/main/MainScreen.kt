package ir.kaaveh.myapplicationtow.ui.main

import android.content.res.Configuration.UI_MODE_NIGHT_UNDEFINED
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {

        var message by rememberSaveable {
            mutableStateOf("Hello World!")
        }

        var isVisible by rememberSaveable {
            mutableStateOf(true)
        }

        if (isVisible)
            Text(text = message)

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {
//            message = "Hello Kaaveh!"
            isVisible = !isVisible

        }) {
            if (isVisible)
                Text(text = "Hide it!")
            else
                Text(text = "Show it!")
        }

        Spacer(modifier = Modifier.height(400.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}

@Preview(
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES,
)
@Composable
fun DefaultPreviewDark() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        MainScreen()
    }
}