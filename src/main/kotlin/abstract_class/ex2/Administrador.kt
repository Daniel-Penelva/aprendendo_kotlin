package abstract_class.ex2

class Administrador : Funcionario() {
    override val salario: Double
        get() = 6000.0

    // Ou pode fazer assim também:
    // override val salario: Double = 6000.0
}