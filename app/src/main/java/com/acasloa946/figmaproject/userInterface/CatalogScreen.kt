package com.acasloa946.figmaproject.userInterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import com.acasloa946.figmaproject.audir8catalog.AudiR8catalog
import com.acasloa946.figmaproject.audirs7catalog.AudiRs7catalog
 import com.acasloa946.figmaproject.etrongtcatalog.EtronGtcatalog
import com.acasloa946.figmaproject.q4catalog.Q4catalog
import com.acasloa946.figmaproject.routes.Routes
import com.acasloa946.figmaproject.sq8catalog.Sq8catalog
import com.acasloa946.figmaproject.vehiculosacombustion.VehiculosAcombustion
import com.acasloa946.figmaproject.vehiculoselectricos.VehiculosElectricos
import com.acasloa946.figmaproject.audirs6catalog.AudiRs6catalog
import com.acasloa946.figmaproject.catalognavigationbar.CatalogNavigationBar

@Composable
fun CatalogScreen(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .verticalScroll(rememberScrollState(10000), enabled = true, reverseScrolling = true),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            VehiculosAcombustion(modifier = Modifier.size(430.dp,314.dp))
            AudiR8catalog(modifier = Modifier.size(430.dp, 288.dp),
                onButtonEspecClick = {
                    navController.navigate(Routes.EspecR8Screen.route)
                })
            AudiRs7catalog(modifier = Modifier.size(430.dp, 288.dp),
                onButtonEspecClick = {
                    navController.navigate(Routes.EspecRS7Screen.route)
                })
            Spacer(modifier = Modifier.padding(15.dp))
            AudiRs6catalog(modifier = Modifier.size(430.dp, 288.dp),
                onButtonSpecClick = {
                    navController.navigate(Routes.EspecRS6Screen.route)
                })
            VehiculosElectricos(modifier = Modifier.size(430.dp,288.dp))
            EtronGtcatalog(modifier = Modifier.size(430.dp,288.dp),
                onButtonSpecClick = {
                    navController.navigate(Routes.EspecEtronScreen.route)
                })
            Sq8catalog(modifier = Modifier.size(430.dp,288.dp),
                onButtonSpecClick = {
                    navController.navigate(Routes.EspecSQ8Screen.route)
                })
            Q4catalog(modifier = Modifier.size(430.dp,360.dp),
                onButtonSpecClick = {
                    navController.navigate(Routes.EspecQ4Screen.route)
                })
        }
        Box(
            modifier = Modifier
                .size(width = 430.dp, height = 60.dp)
                .align(Alignment.BottomCenter)
                .padding(top=1.dp)
        ) {
            CatalogNavigationBar(onCarIconClick = {
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
