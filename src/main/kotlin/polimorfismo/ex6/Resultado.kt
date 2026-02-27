package polimorfismo.ex6

sealed class Resultado {

    data class Sucesso(val dados: String): Resultado()

    data class Erro(val mensagem: String): Resultado()

    object Carregando: Resultado()
}