package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoCuadrado

class ModeloCuadrado: ContratoCuadrado.Modelo {
    override fun areaCuadrado(lado: Float): Float {

            return lado*lado
    }

    override fun perimetroCuadrado(lado: Float): Float {

        return 4*lado
    }

    override fun validaCuadrado(lado: Float): Boolean {

        if(lado>0){
            return true
        }else{
            return false
        }
    }
}