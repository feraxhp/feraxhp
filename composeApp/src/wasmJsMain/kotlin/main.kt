import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.feraxhp.main.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("main") {
        App()
    }
}
