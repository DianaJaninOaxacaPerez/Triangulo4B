package com.example.triangulo4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Modelo.ContratoTriangulo
import com.example.triangulo4b.Presentador.PresentadorTriangulo
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() , ContratoTriangulo.Vista{
    //Declaramos el txtresultado para poder usarlo
    private lateinit var txtResultado: TextView
    //Declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador : ContratoTriangulo.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Inicializamos los componentes que vamos a utilizar//
        val txtl1 = findViewById<EditText>(R.id.edtl1)
        val txtl2 = findViewById<EditText>(R.id.edtl2)
        val txtl3 = findViewById<EditText>(R.id.edtl3)

        val btnArea = findViewById<Button>(R.id.btnArea)
        val btnPerimetro = findViewById<Button>(R.id.btnPerimetro)
        val btnTipo = findViewById<Button>(R.id.btnTipo)
        val txtResultado = findViewById<TextView>(R.id.editResultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        //Inicializamos al presentador//
        presentador = PresentadorTriangulo(this)

        btnPerimetro.setOnClickListener {
            val l1 = txtl1.text.toString().toFloat()
            val l2 = txtl2.text.toString().toFloat()
            val l3 = txtl3.text.toString().toFloat()
            val p = l1 + l2 + l3
            txtResultado.text = "El perimetro es : ${p}"

        }
        btnArea.setOnClickListener {
            val l1 = txtl1.text.toString().toFloat()
            val l2= txtl2.text.toString().toFloat()
            val l3 = txtl3.text.toString().toFloat()

            val s = (l1 + l2 + l3)/3;
            val a = sqrt(s*(s-l1) * (s-l2) * (s-l3))
            txtResultado.text = "El area es : ${a}"

        }
        btnTipo.setOnClickListener {
            val l1 = txtl1.text.toString().toFloat()
            val l2 = txtl2.text.toString().toFloat()
            val l3 = txtl3.text.toString().toFloat()
            var tipo=""
            if(l1==l2 && l2 ==l3)
            {
                tipo = "El triangulo es Equilatero"
            }
            else if(l1!= l2 && l2!= l3 && l3 != l1)
            {
                tipo ="El triangulo es Escaleno"
            }
            else
            {
                tipo = "El triangulo es Isoceles"
            }
            txtResultado.text = tipo

        }
    }

    override fun showArea(area: Float) {
        txtResultado.text="El area es : ${area}"
        TODO("Not yet implemented")
    }

    override fun showPerimetro(perimetro: Float) {
        txtResultado.text= "El perimetro es ${perimetro}"
        TODO("Not yet implemented")
    }

    override fun showTipo(tipo: String) {
        txtResultado.text= "El tipo  es ${tipo}"
        TODO("Not yet implemented")
    }

    override fun ShowError(msg: String) {
        txtResultado.text= "Los datos son invalidos"
        TODO("Not yet implemented")
    }
}