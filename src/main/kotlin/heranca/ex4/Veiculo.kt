package heranca.ex4

abstract class Veiculo {

    abstract fun mover()
}

class Carro: Veiculo() {
    override fun mover() {
        println("O carro está dirigindo na estrada.")
    }
}

fun main() {
    val carro: Veiculo = Carro()
    carro.mover()  // Saída: O carro está dirigindo na estrada.
}

/*
* Exemplo:
* Herança + abstract class
* Subclasse é obrigada a implementar
* */