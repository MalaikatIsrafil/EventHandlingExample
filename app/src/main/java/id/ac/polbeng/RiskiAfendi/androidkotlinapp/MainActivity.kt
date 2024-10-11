package id.ac.polbeng.RiskiAfendi.androidkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import android.view.View
import android.widget.Toast
import id.ac.polbeng.RiskiAfendi.androidkotlinapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDisplayMessage.setOnClickListener {   //Fungsi lamda
            Toast.makeText(
                applicationContext,
                "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }

        binding.btnDisplayMessage.setOnLongClickListener{
            Snackbar.make(binding.rootLayout, "Long Click", Snackbar.LENGTH_LONG).show()
            true
        }
    }
}
