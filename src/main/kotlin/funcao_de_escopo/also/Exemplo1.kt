package funcao_de_escopo.also

fun main() {

    val funcionarios = mutableListOf("Ana", "Bia", "Carlos", "Daniel")

    funcionarios.forEach { nome ->
        nome.also {
            val nomeComSufixo = "$it Silva"
            println(nomeComSufixo)
        }
    }
}

// Usando 'also' para adicionar um sufixo aos nomes e imprimir