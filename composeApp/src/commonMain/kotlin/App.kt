

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentasion.LoginPage
import themes.PoppinsTypography

@Composable
@Preview
fun App() {
    MaterialTheme(typography = PoppinsTypography()) {
        LoginPage()
    }
}
