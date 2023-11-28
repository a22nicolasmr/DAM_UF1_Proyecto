package com.example.uf1_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class CategoriaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_categoria, container, false)

        val botonIngredientes = view.findViewById<Button>(R.id.botonBuscarCategorias)

        botonIngredientes.setOnClickListener {
            val fragment = ProductosFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container3, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }
        return  view
    }


}