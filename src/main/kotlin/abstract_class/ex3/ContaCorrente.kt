package abstract_class.ex3

class ContaCorrente: Conta() {
    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }
}