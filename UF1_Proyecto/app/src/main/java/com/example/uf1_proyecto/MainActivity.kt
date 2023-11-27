package com.example.uf1_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.botonIngredientes).setOnClickListener {
            cambiarFragmento(IngredientesFragment())
        }

        // Manejo del botón para el fragmento de Categorías
        findViewById<Button>(R.id.botonCategorias).setOnClickListener {
            cambiarFragmento(CategoriaFragment())
        }
    }
    private fun cambiarFragmento(fragmento: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragmento)
            .addToBackStack(null)
            .commit()
    }
}