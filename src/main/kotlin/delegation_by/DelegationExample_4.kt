package delegation_by

interface Calculavel {
    fun calcular(): Double
}

class PrecoImposto : Calculavel {
    override fun calcular() = 1.1
}

class Animal(val precoCalc: Calculavel): Calculavel by precoCalc {
    var precoBase = 100.0

    fun precoTotal() = precoBase * calcular()
}
fun main() {
    val cachorro = Animal(PrecoImposto())
    println("Preço total do cachorro: ${cachorro.precoTotal()}")

}