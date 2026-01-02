package sealed_abstract_class.ex1

fun main() {

    fun tratar(resultado: Resultado) {
        when(resultado) {
            is Sucesso -> println(resultado.mensagem())
            is Erro -> println(resultado.mensagem())
        }
    }

    // ERRO DE COMPILAÇÃO!
    // val resultado = Resultado()  // Cannot create instance of abstract class

    // define variavel com tipo Resultado e atribui instancias de Sucesso e Erro
    val resultadoSucesso: Resultado = Sucesso("Dados carregados com sucesso")
    val resultadoErro: Resultado = Erro("Falha ao carregar os dados")

    tratar(resultadoSucesso)
    tratar(resultadoErro)
}

/*
* Exemplo:
* Este exemplo mostra como o sealed abstract trabalha junto com subclass.
*  */