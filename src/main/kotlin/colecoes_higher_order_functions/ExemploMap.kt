package colecoes_higher_order_functions

// Map — chave e valor
fun main() {

    // Imutável
    val capitais = mapOf(
        "Brasil" to "Brasília",
        "Argentina" to "Buenos Aires",
        "França" to "Paris",
        "Japão" to "Tóquio"
    )

    println("Imprimindo as capitais")
    for ((pais, capital) in capitais) {
        println("A capital do $pais é $capital")
    }

    println(capitais["Brasil"]) // Brasília

    // Mutável
    val estoque = mutableMapOf("Notebook" to 5, "Mouse" to 12)
    estoque["Teclado"] = 8 // adiciona
    estoque["Mouse"] = 10 // atualiza

    println("Imprimindo o estoque")
    for ((produto, quantidade) in estoque) {
        println("Produto: $produto, Quantidade: $quantidade")
    }

    println(estoque.getOrDefault("HD", 0)) // 0 - evita null
}