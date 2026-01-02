package sealed_abstract_class.ex3

fun main() {

    fun status(estado: EstadoPedido) {
        when (estado) {
            EstadoPedido.Criado -> println("Pedido Criado")
            EstadoPedido.Cancelado -> println("Pedido Cancelado")
            is EstadoPedido.Pago -> println("Pedido Pago com comprovante: ${estado.comprovante}")
        }
    }

    val estadoCriar: EstadoPedido = EstadoPedido.Criado
    status(estadoCriar)

    val estadoCancelar: EstadoPedido = EstadoPedido.Cancelado
    status(estadoCancelar)

    val estadoPagar: EstadoPedido = EstadoPedido.Pago("12345ABC")
    status(estadoPagar)
}

/*
* Exemplo:
* sealed abstract class + object
* Perfeito para estados únicos + estados com dados
* */