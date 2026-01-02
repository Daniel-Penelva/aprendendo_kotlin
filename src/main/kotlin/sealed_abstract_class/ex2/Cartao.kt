package sealed_abstract_class.ex2

data class Cartao(override val valor: Double): Pagamento(valor) {
    override fun processarPagamento(): Boolean {
        println("Pagamento cartão: $valor")
        return valor <= 1000
    }
}