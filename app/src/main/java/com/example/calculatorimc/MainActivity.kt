package com.example.calculatorimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecicle", "CREATE - estou CRIANDO a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecicle", "START - estou VISIVEL a tela")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecicle", "RESUME - estou INTRAGIVEL a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecicle", "PAUSE - estou PAUSADA a tela")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecicle", "STOP - NÃO estou VISIVEL a tela, MAS FUNCIONAL")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecicle", "RESTART - estou RECRIANDO a tela PAUSADA")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecicle", "DESTROY - estou FECHANDO a tela")
    }
}