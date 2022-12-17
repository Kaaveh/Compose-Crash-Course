package ir.kaaveh.myapplicationtow.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(val route: String, val icon: ImageVector){
    object ProfileScreen : Destination("profile", Icons.Default.AccountCircle)
    object ListScreen : Destination("List", Icons.Default.Home)
}

val bottomNavItems = listOf(
    Destination.ListScreen,
    Destination.ProfileScreen,
)