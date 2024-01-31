package com.acasloa946.figmaproject.audir8catalog

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
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'audi_r8catalog'.
 * Generated code; do not edit directly
 */
@Composable
fun AudiR8catalog(
    modifier: Modifier = Modifier,
    onButtonEspecClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BotonEspecR8(
            onButtonEspecClick = onButtonEspecClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 92.0.dp
                )
            )
        ) {
            TextBotonEspecR8()
        }
        ImageR8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -10.179351806640625.dp
                )
            )
        )
        AudiR8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -112.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 430, heightDp = 288)
@Composable
private fun AudiR8catalogPreview() {
    MaterialTheme {
        RelayContainer {
            AudiR8catalog(
                onButtonEspecClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TextBotonEspecR8(modifier: Modifier = Modifier) {
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
fun BotonEspecR8(
    onButtonEspecClick: () -> Unit,
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
        radius = 56.0,
        content = content,
        modifier = modifier.tappable(onTap = onButtonEspecClick).requiredWidth(159.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImageR8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.audi_r8catalog_image_r8),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(284.0.dp).requiredHeight(119.64129638671875.dp)
    )
}

@Composable
fun AudiR8(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Audi ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 0,
                        blue = 0
                    )
                )
            ) {
                append("R8")
            }
        },
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
