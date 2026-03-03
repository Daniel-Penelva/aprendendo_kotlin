package funcao_de_escopo.also

fun main() {

    val lista = mutableListOf(1, 2, 3)
        .also { println("Lista criada: $it") } // inspeciona sem interferir
        .also { it.add(4) }                    // modifica

    println(lista) // [1, 2, 3, 4]

}