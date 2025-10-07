package org.example
/*
* OBJETOS EN KOTLIN
*
* -- Una clase solo puede heredar de una sola clase --> Herencia multiple.
* -- Puede implementar varias interfaces.
* -- Kotlin puede crear objetos unicos.
* -- Propiedad static java == companion object
* -- Abstraction en Kotlin.
* -- Data class (no hay en java)
* -- class anidada.
* -- class inner.
* -- Constructores.
* -- Polimorfismo
* -- interfaces
*       si un método no tiene implementation (sin código) está obligado a sobreescribirlo.
*       si un código tiene código no hace falta sobreescribir el método.
* -- Sobrecarga de constructores al crear la clase ya temenos creado un constructor (CONSTRUCTOR PRIMARIO)con todos los parametros.
*       para crear constructores con diferentes parametros (CONSTRUCTOR SECUNDARIO).
*
*

 */

// crear clase en kotlin
// para soobrescribir metodos usar open al crear la clase y los metodos

open class Persona(val nombre : String ){
    open fun presentacion(){
        println("Me llamo:  ${nombre}")
    }
}
// clase con herencia de Persona
class Trabajador(nombre : String, val nif: String): Persona(nombre){
    override fun presentacion(){
        println("Soy: ${nombre} con nif: ${nif}")

    }
}


// polimorfismo

open class Animal(){
    open fun hacerSonido(){
        println("ññññññññññ")
    }
}

open class Pajaro(): Animal() {
    override fun hacerSonido() {
        println("PIO PIO")
    }
}


open class Perro(): Animal() {
    override fun hacerSonido() {
        println("GUAU GUAU")
    }
}


    fun main() {
        println("******************Instanciar objeto y Herencia***************************")

        // instancia objeto Persona
        val p: Persona = Persona("Adrian")
        p.presentacion()

        // instancia objeto trabajador
        val t: Trabajador = Trabajador("Carlos", "121212G")
        t.presentacion()
        println("******************Polimorfismo***************************")
        val listAnimal: List<Animal> = listOf(Perro(), Pajaro(), Animal())
        for (animal: Animal in listAnimal) {
            animal.hacerSonido()
        }
        println("******************Constructores***************************")
        val pieza : Pieza = Pieza(12121, 34)
        pieza.mostrarPieza()

        val pieza2 : Pieza= Pieza(3232)
        pieza2.mostrarPieza()
    }

// Implementar interfaces. ver problema diamante

// constructores
class Pieza (val id :Int, val stock  : Int){ // ya creado el constructor principal

    init{ //siempre se ejecuta

        println("Creando pieza con Id: $id, Stock: $stock")
    }    // constructor secundario:
    fun mostrarPieza(){
        println("id: $id, stock: $stock")
    }
    //Constructor secundario
    constructor(id: Int) : this (id, 20)


}