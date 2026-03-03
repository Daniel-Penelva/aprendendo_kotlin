package funcao_de_escopo.with

fun main() {

    val resultado = with(StringBuilder()) {
        append("Kotlin ")
        append("é ")
        append("incrível!")
        toString() // retorno do with
    }
    println(resultado)
}

// Usando 'with' para operar em um objeto StringBuilder