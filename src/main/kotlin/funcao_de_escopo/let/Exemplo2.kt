package funcao_de_escopo.let

fun main() {

    val nomes = mutableListOf("Ana", "Bia", "Carlos", "Daniel")

    nomes.forEach { nome ->
        nome.let {
            val nomeMaiusculo = it.uppercase() // it é o nome atual do loop
            println(nomeMaiusculo)
        }
    }
}

// Usando 'let' para transformar o nome em maiúsculas e imprimir