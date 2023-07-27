package info.fekri.connsamp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColors = lightColors(
    primary = PrimaryDarkColor,
    secondary = PrimaryDarkColor,
    background = BackgroundMain
)

@Composable
fun ConnSampTheme(content: @Composable () -> Unit) {

    MaterialTheme(
        colors = LightColors,
        typography = Typography,
        content = content,
        shapes = Shapes
    )

}