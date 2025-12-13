package classes

class Funcionario(val nome: String, var idade: Int)

fun main() {

    // Exemplo 1 - Testando a utilização de constructores primários
    println("=========== Exemplo 1 - Testando a utilização de constructores primários ===========")
    println("Exemplo 1 - Testando a utilização de constructores primários")
    var funcionario = Funcionario("Ana", 28)
    println("Nome: ${funcionario.nome}, Idade: ${funcionario.idade}")

    // É o mesmo objeto, mas com valores diferentes - Pode alterar dessa maneira se a variável for "var"
    funcionario = Funcionario("Bruno", 35)
    println("Nome: ${funcionario.nome}, Idade: ${funcionario.idade}")

    // Ou pode alterar dessa maneira - Desde que a variável seja "var"
    funcionario.idade = 36
    println("Nome: ${funcionario.nome}, Idade: ${funcionario.idade}")


/*
     Conceitos importantes:

    1. Tipos principais de variaveis
     val → somente leitura (Imutável)
     var → pode ser alterado (Mútavel)

    2. Eles não significam a mesma coisa, apesar de usarem as mesmas palavras.

         (A). val e var no construtor da classe

            val → Propriedade Imútavel
                Ex: val nome: String → o atributo nome do objeto é somente leitura (imutável)

            var → Propriedade Mutável
                Ex: var idade: Int → o atributo idade do objeto pode ser alterado (mutável)

         (B). val e var na variável que aponta para o objeto

                val → Referência Imútavel
                    Ex: val funcionario2 = Funcionario("Carla", 30) → a variável funcionario2 é somente leitura (imutável)

                var → Referência Mutável
                    Ex: var funcionario = Funcionario("Ana", 28) → a variável funcionario pode ser alterada (mutável)
*/

    println("=========== Exemplo 2 - Diferença entre val e var ===========")

    // Exemplo 2.1 - val na variável funcionário
    println("Exemplo 2.1 - val na variável funcionário")

    val funcionario2 = Funcionario("Carla", 30)
    println("Nome: ${funcionario2.nome}, Idade: ${funcionario2.idade}")

    // Consequência Prática
    // funcionario2 = Funcionario("Diego", 40) // Isso gera um erro de compilação, pois funcionario2 é "val" e não pode ser reatribuído, uma vez que, o atributo nome é "val" dentro da classe Funcionario.

    funcionario2.idade = 31 // Isso é permitido, pois idade é "var" dentro da classe Funcionario.
    // funcionario2.nome = "Diego" // Isso gera um erro de compilação, pois nome é "val" dentro da classe Funcionario.
    println("Nome: ${funcionario2.nome}, Idade: ${funcionario2.idade}")


    // Exemplo 2.2 - var na variável funcionário
    println("Exemplo 2.2 - var na variável funcionário")
    var funcionario3 = Funcionario("Rodrigo", 46)
    println("Nome: ${funcionario3.nome}, Idade: ${funcionario3.idade}")

    // Consequência Prática
    funcionario3 = Funcionario("Mariana", 29) // Isso é permitido, pois funcionario3 é "var"
    println("Nome: ${funcionario3.nome}, Idade: ${funcionario3.idade}")

    // funcionario3.nome = "Caio" // Isso gera um erro de compilação, pois nome é "val" dentro da classe Funcionario.
    funcionario3.idade = 47 // Isso é permitido, pois idade é "var" dentro da classe Funcionario.
    println("Nome: ${funcionario3.nome}, Idade: ${funcionario3.idade}")

}