package object_e_singleton

data class Cor(val tipo: String)

object GerenciadorCores {

    // Se quiser inicializar uma lista sem cores (vazia)
    // private val coresDisponiveis = mutableListOf<Cor>()

    private val coresDisponiveis = mutableListOf(
        Cor("Vermelho"),
        Cor("Verde"),
        Cor("Azul"),
        Cor("Amarelo")
    )

    fun listarCores(): List<Cor> {
        return coresDisponiveis
    }

    fun adicionarCor(cor: Cor) {
        coresDisponiveis.add(cor)
    }

    fun totalCores(): Int {
        return coresDisponiveis.size
    }
}

fun main() {
    println("Cores disponíveis:")
    GerenciadorCores.listarCores().forEach { cor ->
        println("- ${cor.tipo}")
    }

    println("Total de cores: ${GerenciadorCores.totalCores()}")

    GerenciadorCores.adicionarCor(Cor("Roxo"))
    println("Após adicionar uma nova cor:")
    println("Total de cores: ${GerenciadorCores.totalCores()}")
}

/*
Este exemplo mostra o uso de um objeto singleton em Kotlin para gerenciar uma coleção de cores.
* */
