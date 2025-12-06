package basic

fun main() {

    /*
    * O que é uma Collection em Kotlin?
    * Collection é uma interface que representa um conjunto de elementos.
    * As três coleções principais são:
    *
    * 1. List → elementos ordenados e que podem repetir
    * 2. Set → elementos únicos, sem repetição
    * 3. Map → pares chave → valor
    *
    * Todas fazem parte da Collection API do Kotlin.
    * */

    // List - lista ordenada

    // 1. Criando uma List imutável
    println("============= lista ordenada - Criando uma List imutável =============")
    val nomes = listOf("Ana", "Bruna", "Caio")
    println(nomes[0]) // Acessando o primeiro elemento
    println(nomes)

    // 2. Criando uma List mutável
    println("============= lista ordenada - Criando uma List mutável =============")
    val frutas = mutableListOf("Maça", "Banana", "Laranja")
    frutas.add("Uva") // Adicionando um elemento
    println(frutas) // Imprimindo a lista de frutas

    frutas.remove("Banana") // Removendo um elemento
    println(frutas)

    frutas.removeFirst() // Removendo o primeiro elemento
    println(frutas)

    frutas.add(0, "Morango") // Adicionando um elemento na posição 0
    frutas.add(1, "Abacaxi") // Adicionando um elemento na posição 1
    println(frutas)

    frutas.removeAt(2) // Removendo o elemento da posição 2
    println(frutas)

    // Set - conjunto de elementos únicos (ou seja, sem elementos repetidos)

    // 1. Criando um Set imutável
    println("============= Set - Criando uma List mutável =============")
    val numeros = setOf(1, 2, 3, 4, 5, 5, 5)
    println(numeros) // Imprimindo o Set (note que o 5 não se repete)

    // 2. Criando um Set mutável
    println("============= Set - Criando uma List mutável =============")
    val letras = mutableSetOf("A", "B", "C")
    letras.add("D") // Adicionando um elemento
    println(letras)

    letras.add("A") // Tentando adicionar um elemento repetido
    println(letras) // Note que o "A" não se repete

    letras.remove("B") // Removendo um elemento
    println(letras)

    // OBS. "it" é a palavra reservada do Kotlin para referenciar o elemento atual em uma lambda expression ou função anônima quando há apenas um parâmetro.
    letras.removeIf { it == "C" } // Removendo o elemento "C" usando uma condição
    println(letras)

    // Map - pares chave → valor
    // 1. Criando um Map imutável
    println("============= Map - Criando um Map imutável =============")
    val alunos = mapOf(1 to "Ana", 2 to "Bruna", 3 to "Caio")
    println(alunos[1]) // Acessando o valor pela chave

    // 2. Criando um Map mutável
    println("============= Map - Criando um Map mutável =============")
    val capitais = mutableMapOf("BR" to "Brasília", "US" to "Washington D.C.", "FR" to "Paris")
    capitais["JP"] = "Tóquio" // Adicionando um par chave → valor
    println(capitais)

    capitais.remove("US") // Removendo um par chave → valor pela chave
    println(capitais)

    capitais["FR"] = "Lyon" // Atualizando o valor da chave "FR"
    println(capitais)

}