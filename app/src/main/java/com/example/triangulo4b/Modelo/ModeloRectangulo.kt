package com.example.triangulo4b.Modelo

import com.example.triangulo4b.Contrato.ContratoRectangulo

class ModeloRectangulo: ContratoRectangulo.Modelo {
    override fun areaRectangulo(base: Float, altura: Float): Float {
        return base * altura
    }

    override fun perimteroRectangulo(base: Float, altura: Float): Float {
        return  base + altura + base + altura
    }
    override fun validaRectangulo(base: Float, altura: Float): Boolean {
        if(base>0&&altura>0)
            return true
        else
            return false
    }
}