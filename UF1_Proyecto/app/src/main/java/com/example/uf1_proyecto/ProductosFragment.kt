package com.example.uf1_proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class ProductosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_productos, container, false)


        val galletasAvena= view.findViewById<LinearLayout>(R.id.grupoGalletasFrutosSecos)
        galletasAvena.setOnClickListener(){
            val fragment = GalletasFrutosSecosFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val tartaVeganaChoc= view.findViewById<LinearLayout>(R.id.grupoTortaChoc)
        tartaVeganaChoc.setOnClickListener(){
            val fragment = TortaVeganaChocolateVainillaFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val muffinsLimon= view.findViewById<LinearLayout>(R.id.grupoMuffinsLimonAran)
        muffinsLimon.setOnClickListener(){
            val fragment = MuffinsLimonArandanosFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }
        val barritasCacahuete= view.findViewById<LinearLayout>(R.id.grupoBarritaCacahuetesChoc)
        barritasCacahuete.setOnClickListener(){
            val fragment = BarritasChocolateCacahueteFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val ensaladaFrutas= view.findViewById<LinearLayout>(R.id.grupoEnsaladaFrutas)
        ensaladaFrutas.setOnClickListener(){
            val fragment = EnsaladaFrutasMielFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val tartaLimon= view.findViewById<LinearLayout>(R.id.grupoTartaLimonFrutos)
        tartaLimon.setOnClickListener(){
            val fragment = TartaLimonFrutosSecosFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val mousseLimon= view.findViewById<LinearLayout>(R.id.grupoMousseLimon)
        mousseLimon.setOnClickListener(){
            val fragment = MousseLimonAvenaFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val galletasLimon= view.findViewById<LinearLayout>(R.id.grupoGalletasLimonAvena)
        galletasLimon.setOnClickListener(){
            val fragment = GalletasLimonAvenaFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val galletasPasas= view.findViewById<LinearLayout>(R.id.grupoGalletasAvenaPasas)
        galletasPasas.setOnClickListener(){
            val fragment = GalletasAvenaPasasFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val mousseChocolate= view.findViewById<LinearLayout>(R.id.grupoMousseChocolateVegano)
        mousseChocolate.setOnClickListener(){
            val fragment = MousseChocolateVeganoFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }

        val browniesChocho= view.findViewById<LinearLayout>(R.id.grupoBrowniesChocNueces)
        browniesChocho.setOnClickListener(){
            val fragment = BrowniesChocoNuecesFragment()
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container4, fragment)

                ?.commit()
        }
        return view
    }


}