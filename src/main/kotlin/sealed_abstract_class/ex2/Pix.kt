package sealed_abstract_class.ex2

data class Pix(override val valor: Double): Pagamento(valor) {
    override fun processarPagamento(): Boolean {
        println("Processando pagamento via Pix no valor de R$ $valor")
        return true
    }
}