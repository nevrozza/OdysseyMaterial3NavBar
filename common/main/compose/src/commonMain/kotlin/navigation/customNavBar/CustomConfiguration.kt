package navigation.customNavBar

import androidx.compose.runtime.Composable
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.CustomNavConfiguration
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.TabsNavModel
//https://github.com/AlexGladkov/Odyssey/blob/5546219efe56ffcc4fcc5b424e9c86e184a5916d/common/common-sample/src/commonMain/kotlin/ru/alexgladkov/common/compose/tabs/BottomConfiguration.kt
class CustomConfiguration(private val content: @Composable (params: Any?) -> Unit) :
    TabsNavModel<CustomNavConfiguration>() {

    override val navConfiguration: CustomNavConfiguration
        @Composable
        get() {
            return CustomNavConfiguration(
                content = content
            )
        }
}