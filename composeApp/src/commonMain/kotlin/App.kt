import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import screens.MainScreen
import themes.AppTheme

@Composable
fun App() {
    AppTheme {
        Surface(modifier = Modifier.fillMaxSize()) { MainScreen() }
    }
}