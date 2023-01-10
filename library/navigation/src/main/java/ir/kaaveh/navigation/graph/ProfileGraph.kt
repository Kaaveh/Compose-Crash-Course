package ir.kaaveh.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import ir.kaaveh.list.ListScreen
import ir.kaaveh.navigation.Destination
import ir.kaaveh.navigation.extention_function.addGraphPostfix
import ir.kaaveh.profile.ProfileScreen
import ir.kaaveh.profile.SecondScreen

fun NavGraphBuilder.profileGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Destination.ProfileScreen.route,
        route = Destination.ProfileScreen.route.addGraphPostfix(),
    ) {
        composable(Destination.ProfileScreen.route) {
            ProfileScreen(
                onNavigationToSecondScreen = {
                    navController.navigate(
                        route = Destination.SecondScreen.route,
                    )
                }
            )
        }
        secondGraph()
    }
}