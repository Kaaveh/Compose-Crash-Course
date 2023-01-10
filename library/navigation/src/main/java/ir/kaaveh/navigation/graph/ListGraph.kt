package ir.kaaveh.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ir.kaaveh.list.ListScreen
import ir.kaaveh.navigation.Destination

fun NavGraphBuilder.listGraph() {
    composable(Destination.ListScreen.route) {
        ListScreen()
    }
}