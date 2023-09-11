package theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import theme.DarkColorScheme
import theme.LightColorScheme
import theme.Typography

@Composable
actual fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}