package funcao_de_escopo.run

fun main() {

    val numeros = listOf(1, 2, 3, 4, 5)

    val soma = numeros.run {
        this.sum()
    }
    println("Soma: $soma")
}

// Usando 'run' para calcular a soma de uma lista de números