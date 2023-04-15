@file:OptIn(ExperimentalMaterial3Api::class)

package navigation.customNavBar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import ru.alexgladkov.odyssey.compose.base.TabNavigator
import ru.alexgladkov.odyssey.compose.controllers.MultiStackRootController
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun CustomBottomNavigationScreen() {
    val rootController = LocalRootController.current as MultiStackRootController
    val tabItem = rootController.stackChangeObserver.collectAsState().value ?: return //?: return -  https://github.com/AlexGladkov/Odyssey/blob/adb5786f5e61bb7234c81cc7797f47cbfcfe380d/common/common-sample/src/commonMain/kotlin/ru/alexgladkov/common/compose/screens/DrawerScreen.kt
    var selectedItem by remember{ mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            NavigationBar() {
                rootController.tabItems.forEachIndexed { index, item ->
//                    val index = rootController.tabItems.indexOf(item)

                    NavigationBarItem(
                        icon = { if (selectedItem == index) Icon(item.tabInfo.tabItem.configuration.selectedIcon!!, null) else Icon(item.tabInfo.tabItem.configuration.unselectedIcon!!, null)},
                        label = { Text(item.tabInfo.tabItem.configuration.title) },
                        selected = selectedItem == index,
                        onClick = {rootController.switchTab(index); selectedItem = index }
                    )
                }
            }
        }
    ) {
        TabNavigator(modifier = Modifier.fillMaxSize().padding(it), null, tabItem)
    }


}