package ir.kaaveh.navigation

sealed class Destination(val route: String) {
    object ProfileScreen : Destination("profile")
    object SecondScreen : Destination("second")
    object ListScreen : Destination("List")
}