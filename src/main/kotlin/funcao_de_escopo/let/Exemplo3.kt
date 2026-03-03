package funcao_de_escopo.let

fun main() {

    val primeiroNome = "Daniel"

    val tamanho = primeiroNome.let {
        println("Nome: $it")  // "it" é o valor de primeiroNome dentro do bloco let
        it.length
    }
    println("Tamanho do nome: $tamanho")
}