package components

import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HouseRule(title: String, desc: String) {
    ListItem(
        headlineContent = { Text(title) },
        supportingContent = { Text(desc) }
    )
}