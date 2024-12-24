package scripts.data

import components.CardImage
import scripts.model.Cards
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.comodin_elige_toma2
import unodocs.composeapp.generated.resources.comodin_intercambio
import unodocs.composeapp.generated.resources.comodin_personalizable
import unodocs.composeapp.generated.resources.comodin_reversa
import unodocs.composeapp.generated.resources.comodin_reversa_toma4
import unodocs.composeapp.generated.resources.comodin_ruleta_de_color
import unodocs.composeapp.generated.resources.comodin_salta
import unodocs.composeapp.generated.resources.comodin_salta2
import unodocs.composeapp.generated.resources.comodin_todos_toman
import unodocs.composeapp.generated.resources.comodin_todos_voltean
import unodocs.composeapp.generated.resources.comodin_toma10
import unodocs.composeapp.generated.resources.comodin_toma2
import unodocs.composeapp.generated.resources.comodin_toma2_focalizada
import unodocs.composeapp.generated.resources.comodin_toma4
import unodocs.composeapp.generated.resources.comodin_toma4_focalizada
import unodocs.composeapp.generated.resources.comodin_toma6
import unodocs.composeapp.generated.resources.comodin_toma_un_color

val wildcards = listOf(
    Cards(
        title = "comodín personalizado",
        desc = """
        aparece en el uno tradicional de 2005 en adelante y pocos uno de estilo como el super mario.
            1) cambiar el color de la parte
            2) le puedes asignar una regla personalizada:
                a) robar 5 cartas "ejemplo"
                b) imunidad al cartigo de robar cartas "ejemplo"
        """.trimIndent(),
        card = { CardImage(drawable.comodin_personalizable) }
    ),
    Cards(
        title = "comodìn toma 2",
        desc = """
        esta carta para el uno all wild:
            el siguiente jugador toma 2 cartas y pierde su turno.
        para los uno flip y express se aplica lo siguiente:
            sí no te desafia robas 2 cartas y pierdes el turno.
            sí ganas el desafio el jugador que tiro el comodin toma 2 va tomar las 2 cartas en su lugar.
            sí pierdes el desafio toma 4 y pierden el turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma2) }
    ),
    Cards(
        title = "comodìn toma 4",
        desc = """
        esta carta para el uno all wild:
            el siguiente jugador toma 4 cartas y pierde su turno.
        para el resto de los uno excepto flip, junior y express se aplica el modo desafio:
            sí no te desafia robas 4 cartas y pierdes el turno.
            sí ganas el desafio el jugador que tiro el comodin toma 4 va tomar las 4 cartas en su lugar.
            sí pierdes el desafio toma 6 y pierden el turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma4) }
    ),
    Cards(
        title = "comodìn toma 2 focalizado",
        desc = """
        esta carta es exclusivo de uno all wild:
        seleccionas al cualquier jugador para tomar 2 cartas y no pierde turno
        """.trimIndent(),
        card = { CardImage(drawable.comodin_elige_toma2) }
    ),
    Cards(
        title = "comodìn salta 2",
        desc = """
        esta carta es exclusivo de uno all wild:
        los siguientes 2 jugadores pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_salta2) }
    ),
    Cards(
        title = "comodìn intecambio obligatorio",
        desc = """
        esta carta es exclusivo de uno all wild:
        el jugador que tiro esta carta debe intercambiar su mazo con cualquier jugador de su elecciòn.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_intercambio) }
    ),
    Cards(
        title = "comodìn toma salta",
        desc = """
        esta carta es exclusivo de uno all wild:
        funciona exctamente igual a la carta salta normal.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_salta) }
    ),
    Cards(
        title = "comodìn reversa",
        desc = """
        esta carta es exclusivo de uno all wild:
        funciona exctamente igual a la carta reversa normal.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_reversa) }
    ),
    Cards(
        title = "comodìn toma un color",
        desc = """
        esta carta es exclusivo de uno flip:
            sí no te desafia robas cartas hasta que le salga el color eligido y pierdes el turno.
            sí ganas el desafio el jugador que tiro el comodin toma un color va tomar ese castigo en su lugar.
            sí pierdes el desafio vas a cartas hasta que le salga el color que se selecciono mas 2 cartas extra y pierden el turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma_un_color) }
    ),
    Cards(
        title = "comodìn todos voltean",
        desc = """
        esta carta es exclusivo de uno flex:
        todos los jugadores deben voltean su carta de poder:
            si su carta de poder esta en rojo de cambiar verde o viceversa.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_todos_voltean) }
    ),
    Cards(
        title = "comodìn todos toman",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: exactamente igual al comodìn multicolor.
            lado flex: todos los jugadores toman 2 cartas y no pierden el turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_todos_toman) }
    ),
    Cards(
        title = "comodìn flex toma 2 focalizado",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: exactamente igual al comodìn multicolor.
            lado flex: seleccionas al cualquier jugador para tomar 2 cartas y no pierde turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma2_focalizada) }
    ),
    Cards(
        title = "comodìn flex toma 4",
        desc = """
        esta carta es exclusivo de uno flex:
            lado regular: exactamente igual al comodìn toma 4.
            lado flex: seleccionas al cualquier jugador para tomar 4 cartas y no pierde turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma4_focalizada) }
    ),
    Cards(
        title = "comodìn reversa toma 4",
        desc = """
        esta carta es exclusivo de uno no mercy:
        cambias la direccìòn del juego y luego toma 4 cartas y pierde su turno.
        "si estas una partida de 2 jugadores tenga cuidado por suerte se puede aplicar la regla de acumulaciòn."
        """.trimIndent(),
        card = { CardImage(drawable.comodin_reversa_toma4) }
    ),
    Cards(
        title = "comodìn ruleta de color",
        desc = """
        esta carta es exclusivo de uno no mercy:
            1) el siguiente jugador elige un color. 
            2) luego debe sacar cartas hasta que le salga una carta de ese color.
            3) los comodines no aplica y pierde su turno. 
        """.trimIndent(),
        card = { CardImage(drawable.comodin_ruleta_de_color) }
    ),
    Cards(
        title = "comodìn toma 6",
        desc = """
        esta carta es exclusivo de uno no mercy:
        el siguiente jugador tomar 6 cartas y pierde su turno.
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma6) }
    ),
    Cards(
        title = "comodìn toma 10",
        desc = """
        esta carta es exclusivo de uno no mercy:
        el siguiente jugador jugador tomar 10 cartas y pierde su turno
        """.trimIndent(),
        card = { CardImage(drawable.comodin_toma10) }
    ),
)