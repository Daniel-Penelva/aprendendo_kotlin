package sealed_abstract_class.ex1

class Erro(val erro: String): Resultado() {
    override fun mensagem(): String {
        return "Erro: $erro"
    }
}