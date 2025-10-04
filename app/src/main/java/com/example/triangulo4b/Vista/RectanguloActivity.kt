package com.example.triangulo4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Modelo.ContratoTriangulo
import com.example.triangulo4b.Presentador.PresentadorRectangulo
import com.example.triangulo4b.R

class RectanguloActivity: AppCompatActivity(), ContratoRectangulo.Vista {
    private lateinit var txtResultado: TextView
    private lateinit var Presentador : ContratoRectangulo.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.rectanguloactivity)
        //inicializamos elemento a utilizar
        val txtaltura: EditText =findViewById<EditText>(R.id.editaltura)
        val txtbase: EditText =findViewById<EditText>(R.id.editbase)
        val btnArea: Button=findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button =findViewById<Button>(R.id.btnPerimetro)
        val txtResultado = findViewById<TextView>(R.id.editResultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Inicializamos al presentador//
        Presentador = PresentadorRectangulo(this)

        btnPerimetro.setOnClickListener{
            val altura=txtaltura.text.toString().toFloat()
            val base=txtbase.text.toString().toFloat()
            Presentador.perimetroRectangulo(base,altura)
        }
        btnArea.setOnClickListener {
            val altura=txtaltura.text.toString().toFloat()
            val base=txtbase.text.toString().toFloat()
            Presentador.areaRectangulo(base,altura)
        }
    }
    override fun showAreaRectangulo(area: Float) {
        txtResultado.text="El area es ${area}"
        TODO("Not yet implemented")
    }

    override fun showPerimetroRectangulo(perimetro: Float) {
        txtResultado.text="El perimetro es ${perimetro}"
        TODO("Not yet implemented")
    }
    override fun showErrorRectangulo(msg: String) {
        txtResultado.text=msg
        TODO("Not yet implemented")
    }
}