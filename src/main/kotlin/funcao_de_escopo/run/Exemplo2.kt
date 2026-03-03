package funcao_de_escopo.run

fun main() {

    val texto = StringBuilder().run {
        append("Olá ")
        append("Mundo!")
        toString()// retorno do run
    }
    println(texto)
}

// Outro exemplo 'run' com StringBuilder para construir uma string