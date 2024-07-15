package scripts.data

import components.CardImage
import scripts.model.CommonRule
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.comodin_multicolor
import unodocs.composeapp.generated.resources.multicolor_oscuro
import unodocs.composeapp.generated.resources.reversa_oscuro
import unodocs.composeapp.generated.resources.reversa
import unodocs.composeapp.generated.resources.salta

val commonRules = listOf(
    CommonRule(
        name = "Decir uno",
        desc = "cuando tiras tu penultima carta debes decir uno antes que te descubra o de lo contrario debes tomar dos cartas de la pila para tomar."
    ),
    CommonRule(
        name = "Repartir cartas",
        desc = """
        la fase de preparación consiste en los siguientes casos:
            en caso de los uno junior o express son 5 cartas.
            en de si juegas los otros juegos de uno son 7 cartas.
        """.trimIndent()
    ),
    CommonRule(
        name = "como ganar",
        desc = "la forma de ganar es. que te desaches de todas tus cartas."
    ),
    CommonRule(
        name = "salta",
        desc = """
            cuando se tira esta carta, el siguiente jugador pierde su turno y tirará el siguiente según el sentido del juego.
        """.trimIndent(),
        card = { CardImage(drawable.salta) },
    ),
    CommonRule(
        name = "reversa",
        desc = """
        cuando se juega esta se cumple bajo dos condiciones. 
            condición 1: si estas en una partida de dos jugadores actua como una carta salta. 
            condición 2: cambia la dirección del juego si son mas de dos jugadores.
        """.trimIndent(),
        card = { CardImage(drawable.reversa) },
        altCard = {
            CardImage(drawable.reversa_oscuro, "(uno flip)")
        }
    ),
    CommonRule(
        name = "comodín multicolor",
        desc = """
            el jugador que tire esta carta dirá el nuevo color que se jugará o puede repetir el que ya estaba para tirar. 
            Esta carta se puede tirar sobre cualquier carta; 
        """.trimIndent(),
        card = { CardImage(drawable.comodin_multicolor) },
        altCard = {
            CardImage(drawable.multicolor_oscuro, "(uno flip)")
        }
    ),
)