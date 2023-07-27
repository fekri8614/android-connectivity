package info.fekri.connsamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import info.fekri.connsamp.databinding.ActivityMainBinding
import info.fekri.connsamp.ui.theme.BackgroundMain
import info.fekri.connsamp.ui.theme.ConnSampTheme
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectIndexed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_LTR
        setContent {
            ConnSampTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundMain
                ) {
                    MainAppUi()
                }
            }
        }
    }
}

@Composable
fun MainAppUi() {

}
