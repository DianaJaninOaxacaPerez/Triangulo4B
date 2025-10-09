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
import com.example.triangulo4b.Presentador.PresentadorCuadrado
import com.example.triangulo4b.R
import kotlin.math.sqrt
import kotlin.toString


class CuadradoActivity : AppCompatActivity(), ContratoCuadrado.Vista {

    //Declaramos el txtresultado para poder usarlo
    private lateinit var txvResultado: TextView
    //Declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador : ContratoCuadrado.Presentador
    fun setPresentador(presentador: ContratoCuadrado.Presentador) {
        this.presentador = presentador
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cuadrado)
        val txtlado: EditText = findViewById<EditText>(R.id.edtlado)
        val btnArea: Button= findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button = findViewById<Button>(R.id.btnPerimetro)
        val btnVolver: Button = findViewById<Button>(R.id.btnVolver)
        txvResultado = findViewById<TextView>(R.id.txvRes)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        presentador= PresentadorCuadrado(this)

        btnPerimetro.setOnClickListener {
            val lado = txtlado.text.toString().toFloat()
            presentador.perimetroCuadrado(lado)
        }
        btnArea.setOnClickListener{
            val lado=txtlado.text.toString().toFloat()
            presentador.areaCuadrado(lado)
        }
        btnVolver.setOnClickListener {
            finish()
        }
    }
    override fun showAreaCuadrado(area: Float) {
        txvResultado.text="El area es ${area}"
    }

    override fun showPerimetroCuadrado(perimetro: Float) {
        txvResultado.text="El area es ${perimetro}"
    }
    override fun showErrorC(msg: String) {
        txvResultado.text=msg
    }
}