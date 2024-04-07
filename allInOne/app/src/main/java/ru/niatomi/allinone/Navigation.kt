package ru.niatomi.allinone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.niatomi.allinone.routes.Display
import ru.niatomi.allinone.routes.ImageScreen
import ru.niatomi.allinone.routes.InputFields
import ru.niatomi.allinone.routes.Lists
import ru.niatomi.allinone.routes.Modifiers
import ru.niatomi.allinone.routes.State
import ru.niatomi.allinone.routes.Styling
import ru.niatomi.allinone.routes.TextScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
    ) {
            Box(modifier = Modifier.padding(20.dp)) {
                NavHost(navController = navController, startDestination = Screens.DEFAULT_SCREEN.route) {
                    composable(route = Screens.IMAGE.route) { ImageScreen() }
                    composable(route = Screens.TEXT.route) { TextScreen() }
                    composable(route = Screens.DISPLAY.route) { Display() }
                    composable(route = Screens.MODIFIERS.route) { Modifiers() }
                    composable(route = Screens.STYLING.route) { Styling() }
                    composable(route = Screens.STATE.route) { State() }
                    composable(route = Screens.INPUTS_FIELDS.route) { InputFields() }
                    composable(route = Screens.LISTS.route) { Lists() }
                }
            }
            ScreenSwitcher(navController)
        }
}

fun screenParse(enumName: String): String {
    return enumName
        .lowercase()
        .split("_")[0]
}

@Composable
fun ScreenSwitcher(navController: NavController) {
    val buttonColor = ButtonDefaults.buttonColors(
        containerColor = colorResource(id = R.color.secondary_background),
        contentColor = Color.White
    )
    val buttonShape = RoundedCornerShape(5.dp)

    val position = remember {
        mutableStateOf(0)
    }
    val availableScreens = Screens.entries.filter { it ->
        it.name != "DEFAULT_SCREEN"
    }
    var currentScreen = remember {
        mutableStateOf(screenParse(Screens.DEFAULT_SCREEN.route))
    }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter) {
        Row(modifier = Modifier
            .background(colorResource(id = R.color.background))
            .fillMaxWidth()
            .padding(10.dp),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Button(onClick = { /*TODO*/
                position.value--
                if (position.value < 0) {
                    position.value = availableScreens.size - 1
                }
                navController.navigate(availableScreens[position.value].route)
                currentScreen.value = screenParse(availableScreens[position.value].name)
            },
                colors = buttonColor,
                shape = buttonShape) {
                Text(text = "<")
            }
            Text(text = "Current screen is about ${currentScreen.value}",
                color = colorResource(
                id = R.color.white
            ))
            Button(onClick = {
                position.value++
                if (position.value >= availableScreens.size) {
                    position.value = 0
                }
                navController.navigate(availableScreens[position.value].route)
                currentScreen.value = screenParse(availableScreens[position.value].name)
            },
                colors = buttonColor,
                shape = buttonShape) {
                Text(text = ">")
            }
        }
    }
}