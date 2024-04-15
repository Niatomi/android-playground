package ru.niatomi.allinone.routes

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Lists() {
    val scrollState1 = rememberScrollState()
    val scrollState2 = rememberScrollState()
    Column {

        Column(Modifier.border(5.dp, color = Color.Black)) {
            Text(text = "Column scrolling (bad, all items loads once at startup)",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp))
            Column(
                Modifier
                    .fillMaxHeight(0.5f)
                    .verticalScroll(scrollState1)) {
                for (i in 0..50) {
                    Text(text = "Item $i",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp))
                }
            }
        }
        Column(Modifier.border(5.dp, color = Color.Black)) {
            Text(text = "Lazy scrolling (good)",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp))
            LazyColumn {
//                Theres also items indexed
                items(5000) {
                    Text(text = "Item $it",
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp))
                }
            }
        }
    }
}