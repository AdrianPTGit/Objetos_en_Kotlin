package org.example.Ejercicios

import org.example.Persona

/*
Enunciado 1.
Crea una clase Vehículo con propiedades marca y año. Haz una subclase Coche que añada modelo. Crea una lista de coches
y muéstralos.

 */

open class Vehiculo(val marca : String, val año : Int){

    open fun listaVehiculos(){
        println("Vehiculo MARCA: $marca, AÑO: $año")

    }

    override fun toString(): String {
        return "Vehiculo(marca='$marca', año=$año)"
    }

}

class Coche (marca: String, año: Int, val modelo: String): Vehiculo(marca, año){

    constructor(marca: String,  modelo: String) : this(marca, 1995, modelo)

    override fun listaVehiculos(){
        println("Vehiculo MARCA: $marca, AÑO: $año, MODELO: $modelo")

    }

    override fun toString(): String {
        return "Vehiculo(marca='$marca', año=$año, modelo=$modelo)"
    }


}

fun main(){

    val listaCoches : List<Coche> = listOf(
        Coche("Seat","Ibiza"),
        Coche("seat", 2005,"Cordoba"),
        Coche("Audi", 1998,"A3"),
        Coche("Audi", 1999,"A4"),
        Coche("Audi", 1985, "A5"),

    )

    for (coche : Coche in listaCoches )
        println(coche)

}