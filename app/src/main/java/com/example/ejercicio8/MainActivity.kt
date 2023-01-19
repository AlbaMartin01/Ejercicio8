package com.example.ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.botonElfo).setOnClickListener{
            findViewById<ImageView>(R.id.imagenInicio).setImageResource(R.drawable.elfo)
        }

        findViewById<Button>(R.id.botonHumano).setOnClickListener{
            findViewById<ImageView>(R.id.imagenInicio).setImageResource(R.drawable.humano)
        }

        findViewById<Button>(R.id.botonEnano).setOnClickListener{
            findViewById<ImageView>(R.id.imagenInicio).setImageResource(R.drawable.enano)
        }

        findViewById<Button>(R.id.botonGoblin).setOnClickListener{
            findViewById<ImageView>(R.id.imagenInicio).setImageResource(R.drawable.goblin)
        }

        findViewById<Button>(R.id.botonAceptar).setOnClickListener{
            val intento = Intent(this,ActividadVacia::class.java)
            startActivity(intento)
        }
    }
}