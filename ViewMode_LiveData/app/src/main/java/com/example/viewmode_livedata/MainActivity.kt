package com.example.viewmode_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.viewmode_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel :: class.java)

        mainViewModel.cont.observe(this){
            binding.textResultado.text = it.toString()
        }

        binding.buttonClique.setOnClickListener {
            mainViewModel.addNum()
        }

    }


}