package screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import unodocs.composeapp.generated.resources.Res.drawable

import unodocs.composeapp.generated.resources.ic_action_cards
import unodocs.composeapp.generated.resources.ic_colorblind
import unodocs.composeapp.generated.resources.ic_common
import unodocs.composeapp.generated.resources.ic_house_rules
import unodocs.composeapp.generated.resources.ic_unique
import unodocs.composeapp.generated.resources.ic_wild

sealed class BottomBarScreen(
    val title: String,
    val route: String,
    val icon: DrawableResource
) {
    data object Home: BottomBarScreen("reglas comunes", "home", drawable.ic_common)

    data object Colorblind: BottomBarScreen("guia para daltonicos", "colorblind", drawable.ic_colorblind)

    data object ActionCards: BottomBarScreen("cartas de acciòn", "action_cards", drawable.ic_action_cards)

    data object WildCards: BottomBarScreen("comodines", "wild_cards", drawable.ic_wild)

    data object StyleWildCards: BottomBarScreen("comodines de estilo", "style_wild_cards", drawable.ic_unique)

    data object HouseRules: BottomBarScreen("reglas de la casa", "house_rules", drawable.ic_house_rules)
}

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController, BottomBarScreen.Home.route,
        modifier = modifier
    ) {
        composable(BottomBarScreen.Home.route) { CommonRulesScreen() }
        composable(BottomBarScreen.Colorblind.route) { ColorblindScreen() }
        composable(BottomBarScreen.ActionCards.route) { ActionCardsScreen() }
        composable(BottomBarScreen.WildCards.route) { WildCardsScreen() }
        composable(BottomBarScreen.StyleWildCards.route) { WildStyleCardsScreen() }
        composable(BottomBarScreen.HouseRules.route) { HouseRulesScreen() }
    }
}

val screens = listOf(
    BottomBarScreen.Home,
    BottomBarScreen.Colorblind,
    BottomBarScreen.ActionCards,
    BottomBarScreen.WildCards,
    BottomBarScreen.StyleWildCards,
    BottomBarScreen.HouseRules,
)

@Composable
fun BottomBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        screens.forEach { screen ->
            AddItem(screen, currentDestination, navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val colors = NavigationBarItemDefaults.colors(
        unselectedIconColor = Color(MaterialTheme.colorScheme.onBackground.toArgb()),
        selectedIconColor = Color(MaterialTheme.colorScheme.secondary.toArgb())
    )

    NavigationBarItem(
        icon = { Icon(painterResource(screen.icon), "navigation icon") },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        colors = colors,
        onClick = {
            navController.navigate(screen.route) {
                launchSingleTop = true
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var screenTitle by remember { mutableStateOf("") }
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    screens.forEach {screen ->
        val route = currentDestination?.route
        if(route == screen.route) screenTitle = screen.title
    }

    Scaffold(
        modifier = Modifier.fillMaxHeight(),
        topBar = { TopAppBar(
            title = { Text(screenTitle) }
        ) },
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        val navStyles = Modifier.padding(innerPadding)

        BottomNavGraph(navController, navStyles)
    }
}
