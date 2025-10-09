package com.example.triangulo4b.Presentador

import com.example.triangulo4b.Contrato.ContratoCuadrado
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
    }

    override fun perimetroCuadrado(lado: Float) {
        if(modelo.validaCuadrado(lado)) {
            val a = modelo.perimetroCuadrado(lado)
            vista.showPerimetroCuadrado(a)
        }else{
            vista.showErrorC(msg="Datos incorrectos")
        }
    }
}