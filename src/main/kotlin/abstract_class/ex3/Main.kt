package abstract_class.ex3

fun main() {
    val contaCorrente = ContaCorrente()
    contaCorrente.depositar(1000.0)
    contaCorrente.sacar(500.0)
}

/*
* Exemplo:
* Este exemplo demonstra como utilizar o controle de visibilidade. O modificador de acesso é protected, logo só será acessivel
* dentro da classe Conta e suas subclasses.
* */