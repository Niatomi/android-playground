package ru.niatomi.allinone.routes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import ru.niatomi.allinone.R
import ru.niatomi.allinone.components.ImageCard

@Composable
fun ImageScreen() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
    ) {
        val pepeResource = painterResource(id = R.drawable.pepe_buisness_stressed)
        ImageCard(painter = pepeResource , subject = "Big problems on selling market")
        val pugResource = painterResource(id = R.drawable.pug)
        ImageCard(painter = pugResource , subject = "What da dog doin?")
    }
}