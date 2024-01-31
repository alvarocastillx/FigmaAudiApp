package com.acasloa946.figmaproject.electricoscomponent

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
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'electricos_component'.
 * Generated code; do not edit directly
 */
@Composable
fun ElectricosComponent(
    modifier: Modifier = Modifier,
    onDiscoverButtonClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BackVideo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        DiscoverButton(
            onDiscoverButtonClick = onDiscoverButtonClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 151.0.dp,
                    y = 218.0.dp
                )
            )
        ) {
            DiscoverButtonText()
        }
        Class3CarImages(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -27.5.dp
                )
            )
        )
        LineaSeparatoriaLower(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = -166.0.dp
                )
            )
        )
        TextElectric(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -130.5.dp
                )
            )
        )
        AudiIcon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -96.0.dp
                )
            )
        ) {
            Vector(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0005168914794921875.dp,
                        y = 0.00004100799560546875.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 371)
@Composable
private fun ElectricosComponentPreview() {
    MaterialTheme {
        RelayContainer {
            ElectricosComponent(
                onDiscoverButtonClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BackVideo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.electricos_component_back_video),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(371.0.dp)
    )
}

@Composable
fun DiscoverButtonText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Descúbrelos",
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
fun DiscoverButton(
    onDiscoverButtonClick: () -> Unit,
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
        radius = 50.0,
        content = content,
        modifier = modifier.tappable(onTap = onDiscoverButtonClick).requiredWidth(127.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun Class3CarImages(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.electricos_component_3car_images),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(367.0.dp).requiredHeight(94.0.dp)
    )
}

@Composable
fun LineaSeparatoriaLower(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.electricos_component_linea_separatoria_lower),
        modifier = modifier.requiredWidth(400.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun TextElectric(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 25.0.sp)) {
                append("Nueva gama totalmente")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 62,
                        green = 190,
                        blue = 2
                    ),
                    fontSize = 25.0.sp
                )
            ) {
                append(" eléctrica")
            }
        },
        fontSize = 25.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.210227279663086.em,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.electricos_component_vector),
        modifier = modifier.requiredWidth(44.001033782958984.dp).requiredHeight(14.878011703491211.dp)
    )
}

@Composable
fun AudiIcon(
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
