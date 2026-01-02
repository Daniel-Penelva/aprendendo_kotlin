package sealed_abstract_class.ex1

class Sucesso(val dados: String): Resultado() {
    override fun mensagem(): String {
        return "Sucesso: $dados"
    }

    // ou pode fazer assim:
    /*
        override fun mensagem() = "Sucesso: $dados"
    * */
}