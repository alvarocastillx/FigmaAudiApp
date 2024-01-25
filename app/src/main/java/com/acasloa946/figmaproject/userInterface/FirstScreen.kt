package com.acasloa946.figmaproject.userInterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.figmaproject.bottomnavbar.BottomNavBar
import com.acasloa946.figmaproject.electricos.Electricos
import com.acasloa946.figmaproject.nuevors7.NuevoRs7
import com.acasloa946.figmaproject.routes.Routes
import com.acasloa946.figmaproject.sobrenosotroscomponent.SobreNosotrosComponent

@Composable
fun InitialScreen(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .verticalScroll(
                    rememberScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NuevoRs7(
                modifier = Modifier
                    .width(430.dp)
                    .height(273.dp)
            )
            SobreNosotrosComponent(
                modifier = Modifier
                    .width(430.dp)
                    .height(470.dp)
            )
            Electricos(
                modifier = Modifier
                    .width(430.dp)
                    .height(371.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(width = 411.dp, height = 62.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 30.dp)
        ) {
            BottomNavBar(onCarButtonClick = {
                navController.navigate(Routes.CatalogScreen.route)
            },
                onAudiButtonClick = {
                    navController.navigate(Routes.InitialScreen.route)
                },
                onSettingsButtonClick = {
                    navController.navigate(Routes.OptionsScreen.route)
                })
        }
    }
}




