package com.example.triangulo4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoCuadrado

class CuadradoActivity : AppCompatActivity(), ContratoCuadrado.Vista {

    //Declaramos el txtresultado para poder usarlo
    private lateinit var txtResultado: TextView
    //Declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador : ContratoCuadrado.Presentador


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cuadrado)
        val txtlado: EditText = findViewById<EditText>(R.id.editlado)
        val btnArea: Button= findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button = findViewById<Button>(R.id.btnPerimetro)
        txtResultado = findViewById<TextView>(R.id.editResultado)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnPerimetro.setOnClickListener {
            val lado = txtlado.text.toString().toFloat()
            presentador.perimetroCuadrado(lado)
        }
        btnArea.setOnClickListener{
            val lado=txtlado.text.toString().toFloat()
            presentador.areaCuadrado(lado)
        }

    }

    override fun showAreaCuadrado(area: Float) {
        txtResultado.text="El area es ${area}"

        TODO("Not yet implemented")
    }

    override fun showPerimetroCuadrado(perimetro: Float) {
        txtResultado.text="El area es ${perimetro}"
        TODO("Not yet implemented")
    }

    override fun showErrorC(msg: String) {
        txtResultado.text=msg

        TODO("Not yet implemented")
    }
}