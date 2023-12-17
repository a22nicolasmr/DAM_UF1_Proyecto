package com.example.uf1_proyecto

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonIngredientes = findViewById<Button>(R.id.botonIngredientes)
        botonIngredientes.setOnClickListener {
            val fragment = IngredientesFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)

                .commit()
        }

        val botonCategoriaFragment = findViewById<Button>(R.id.botonCategorias)
        botonCategoriaFragment.setOnClickListener {
            val fragment = CategoriaFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)

                .commit()
        }



    }
}