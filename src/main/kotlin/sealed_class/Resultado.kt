package sealed_class

// Exemplo 1- sealed class com object e data class
sealed class Resultado {
    object Loading: Resultado()  // object para estado de carregamento | Loading para indicar que algo está em progresso | Resultado() é a classe selada base para representar diferentes estados de resultado
    object Empty: Resultado()  // object para resultado vazio
    object Finished: Resultado() // object para indicar que o processo foi finalizado
    data class Success(val dados: String): Resultado()  // Sucesso com dados
    data class Error(val message: String): Resultado()  // Erro com mensagem
}

fun processarResultado(resultado: Resultado) {
    when (resultado) {
        is Resultado.Loading -> println("Carregando...")
        is Resultado.Empty -> println("Nenhum dado disponível.")
        is  Resultado.Finished -> println("Processo finalizado.")
        is Resultado.Success -> println("Sucesso: ${resultado.dados}")
        is Resultado.Error -> println("Erro: ${resultado.message}")
    }
}

/*
OBS.
    - Sem else
    - O compilador garante cobertura total
    - Código seguro
*/

fun main() {
    processarResultado(Resultado.Loading)
    processarResultado(Resultado.Empty)
    processarResultado(Resultado.Finished)
    processarResultado(Resultado.Success("Dados carregados com sucesso!"))
    processarResultado(Resultado.Error("Falha ao carregar dados."))
}

/*
O sealed class cria uma hierarquia de classes restrita onde o compilador conhece TODOS os subtipos possíveis em tempo de compilação. É uma classe
que restringe quem pode herdar dela.
O compilador sabe exatamente quais subclasses existem.

OBS. Perfeito para estados finitos (Success/Error, Loading/Empty).

Isso permite:
    - when sem else
    - Modelagem segura de estados
    - Código mais legível e à prova de erro
* */