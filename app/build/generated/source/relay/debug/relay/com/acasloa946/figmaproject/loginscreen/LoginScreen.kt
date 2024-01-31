package com.acasloa946.figmaproject.loginscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.figmaproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'login_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginScreen(
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
        ) {}
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
        ) {}
        UserOutLinedTextField(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -159.0.dp
                )
            )
        ) {}
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

@Preview(widthDp = 430, heightDp = 792)
@Composable
private fun LoginScreenPreview() {
    MaterialTheme {
        RelayContainer {
            LoginScreen(
                onLoginButtonClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LoginButtonText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar sesión",
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun LoginButton(
    onLoginButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 10.0.dp,
            end = 24.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        radius = 58.0,
        content = content,
        modifier = modifier.tappable(onTap = onLoginButtonClick).requiredWidth(133.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun SwitchSesion(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        radius = 41.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun SesionSwitchText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mantener sesión iniciada",
        fontSize = 15.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(193.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PasswordOutLinedTextField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun UserOutLinedTextField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun AudiLogoVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.login_screen_audi_logo_vector),
        modifier = modifier.requiredWidth(151.0035400390625.dp).requiredHeight(50.51604080200195.dp)
    )
}

@Composable
fun AudiLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 115.0,
        content = content,
        modifier = modifier.requiredWidth(151.0.dp).requiredHeight(146.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
