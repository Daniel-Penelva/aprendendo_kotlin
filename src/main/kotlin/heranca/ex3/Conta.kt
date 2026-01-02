package heranca.ex3

open class Conta {
    open val limite = 1000.00
}

class ContaPremium : Conta() {
    override val limite = 5000.00
}

fun main() {
    val contaComum = Conta()
    val contaPremium = ContaPremium()

    println("Limite da Conta Comum: ${contaComum.limite}")        // Saída: Limite da Conta Comum: 1000.0
    println("Limite da Conta Premium: ${contaPremium.limite}")    // Saída: Limite da Conta Premium: 5000.0
}

/*
* Exemplo
* Herança + propriedades
* Propriedades também participam da herança
* */