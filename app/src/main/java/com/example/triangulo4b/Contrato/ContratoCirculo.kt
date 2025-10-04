package com.example.triangulo4b.Contrato

interface ContratoCirculo {

    interface Modelo{
        fun areaCirculo(radio: Float): Double
        fun perimetroCirculo(radio: Float): Double
        fun validaCirculo(radio: Float): Boolean
    }
    interface Vista{
        fun showAreaCirculo(area: Double)
        fun showPerimetroCirculo(perimetro: Double)
        fun showErrorCirculo(msg: String)
    }
    interface Presentador{
        fun areaCirculo(radio: Float)
        fun perimetroCirculo(radio: Float)
    }
}
