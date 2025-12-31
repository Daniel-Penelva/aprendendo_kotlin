package interfaces

interface Carro {
    val marca: String
    val modelo: String
    val cor: String

    fun fazerBarulho()

    fun cor(cor: String) = "Cor definida: $cor"
}

data class Ferrari(override val marca: String, override val modelo: String, override val cor: String) : Carro {
    override fun fazerBarulho() {
        println("Rrrrrrroooommmmmm!")
    }

    override fun cor(cor: String): String {
        return super.cor(cor)
    }
}

data class Lamborguini(override val marca: String, override val modelo: String, override val cor: String) : Carro {
    override fun fazerBarulho() {
        println("RrrrrrroooommmmmmNananananana!")
    }

    override fun cor(cor: String): String {
        return super.cor(cor)
    }
}

fun main() {
    val carro: Carro = Ferrari("Ferrari", "F8 Tributo", "Vermelho")
    println("Marca: ${carro.marca}")
    println("Modelo: ${carro.modelo}")
    println(carro.cor(carro.cor))
    carro.fazerBarulho()

    println(" ============================================================================ ")

    val carro2: Carro = Lamborguini("Lamborguini", "Aventador", "Amarelo")
    println("Marca: ${carro2.marca}")
    println("Modelo: ${carro2.modelo}")
    println(carro2.cor(carro2.cor))
    carro2.fazerBarulho()
}

/* Exemplo:
Este exemplo demonstra a definição de uma interface Carro com propriedades e métodos, e duas classes que a implementam: Ferrari e Lamborguini.
* */