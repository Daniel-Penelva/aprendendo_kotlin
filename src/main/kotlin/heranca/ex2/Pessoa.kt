package heranca.ex2

open class Pessoa(val nome: String) {
}

class Funcionario(nome: String, val cargo: String, val salario: Double): Pessoa(nome) {
    fun mostrarDetalhes() {
        println("Nome: $nome, Cargo: $cargo, Salário: $salario")
    }
}

fun main() {

    val funcionario = Funcionario("Ana", "Desenvolvedora", 7500.0)
    funcionario.mostrarDetalhes()  // Saída: Nome: Ana, Cargo: Desenvolvedora, Salário: 7500.0
}

/*
* Exemplos
* Herança com construtores
* Construtor da superclasse chamado explicitamente
* */