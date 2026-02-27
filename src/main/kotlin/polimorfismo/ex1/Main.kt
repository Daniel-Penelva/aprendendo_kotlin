package polimorfismo.ex1

fun main() {

    // Criando instâncias de pagamento - Exemplo 1
    println("===== Exemplo 1 =====")
    val pagamentos: List<Pagamento> = listOf(
        CartaoCredito(150.0),
        Boleto(200.0),
        Pix(99.90)
    )

    for (pagamento in pagamentos) {
        executarPagamento(pagamento)
    }

    // Criando instâncias de pagamento - Exemplo 2
    println("===== Exemplo 2 =====")
    val pagamentoBoleto = Boleto(150.0)
    val pagamentoPix = Pix(200.0)

    println("Executando pagamento via boleto:")
    executarPagamento(pagamentoBoleto)

    println("\nExecutando pagamento via Pix:")
    executarPagamento(pagamentoPix)
}