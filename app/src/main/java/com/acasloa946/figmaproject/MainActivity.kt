package com.acasloa946.figmaproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.figmaproject.routes.Routes
import com.acasloa946.figmaproject.ui.theme.FigmaProjectTheme
import com.acasloa946.figmaproject.userInterface.CatalogScreen
import com.acasloa946.figmaproject.userInterface.InitialScreen
import com.acasloa946.figmaproject.userInterface.OptionsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    val NavController = rememberNavController()
                    NavHost(NavController, startDestination = Routes.InitialScreen.route) {
                        composable(Routes.InitialScreen.route) { InitialScreen(NavController) }
                        composable(Routes.CatalogScreen.route) { CatalogScreen(navController = NavController)}
                        composable(Routes.OptionsScreen.route) { OptionsScreen(NavController)}

                    }

                }
            }
        }
    }
}







