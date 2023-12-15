package com.example.uf1_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

class EnsaladaFrutasMielFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ensalada_frutas_miel, container, false)
        // Inflate the layout for this fragment
        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(activity, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.flechaBack->{
                    val fragment = ProductosFragment()
                    activity?.supportFragmentManager?.beginTransaction()
                        ?.replace(R.id.fragment_container5, fragment)
                        ?.commit()
                    true
                }
                R.id.exit -> {
                    activity?.finish()
                    true
                }

                else -> false
            }
        }
        return view
    }


}