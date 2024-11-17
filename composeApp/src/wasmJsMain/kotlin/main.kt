import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import kusu.okxbot.botadmin.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("BotAdmin") {
        App()
    }
}
