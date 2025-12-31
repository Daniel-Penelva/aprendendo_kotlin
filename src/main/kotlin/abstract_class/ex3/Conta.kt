package abstract_class.ex3

abstract class Conta {
    protected var saldo: Double = 0.0

    fun depositar(valor: Double) {
        saldo += valor
    }

    abstract fun sacar(valor: Double)
}


// Controle de Visibilidade