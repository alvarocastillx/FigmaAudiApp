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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.figmaproject.loginbanner.LoginBanner
import com.acasloa946.figmaproject.loginscreen.AudiLogo
import com.acasloa946.figmaproject.loginscreen.AudiLogoVector
import com.acasloa946.figmaproject.loginscreen.LoginButton
import com.acasloa946.figmaproject.loginscreen.LoginButtonText
import com.acasloa946.figmaproject.loginscreen.PasswordOutLinedTextField
import com.acasloa946.figmaproject.loginscreen.SesionSwitchText
import com.acasloa946.figmaproject.loginscreen.SwitchSesion
import com.acasloa946.figmaproject.loginscreen.TopLevel
import com.acasloa946.figmaproject.loginscreen.UserOutLinedTextField
import com.acasloa946.figmaproject.neutralnavbar.NeutralNavBar
import com.acasloa946.figmaproject.routes.Routes

@Composable
fun LoginScreen(navController: NavController) {
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
            LoginBanner(modifier = Modifier.size(430.dp,78.dp))
            LoginScreenMain(modifier = Modifier.size(430.dp,700.dp),
                onLoginButtonClick = {
                    navController.navigate(Routes.InitialScreen.route)
                })

        }
        Box(
            modifier = Modifier
                .size(width = 430.dp, height = 60.dp)
                .align(Alignment.BottomCenter)
                .background(Color(0xff000000))
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreenMain(
    modifier: Modifier = Modifier,
    onLoginButtonClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LoginButton(
            onLoginButtonClick = onLoginButtonClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 39.0.dp
                )
            )
        ) {
            LoginButtonText()
        }
        SwitchSesion(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 99.0.dp,
                    y = -16.0.dp
                )
            )
        ) {
            var switchSesionLogin by remember() { mutableStateOf(false) }
            androidx.compose.material3.Switch(
                checked = switchSesionLogin, onCheckedChange = { switchSesionLogin = !switchSesionLogin },
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
        SesionSwitchText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -28.5.dp,
                    y = -16.5.dp
                )
            )
        )
        PasswordOutLinedTextField(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -79.0.dp
                )
            )
        ) {var stringPassword by remember() { mutableStateOf("")}
                androidx.compose.material3.OutlinedTextField(value = stringPassword, onValueChange = {
                    stringPassword = it
                },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Red,
                        unfocusedBorderColor = Color.White,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.Red,
                    ),
                    label = { Text("Contraseña", color = Color.White) },modifier = Modifier.size(210.dp,56.dp),
                    textStyle = TextStyle(Color.White)
                )

        }
        UserOutLinedTextField(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -159.0.dp
                )
            )
        ) {
            var stringUser by remember() { mutableStateOf("")}
            androidx.compose.material3.OutlinedTextField(value = stringUser, onValueChange = {
                stringUser = it
            },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Red,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.Red,
                ),
                label = { Text("Usuario", color = Color.White) },
                modifier = Modifier.size(210.dp,56.dp),
                textStyle = TextStyle(Color.White))
        }
        AudiLogo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -275.0.dp
                )
            )
        ) {
            AudiLogoVector(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.00177001953125.dp,
                        y = -0.0000362396240234375.dp
                    )
                )
            )
        }
    }
}

