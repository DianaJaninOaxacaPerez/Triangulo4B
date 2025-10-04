package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Modelo.ContratoTriangulo
import com.example.triangulo4b.Modelo.ModeloTriangulo

class PresentadorTriangulo(private  val vista: ContratoTriangulo.Vista): ContratoTriangulo.Presentador {
    private val modelo: ContratoTriangulo.Modelo= ModeloTriangulo()
    override fun area(l1: Float, l2: Float, l3: Float) {
        if(modelo.validaTriangulo(l1,l2,l3)==true)
            {
                val a =modelo.area(l1,l2,l3)
                vista.showArea(a)
            }
        else
        {
            vista.ShowError("Datos no validos")
        }

    }

    override fun perimetro(l1: Float, l2: Float, l3: Float) {
        if(modelo.validaTriangulo(l1,l2,l3))
        {
            val p =modelo.perimtero(l1,l2,l3)
            vista.ShowError("Datos no validos")
        }
        TODO("Not yet implemented")
    }

    override fun tipo(l1: Float, l2: Float, l3: Float) {
        if (modelo.validaTriangulo(l1,l2,l3))
        {
           val t = modelo.tipo(l1,l2,l3);
            vista.showTipo(t);
        }
        else
        {
            vista.ShowError("Datos no validos");
        }
        TODO("Not yet implemented")
    }

}