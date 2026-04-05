package com.ejemplo.miapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvContador = findViewById<TextView>(R.id.tvContador)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnReset = findViewById<Button>(R.id.btnReset)

        fun actualizar() {
            tvContador.text = contador.toString()
            tvContador.setTextColor(when {
                contador > 0 -> getColor(R.color.verde)
                contador < 0 -> getColor(R.color.rojo)
                else -> getColor(R.color.blanco)
            })
        }

        btnSumar.setOnClickListener { contador++; actualizar() }
        btnRestar.setOnClickListener { contador--; actualizar() }
        btnReset.setOnClickListener { contador = 0; actualizar() }
    }
}
