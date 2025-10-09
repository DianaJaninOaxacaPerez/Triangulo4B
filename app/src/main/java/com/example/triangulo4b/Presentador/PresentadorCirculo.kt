package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Modelo.ModeloCirculo

class PresentadorCirculo(private val vista: ContratoCirculo.Vista): ContratoCirculo.Presentador  {
    private val modelo: ContratoCirculo.Modelo= ModeloCirculo()
    override fun areaCirculo(radio: Float) {
        if(modelo.validaCirculo(radio)) {
            val a = modelo.areaCirculo(radio)
            vista.showAreaCirculo(a)
        }else{
            vista.showErrorCirculo(msg="Datos incorrectos")
        }
        TODO("Not yet implemented")
    }

    override fun perimetroCirculo(radio: Float) {
        if(modelo.validaCirculo(radio)==true) {
            val a = modelo.perimetroCirculo(radio)
            vista.showPerimetroCirculo(a)
        }else{
            vista.showErrorCirculo(msg="Datos incorrectos")
        }
        TODO("Not yet implemented")
    }
}