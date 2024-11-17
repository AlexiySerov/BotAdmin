package kusu.okxbot.botadmin.screens.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kusu.okxbot.botadmin.data.EventType

@Composable
internal fun DateElement(date: Int, color: Color = Color.White, array: Array<EventType>){
    Column(
        modifier = Modifier
            .padding(5.dp)
            .size(50.dp)
            .background(color = color),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Text("$date", color = Color.Black)

        Row(modifier = Modifier
            .width(44.dp),
            horizontalArrangement = Arrangement.SpaceAround) {
            for (i in array){
                EventDot(i.color)
            }
        }
    }
}
