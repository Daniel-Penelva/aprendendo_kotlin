package funcao_de_escopo.apply

data class Pessoa(var nome: String, var idade: Int)
fun main() {

    val pessoa = Pessoa("", 0).apply { // "this é a Pessoa, não precisa escrever", ou seja, não precisa escrever pessoa.nome = "Daniel"
        nome = "Carlos"
        idade = 30
    }
    println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
}