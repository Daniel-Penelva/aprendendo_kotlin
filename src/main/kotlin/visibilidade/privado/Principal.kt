package visibilidade.privado

// Testando numa classe Principal
fun main() {
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