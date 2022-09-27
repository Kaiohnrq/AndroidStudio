package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentFormBinding
import com.example.todolist.databinding.FragmentListBinding

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    binding = FragmentFormBinding.inflate(layoutInflater, container, false)


    binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }

    binding.buttonCancelar.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }

        return binding.root
    }

}