import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import presentation.Component
import presentation.Splash
import theme.AppTheme

@Composable
fun App() {
    AppTheme(darkTheme = isSystemInDarkTheme(), dynamicColor = true) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            Splash()
        }
    }
}

expect fun getPlatformName(): String
