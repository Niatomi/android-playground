package ru.niatomi.allinone.routes

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.niatomi.allinone.R
import ru.niatomi.allinone.components.SharedColorSquare

@Composable
fun State() {
    val rememberCounter =  remember { mutableIntStateOf(0) }
    var justCounter = 0
    val buttonShape = RoundedCornerShape(5.dp)
    val fontSize = 60.sp
    val buttonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.accent),
        contentColor = Color.White
    )

    val sharedColor = remember {
        mutableStateOf(Color.Cyan)
    }

    Column(Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.25f)) {
            Text(modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "Counter without remember: $justCounter")
            Text(modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "There is always zero because every " +
                        "redraw composable reinits and sets justCounter to 0",
                textDecoration = TextDecoration.Underline)
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
                    .padding(12.dp),
                    shape = buttonShape,
                    onClick = { justCounter -= 1 },
                    colors = buttonColor) {
                    Text(text = "-", fontSize = fontSize)
                }
                Button(modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight()
                    .padding(12.dp),
                    shape = buttonShape,
                    onClick = { justCounter += 1 },
                    colors = buttonColor) {
                    Text(text = "+", fontSize = fontSize)
                }
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.25f)) {
            Text(modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "Counter with remember: ${rememberCounter.intValue}")
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight()
                    .padding(12.dp),
                    shape = buttonShape,
                    onClick = { rememberCounter.intValue -= 1 },
                    colors = buttonColor) {
                    Text(text = "-", fontSize = fontSize)
                }
                Button(modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight()
                    .padding(12.dp),
                    shape = buttonShape,
                    onClick = { rememberCounter.intValue += 1 },
                    colors = buttonColor) {
                    Text(text = "+", fontSize = fontSize)
                }
            }
        }
        Column(Modifier.fillMaxSize().border(1.dp, color = Color.Black)) {
            Text(modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "Shared state between compose components")
            Column {
                SharedColorSquare(color = sharedColor)
                SharedColorSquare(color = sharedColor)
                SharedColorSquare(color = sharedColor)
            }
        }
    }
}