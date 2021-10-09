package com.aplicacao

import android.content.res.ColorStateList
import android.graphics.Color
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle","Estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "tela esta visivel")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "Interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "Agora voce nao pode Interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "Agora voce parou a aplicacao e a tela nao está mais visivel")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "Sua tela foi destruída")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "Sua tela foi restardada com sucesso")
    }


    }

