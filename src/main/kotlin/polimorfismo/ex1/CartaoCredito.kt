package polimorfismo.ex1

// Classe para pagamento com cartão de crédito - Classe Filha (subclasse)
class CartaoCredito(valor: Double): Pagamento(valor) {
    override fun processar() {
        println("Processando pagamento no cartão de crédito: R$ $valor")
    }
}