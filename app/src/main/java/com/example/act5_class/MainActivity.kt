package com.example.act5_class

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.act5_class.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val miBoton = binding.btnPasar
        val txtNombre = binding.txtValor

        miBoton.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            intento1.putExtra("nombre", txtNombre.text.toString())
            startActivity(intento1)
        }
    }
}