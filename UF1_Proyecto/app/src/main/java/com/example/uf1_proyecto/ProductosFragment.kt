package com.example.uf1_proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class ProductosFragment : Fragment() ,CategoriaFragment.OnCheckBoxSelectedListener{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_productos, container, false)

        val galletasAvena= view.findViewById<LinearLayout>(R.id.grupoGalletasFrutosSecos)
        galletasAvena.setOnClickListener(){
            val fragment = GalletasFrutosSecosFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val tartaVeganaChoc= view.findViewById<LinearLayout>(R.id.grupoTortaChoc)
        tartaVeganaChoc.setOnClickListener(){
            val fragment = TortaVeganaChocolateVainillaFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val barritasCacahuete= view.findViewById<LinearLayout>(R.id.grupoBarritaCacahuetesChoc)
        barritasCacahuete.setOnClickListener(){
            val fragment = BarritasChocolateCacahueteFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val ensaladaFrutas= view.findViewById<LinearLayout>(R.id.grupoEnsaladaFrutas)
        ensaladaFrutas.setOnClickListener(){
            val fragment = EnsaladaFrutasMielFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val tartaLimon= view.findViewById<LinearLayout>(R.id.grupoTartaLimonFrutos)
        tartaLimon.setOnClickListener(){
            val fragment = TartaLimonFrutosSecosFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val mousseLimon= view.findViewById<LinearLayout>(R.id.grupoMousseLimon)
        mousseLimon.setOnClickListener(){
            val fragment = MousseLimonAvenaFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val galletasLimon= view.findViewById<LinearLayout>(R.id.grupoGalletasLimonAvena)
        galletasLimon.setOnClickListener(){
            val fragment = GalletasLimonAvenaFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val galletasPasas= view.findViewById<LinearLayout>(R.id.grupoGalletasAvenaPasas)
        galletasPasas.setOnClickListener(){
            val fragment = GalletasAvenaPasasFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }

        val mousseChocolate= view.findViewById<LinearLayout>(R.id.grupoMousseChocolateVegano)
        mousseChocolate.setOnClickListener(){
            val fragment = MousseChocolateVeganoFragment() // Crear una instancia del Fragmento
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment) // Reemplazar R.id.fragment_container con tu contenedor de fragmentos

                ?.commit()
        }
        return view
    }
     fun onCheckBoxSelected(isChecked: Boolean) {
        if (isChecked) {
            layoutAMostrar?.visibility = View.VISIBLE // Mostrar el layout si el CheckBox está seleccionado
        } else {
            layoutAMostrar?.visibility = View.GONE // Ocultar el layout si el CheckBox no está seleccionado
        }
    }
}