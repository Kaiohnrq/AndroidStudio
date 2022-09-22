package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val buttonD6 = findViewById<Button>(R.id.botaoD6)

            buttonD6.setOnClickListener{
                rolarDados(6)
        }

    val buttonD12 = findViewById<Button>(R.id.buttonD12)

            buttonD12.setOnClickListener{
                rolarDados(12)
            }

    val buttonD20 = findViewById<Button>(R.id.buttonD20)

            buttonD20.setOnClickListener {
                rolarDados(20)
            }

    }

    private fun rolarDados(lados: Int) {

        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)
        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageView)
        when(rolagem){
            1 -> image.setImageResource(R.drawable.dice1)
            2 -> image.setImageResource(R.drawable.dice24)
            3 -> image.setImageResource(R.drawable.dice3)
            4 -> image.setImageResource(R.drawable.dice4)
            5 -> image.setImageResource(R.drawable.dice5)
            6 -> image.setImageResource(R.drawable.dice6)
        }
    }
}