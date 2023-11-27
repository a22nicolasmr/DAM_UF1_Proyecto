package com.example.uf1_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngredientes = findViewById<Button>(R.id.botonIngredientes)
        val btnCategorias = findViewById<Button>(R.id.botonCategorias)
        val btnSalir= findViewById<Button>(R.id.botonSalir)

        btnIngredientes.setOnClickListener {
            val intent = Intent(this, IngredientesFragment::class.java)
            startActivity(intent)
        }

        btnCategorias.setOnClickListener {
            val intent = Intent(this, CategoriaFragment::class.java)
            startActivity(intent)
        }

        btnSalir.setOnClickListener {
            finish()
        }


    }
}