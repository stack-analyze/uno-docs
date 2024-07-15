package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import scripts.data.colorblindInfoList
import scripts.data.flexColorblind

@Composable
fun ColorblindScreen() {
    // syles
    val contentStyles = Modifier.padding(10.dp)

    // body
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 150.dp),
    ) {
        items(colorblindInfoList) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = contentStyles
            ) {
                Icon(
                    painter = painterResource(it.image),
                    contentDescription = "colorbind",
                    modifier = Modifier.size(80.dp),
                    tint = MaterialTheme.colorScheme.inverseSurface
                )
                Text(it.colorName)
                Text(it.origin)
            }
        }

        items(flexColorblind) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = contentStyles
            ) {
                Icon(
                    painter = painterResource(it.image),
                    contentDescription = "colorblind",
                    modifier = Modifier.size(80.dp),
                    tint = MaterialTheme.colorScheme.inverseSurface
                )
                Text(it.colorName)
                Text(it.origin)
            }
        }
    }
}