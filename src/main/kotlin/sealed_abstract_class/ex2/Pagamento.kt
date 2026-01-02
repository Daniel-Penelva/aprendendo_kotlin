package sealed_abstract_class.ex2

sealed abstract class Pagamento(protected open val valor: Double) {
    abstract fun processarPagamento(): Boolean
}