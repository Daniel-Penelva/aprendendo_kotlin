package heranca_multipla_com_interface

open class Funcionario(val nome: String) {

    open fun apresentar() {
        println("Sou funcionário: $nome")
    }
}