package enumeracao

// Exemplo - enum class com métodos
enum class FormaPagamento {
    PIX {
        override fun taxa() = 0.0
    },
    CARTAO {
        override fun taxa() = 0.05
    };

    abstract fun taxa(): Double
}

fun main() {
    val pagamentoPix = FormaPagamento.PIX
    val pagamentoCartao = FormaPagamento.CARTAO

    println("Taxa PIX: ${pagamentoPix.taxa()}")          // Taxa PIX: 0.0
    println("Taxa Cartão: ${pagamentoCartao.taxa()}")    // Taxa Cartão: 0.05
}