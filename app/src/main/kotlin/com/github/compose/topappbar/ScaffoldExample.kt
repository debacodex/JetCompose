package com.github.compose.topappbar

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier


import androidx.compose.ui.unit.dp
//import androidx.compose.ui.text.style.TextOverflow
import com.github.compose.tabs.TabLayoutScreen
import com.github.compose.*

import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.pager.rememberPagerState
import com.github.compose.bottomBar.BottomBar
import com.github.compose.bottomBar.SwipeableBottomBar
import com.github.compose.itemList.bottomNavItemList
import com.github.compose.navigation.BottomNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                //    containerColor = MaterialTheme.colorScheme.primaryContainer,
                   // titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Debashis",
                        maxLines = 1,
                       // overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle Navigation */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle Action */ }) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = "Settings"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        // Content of your screen
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) { /*
            Text(
                text = "Hello! This is the main content area.",
                modifier = Modifier.padding((16.dp))
            )
            */
            //TabLayoutScreen()
            //MainScreen()
            val navController = rememberNavController()
                BottomNavGraph(navController = navController)
                val pagerState = rememberPagerState(pageCount = { bottomNavItemList.size })

                Scaffold(
                    bottomBar = {
                        BottomBar(navController = navController, pagerState = pagerState)
                    }
                ) { paddingValues ->
                    SwipeableBottomBar(pagerState = pagerState, paddingValues = paddingValues, navController = navController)
                }
            
        }
    }
}