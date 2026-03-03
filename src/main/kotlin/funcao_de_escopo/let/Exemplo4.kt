package funcao_de_escopo.let

fun main() {
    // Exemplo de uso do 'let' para transformar um número em seu quadrado e imprimir
    val numero: Int? = 5

    numero?.let {
        val quadrado = it * it  // it é o valor de número dentro do bloco let
        println("O quadrado de $it é $quadrado")
    }
}