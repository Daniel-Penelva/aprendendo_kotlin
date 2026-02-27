package polimorfismo.ex1

// Classe base para pagamentos - Classe Pai
open class Pagamento(val valor: Double) {
    open fun processar() {
        println("Processando pagamento de R$ $valor")
    }
}