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
import com.acasloa946.figmaproject.userInterface.EspecEtronScreen
import com.acasloa946.figmaproject.userInterface.EspecQ4Screen
import com.acasloa946.figmaproject.userInterface.EspecR8Screen
import com.acasloa946.figmaproject.userInterface.EspecRS6Screen
import com.acasloa946.figmaproject.userInterface.EspecRS7Screen
import com.acasloa946.figmaproject.userInterface.EspecSQ8Screen
import com.acasloa946.figmaproject.userInterface.InitialScreen
import com.acasloa946.figmaproject.userInterface.LoginScreen
import com.acasloa946.figmaproject.userInterface.OptionsScreen
import com.acasloa946.figmaproject.userInterface.SecondScreen
import com.acasloa946.figmaproject.userInterface.ThirdScreen

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
                        composable(Routes.CatalogScreen.route) { CatalogScreen(NavController)}
                        composable(Routes.OptionsScreen.route) { OptionsScreen(NavController)}
                        composable(Routes.LoginScreen.route) { LoginScreen(NavController)}
                        composable(Routes.SecondScreen.route) { SecondScreen(NavController)}
                        composable(Routes.ThirdScreen.route) { ThirdScreen(NavController) }
                        composable(Routes.EspecRS7Screen.route) { EspecRS7Screen(NavController) }
                        composable(Routes.EspecRS6Screen.route) { EspecRS6Screen(NavController) }
                        composable(Routes.EspecR8Screen.route) { EspecR8Screen(NavController) }
                        composable(Routes.EspecEtronScreen.route) { EspecEtronScreen(NavController) }
                        composable(Routes.EspecSQ8Screen.route) { EspecSQ8Screen(NavController) }
                        composable(Routes.EspecQ4Screen.route) { EspecQ4Screen(NavController) }










                    }

                }
            }
        }
    }
}







