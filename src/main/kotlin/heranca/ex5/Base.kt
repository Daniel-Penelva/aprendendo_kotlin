package heranca.ex5

open class Base {
    init {
        println("Base init")
    }

    open val nome = "Base"
}

class Derivada : Base() {
    override val nome = "Derivada"

    init {
        println("Derivada init")
    }
}

fun main() {
    Derivada()
}

/*
* Exemplo
* Ordem de inicialização
* Propriedades abertas (open) podem ser acessadas antes de serem inicializadas
* */