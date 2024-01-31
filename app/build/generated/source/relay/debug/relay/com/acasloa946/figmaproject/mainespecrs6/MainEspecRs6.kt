package com.acasloa946.figmaproject.mainespecrs6

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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.figmaproject.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'main_espec_rs6'.
 * Generated code; do not edit directly
 */
@Composable
fun MainEspecRs6(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ImagenAbajo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -3.0.dp,
                    y = -353.0.dp
                )
            )
        )
        ImagenArriba(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -3.0.dp,
                    y = -494.04411697387695.dp
                )
            )
        )
        MainText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -3.5.dp,
                    y = -78.5.dp
                )
            )
        )
        ESPECIFICACIONES(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -3.0.dp,
                    y = 360.5.dp
                )
            )
        ) {
            ItemList3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 8.0.dp
                    )
                )
            ) {
                CapaItem3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                ItemList3Synth {
                    Item3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        ContenidoItem3(modifier = Modifier.columnWeight(1.0f)) {
                            HeadlineItem3(modifier = Modifier.rowWeight(1.0f))
                            TextoAbajoItem3(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
            }
            ItemList2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 100.0.dp
                    )
                )
            ) {
                CapaItem2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                ItemList2Synth {
                    Item2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        ContenidoItem2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            HeadlineItem2(modifier = Modifier.rowWeight(1.0f))
                            TextoAbajoItem2(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
            }
            ItemList1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -92.0.dp
                    )
                )
            ) {
                CapaItem1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                ItemList1Synth {
                    Item1(modifier = Modifier.rowWeight(1.0f)) {
                        ContenidoItem1(modifier = Modifier.rowWeight(1.0f)) {
                            HeadlineItem1(modifier = Modifier.rowWeight(1.0f))
                            TextoAbajoItem1(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 1195)
@Composable
private fun MainEspecRs6Preview() {
    MaterialTheme {
        RelayContainer {
            MainEspecRs6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun ImagenAbajo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_espec_rs6_imagen_abajo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(225.0.dp)
    )
}

@Composable
fun ImagenArriba(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_espec_rs6_imagen_arriba),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(116.9117660522461.dp)
    )
}

@Composable
fun MainText(modifier: Modifier = Modifier) {
    RelayText(
        content = "El Audi RS6 2022, versátil y potente, presenta un motor V8 biturbo de 4.0 litros para un rendimiento excepcional. Su diseño combina elegancia con detalles deportivos, mientras que el interior lujoso y tecnológico garantiza una experiencia de conducción premium. Con tracción integral Quattro y capacidades dinámicas, el RS6 ofrece un equilibrio perfecto entre estilo y rendimiento.\n\n\n\n",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(323.0.dp).requiredHeight(288.0.dp)
    )
}

@Composable
fun CapaItem3(
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

@Composable
fun HeadlineItem3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Número de plazas",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TextoAbajoItem3(modifier: Modifier = Modifier) {
    RelayText(
        content = "5",
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.25.sp,
        textAlign = TextAlign.Left,
        overflow = TextOverflow.Ellipsis,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ContenidoItem3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxHeight(1.0f)
    )
}

@Composable
fun Item3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ItemList3Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(72.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun ItemList3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun CapaItem2(
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

@Composable
fun HeadlineItem2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Consumo",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TextoAbajoItem2(modifier: Modifier = Modifier) {
    RelayText(
        content = "19L/100km",
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.25.sp,
        textAlign = TextAlign.Left,
        overflow = TextOverflow.Ellipsis,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ContenidoItem2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Item2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 24.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ItemList2Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(72.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun ItemList2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun CapaItem1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0000152587890625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun HeadlineItem1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Número de CV.",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 29,
            green = 27,
            blue = 32
        ),
        height = 1.5.em,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TextoAbajoItem1(modifier: Modifier = Modifier) {
    RelayText(
        content = "600",
        color = Color(
            alpha = 255,
            red = 73,
            green = 69,
            blue = 79
        ),
        height = 1.4285714721679688.em,
        letterSpacing = 0.25.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ContenidoItem1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun Item1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 12.0.dp,
            end = 24.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun ItemList1Synth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).alpha(alpha = 100.0f)
    )
}

@Composable
fun ItemList1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 254,
            green = 247,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(88.0.dp)
    )
}

@Composable
fun ESPECIFICACIONES(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(272.0.dp)
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
