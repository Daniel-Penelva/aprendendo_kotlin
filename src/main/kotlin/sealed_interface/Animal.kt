package sealed_interface

sealed interface Animal {
    val nome: String
    fun som(): String
}

sealed interface Pet {
    fun brincar(): String
}

data class Cachorro(override val nome: String, val raca: String) : Animal, Pet {
    override fun som() = "Au Au!"
    override fun brincar() = "$nome abana o rabo!"
}

fun main() {
    val meuCachorro: Animal = Cachorro("Rex", "Labrador")
    println("Nome: ${meuCachorro.nome}")
    println("Som: ${meuCachorro.som()}")

    if (meuCachorro is Pet) {
        println(meuCachorro.brincar())
    }
}

/* Exemplo
sealed interface + múltiplas heranças
Aqui, a interface selada `Animal` define uma propriedade e um método, enquanto a interface `Pet` define outro método.
A classe `Cachorro` implementa ambas as interfaces, demonstrando como as interfaces seladas podem ser usadas em conjunto com múltiplas heranças.
* */