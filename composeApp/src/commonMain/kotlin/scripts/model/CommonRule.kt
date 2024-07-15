package scripts.model

import androidx.compose.runtime.Composable

data class CommonRule(
    val name: String,
    val desc: String,
    val card: (@Composable () -> Unit)? = null,
    val altCard: (@Composable () -> Unit)? = null
)