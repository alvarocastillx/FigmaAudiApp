package com.acasloa946.figmaproject.catalognavigationbar

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.acasloa946.figmaproject.R
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'catalog_navigation_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun CatalogNavigationBar(
    modifier: Modifier = Modifier,
    onSettingsButtonClick: () -> Unit = {},
    onCarIconClick: () -> Unit = {},
    onAudiIconClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangle1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        FrameSettingsButton(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 146.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            SettingsIcon(
                onSettingsButtonClick = onSettingsButtonClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.6094894409179688.dp,
                        y = 0.39999961853027344.dp
                    )
                )
            ) {
                SettingsIconVector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.0002155303955078125.dp,
                            y = -0.0000171661376953125.dp
                        )
                    )
                )
            }
        }
        FrameCatalogButton(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            CarIcon(
                onCarIconClick = onCarIconClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.10948944091796875.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                Vector2CarIcon(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Vector1CarIcon(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0001430511474609375.dp,
                            y = 1.0.dp
                        )
                    )
                )
            }
        }
        FrameAudiIcon(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -146.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            AudiIcon(
                onAudiIconClick = onAudiIconClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.9793167114257812.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                AudiIconVector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.00078582763671875.dp,
                            y = -0.00006580352783203125.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 60)
@Composable
private fun CatalogNavigationBarPreview() {
    MaterialTheme {
        RelayContainer {
            CatalogNavigationBar(
                onSettingsButtonClick = {},
                onCarIconClick = {},
                onAudiIconClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.catalog_navigation_bar_rectangle_1),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(60.0.dp)
    )
}

@Composable
fun SettingsIconVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.catalog_navigation_bar_settings_icon_vector),
        modifier = modifier.requiredWidth(42.05839157104492.dp).requiredHeight(40.666664123535156.dp)
    )
}

@Composable
fun SettingsIcon(
    onSettingsButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 115.0,
        content = content,
        modifier = modifier.tappable(onTap = onSettingsButtonClick).requiredWidth(50.21897888183594.dp).requiredHeight(48.79999923706055.dp)
    )
}

@Composable
fun FrameSettingsButton(
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
        modifier = modifier.requiredWidth(137.0.dp).requiredHeight(60.0.dp)
    )
}

@Composable
fun Vector2CarIcon(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(50.21897888183594.dp).requiredHeight(48.0.dp))
}

@Composable
fun Vector1CarIcon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.catalog_navigation_bar_vector1car_icon),
        modifier = modifier.requiredWidth(41.84914779663086.dp).requiredHeight(34.0.dp)
    )
}

@Composable
fun CarIcon(
    onCarIconClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 115.0,
        content = content,
        modifier = modifier.tappable(onTap = onCarIconClick).requiredWidth(50.21897888183594.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameCatalogButton(
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
        modifier = modifier.requiredWidth(156.0.dp).requiredHeight(60.0.dp)
    )
}

@Composable
fun AudiIconVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.catalog_navigation_bar_audi_icon_vector),
        modifier = modifier.requiredWidth(66.960205078125.dp).requiredHeight(21.452016830444336.dp)
    )
}

@Composable
fun AudiIcon(
    onAudiIconClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 115.0,
        content = content,
        modifier = modifier.tappable(onTap = onAudiIconClick).requiredWidth(66.95863342285156.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun FrameAudiIcon(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(137.0.dp).requiredHeight(60.0.dp)
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
        strokeWidth = 1.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
