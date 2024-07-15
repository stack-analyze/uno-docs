package scripts.model

import androidx.compose.runtime.Composable

data class Cards(
    val title: String,
    val desc: String,
    val card: (@Composable () -> Unit),
    val altCard: (@Composable () -> Unit)? = null,
)
