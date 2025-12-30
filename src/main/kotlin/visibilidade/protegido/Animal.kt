package visibilidade.protegido

// Classe PAI - deve ser "open" para herdar
open class Animal {
    protected var patas: Int = 4
    protected  fun fazerSom() {
        println("Animal faz som!")
    }

    fun mostrarPatas() {
        println("Patas $patas")
    }
}

// Classe FILHA - herda de Animal
class Cachorro: Animal () {
    fun brincar() {
        patas = 4 // Acesso permitido
        fazerSom() // Acesso permitido
        println("Cachorro tem $patas patas e faz som ao brincar.")
    }
}

class Gato: Animal () {
    fun miar() {
        patas = 4 // Acesso permitido
        fazerSom() // Acesso permitido
        println("Cachorro tem $patas patas e faz som ao brincar.")
    }
}

fun main() {
    val cachorro = Cachorro()
    cachorro.brincar()      // Funciona
    cachorro.mostrarPatas() // Funciona (método public)

    val gato = Gato()
    gato.miar()
    gato.mostrarPatas()

    // X ERRO! protected não é acessível fora da hierarquia
    // cachorro.patas = 3     // Compilation Error!
    // cachorro.fazerSom() // Compilation Error!
}