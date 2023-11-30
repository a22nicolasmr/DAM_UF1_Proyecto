package com.example.uf1_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton


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

        val checkBoxProteina=view.findViewById<CheckBox>(R.id.checkBoxAltoProteina)
        checkBoxProteina?.setOnCheckedChangeListener { _, isChecked ->
            // Comunicar el estado del CheckBox a la actividad anfitriona o al siguiente fragmento
            val listener = activity as? OnCheckBoxSelectedListener
            listener?.onCheckBoxSelected(isChecked)
        }

        val checkBoxBajoCalorias=view.findViewById<CheckBox>(R.id.checkBoxBajoCalorias)
        val checkBoxSinLactosa= view.findViewById<CheckBox>(R.id.checkBoxSinLactosa)
        val checkBoxHorneado=view.findViewById<CheckBox>(R.id.checkBoxHorneado)
        val checkBoxVegano=view.findViewById<CheckBox>(R.id.checkBoxVegano)
        val checkBoxSinGluten=view.findViewById<CheckBox>(R.id.checkBoxSinGluten)
        val checkBoxFrutas=view.findViewById<CheckBox>(R.id.checkBoxFrutas)


        return  view
    }


}