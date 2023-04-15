package navigation


import navigation.customNavBar.CustomBottomNavigationScreen
import navigation.customNavBar.CustomConfiguration
import navigation.tabs.*
import ru.alexgladkov.odyssey.compose.extensions.customNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import screens.GalleryScreen
import screens.PersonScreen
import screens.SettingsScreen

fun RootComposeBuilder.mainFlow() {
    customNavigation(name = NavigationTree.Main.MainFlow.name,
        tabsNavModel = CustomConfiguration(
        content = { CustomBottomNavigationScreen() }
    )) {
        tab(PersonTab()) {
            screen(name = NavigationTree.Main.Person.name) {
                PersonScreen()
            }
        }

        tab(GalleryTab()) {
            screen(name = NavigationTree.Main.Gallery.name) {
                GalleryScreen()
            }
        }

        tab(SettingsTab()) {
            screen(name = NavigationTree.Main.Settings.name) {
                SettingsScreen()
            }
        }
    }
}

