package com.example.triangulo4b.Contrato

interface ContratoCirculo {

    interface Modelo{
        fun areaCirculo(radio: Float): Float
        fun perimetroCirculo(radio: Float): Float
        fun validaCirculo(radio: Float): Boolean
    }
    interface Vista{
        fun showAreaCirculo(area: Float)
        fun showPerimetroCirculo(perimetro: Float)
        fun showErrorCirculo(msg: String)
    }
    interface Presentador{
        fun areaCirculo(radio: Float)
        fun perimetroCirculo(radio: Float)
    }
}
