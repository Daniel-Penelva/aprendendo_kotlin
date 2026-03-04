package colecoes_higher_order_functions

// Set — sem duplicatas
fun main() {

    // Set — coleção de elementos únicos
    val cores = setOf("Vermelho", "Verde", "Azul", "Amarelo", "Vermelho") // "Vermelho" é duplicado - duplicatas ignoradas

    println("Imprimindo as cores")
    for (cor in cores) {
        println(cor)
    }

    println("Tamanho do set: ${cores.size}") // 4 - "Vermelho" é contado apenas uma vez
    println("Contém 'Azul'? ${cores.contains("Azul")}") // true
    println("Contém 'Rosa'? ${cores.contains("Rosa")}") // false

    // Set mutável
    val tags = mutableSetOf("Kotlin", "Java", "Python")

    tags.add("mobile")
    tags.add("Kotlin") // ignorado, já existe
    tags.remove("Java")

    println(tags.contains("Android")) // false
    println(tags.size) // 3

    for (linguagem in tags) {
        println(linguagem)
    }
}