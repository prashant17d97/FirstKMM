import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import presentation.Component
import theme.AppTheme

@Composable
fun App() {
    AppTheme(darkTheme = isSystemInDarkTheme(), dynamicColor = true) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Component()
        }
    }
}

expect fun getPlatformName(): String
