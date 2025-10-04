package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoCuadrado
import com.example.triangulo4b.Contrato.ContratoRectangulo
import com.example.triangulo4b.Modelo.ModeloCuadrado

class PresentadorCuadrado(private val vista: ContratoCuadrado.Vista): ContratoCuadrado.Presentador {
    private val modelo: ContratoCuadrado.Modelo= ModeloCuadrado()

    override fun areaCuadrado(lado: Float) {

        if(modelo.validaCuadrado(lado)==true) {
            val a = modelo.areaCuadrado(lado)
            vista.showAreaCuadrado(a)
        }else{
            vista.showErrorC(msg="Datos incorrectos")
        }

        TODO("Not yet implemented")
    }

    override fun perimetroCuadrado(lado: Float) {
        if(modelo.validaCuadrado(lado)) {
            val a = modelo.areaCuadrado(lado)
            vista.showPerimetroCuadrado(a)
        }else{
            vista.showErrorC(msg="Datos incorrectos")
        }
        TODO("Not yet implemented")
    }
}