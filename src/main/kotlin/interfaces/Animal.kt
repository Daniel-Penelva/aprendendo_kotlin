package interfaces

interface Animal {
    fun emitirSom()
}

class Cachorro : Animal {
    override fun emitirSom() {
        println("Au au")
    }
}

fun main() {
    val animal: Animal = Cachorro()
    animal.emitirSom()
}

/* Exemplo:
* Interface Básica
* */