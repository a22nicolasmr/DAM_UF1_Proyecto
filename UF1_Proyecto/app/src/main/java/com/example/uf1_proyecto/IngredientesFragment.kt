package com.example.uf1_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class IngredientesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_ingredientes, container, false)

        val btnOK = view.findViewById<Button>(R.id.botonBuscarIngredientes)

        btnOK.setOnClickListener {
            val intent = Intent(activity, ProductosFragment::class.java)
            startActivity(intent)
        }
        return view
    }
}