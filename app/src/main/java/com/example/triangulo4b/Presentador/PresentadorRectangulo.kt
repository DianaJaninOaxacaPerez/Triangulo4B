package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Modelo.ContratoTriangulo
import com.example.triangulo4b.Modelo.ModeloRectangulo
import com.example.triangulo4b.Modelo.ModeloTriangulo

class PresentadorRectangulo(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador {
    private val modelo: ContratoRectangulo.Modelo= ModeloRectangulo()
    override fun areaRectangulo(base: Float, altura: Float) {
        if(modelo.validaRectangulo(base,altura)==true){
            val  a=modelo.areaRectangulo(base,altura)
            vista.showAreaRectangulo(a)
        }
        else
        {
            vista.showErrorRectangulo("Datos no validos")
        }

        TODO("Not yet implemented")
    }

    override fun perimetroRectangulo(base: Float, altura: Float) {
        if(modelo.validaRectangulo(base,altura)){
            val  p=modelo.perimteroRectangulo(base,altura)
            vista.showPerimetroRectangulo(p)
        }
        else
        {
            vista.showErrorRectangulo("Datos no validos")
        }
        TODO("Not yet implemented")
    }

}