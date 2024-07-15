package scripts.data

import scripts.model.ColorblindInfo
import unodocs.composeapp.generated.resources.Res
import unodocs.composeapp.generated.resources.colorbind_blue1
import unodocs.composeapp.generated.resources.colorbind_blue2
import unodocs.composeapp.generated.resources.colorbind_green1
import unodocs.composeapp.generated.resources.colorbind_green2
import unodocs.composeapp.generated.resources.colorbind_red1
import unodocs.composeapp.generated.resources.colorbind_red2
import unodocs.composeapp.generated.resources.colorbind_yellow1
import unodocs.composeapp.generated.resources.colorbind_yellow2

val flexColorblind = listOf(
    ColorblindInfo(
        colorName = "rojo",
        origin = "uno flex",
        image = Res.drawable.colorbind_red1
    ),
    ColorblindInfo(
        colorName = "verde",
        origin = "uno flex",
        image = Res.drawable.colorbind_green1
    ),
    ColorblindInfo(
        colorName = "amarillo",
        origin = "uno flex",
        image = Res.drawable.colorbind_yellow1
    ),
    ColorblindInfo(
        colorName = "azul",
        origin = "uno flex",
        image = Res.drawable.colorbind_blue1
    ),
)

val colorblindInfoList = listOf(
    ColorblindInfo(
        colorName = "rojo",
        origin = "uno version 2024",
        image = Res.drawable.colorbind_red2
    ),
    ColorblindInfo(
        colorName = "verde",
        origin = "uno version 2024",
        image = Res.drawable.colorbind_green2
    ),
    ColorblindInfo(
        colorName = "amarillo",
        origin = "uno version 2024",
        image = Res.drawable.colorbind_yellow2
    ),
    ColorblindInfo(
        colorName = "azul",
        origin = "uno version 2024",
        image = Res.drawable.colorbind_blue2
    ),
)