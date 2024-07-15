package scripts.data

import components.CardImage
import scripts.model.Cards
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.lightyear_hipervelocidad

val wildStyleCards = listOf(
    Cards(
        title = "comodìn hipervelocidad",
        desc = """
        esta carta pertenece al uno de la pelicula lightyear:
            1) el primer jugador elige un color ejemplo el azul
            2) el jugador debe tirar una del color elegido.
            3) el siguiente jugador pierde su turno.
            4) si un jugador tira una carta numerica que coincida con la pila para tomar se finalizar el efecto. 
        """.trimIndent(),
        card = { CardImage(drawable.lightyear_hipervelocidad) }
    ),
)