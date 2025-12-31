package object_e_singleton

object Configuracao {

    const val VERSAO = "1.0"
    var nomeAplicacao: String = "Minha Aplicação"
    var debugMode: Boolean = false

    fun inicializarConfiguracao() {
        println("Aplicação: $nomeAplicacao")
        println("Versão: $VERSAO")
        println("Modo Debug: $debugMode")
    }
}

fun main() {

    Configuracao.inicializarConfiguracao()  // Única instância

    // Acessando o singleton Configuracao
    Configuracao.nomeAplicacao = "App Exemplo"

    Configuracao.debugMode = true
    println("Debug: ${Configuracao.debugMode}")

    // Exibindo as configurações
    Configuracao.inicializarConfiguracao()

}