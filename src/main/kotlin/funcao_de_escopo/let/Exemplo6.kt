package funcao_de_escopo.let

fun main() {

    val programacao: String? = "Kotlin"
    programacao?.let {
        println("Estou aprendendo ${it.uppercase()}")  // ou simplesmente println("Estou aprendendo $it")
    }
}