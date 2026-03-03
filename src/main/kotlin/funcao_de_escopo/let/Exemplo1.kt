package funcao_de_escopo.let

fun main() {
    val name: String? = "daniel"

    // Sem let - verboso
    if (name != null) {
        println(name.uppercase())
    }

    // Com let - elegante
    name?.let {
        println(it.uppercase())  // "it" é o name
    }
}

// Exemplo usando nullable