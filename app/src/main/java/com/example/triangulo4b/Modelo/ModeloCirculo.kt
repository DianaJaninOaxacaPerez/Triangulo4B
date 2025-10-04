package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Contrato.ContratoRectangulo
import kotlin.math.PI

class ModeloCirculo : ContratoCirculo.Modelo {
    override fun areaCirculo(radio: Float): Double {
        return PI*radio*radio
        TODO("Not yet implemented")
    }

    override fun perimetroCirculo(radio: Float): Double {
        return 2*PI*radio
        TODO("Not yet implemented")
    }

    override fun validaCirculo(radio: Float): Boolean {
        if(radio>0){
            return true
        }else{
            return false
        }
        TODO("Not yet implemented")
    }


}