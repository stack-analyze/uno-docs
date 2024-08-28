package screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import unodocs.composeapp.generated.resources.Res.drawable

import unodocs.composeapp.generated.resources.ic_action_cards
import unodocs.composeapp.generated.resources.ic_colorblind
import unodocs.composeapp.generated.resources.ic_common
import unodocs.composeapp.generated.resources.ic_house_rules
import unodocs.composeapp.generated.resources.ic_unique
import unodocs.composeapp.generated.resources.ic_wild

sealed class NavigationScreen(
    val title: String,
    val route: String,
    val icon: DrawableResource,
) {
    data object Home : NavigationScreen("reglas comunes", "home", drawable.ic_common)

    data object Colorblind :
        NavigationScreen("guia para daltonicos", "colorblind", drawable.ic_colorblind)

    data object ActionCards :
        NavigationScreen("cartas de acciòn", "action_cards", drawable.ic_action_cards)

    data object WildCards : NavigationScreen("comodines", "wild_cards", drawable.ic_wild)

    data object StyleWildCards :
        NavigationScreen("comodines de estilo", "style_wild_cards", drawable.ic_unique)

    data object HouseRules :
        NavigationScreen("reglas de la casa", "house_rules", drawable.ic_house_rules)
}

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController, NavigationScreen.Home.route,
        modifier = modifier
    ) {
        composable(NavigationScreen.Home.route) { CommonRulesScreen() }
        composable(NavigationScreen.Colorblind.route) { ColorblindScreen() }
        composable(NavigationScreen.ActionCards.route) { ActionCardsScreen() }
        composable(NavigationScreen.WildCards.route) { WildCardsScreen() }
        composable(NavigationScreen.StyleWildCards.route) { WildStyleCardsScreen() }
        composable(NavigationScreen.HouseRules.route) { HouseRulesScreen() }
    }
}

val screens = listOf(
    NavigationScreen.Home,
    NavigationScreen.Colorblind,
    NavigationScreen.ActionCards,
    NavigationScreen.WildCards,
    NavigationScreen.StyleWildCards,
    NavigationScreen.HouseRules,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var screenTitle by remember { mutableStateOf("") }
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    screens.forEach { screen ->
        val route = currentDestination?.route
        if (route == screen.route) screenTitle = screen.title
    }

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                screens.forEach { screen ->
                    NavigationDrawerItem(
                        label = { Text(screen.title) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        icon = { Icon(painterResource(screen.icon),null) },
                        onClick = {
                            navController.navigate(screen.route) {
                                launchSingleTop = true
                            }
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                }
            }
        },
        gesturesEnabled = true
    ) {

        Scaffold(
            modifier = Modifier.fillMaxHeight(),
            topBar = {
                TopAppBar(
                    title = { Text(screenTitle) },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply { if (isClosed) open() else close() }
                            }
                        }) { Icon(Icons.Outlined.Menu, null) }
                    }
                )
            },

            ) { innerPadding ->
            val navStyles = Modifier.padding(innerPadding)

            NavGraph(navController, navStyles)
        }
    }
}
