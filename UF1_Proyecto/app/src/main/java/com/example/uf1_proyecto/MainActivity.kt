package com.example.uf1_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngredientes = findViewById<Button>(R.id.botonIngredientes)
        val btnCategorias = findViewById<Button>(R.id.botonCategorias)
        val btnSalir= findViewById<Button>(R.id.botonSalir)

        btnIngredientes.setOnClickListener {
            val intent = Intent(this, ButonIngredientes::class.java)
            startActivity(intent)
        }

        btnCategorias.setOnClickListener {
            val intent = Intent(this, ButtonCategory::class.java)
            startActivity(intent)
        }

        btnSalir.setOnClickListener {
            finish()
        }
    }
}