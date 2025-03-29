package scripts.data

import androidx.compose.runtime.Composable
import components.CardImage
import unodocs.composeapp.generated.resources.Res.drawable
import unodocs.composeapp.generated.resources.comodin_pica
import unodocs.composeapp.generated.resources.comodin_diamante
import unodocs.composeapp.generated.resources.comodin_trebol
import unodocs.composeapp.generated.resources.comodin_corazon
import unodocs.composeapp.generated.resources.comodin_negro
import unodocs.composeapp.generated.resources.comodin_rojo
import unodocs.composeapp.generated.resources.comodin_poker

data class WildCards(
    val title: String,
    val desc: String,
    val image: @Composable (() -> Unit)
)

data class ButtonContainer(
    val link: String, val text: String
)

val pokerIcons = listOf(
    icons.ic_poker_spade,
    icons.ic_poker_diamond,
    icons.ic_poker_club,
    icons.ic_poker_heart,
)

val links = listOf(
    ButtonContainer(
        link = "https://bicyclecards.com/how-to-play",
        text = "bicycle aprender a jugar",
    ), // bicycle how play
    ButtonContainer(
        link = "https://stack-analyze.vercel.app/utility/poker",
        text = "stack-analyze poker",
    ), // stack-analyze ionic
)

val wildCards = listOf(
    WildCards(
        title = "comodín picas",
        desc = "descarta todas las cartas pica de tu mano",
    ) { CardImage(drawable.comodin_pica) },
    WildCards(
        title = "comodín diamantes",
        desc = "descarta todas las cartas diamantes de tu mano",
    ) { CardImage(drawable.comodin_diamante) },
    WildCards(
        title = "comodín tréboles",
        desc = "descarta todas las cartas tréboles de tu mano",
    ) { CardImage(drawable.comodin_trebol) },
    WildCards(
        title = "comodín corazones",
        desc = "descarta todas las cartas corazones de tu mano",
    ) { CardImage(drawable.comodin_corazon) },
    WildCards(
        title = "comodín negro",
        desc = "descarta todas las cartas negras de tu mano",
    ) { CardImage(drawable.comodin_negro) },
    WildCards(
        title = "comodín rojo",
        desc = "descarta todas las cartas rojas de tu mano",
    ) { CardImage(drawable.comodin_rojo) },
    WildCards(
        title = "comodín poker",
        desc = "descarta todas las cartas de tu mano",
    ) { CardImage(drawable.comodin_poker) },
)