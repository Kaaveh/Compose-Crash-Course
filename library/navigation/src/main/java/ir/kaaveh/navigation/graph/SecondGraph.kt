package ir.kaaveh.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ir.kaaveh.list.ListScreen
import ir.kaaveh.navigation.Destination
import ir.kaaveh.profile.SecondScreen

fun NavGraphBuilder.secondGraph() {
    composable(Destination.SecondScreen.route) {
        SecondScreen()
    }
}