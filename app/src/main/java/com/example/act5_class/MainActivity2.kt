package com.example.act5_class

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.act5_class.databinding.ActivityMain2Binding
import com.example.act5_class.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding2: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        val bundle = intent.extras
        val dato = bundle?.getString("nombre")

        binding2.lblRecibe.text = "Mi nombre es: ${dato.toString()}"

        val miBtnRegresar = binding2.btnRegresar

        miBtnRegresar.setOnClickListener {
            finish()
        }
    }
}