package com.example.dimasariyudha.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.dimasariyudha.Routes

@Composable
fun Home(navController: NavHostController){
    var angka by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column (modifier = Modifier.align(Alignment.Center)) {
            Text(text = "Welcome, The Number is $angka", color = Color.Black)
            Button(onClick = { angka++ }) {
                Text(text = "Increment", color = Color.White)
            }
            Button(onClick = { navController.navigate(Routes.Profile.route) }) {
                Text(text = "Navigate to Profile", color = Color.White)
            }
            Button(onClick = { navController.navigate(Routes.Setting.route + "/$angka") }) {
                Text(text = "Navigate to Settings", color = Color.White)
            }
        }
    }
}