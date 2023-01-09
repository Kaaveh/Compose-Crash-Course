package ir.kaaveh.myapplicationtow.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ir.kaaveh.list.ListScreen
import ir.kaaveh.profile.ProfileScreen
import ir.kaaveh.profile.SecondScreen

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = Destination.ListScreen.route,
        modifier = modifier,
    ) {
        composable(Destination.ListScreen.route) {
            ListScreen()
        }
        composable(Destination.ProfileScreen.route) {
            ProfileScreen(
                onNavigationToSecondScreen = {
                    navController.navigate(
                        route = Destination.SecondScreen.route,
                    )
                }
            )
        }
        composable(Destination.SecondScreen.route) {
            SecondScreen()
        }
    }
}