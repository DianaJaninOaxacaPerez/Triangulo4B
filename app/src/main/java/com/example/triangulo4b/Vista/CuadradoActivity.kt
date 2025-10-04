package com.example.triangulo4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.triangulo4b.Contrato.ContratoCuadrado
import com.example.triangulo4b.Modelo.ContratoTriangulo
import com.example.triangulo4b.Presentador.PresentadorCuadrado
import com.example.triangulo4b.Presentador.PresentadorTriangulo
import com.example.triangulo4b.R
import java.time.temporal.Temporal

class CuadradoActivity : AppCompatActivity(), ContratoCuadrado.Vista {
    //Declaramos el txtresultado para poder usarlo
    private lateinit var txtResultado: TextView
    //Declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador : ContratoCuadrado.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cuadradoactivity)
        val txtlado: EditText = findViewById<EditText>(R.id.editlado)
        val btnArea: Button = findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button = findViewById<Button>(R.id.btnPerimetro)
        txtResultado = findViewById<TextView>(R.id.editResultado)


        btnPerimetro.setOnClickListener {
            val lado = txtlado.text.toString().toFloat()
            presentador.perimetroCuadrado(lado)
        }
        btnArea.setOnClickListener{
            val lado=txtlado.text.toString().toFloat()
            presentador.areaCuadrado(lado)
        }

        //Inicializamos al presentador//
        presentador = PresentadorCuadrado(this)

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