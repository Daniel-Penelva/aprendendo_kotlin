package interfaces

interface A {
    fun executar() {
        println("A executando...")
    }
}

interface B {
    fun executar() {
        println("B executando...")
    }
}

// OBS. Repare que os métodos de A e B possuem o mesmo nome - como resolver esse conflito?
// Utiliza-se o super<?> para especificar de qual interface o método deve ser chamado.
class Teste: A, B {
    override fun executar() {
        super<A>.executar() // Chama o método da interface A
        super<B>.executar() // Chama o método da interface B
    }
}

fun main() {
    val teste: Teste = Teste()
    teste.executar()

    val testeA: A = Teste()
    testeA.executar()

    val testeB: B = Teste()
    testeB.executar()
}

/* Exemplo:
Conflito de métodos (como resolver)
Caso o metodo possua o mesmo nome em duas interfaces diferentes, utiliza-se o super<?> para especificar de qual interface o método deve ser chamado.
* */