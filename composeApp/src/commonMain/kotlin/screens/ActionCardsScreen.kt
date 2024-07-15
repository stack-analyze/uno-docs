package screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import scripts.data.actionCards

@Composable
fun ActionCardsScreen() {
    LazyColumn {
        items(actionCards) {
            ListItem(
                headlineContent = { Text(it.title) },
                supportingContent = { Text(it.desc) },
                leadingContent = it.card,
                trailingContent = it.altCard
            )
            HorizontalDivider()
        }
    }
}