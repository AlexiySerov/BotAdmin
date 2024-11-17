package kusu.okxbot.botadmin.data

import androidx.compose.ui.graphics.Color

enum class EventType(val code: Short, val color: Color) {
    UNLOCK(0, Color.Blue), LISTING(1, Color.Blue), PUBLIC_TALK(2, Color.Green)
}
