package visibilidade.privado

class ContaBancaria {

    private var saldo: Double = 0.0

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("Valor de depósito inválido")
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
        } else {
            println("Valor de saque inválido ou saldo insuficiente")
        }
    }

    fun mostrarSaldo(): Double {
        return saldo
    }

}

fun  main() {
    val conta = ContaBancaria()

    // Isso não compila
    // conta.saldo // Erro: 'saldo' é privado e só pode ser acessado dentro da classe 'ContaBancaria'

    conta.depositar(1000.0)
    println("Saldo atual: ${conta.mostrarSaldo()}")

    conta.sacar(500.0)
    println("Saldo atual: ${conta.mostrarSaldo()}")
}

/*
private

    - O mais restritivo
    - Em propriedades e métodos
    - Encapsulamento forte
    - Regra de negócio protegida

* */