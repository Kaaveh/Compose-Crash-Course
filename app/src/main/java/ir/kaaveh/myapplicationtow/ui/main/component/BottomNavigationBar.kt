package ir.kaaveh.myapplicationtow.ui.main.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ir.kaaveh.navigation.BottomNavItem

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    currentScreenRoute: String?,
    onItemClick: (BottomNavItem) -> Unit,
) {
    BottomNavigation {
        items.forEach { item ->
            val selected = item.route == currentScreenRoute
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = item.route)
                        AnimatedVisibility(visible = selected) {
                            Text(
                                text = item.route,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                },
            )
        }
    }
}