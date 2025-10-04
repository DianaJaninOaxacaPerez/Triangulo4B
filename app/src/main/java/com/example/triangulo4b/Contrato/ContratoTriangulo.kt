package com.example.triangulo4b.Modelo

interface ContratoTriangulo {
    interface Modelo{
        fun area (l1:Float,l2: Float,l3: Float):Float
        fun perimtero (l1:Float,l2: Float,l3: Float):Float
        fun tipo (l1:Float,l2: Float,l3: Float): String
        fun validaTriangulo (l1:Float,l2: Float,l3: Float): Boolean
    }
    interface Vista{
        fun showArea(area:Float)
        fun showPerimetro(perimetro:Float)
        fun showTipo(tipo: String)
        fun ShowError(msg: String)
    }
    interface Presentador{
        fun area(l1:Float,l2: Float,l3: Float)
        fun perimetro(l1:Float,l2: Float,l3: Float)
        fun tipo(l1:Float,l2: Float,l3: Float)
    }
}