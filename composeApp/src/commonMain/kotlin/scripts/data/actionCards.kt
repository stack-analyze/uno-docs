package scripts.data

import components.CardImage
import scripts.model.Cards
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.flex_reversa
import unodocs.composeapp.generated.resources.flex_salta
import unodocs.composeapp.generated.resources.flex_toma2
import unodocs.composeapp.generated.resources.flip_claro
import unodocs.composeapp.generated.resources.flip_oscuro
import unodocs.composeapp.generated.resources.salta_todos
import unodocs.composeapp.generated.resources.tira_un_color
import unodocs.composeapp.generated.resources.toma1
import unodocs.composeapp.generated.resources.toma2
import unodocs.composeapp.generated.resources.toma4
import unodocs.composeapp.generated.resources.toma5

val actionCards = listOf(
    Cards(
        title = "toma 1",
        desc = """
        esta carta aparece en los UNO express, junior y flip:
        el siguiente jugador toma 1 carta y pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.toma1) }
    ),
    Cards(
        title = "toma 2",
        desc = """
        esta carta aparece en todos los UNO excepto. 
        express, flip y all wild:
        el siguiente jugador toma 2 cartas y pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.toma2) }
    ),
    Cards(
        title = "toma 4",
        desc = """
        esta carta es exclusivo de uno no mercy:
        el siguiente jugador toma 4 cartas y pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.toma4) }
    ),
    Cards(
        title = "toma 5",
        desc = """
        esta carta es exclusivo de uno flip:
        el siguiente jugador toma 5 cartas y pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.toma5) }
    ),
    Cards(
        title = "flex toma 2",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: toma 2 cartas y pierde su turno.
            lado flex: todos toma 1 carta.
        """.trimIndent(),
        card = { CardImage(drawable.flex_toma2) }
    ),
    Cards(
        title = "salta a todos",
        desc = """
        esta carta aparece en los UNO: flip y no mercy:
        todos los jugadores pierden su turno excepto quien lanzo la carta.
        """.trimIndent(),
        card = { CardImage(drawable.salta_todos) }
    ),
    Cards(
        title = "tira un color",
        desc = """
        esta carta es exclusivo de uno no mercy y uno mobile:
        cuando lanza esta carta deshaces de todas la cartas del color indicado.
        ejemplo si lanzo la tira tira un color rojo, debes deshacer todas las cartas de ese color.
        """.trimIndent(),
        card = { CardImage(drawable.tira_un_color) }
    ),
    Cards(
        title = "flex reversa",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: funciona igual a la carta reversa.
            lado flex: aprate de cambiar la direcciòn el siguiente jugador pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.flex_reversa) }
    ),
    Cards(
        title = "flex salta",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: funciona igual a la carta salta.
            lado flex: funciona igual a la carta salta a todos.
        """.trimIndent(),
        card = { CardImage(drawable.flex_salta) }
    ),
    Cards(
        title = "flip",
        desc = """
        esta carta exclusivo de uno flip.
        cuando se juega una carta flip se cambio de lado claro a oscuro o viceversa.
        esta carta tiene la posibilidad que la salga un comodìn.
        las cartas de acciòn no se aplica su efecto.
        """.trimIndent(),
        card = { CardImage(drawable.flip_claro, "(claro)") },
        altCard = { CardImage(drawable.flip_oscuro, "(oscuro)") }
    )
)