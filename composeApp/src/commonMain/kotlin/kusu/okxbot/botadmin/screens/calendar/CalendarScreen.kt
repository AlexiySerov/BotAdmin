package kusu.okxbot.botadmin.screens.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kusu.okxbot.botadmin.data.EventType



@Composable
internal fun CalendarScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(16.dp)
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(16.dp)){
            Text("Calendar")
        }

        val now = Clock.System.now()

        val tz = TimeZone.currentSystemDefault()
        val today = now.toLocalDateTime(tz).date

        val currentMoment = Clock.System.now()
        val currentDate = currentMoment.toLocalDateTime(TimeZone.currentSystemDefault()).date
        val yearMonth = currentDate.month
        currentDate.month.ordinal

        for (i in 1..4){
            Row(modifier = Modifier) {
                for (j in 1..7){
                    DateElement(date = (i-1)*7 + j, array = arrayOf(EventType.UNLOCK, EventType.PUBLIC_TALK))
                }
            }
        }


    }
}
