package polimorfismo.ex1

class Pix(valor: Double): Pagamento(valor) {
    override fun processar() {
        println("Processando pagamento via Pix: R$ $valor")
    }
}