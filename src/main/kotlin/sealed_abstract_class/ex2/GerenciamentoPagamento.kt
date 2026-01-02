package sealed_abstract_class.ex2

fun main(){
    val pagamentos = listOf(
        Pix(150.0),
        Cartao(500.0),
        Cartao(1500.0)
    )

    pagamentos.forEach { pagamento ->
        val sucesso = pagamento.processarPagamento()
        println("Pagamento realizado com sucesso: $sucesso\n")
    }
}

/*
* Exemplo:
* Este exemplo mostra como utilizar o estado compartilhado, no caso, estado comum "valor"*/