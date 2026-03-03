package funcao_de_escopo

data class Pedido(
    var cliente: String = "",
    var produto: String = "",
    var quantidade: Int = 0,
    var observacao: String? = null
)

fun main(){

    // Usando apply para configurar um Pedido
    val pedido = Pedido().apply {
        cliente = "Daniel"
        produto = "Notebook"
        quantidade = 2
        observacao = "Entregar no endereço X"

    }.also { println("Pedido criado: $it") }  // Usando also para imprimir o pedido no console antes de salvá-lo.

    // Usando let para imprimir a observação somente se ela não for nula.
    pedido.observacao?.let { println("Observação do pedido: $it") }

}

/*
Enunciado:
Usando apply, configure um Pedido com os valores que quiser. Depois use also para imprimir o pedido no console antes de salvá-lo.
Por fim, use let para imprimir a observacao somente se ela não for nula.
* */