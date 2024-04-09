package ru.niatomi.allinone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.util.Random

@Composable
fun SharedColorSquare(
    color: MutableState<Color>
) {
   Box(
       Modifier
           .fillMaxWidth()
           .height(100.dp)
           .padding(12.dp)
           .background(color = color.value)
           .clickable {
                color.value = Color(Random().nextLong())
           }, contentAlignment = Alignment.Center) {
       Text(text = "Click Me! And look at ma brothers")
   }
}