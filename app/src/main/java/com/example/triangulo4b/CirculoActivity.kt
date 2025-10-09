package com.example.triangulo4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Presentador.PresentadorCirculo


class CirculoActivity : AppCompatActivity() , ContratoCirculo.Vista{

    private lateinit var txtResultado: TextView
    private lateinit var Presentador : ContratoCirculo.Presentador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.circulo)


        val txtradio=findViewById<EditText>(R.id.editradio)
        val btnArea =findViewById<Button>(R.id.btnArea)
        val btnPerimetro =findViewById<Button>(R.id.btnPerimetro)
        val btnVolver =findViewById<Button>(R.id.btnVolver)
        txtResultado = findViewById<TextView>(R.id.editResultado)

        Presentador = PresentadorCirculo(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.frmcirculo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val r = txtradio.text.toString().toFloatOrNull()?: 0f
            Presentador.perimetroCirculo(r)
        }
        btnArea.setOnClickListener{
            val r=txtradio.text.toString().toFloatOrNull()?: 0f
            Presentador.areaCirculo(r)
        }
        btnVolver.setOnClickListener {
            finish()
        }


    }

    override fun showAreaCirculo(area: Float) {
        txtResultado.text="El area es ${area}"
        TODO("Not yet implemented")
    }

    override fun showPerimetroCirculo(perimetro: Float) {
        txtResultado.text="El area es ${perimetro}"
        TODO("Not yet implemented")
    }

    override fun showErrorCirculo(msg: String) {
        txtResultado.text=msg

        TODO("Not yet implemented")
    }

}