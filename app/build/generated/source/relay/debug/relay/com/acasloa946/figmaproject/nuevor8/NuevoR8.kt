package com.acasloa946.figmaproject.nuevor8

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.figmaproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'nuevo_r8'.
 * Generated code; do not edit directly
 */
@Composable
fun NuevoR8(
    modifier: Modifier = Modifier,
    onEspecButtonClick: () -> Unit = {},
    onLeftArrowClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ButtonConfig(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = -85.5.dp,
                    y = 0.0.dp
                )
            ).columnWeight(1.0f)
        ) {
            CapaButtonConfig(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                TextButtonConfig()
            }
        }
        BotonEspec(
            onEspecButtonClick = onEspecButtonClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 223.0.dp,
                    y = 221.0.dp
                )
            )
        ) {
            CapaBotonEspec(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                TextoBotonEspec()
            }
        }
        R8Image(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 8.0.dp
                )
            )
        )
        BannerSuperior(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -97.5.dp
                )
            )
        ) {
            NUEVOR8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = -1.0.dp
                    )
                )
            )
        }
        LeftArrow(
            onLeftArrowClick = onLeftArrowClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -174.0.dp,
                    y = 8.5.dp
                )
            )
        ) {
            LeftArrowVector(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 273)
@Composable
private fun NuevoR8Preview() {
    MaterialTheme {
        RelayContainer {
            NuevoR8(
                onEspecButtonClick = {},
                onLeftArrowClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TextButtonConfig(modifier: Modifier = Modifier) {
    RelayText(
        content = "Configure el suyo",
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.10000000149011612.sp,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CapaButtonConfig(
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 24.0.dp,
            top = 10.0.dp,
            end = 24.0.dp,
            bottom = 10.0.dp
        ),
        itemSpacing = 8.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ButtonConfig(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 8.0,
        radius = 100.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 221.0.dp,
                end = 0.0.dp,
                bottom = 12.0.dp
            )
        ).requiredWidth(159.0.dp).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 38,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 100.0.dp,
            blur = 3.0.dp,
            offsetX = 0.0.dp,
            offsetY = 1.0.dp,
            spread = 1.0.dp
        )
    )
}

@Composable
fun TextoBotonEspec(modifier: Modifier = Modifier) {
    RelayText(
        content = "Especificaciones",
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
fun CapaBotonEspec(
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
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BotonEspec(
    onEspecButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 8.0,
        radius = 100.0,
        content = content,
        modifier = modifier.tappable(onTap = onEspecButtonClick).requiredWidth(159.0.dp).requiredHeight(40.0.dp).relayDropShadow(
            color = Color(
                alpha = 38,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 100.0.dp,
            blur = 3.0.dp,
            offsetX = 0.0.dp,
            offsetY = 1.0.dp,
            spread = 1.0.dp
        )
    )
}

@Composable
fun R8Image(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.nuevo_r8_r8image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(284.0.dp).requiredHeight(117.0.dp)
    )
}

@Composable
fun NUEVOR8(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 255,
                        blue = 255
                    ),
                    fontFamily = inter,
                    fontSize = 30.0.sp,
                    fontWeight = FontWeight(600.0.toInt())
                )
            ) {
                append("NUEVO ")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 0,
                        blue = 0
                    ),
                    fontFamily = inter,
                    fontSize = 30.0.sp,
                    fontWeight = FontWeight(600.0.toInt())
                )
            ) {
                append("R8")
            }
        },
        fontSize = 30.0.sp,
        fontFamily = inriaSerif,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.1990000406901042.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun BannerSuperior(
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
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(78.0.dp)
    )
}

@Composable
fun LeftArrowVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.nuevo_r8_left_arrow_vector),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun LeftArrow(
    onLeftArrowClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onLeftArrowClick).requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
