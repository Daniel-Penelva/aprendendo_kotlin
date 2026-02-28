package basic

// Exemplo 1
fun String.primeiraMaiuscula(): String {
    return this.replaceFirstChar { it.uppercase() }
}

// Exemplo 2
fun Int.ehMaiorIdade(): Boolean {
    return this >= 18
}

fun main() {

    println("daniel".primeiraMaiuscula()) // Output: Daniel
    println(17.ehMaiorIdade()) // Output: false
    println(25.ehMaiorIdade()) // Output: true

}

/*
OBS.
Extension Functions
Sabe quando quer adicionar um método a uma classe que não é sua (como String ou Int)? Em Java, impossível sem herança ou util class. Em Kotlin
se usa Extension Functions, que permitem adicionar métodos a classes existentes sem modificá-las. Basta definir uma função com o nome da classe
como prefixo. No exemplo, String.primeiraMaiuscula() torna a primeira letra de uma string maiúscula, e Int.ehMaiorIdade() verifica se um número
é maior ou igual a 18. Isso é super útil para tornar o código mais legível e organizado, sem precisar criar subclasses ou utilitários separados.
E o melhor: não altera a classe original, apenas adiciona funcionalidades de forma elegante e fácil de usar.
* */