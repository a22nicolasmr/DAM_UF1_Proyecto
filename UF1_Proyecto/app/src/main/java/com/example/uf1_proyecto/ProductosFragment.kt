package com.example.uf1_proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class ProductosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_productos, container, false)

        val muffinsLimonArand = view.findViewById<LinearLayout>(R.id.grupoMuffinsLimonAran)

        // Obtener instancia de IngredientesFragment
        val ingredientsFragment = childFragmentManager.findFragmentByTag("tag_ingredients") as? IngredientesFragment

        // Verificar el estado del CheckBox desde IngredientesFragment
        val checkBoxState = ingredientsFragment?.getCheckBoxState() ?: false

        if (checkBoxState) {
            muffinsLimonArand.visibility = View.VISIBLE
        } else {
            muffinsLimonArand.visibility = View.GONE
        }

        return view
    }
}