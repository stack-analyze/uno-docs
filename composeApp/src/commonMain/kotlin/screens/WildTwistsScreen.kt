package screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import scripts.data.links
import scripts.data.pokerIcons
import scripts.data.wildCards

@Composable
fun WildTwistsScreen() {
    // styles
    val pokerIconStyles = Modifier.size(40.dp).padding(vertical = 4.dp)
    val rowStyles = Modifier.fillMaxWidth()

    // open link
    val localUriHandler = LocalUriHandler.current

    // ui
    LazyColumn {
        item {
            ListItem(
                headlineContent = { Text("icons de poker") },
                supportingContent = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = rowStyles
                    ) {
                        for (pokerIcon in pokerIcons) Icon(
                            pokerIcon, "poker icon", pokerIconStyles
                        )
                    }
                }
            )
            HorizontalDivider()
        }

        item {
            ListItem(
                headlineContent = { Text("""
                    reglas de poker links:
                    'nota las reglas esta escritas en ingles'
                """.trimIndent()) },
                supportingContent = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = rowStyles,
                    ) {
                        for((link, text) in links) OutlinedButton(
                            onClick = { localUriHandler.openUri(link) },
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = MaterialTheme.colorScheme.secondary
                            )
                        ) { Text(text) }
                    }
                }
            )
            HorizontalDivider()
        }

        item {
            ListItem(
                headlineContent = { Text("modo de juego wild race") },
                supportingContent = {
                    Text(
                        """
                    este modo de juego es exclusivo para el uno wild twists.
                    
                    Para ganar, deshazte de tus cartas primero siendo rápido para golpear la pila de descarte cuando aparezca un comodín:
                        1. Tomen turnos para voltear la carta boca arriba de su mazo a la pila de descarte en el sentido de las agujas del reloj.
                        2. Vigila cuidadosamente la pila de descartes y cuando se juegue cualquier tipo de COMODÍN, ¡debes actuar RÁPIDAMENTE!
                        3. ¡Los jugadores CORREN para tocar el Comodín en la pila de descarte con su mano tan pronto como lo vean!
                        4. Si eres el ÚLTIMO jugador en golpear la pila, debes recoger cartas de la pila de descarte.
                        5. Dependiendo de lo que muestre el comodín, debes tomar cartas de la pila de descarte y agregarlas a tu baraja.
                    """.trimIndent()
                    )
                }
            )
            HorizontalDivider()
        }

        items(wildCards) {
            ListItem(
                headlineContent = { Text(it.title) },
                supportingContent = { Text(it.desc) },
                leadingContent = it.image
            )
        }
    }
}