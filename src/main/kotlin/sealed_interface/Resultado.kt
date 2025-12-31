package sealed_interface

sealed interface Resultado {
    data class Sucesso(val dados: String) : Resultado
    data class  Erro(val mensagem: String): Resultado
    object Carregando: Resultado // Objeto singleton para representar o estado de carregamento
}

fun processarResultado(resultado: Resultado) {
    when (resultado) {
        is Resultado.Sucesso -> println("Dados recebidos: ${resultado.dados}")
        is Resultado.Erro -> println("Erro ocorrido: ${resultado.mensagem}")
        Resultado.Carregando -> println("Carregando dados...")
    }
}

fun main() {
    val resultado1: Resultado = Resultado.Sucesso("Informações importantes")
    val resultado2: Resultado = Resultado.Erro("Falha na conexão")
    val resultado3: Resultado = Resultado.Carregando

    processarResultado(resultado1)
    processarResultado(resultado2)
    processarResultado(resultado3)
}

/* Exemplo
sealed interface + data class (e object)
Exemplo básico, aqui, definimos uma interface selada `Resultado` que pode representar três estados diferentes: sucesso, erro e carregamento.
A função `processarResultado` utiliza uma expressão `when` para lidar com cada caso de forma apropriada.
* */