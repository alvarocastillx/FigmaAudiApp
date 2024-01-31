package com.acasloa946.figmaproject.settingsscreen

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'settings_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun SettingsScreen(
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
        ) {}
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
        ) {}
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
        ) {}
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
        ) {}
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

@Preview(widthDp = 430, heightDp = 793)
@Composable
private fun SettingsScreenPreview() {
    MaterialTheme {
        RelayContainer {
            SettingsScreen(
                onContactButtonClick = {},
                onLoginButtonClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ContactButtonText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contacto",
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
fun ContactButton(
    onContactButtonClick: () -> Unit,
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
        radius = 125.0,
        content = content,
        modifier = modifier.tappable(onTap = onContactButtonClick).requiredWidth(150.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LoginButtonText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicio de sesión",
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
        radius = 119.0,
        content = content,
        modifier = modifier.tappable(onTap = onLoginButtonClick).requiredWidth(148.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun SwitchDatos(
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
        radius = 39.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TextLimit(modifier: Modifier = Modifier) {
    RelayText(
        content = "Limitar uso de datos",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun UsoDeDatos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Uso de datos",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.210227279663086.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun SwitchData(
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
        radius = 38.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TextData(modifier: Modifier = Modifier) {
    RelayText(
        content = "Habilitar protección de datos",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SwitchRecon(
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
        radius = 62.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TextRecon(modifier: Modifier = Modifier) {
    RelayText(
        content = "Habilitar reconocimiento facial",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TextPrivacidad(modifier: Modifier = Modifier) {
    RelayText(
        content = "Privacidad",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.210227279663086.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
        radius = 76.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TextSesion(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mantener sesión iniciada",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TextGeneral(modifier: Modifier = Modifier) {
    RelayText(
        content = "General",
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.210227279663086.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
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
