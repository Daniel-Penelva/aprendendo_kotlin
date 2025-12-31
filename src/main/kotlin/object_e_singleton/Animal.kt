package object_e_singleton

data class Animal(val tipo: String, val raca: String) {
    companion object {
        fun criarCachorro(raca: String): Animal {
            return Animal("Cachorro", raca)
        }

        fun criarGato(raca: String): Animal {
            return Animal("Gato", raca)
        }
    }
}

fun main() {
    val cachorro = Animal.criarCachorro("Labrador")
    val gato = Animal.criarGato("Siamês")

    println("Animal 1: Tipo = ${cachorro.tipo}, Raça = ${cachorro.raca}")
    println("Animal 2: Tipo = ${gato.tipo}, Raça = ${gato.raca}")
}

/*
Este exemplo mostra o uso de companion object em kotlin para criar métodos de fábrica (factory methods) para a classe Animal.
* */
