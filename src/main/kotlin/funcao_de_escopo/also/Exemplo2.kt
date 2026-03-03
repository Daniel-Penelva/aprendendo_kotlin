package funcao_de_escopo.also

fun main() {

    val lista = mutableListOf(1, 2, 3).also {
        println("Números antes de adicionar: $it")
    }.apply {
        add(4)
        add(5)
    }.also {
        println("Números depois de adicionar: $it")
    }

}

// 'also' para validar um número antes de adicioná-lo a uma lista - also não modifica o valor final — só observa.