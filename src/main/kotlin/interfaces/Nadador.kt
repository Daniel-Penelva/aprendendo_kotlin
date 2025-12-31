package interfaces

interface Nadador {
    fun nadar()
}

interface Corredor {
    fun correr()
}

class Triatleta : Nadador, Corredor {
    override fun nadar() {
        println("Nadando...")
    }

    override fun correr() {
        println("Correndo...")
    }
}

fun main() {
    val nadador: Nadador = Triatleta()
    nadador.nadar()

    val corredor: Corredor = Triatleta()
    corredor.correr()
}

/* Exemplo:
Múltiplas interfaces

Bom saber:
    - Kotlin suporta múltiplas interfaces
    - Evita herança múltipla de classes
* */