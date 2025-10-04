package com.example.triangulo4b.Contrato

interface ContratoCuadrado {

    interface Modelo{
        fun areaCuadrado(lado: Float): Float
        fun perimetroCuadrado(lado: Float): Float
        fun validaCuadrado(lado: Float): Boolean
    }
    interface Vista{
        fun showAreaCuadrado(area: Float)
        fun showPerimetroCuadrado(perimetro: Float)
        fun showErrorC(msg: String)
    }
    interface Presentador{
        fun areaCuadrado(lado: Float)
        fun perimetroCuadrado(lado: Float)
    }
}