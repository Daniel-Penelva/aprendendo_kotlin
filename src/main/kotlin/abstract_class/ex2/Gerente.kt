package abstract_class.ex2

class Gerente: Funcionario() {
    override val salario: Double
        get() = 8000.0

    // Ou pode fazer assim também:
    // override val salario: Double = 8000.0
}