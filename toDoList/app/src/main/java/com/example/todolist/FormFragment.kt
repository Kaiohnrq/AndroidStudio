package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_form, container, false)

        val buttonSalvar = view.findViewById<Button>(R.id.buttonSalvar)
        buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }

        val buttonCancelar = view.findViewById<Button>(R.id.buttonCancelar)
        buttonCancelar.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }

        return view
    }

}