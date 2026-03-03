package funcao_de_escopo.run

fun main() {

    val comprimento = "Kotlin".run {
        println("Linguagem: $this")
        this.length // retorno do run
    }
    println("Comprimento: $comprimento")
}
// 'run' para inicializar um objeto e retornar um valor derivado dele