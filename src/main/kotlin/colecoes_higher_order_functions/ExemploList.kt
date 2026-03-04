package colecoes_higher_order_functions

// List — a coleção mais usada
fun main() {

    // Lista imutável
    val frutas = listOf("Maça", "Banana", "Uva", "Laranja")

    println("Imprimindo as frutas")
    for (fruta in frutas) {
        println(fruta)
    }

    println("Imprimindo informações sobre as frutas")
    println(frutas[0])  // Maça
    println(frutas.size) // 4
    println(frutas.first()) // Maça
    println(frutas.last())  // Laranja
    println(frutas.contains("Uva")) // true
    println(frutas.indexOf("Banana")) // 1
    println(frutas.get(2)) // Uva
    println(frutas.equals(listOf("Maça", "Banana", "Uva", "Laranja"))) // true


    // Lista mutável
    val numeros = mutableListOf(1, 2, 3, 4, 5)
    numeros.add(6)
    numeros.remove(2) // Remove o número 2 da lista
    numeros.addFirst(0) // Adiciona o número 0 no início da lista
    numeros.addLast(7) // Adiciona o número 7 no final da lista
    numeros.removeIf { it % 2 == 0 } // Remove os números pares da lista

    println("Imprimindo os números")
    for(numero in numeros) {
        println(numero)
    }
}