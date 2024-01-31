package com.acasloa946.figmaproject.vehiculoselectricos

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.figmaproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'vehiculos_electricos'.
 * Generated code; do not edit directly
 */
@Composable
fun VehiculosElectricos(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        AudiLogo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -33.5.dp
                )
            )
        ) {
            AudiLogoVector(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.00048828125.dp,
                        y = 0.0.dp
                    )
                ).rowWeight(1.0f).columnWeight(1.0f)
            )
        }
        TextoElectricos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -75.5.dp
                )
            )
        )
        CarImages(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 31.0.dp,
                    y = 91.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 430, heightDp = 288)
@Composable
private fun VehiculosElectricosPreview() {
    MaterialTheme {
        RelayContainer {
            VehiculosElectricos(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun AudiLogoVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.vehiculos_electricos_audi_logo_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 14.06103515625.dp,
                end = 0.0.dp,
                bottom = 14.060953140258789.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AudiLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(44.0.dp).requiredHeight(43.0.dp)
    )
}

@Composable
fun TextoElectricos(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Vehículos ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 62,
                        green = 190,
                        blue = 2
                    )
                )
            ) {
                append("eléctricos")
            }
        },
        fontSize = 30.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(41.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CarImages(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.vehiculos_electricos_car_images),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(367.0.dp).requiredHeight(168.0.dp)
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
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
