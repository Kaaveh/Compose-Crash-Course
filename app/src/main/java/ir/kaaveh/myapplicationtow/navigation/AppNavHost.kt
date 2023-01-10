package ir.kaaveh.myapplicationtow.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ir.kaaveh.navigation.Destination
import ir.kaaveh.navigation.graph.listGraph
import ir.kaaveh.navigation.graph.profileGraph

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = Destination.ListScreen.route,
        modifier = modifier,
    ) {
        listGraph()
        profileGraph(navController)
    }
}