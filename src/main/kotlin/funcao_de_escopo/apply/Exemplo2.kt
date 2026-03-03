package funcao_de_escopo.apply

fun main() {

    val listaNumeros = mutableListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    println("Lista de Números: $listaNumeros")
}

// Usando 'apply' para configurar uma lista de números.
// O bloco de código dentro do apply é executado no contexto do objeto (this) e retorna o próprio objeto após a configuração.