package ir.kaaveh.myapplicationtow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ir.kaaveh.designsystem.theme.MyApplicationTowTheme
import ir.kaaveh.myapplicationtow.navigation.AppNavHost
import ir.kaaveh.myapplicationtow.ui.main.component.BottomNavigationBar
import ir.kaaveh.navigation.BottomNavItem
import ir.kaaveh.navigation.Destination
import ir.kaaveh.navigation.extention_function.addGraphPostfix

class MainActivity : ComponentActivity() {

    private val bottomNavItems = listOf(
        BottomNavItem(
            name = "List",
            route = Destination.ListScreen.route,
            icon = Icons.Default.Home,
        ),
        BottomNavItem(
            name = "Profile",
            route = Destination.ProfileScreen.route.addGraphPostfix(),
            icon = Icons.Default.AccountCircle,
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTowTheme {

                val navController = rememberNavController()
                val backStackEntry = navController.currentBackStackEntryAsState()
                val currentScreenRoute = backStackEntry.value?.destination?.route

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = bottomNavItems,
                            currentScreenRoute = currentScreenRoute,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }
                ) { paddingValues ->
                    AppNavHost(
                        navController = navController,
                        modifier = Modifier.padding(bottom = paddingValues.calculateBottomPadding()),
                    )
                }
            }
        }
    }
}

