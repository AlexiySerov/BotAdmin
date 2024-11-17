package kusu.okxbot.botadmin.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
/**
private val LightColorScheme = lightColorScheme(
    primary = md_theme_light_primary

)

private val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_primary
)

internal val LocalThemeIsDark = compositionLocalOf { mutableStateOf(true) }

@Composable
internal fun AppTheme(
    content: @Composable () -> Unit
) {
    val systemIsDark = isSystemInDarkTheme()
    val isDarkState = remember { mutableStateOf(systemIsDark) }
    CompositionLocalProvider(
        LocalThemeIsDark provides isDarkState
    ) {
        val isDark by isDarkState
        SystemAppearance(!isDark)
        MaterialTheme(
            colorScheme = if (isDark) DarkColorScheme else LightColorScheme,
            content = { Surface(content = content) }
        )
    }
}

@Composable
internal expect fun SystemAppearance(isDark: Boolean)
*/