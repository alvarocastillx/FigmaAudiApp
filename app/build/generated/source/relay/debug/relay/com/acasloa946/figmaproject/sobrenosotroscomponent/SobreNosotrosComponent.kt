package com.acasloa946.figmaproject.sobrenosotroscomponent

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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

/**
 * This composable was generated from the UI Package 'sobre_nosotros_component'.
 * Generated code; do not edit directly
 */
@Composable
fun SobreNosotrosComponent(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        BotonInfo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 178.0.dp
                )
            )
        ) {
            CapaBotonInfo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                TextBotonInfo()
            }
        }
        SobreNosotros(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 38.0.dp
                )
            )
        ) {
            TextoInfo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 121.0.dp
                    )
                )
            )
            ImagenFactory(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = -29.0.dp
                    )
                )
            )
            TextSobreNosotros(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -145.5.dp
                    )
                )
            )
        }
        LineaSeparatoriaMedio(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -213.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 430, heightDp = 470)
@Composable
private fun SobreNosotrosComponentPreview() {
    MaterialTheme {
        RelayContainer {
            SobreNosotrosComponent(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun TextBotonInfo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sepa más sobre nosotros",
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
fun CapaBotonInfo(
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
fun BotonInfo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 8.0,
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(40.0.dp).relayDropShadow(
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
fun TextoInfo(modifier: Modifier = Modifier) {
    RelayText(
        content = "En Audi, nos dedicamos a la excelencia en el diseño, la innovación y la pasión por la ingeniería automotriz.\nDesde nuestros inicios, hemos liderado el camino en la creación de vehículos que fusionan la elegancia con el rendimiento de vanguardia.",
        fontSize = 15.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(388.0.dp).requiredHeight(90.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun ImagenFactory(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sobre_nosotros_component_imagen_factory),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(325.0.dp).requiredHeight(162.0.dp).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 5.0.dp,
            offsetY = 9.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun TextSobreNosotros(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sobre nosotros",
        fontSize = 30.0.sp,
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
fun SobreNosotros(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(332.0.dp)
    )
}

@Composable
fun LineaSeparatoriaMedio(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sobre_nosotros_component_linea_separatoria_medio),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(0.0.dp)
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
