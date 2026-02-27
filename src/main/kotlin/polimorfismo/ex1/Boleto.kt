package polimorfismo.ex1

// Classe para pagamento com boleto - Classe Filha (subclasse)
class Boleto(valor: Double): Pagamento(valor) {
    override fun processar() {
        println("Processando pagamento via boleto: R$ $valor")
    }
}