package screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import scripts.data.commonRules

@Composable
fun CommonRulesScreen() {
    val state = rememberLazyListState()

    LazyColumn(
        state = state,
        modifier = Modifier.fillMaxSize()
    ) {
        items(commonRules) { rule ->
            ListItem(
                headlineContent = {
                    Text(rule.name, fontWeight = FontWeight.Bold)
                },
                supportingContent = { Text(rule.desc) },
                leadingContent = rule.card,
                trailingContent = rule.altCard
            )
            HorizontalDivider()
        }
    }
}