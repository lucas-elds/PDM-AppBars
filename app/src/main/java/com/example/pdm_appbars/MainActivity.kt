package com.example.pdm_appbars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*

import com.example.pdm_appbars.ui.theme.PDMAppBarsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PDMAppBarsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("App Bar Example")
                            },
                            navigationIcon = {
                                IconButton(onClick = {}) {
                                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                                }
                            },
                            actions = {
                                IconButton(onClick = {}) {
                                    Icon(Icons.Filled.Search, contentDescription = "Search")
                                }
                                IconButton(onClick = {}) {
                                    Icon(Icons.Filled.MoreVert, contentDescription = "More Options")
                                }
                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            )
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            actions = {
                                IconButton(onClick = {}) {
                                    Icon(Icons.Filled.Check, contentDescription = "Check")
                                }
                                IconButton(onClick = {}) {
                                    Icon(Icons.Filled.Edit, contentDescription = "Edit")
                                }
                            },
                            floatingActionButton = {
                                FloatingActionButton(
                                    onClick = {},
                                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor
                                ) {
                                    Icon(Icons.Filled.Add, contentDescription = "Add")
                                }
                            }
                        )
                    },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PDMAppBarsTheme {
        Greeting("Android")
    }
}
