package ru.niatomi.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    Column(
        modifier = Modifier.
            padding(12.dp)
    ) {
        NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
            composable(route = Screen.MainScreen.route) {
                MainScreen(navController = navController)
            }
            composable(route = Screen.DetailScreen.route) {
                DetailScreen(navController = navController)
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    Button(onClick = { navController.navigate(Screen.DetailScreen.route) }) {
        Text(text = "Click to go to another route")
    }
}

@Composable
fun DetailScreen(navController: NavController) {
    Column {
        Text(text = "You are on another screen")
        Button(onClick = { navController.navigate(Screen.MainScreen.route) }) {
            Text(text = "Go back")
        }
    }
}
