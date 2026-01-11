package com.github.compose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.github.compose.tabs.*

@Composable
fun HomeScreen(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
    /*
        Text(
            text = "Home",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            color = Color.Black
        )
        
        */
        TabLayoutScreen()
        
    }

}