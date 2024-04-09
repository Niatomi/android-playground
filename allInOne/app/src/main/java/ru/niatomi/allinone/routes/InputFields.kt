package ru.niatomi.allinone.routes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@Composable
fun InputFields() {
    var textField by remember {
        mutableStateOf("")
    }
    val scaffoldState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp),
        snackbarHost = { SnackbarHost(hostState = scaffoldState) }) {pad ->
        Column {
            pad.calculateBottomPadding()
            TextField(modifier = Modifier.fillMaxWidth(),
                value = textField,
                onValueChange = { textField = it },
                singleLine = true,
                label = { Text(text = "Write your name here") })
            Button(onClick = {
                scope.launch {
                    scaffoldState.showSnackbar(message = "Hello ${textField}")
                }
            }) {
                Text(text = "Greet")
            }
        }
    }
}
