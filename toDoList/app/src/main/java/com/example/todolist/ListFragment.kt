package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.adapter.TarefaAdapter
import com.example.todolist.databinding.FragmentListBinding
import com.example.todolist.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    binding = FragmentListBinding.inflate(layoutInflater, container, false)



    val listTarefas = listOf(
        Tarefa(
            "Lavar a louça",
            "Lavar a louça o dia todo!",
            "Kaio Henrique",
            "2022-09-26",
            false,
            "dia a dia"
        ),
        Tarefa(
            "Lavar a moto",
            "Lavar a moto após o curso",
            "Kaio Henrique",
            "2022-09-26",
            true,
            "dia a dia"
        ),
        Tarefa(
            "Almoçar",
            "Almoçar no horario certo",
            "Kaio Henrique",
            "2022-09-26",
            false,
            "dia a dia"
        )
    )

    val adapter = TarefaAdapter()
    binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
    binding.recyclerTarefa.adapter = adapter
    binding.recyclerTarefa.setHasFixedSize(true)

    adapter.setList(listTarefas)

    binding.floatingActionButton.setOnClickListener {
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

    return binding.root
    }

}