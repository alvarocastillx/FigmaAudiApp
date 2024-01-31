package com.acasloa946.figmaproject.userInterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.figmaproject.bannersuperiorespecrs6.BannerSuperiorEspecRs6
import com.acasloa946.figmaproject.mainespecrs6.MainEspecRs6
import com.acasloa946.figmaproject.neutralnavbar.NeutralNavBar
import com.acasloa946.figmaproject.routes.Routes

@Composable
fun EspecRS6Screen(navController: NavController) {
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
            BannerSuperiorEspecRs6(modifier = Modifier.size(430.dp,78.dp))
            MainEspecRs6(modifier = Modifier.size(430.dp,1195.dp))


        }
        Box(
            modifier = Modifier
                .size(width = 430.dp, height = 60.dp)
                .align(Alignment.BottomCenter)
                .padding(top = 2.dp)

        ) {
            NeutralNavBar(
                onCarIconClick = {
                    navController.navigate(Routes.CatalogScreen.route)
                },
                onAudiIconClick = {
                    navController.navigate(Routes.InitialScreen.route)
                },
                onSettingsButtonClick = {
                    navController.navigate(Routes.OptionsScreen.route)
                }
            )
        }
    }
}