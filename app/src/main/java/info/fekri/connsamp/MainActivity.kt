package info.fekri.connsamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import info.fekri.connsamp.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectIndexed

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val inflateLayout = findViewById<View>(R.id.network_error)
        val networkConnection = NetworkConnection(applicationContext)
        networkConnection.observe(this) { isConnected ->
            if (isConnected) {
                Toast.makeText(this, "Connected!", Toast.LENGTH_SHORT).show()
                inflateLayout.visibility = View.VISIBLE
            } else {
                inflateLayout.visibility = View.GONE
                Toast.makeText(this, "No Internet Connected!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}