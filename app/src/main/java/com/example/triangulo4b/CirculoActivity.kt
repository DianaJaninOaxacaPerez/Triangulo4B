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


        val txtradio: EditText=findViewById<EditText>(R.id.editradio)
        val btnArea: Button =findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button =findViewById<Button>(R.id.btnPerimetro)
        txtResultado=findViewById<TextView>(R.id.editResultado)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Presentador = PresentadorCirculo(this)
        btnPerimetro.setOnClickListener {
            val r = txtradio.text.toString().toFloat()
            Presentador.perimetroCirculo(r)
        }
        btnArea.setOnClickListener{
            val r=txtradio.text.toString().toFloat()
            Presentador.areaCirculo(r)
        }


    }

    override fun showAreaCirculo(area: Double) {
        txtResultado.text="El area es ${area}"
        TODO("Not yet implemented")
    }

    override fun showPerimetroCirculo(perimetro: Double) {
        txtResultado.text="El area es ${perimetro}"
        TODO("Not yet implemented")
    }

    override fun showErrorCirculo(msg: String) {
        txtResultado.text=msg

        TODO("Not yet implemented")
    }

}