package scripts.model

import org.jetbrains.compose.resources.DrawableResource


data class ColorblindInfo(
    val colorName: String,
    val image: DrawableResource,
    val origin: String,
)


