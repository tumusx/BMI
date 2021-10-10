package com.aplicacao

import android.content.res.ColorStateList
import android.graphics.Color
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val n1 = findViewById(R.id.peso) as EditText
    val n2 = findViewById(R.id.altura) as EditText
    val total = findViewById(R.id.resultado)as TextView
    val cal1 = findViewById(R.id.calcuBot) as Button

     cal1.setOnClickListener {
         val val1 = n1.text.toString().toFloat()
         val val2 = n2.text.toString().toFloat()


         var resultado = val1/(val2*val2)
         total.setText(resultado.toString())
         if (resultado>15){
             total.setText("Seu IMC é de: $resultado")
             total.setTextColor(Color.RED)
         }
         else{
             total.setText("Voce está magro demais. S eu imc é $resultado")
             total.setTextColor(Color.RED)
         }


     }

    }


}


