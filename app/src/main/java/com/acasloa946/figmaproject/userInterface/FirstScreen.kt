package com.acasloa946.figmaproject.userInterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.acasloa946.figmaproject.electricoscomponent.ElectricosComponent
import com.acasloa946.figmaproject.initalscreennavbar.InitalScreenNavBar
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
            NuevoRs7(modifier = Modifier
                .width(430.dp)
                .height(273.dp),
                onRightArrowClick = {
                    //TODO
                })
            SobreNosotrosComponent(
                modifier = Modifier
                    .width(430.dp)
                    .height(470.dp)
            )
            ElectricosComponent(modifier = Modifier.size(430.dp,371.dp), onDiscoverButtonClick = {
                navController.navigate(Routes.CatalogScreen.route)
            })

        }
        Box(
            modifier = Modifier
                .size(width = 430.dp, height = 60.dp)
                .align(Alignment.BottomCenter)

        ) {
            InitalScreenNavBar(onCarIconClick = {
                navController.navigate(Routes.CatalogScreen.route)
            },
                onAudiIconClick = {
                    navController.navigate(Routes.InitialScreen.route)
                },
                onSettingsButtonClick = {
                    navController.navigate(Routes.OptionsScreen.route)
                })
        }
    }
}




