package ru.niatomi.allinone.routes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Arrangement and Alignment is simply a display: flex option in css

// There is also height and width props
// it speaks on it self on what they do

@Composable
fun Display() {
    Column {
        Text(text = "Default Behaviour")
        Box {
            Text(text = "Item 1")
            Text(text = "asdf")
        }
        Spacer(Modifier.size(5.dp))
        Text(text = "Column Display")
        Column {
            Text(text = "Item 1")
            Text(text = "Item 2")
        }
        Spacer(Modifier.size(5.dp))
        Text(text = "Row Display")
        Column {
            Text(text = "Item 1")
            Text(text = "Item 2")
        }
    }
}