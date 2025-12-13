package classes

class Pessoa {

    var nome: String = ""
    var idade: Int  = 0

}

fun main() {

    // Exemplo 1 - Criando uma instância da classe Pessoa - Criando Objetos
    println("Exemplo 1 - Criando uma instância da classe Pessoa - Criando Objetos")
    val pessoa = Pessoa()
    pessoa.nome = "João"
    pessoa.idade = 30

    println("Nome: ${pessoa.nome}")
    println("Idade: ${pessoa.idade}")

    // Exemplo 2 - Modificando os atributos de um objeto
    println("\nExemplo 2 - Modificando os atributos de um objeto")
    pessoa.nome = "Maria"
    pessoa.idade = 25

    println("Nome: ${pessoa.nome}")
    println("Idade: ${pessoa.idade}")
}