package scripts.data

import components.CardImage
import scripts.model.Cards
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.comodin_mezcla_cartas
import unodocs.composeapp.generated.resources.lightyear_hipervelocidad

val wildStyleCards = listOf(
    Cards(
        title = "comodín mezcla las cartas",
        desc = """
        esta carta fue agregada en el uno tradicional en su edición de 2018:
            1) te permite equilibrar las cartas de todos lo jugadores que tiene en la mano.
            2) te permite cambiar el color debido que es un comodín.
        "debes usar de forma tactica al se la carta mas rota debido que solo hay una."
        """.trimIndent(),
        card = { CardImage(drawable.comodin_mezcla_cartas) }
    ),
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