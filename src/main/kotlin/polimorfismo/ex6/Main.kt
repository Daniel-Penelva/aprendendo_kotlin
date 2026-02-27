package polimorfismo.ex6

fun main() {
    val resultado: Resultado = buscarDados(1)

    when (resultado) {
        is Resultado.Sucesso -> { println("Sucesso: ${resultado.dados}") }
        is Resultado.Erro -> { println("Erro: ${resultado.mensagem}") }
        Resultado.Carregando -> { println("Carregando...") }
    }
}