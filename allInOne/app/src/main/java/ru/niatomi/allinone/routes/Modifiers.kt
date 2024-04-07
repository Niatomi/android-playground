package ru.niatomi.allinone.routes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Modifiers() {
    Column(
        Modifier
            .background(Color.Green)
            .fillMaxHeight(0.9f)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .border(5.dp, Color.Cyan)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
//            .requiredWidth // css: minWidth
//            .padding // css: :)
    ) {
        Text(text = "Hello",
            modifier = Modifier.offset(x = 10.dp, y = 5.dp)) // starts from top left
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World", Modifier.clickable {  })
    }
}