package ru.niatomi.allinone.routes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import ru.niatomi.allinone.R


@Composable
fun Styling() {

    ProvideTextStyle(TextStyle(color = Color.White)) {
        val spanStyle = SpanStyle(
            colorResource(id = R.color.accent),
            fontSize = 30.sp,
        )
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
                for (index in 0..5) {
//                    Ye, minecraft font
//                    what you gonna say bout it? Bye🤫🧏🏻‍♂️Bye
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Sample Text",
                        color = if (index % 2 == 0) Color.Green else colorResource(id = R.color.accent),
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.minecraft_font, weight = FontWeight.Thin))
                    )
                }
                Text(modifier = Modifier.fillMaxWidth(),
                    text = buildAnnotatedString {
                        withStyle(
                            style = spanStyle
                        ) {
                            append("B")
                        }
                        append("ye\uD83E\uDD2B\uD83E\uDDCF\uD83C\uDFFB\u200D♂\uFE0F")
                        withStyle(
                            style = spanStyle
                        ) {
                            append("B")
                        }
                        append("ye")
                    },
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}