package com.example.uf1_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox


class IngredientesFragment : Fragment() {

    // Referencia al CheckBox dentro de IngredientesFragment
    private lateinit var checkBoxLimon: CheckBox

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ingredientes, container, false)

        // Asignar el CheckBox desde la vista inflada
        checkBoxLimon = view.findViewById(R.id.checkBoxLimon)

        // Puedes configurar listeners u otras operaciones con el CheckBox aquí

        return view
    }

    // Método para obtener el estado actual del CheckBox
    fun getCheckBoxState(): Boolean {
        return checkBoxLimon.isChecked
    }
}
