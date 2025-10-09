package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoCirculo
import com.example.triangulo4b.Contrato.ContratoRectangulo
import kotlin.math.PI

class ModeloCirculo : ContratoCirculo.Modelo {
    override fun areaCirculo(radio: Float): Float {
        return (PI*radio*radio).toFloat()
        TODO("Not yet implemented")
    }

    override fun perimetroCirculo(radio: Float): Float {
        return (2*PI*radio).toFloat()
        TODO("Not yet implemented")
    }

    override fun validaCirculo(radio: Float): Boolean {
        return (radio > 0f)
        TODO("Not yet implemented")
    }


}