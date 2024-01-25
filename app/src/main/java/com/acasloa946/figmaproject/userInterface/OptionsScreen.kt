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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.figmaproject.bottomnavbar.BottomNavBar
import com.acasloa946.figmaproject.routes.Routes
import com.acasloa946.figmaproject.settingsbanner.SettingsBanner
import androidx.compose.ui.unit.DpOffset
import com.acasloa946.figmaproject.settingsscreen.ContactButton
import com.acasloa946.figmaproject.settingsscreen.ContactButtonText
import com.acasloa946.figmaproject.settingsscreen.LoginButton
import com.acasloa946.figmaproject.settingsscreen.LoginButtonText
import com.acasloa946.figmaproject.settingsscreen.SettingsScreen
import com.acasloa946.figmaproject.settingsscreen.SwitchData
import com.acasloa946.figmaproject.settingsscreen.SwitchDatos
import com.acasloa946.figmaproject.settingsscreen.SwitchRecon
import com.acasloa946.figmaproject.settingsscreen.SwitchSesion
import com.acasloa946.figmaproject.settingsscreen.TextData
import com.acasloa946.figmaproject.settingsscreen.TextGeneral
import com.acasloa946.figmaproject.settingsscreen.TextLimit
import com.acasloa946.figmaproject.settingsscreen.TextPrivacidad
import com.acasloa946.figmaproject.settingsscreen.TextRecon
import com.acasloa946.figmaproject.settingsscreen.TextSesion
import com.acasloa946.figmaproject.settingsscreen.TopLevel
import com.acasloa946.figmaproject.settingsscreen.UsoDeDatos


@Composable
fun OptionsScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff000000))
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(
                    rememberScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SettingsBanner(modifier = Modifier.size(430.dp, 78.dp))
            SettingsScreenMain(modifier = Modifier.size(430.dp, 793.dp))
            SettingsScreen()

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

@Composable
fun SettingsScreenMain(
        modifier: Modifier = Modifier,
        onContactButtonClick: () -> Unit = {},
        onLoginButtonClick: () -> Unit = {}
    ) {
        TopLevel(modifier = modifier) {
            ContactButton(
                onContactButtonClick = onContactButtonClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 139.5.dp
                    )
                )
            ) {
                ContactButtonText()
            }
            LoginButton(
                onLoginButtonClick = onLoginButtonClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = 80.5.dp
                    )
                )
            ) {
                LoginButtonText()
            }
            SwitchDatos(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = -16.5.dp
                    )
                )
            ) {
                var switchUsoDatos by remember() { mutableStateOf(false) }
                androidx.compose.material3.Switch(
                    checked = switchUsoDatos, onCheckedChange = { switchUsoDatos = !switchUsoDatos },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(checkedTrackColor = Color.Red))
            }
            TextLimit(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -95.0.dp,
                        y = -17.0.dp
                    )
                )
            )
            UsoDeDatos(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = -70.5.dp
                    )
                )
            )
            SwitchData(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = -133.5.dp
                    )
                )
            ) {
                var switchData by remember() { mutableStateOf(false) }
                androidx.compose.material3.Switch(
                    checked = switchData, onCheckedChange = { switchData = !switchData },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(checkedTrackColor = Color.Red)
                )
            }
            TextData(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -53.0.dp,
                        y = -134.0.dp
                    )
                )
            )
            SwitchRecon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = -189.5.dp
                    )
                )
            ) {
                var switchRecon by remember() { mutableStateOf(false) }
                androidx.compose.material3.Switch(
                    checked = switchRecon, onCheckedChange = { switchRecon = !switchRecon },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(checkedTrackColor = Color.Red)
                )
            }
            TextRecon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -45.0.dp,
                        y = -189.0.dp
                    )
                )
            )
            TextPrivacidad(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = -243.5.dp
                    )
                )
            )
            SwitchSesion(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 165.0.dp,
                        y = -302.5.dp
                    )
                )
            ) {
                var switchSesion by remember() { mutableStateOf(false) }
                androidx.compose.material3.Switch(
                    checked = switchSesion, onCheckedChange = { switchSesion = !switchSesion },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(checkedTrackColor = Color.Red))

            }
            TextSesion(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -72.0.dp,
                        y = -302.0.dp
                    )
                )
            )
            TextGeneral(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = -360.5.dp
                    )
                )
            )
        }
    }
