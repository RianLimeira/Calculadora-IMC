package com.example.calculatorimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alturas = findViewById<EditText>(R.id.altura)
        val pesos = findViewById<EditText>(R.id.peso)
        var resultado = findViewById<TextView>(R.id.resultadoIMC)
        val btn = findViewById<Button>(R.id.button)


        btn.setOnClickListener() {
            if (pesos != null && alturas != null) {
                resultado.visibility = View.VISIBLE
                var restultIMC = pesos.text.toString().toFloat() / (alturas.text.toString()
                    .toFloat() * alturas.text.toString().toFloat())
                resultado.text = "Seu IMC = " + restultIMC
            }
        }

    }

}

