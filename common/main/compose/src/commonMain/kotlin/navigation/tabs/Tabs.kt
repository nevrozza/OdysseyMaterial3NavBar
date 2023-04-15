package navigation.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.TabConfiguration
import ru.alexgladkov.odyssey.compose.navigation.bottom_bar_navigation.TabItem


class PersonTab: TabItem() {
    override val configuration: TabConfiguration
        @Composable
        get() = TabConfiguration(selectedIcon = rememberVectorPainter(Icons.Filled.Person), unselectedIcon = rememberVectorPainter(Icons.Outlined.Person), title = "Person", titleStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium))
}

class GalleryTab: TabItem() {
    override val configuration: TabConfiguration
        @Composable
        get() = TabConfiguration(selectedIcon = rememberVectorPainter(Icons.Filled.Image), unselectedIcon = rememberVectorPainter(Icons.Outlined.Image),title = "Gallery", titleStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium))
}

class SettingsTab: TabItem() {
    override val configuration: TabConfiguration
        @Composable
        get() = TabConfiguration(selectedIcon = rememberVectorPainter(Icons.Filled.Settings), unselectedIcon = rememberVectorPainter(Icons.Outlined.Settings),title = "Settings", titleStyle = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Medium))
}