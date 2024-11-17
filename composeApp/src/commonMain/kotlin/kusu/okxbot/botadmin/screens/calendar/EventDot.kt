package kusu.okxbot.botadmin.screens.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import kusu.okxbot.botadmin.theme.AppTheme

@Composable
internal fun EventDot(color: Color) {
    Box(
        modifier = Modifier
            .size(7.dp)
            .clip(CircleShape)
            .border(1.dp,Color.Black, CircleShape)
            .background(color)
    )
}