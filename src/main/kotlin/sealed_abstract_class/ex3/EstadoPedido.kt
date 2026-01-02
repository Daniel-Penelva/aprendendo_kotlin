package sealed_abstract_class.ex3

sealed abstract class EstadoPedido {

    object Criado: EstadoPedido()
    object Cancelado: EstadoPedido()
    class Pago(val comprovante: String): EstadoPedido()
}