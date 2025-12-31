package abstract_class.ex2

fun main() {
    val gerente = Gerente()
    val administrador = Administrador()

    println("Salário do Gerente: R$${gerente.salario}")
    println("Salário do Administrador: R$${administrador.salario}")
}

/*
* Exemplo:
Propriedades abstratas
Uma abstract class pode exigir que a subclasse forneça dados.
* */