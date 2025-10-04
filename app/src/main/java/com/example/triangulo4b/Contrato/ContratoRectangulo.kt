package com.example.triangulo4b.Contrato

interface ContratoRectangulo {
    interface Modelo{
        fun areaRectangulo (base:Float,altura: Float):Float
        fun perimteroRectangulo (base:Float,altura: Float):Float
        fun validaRectangulo(base:Float,altura: Float): Boolean
    }
    interface Vista{
        fun showAreaRectangulo(area: Float)
        fun showPerimetroRectangulo(perimetro: Float)
        fun showErrorRectangulo(msg: String)
    }
    interface  Presentador{
        fun areaRectangulo(base: Float,altura: Float)
        fun perimetroRectangulo(base: Float,altura: Float)

    }

}