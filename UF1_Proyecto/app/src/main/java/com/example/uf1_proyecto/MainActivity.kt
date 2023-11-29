package com.example.uf1_proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonIngredientes = findViewById<Button>(R.id.botonIngredientes)
        botonIngredientes.setOnClickListener {
            val fragment = IngredientesFragment() // Crear una instancia del Fragmento
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                .commit()
        }

        val botonCategoriaFragment = findViewById<Button>(R.id.botonCategorias)
        botonCategoriaFragment.setOnClickListener {
            val fragment = CategoriaFragment() // Crear una instancia del Fragmento
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                .commit()
        }
    }
    override fun onBackPressed() {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        // Si hay fragmentos en la pila
        if (fragment !is BarritasChocolateCacahueteFragment) {
            // Realiza la transacción para volver al fragmento anterior (ProductosFragment)
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, BarritasChocolateCacahueteFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        } else {
            // Si es el fragmento BarritasChocolateCacahueteFragment, deja que el comportamiento predeterminado se ejecute (salir de la app)
            super.onBackPressed()
        }
    }

}