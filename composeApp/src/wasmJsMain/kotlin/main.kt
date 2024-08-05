import androidx.compose.runtime.SideEffect
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.feraxhp.main.App

@OptIn(ExperimentalComposeUiApi::class)
private fun main() {
    CanvasBasedWindow("feraxhp") {
        App()
        SideEffect {
            unSetLoader()
        }
    }
}

fun unSetLoader(): String =
    js("document.querySelector(\"#loaderIndicator\").style.display = \"none\"")
