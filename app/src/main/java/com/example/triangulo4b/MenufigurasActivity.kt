package com.example.triangulo4b

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenufigurasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.menufiguras)
        val spinner: Spinner = findViewById(R.id.spnOpcion)
        val btnIr: Button = findViewById(R.id.btnIr)
        val opciones = arrayOf("Rectangulo", "Cuadrado", "Circulo", "Triangulo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnIr.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Rectangulo" -> {
                    val intent = Intent(this, RectanguloActivity::class.java)
                    startActivity(intent)
                }
                "Circulo" -> {
                    val intent = Intent(this, CirculoActivity::class.java)
                    startActivity(intent)
                }
                "Triangulo" -> {
                    val intent = Intent(this, Triangulo4bActivity::class.java)
                    startActivity(intent)
                }
                "Cuadrado" -> {
                    val intent = Intent(this, CuadradoActivity::class.java)
                    startActivity(intent)
                }

            }
        }
    }

}