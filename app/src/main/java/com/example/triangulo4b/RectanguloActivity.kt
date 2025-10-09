package com.example.triangulo4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Presentador.PresentadorRectangulo
import com.example.triangulo4b.R
import kotlin.toString
import kotlin.math.sqrt

class RectanguloActivity : AppCompatActivity() , ContratoRectangulo.Vista{

    private lateinit var txvResultado: TextView
    private lateinit var presentador : ContratoRectangulo.Presentador

    fun setPresentador(presentador: ContratoRectangulo.Presentador) {
        this.presentador = presentador
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.rectangulo)

        //inicializamos elemento a utilizar
        val txtaltura=findViewById<EditText>(R.id.editaltura)
        val txtbase=findViewById<EditText>(R.id.editbase)
        val btnArea=findViewById<Button>(R.id.btnArea)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetro)
        txvResultado = findViewById<TextView>(R.id.txvRes)
        val btnVolver: Button = findViewById<Button>(R.id.btnVolver)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Inicializamos al presentador//
        presentador = PresentadorRectangulo(this)

        btnPerimetro.setOnClickListener{
            val altura=txtaltura.text.toString().toFloat()
            val base=txtbase.text.toString().toFloat()
            presentador.perimetroRectangulo(base,altura)
        }
        btnArea.setOnClickListener {
            val altura=txtaltura.text.toString().toFloat()
            val base=txtbase.text.toString().toFloat()
            presentador.areaRectangulo(base,altura)
        }
        btnVolver.setOnClickListener {
            finish()
        }

    }

    override fun showAreaRectangulo(area: Float) {
        txvResultado.text="El area es ${area}"
    }

    override fun showPerimetroRectangulo(perimetro: Float) {
        txvResultado.text="El perimetro es ${perimetro}"
    }

    override fun showErrorRectangulo(msg: String) {
        txvResultado.text=msg
    }
}