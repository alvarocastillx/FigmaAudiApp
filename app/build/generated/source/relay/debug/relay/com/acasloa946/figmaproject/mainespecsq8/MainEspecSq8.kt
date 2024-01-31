package com.acasloa946.figmaproject.mainespecsq8

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
 * This composable was generated from the UI Package 'main_espec_sq8'.
 * Generated code; do not edit directly
 */
@Composable
fun MainEspecSq8(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ImagenAbajo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -444.09375.dp
                )
            )
        )
        MainText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -43.5.dp
                )
            )
        )
        ESPECIFICACIONES(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 463.5.dp
                )
            )
        ) {
            ItemList3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                CapaItem3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                ItemList3Synth {
                    Item3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        ContenidoItem3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            HeadlineItem3(modifier = Modifier.rowWeight(1.0f))
                            TextoAbajoItem3(modifier = Modifier.rowWeight(1.0f))
                        }
                    }
                }
            }
            ItemList2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
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
                    alignment = Alignment.CenterStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -92.0.dp
                    )
                ).rowWeight(1.0f)
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
        ImageSQ8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -586.84375.dp
                )
            )
        )
    }
}

@Preview(widthDp = 430, heightDp = 1395)
@Composable
private fun MainEspecSq8Preview() {
    MaterialTheme {
        RelayContainer {
            MainEspecSq8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun ImagenAbajo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_espec_sq8_imagen_abajo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(300.0.dp).requiredHeight(182.8125.dp)
    )
}

@Composable
fun MainText(modifier: Modifier = Modifier) {
    RelayText(
        content = "El Audi SQ8 e-Tron redefine la experiencia de conducción SUV con un equilibrio perfecto entre potencia, elegancia y eficiencia. Este modelo de alto rendimiento fusiona el diseño imponente de un SUV con la tecnología avanzada de propulsión eléctrica.\nDesde su diseño exterior, que combina líneas deportivas con la robustez característica de Audi, hasta su lujoso interior, cada detalle del SQ8 E-tron refleja la excelencia artesanal de la marca. Experimenta la comodidad y la sofisticación en cada viaje.\nBajo el capó, la combinación de un potente motor eléctrico y un rendimiento excepcional redefine las expectativas de un SUV. Disfruta de una aceleración impresionante y un manejo ágil, destacando la versatilidad de este vehículo para enfrentar cualquier terreno",
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
        modifier = modifier.requiredWidth(323.0.dp).requiredHeight(576.0.dp)
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
        content = "5\n",
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
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 108.0.dp,
                end = 0.0.dp,
                bottom = 92.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        content = "26,2–28 kWh/100 km",
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
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 200.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        content = "503",
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
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(88.0.dp)
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
fun ImageSQ8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.main_espec_sq8_image_sq8),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(275.0.dp).requiredHeight(131.3125.dp)
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
