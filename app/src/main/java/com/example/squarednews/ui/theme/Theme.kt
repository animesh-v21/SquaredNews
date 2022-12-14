package com.example.squarednews.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = primaryMain,
    primaryVariant = primaryAux,
    secondary = secondaryAux,
    background = secondaryMain
)

@Composable
fun SquaredNewsTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}