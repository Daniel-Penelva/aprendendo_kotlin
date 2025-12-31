package interfaces

interface Nomeavel {
    val nome: String
        get() = "Desconhecido"
}

class  Produto: Nomeavel

fun main() {
    val produto: Nomeavel = Produto()
    println("Nome do produto: ${produto.nome}")
}

/* Exemplo:
Interfaces com getters customizados
* */