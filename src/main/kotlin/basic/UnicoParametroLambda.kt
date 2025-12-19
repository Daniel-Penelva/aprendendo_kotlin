package basic

fun main() {

    // Exemplo 1 - Conceito Básico
    println("====================== Exemplo 1 - Conceito Básico ======================")

    val frutas = listOf("Maça", "Banana", "Laranja")

    // Longo: Declarando parâmetro
    println("====================== Longo: Declarando parâmetro ======================")
    frutas.forEach { fruta -> println("Frutas: $fruta") }

    // Curto: Usando it (Kotlin cria automaticamente)
    println("====================== Curto: Usando it (Kotlin cria automaticamente) ======================")
    frutas.forEach { println("Frutas: $it") }


    // Exemplo 2 - o uso do it só funciona com um parâmetro
    println("====================== Exemplo 2 - o uso do it só funciona com um parâmetro ======================")

    // Filtrar frutas com letra acima de 5
    println("====================== Filtrar frutas com letra acima de 5 ======================")
    val tamanhoFruta = frutas.filter { it.length > 5 }
    println("Fruta com mais de cinco letras: $tamanhoFruta")

    // Mapear aumentando o tamanho da letra
    println("====================== Mapear aumentando o tamanho da letra ======================")
    val alterartamanhoPalavra = frutas.map { it.uppercase() }
    println("Alterar tamanho palavra: $alterartamanhoPalavra")

    // Verifica se existe banana na lista de fruta
    println("====================== Verifica se existe banana na lista de fruta ======================")
    val existeBanana = frutas.any { it == "uva" }
    println("Existe banana na lista de fruta? $existeBanana")

    // OBS. Não funciona com dois parâmetros (index e fruta), it não funciona
    println("====================== Não funciona com dois parâmetros (index e fruta), it não funciona ======================")
    frutas.forEachIndexed {index, fruta -> println("$index: $fruta") }


    // Exemplo 3 - exemplos práticos
    println("====================== Exemplo 3 - exemplos práticos ======================")

    val numeros = listOf(1, 2, 3, 4, 5)
    println(numeros)

    // Filtrar números pares
    println("====================== Filtrar números pares ======================")
    val pares = numeros.filter { it % 2 == 0 }
    println("Pares: $pares")

    // MAPEAR - dobrar cada número
    println("====================== MAPEAR - dobrar cada número ======================")
    val dobrados = numeros.map { it * 2 }
    println("Pares: $dobrados")

    // 3. ANY - verifica se existe número > 3
    println("====================== ANY - verifica se existe número > 3 ======================")
    val temMaior3 = numeros.any { it > 3 }
    println("Tem > 3? $temMaior3") // true


    // Exemplo 4 - Exemplo prático utilizando mutableListOf
    println("====================== Exemplo 4 - Exemplo prático utilizando mutableListOf ======================")

    val nomes = mutableListOf("Daniel", "Isis", "Biana", "Ellen", "Walter", "Paulo", "Maria")
    println("Nomes: $nomes")

    // FILTRAR - nomes acima de cinco letras
    println("====================== FILTRAR - nomes acima de cinco letras ======================")
    val nomesLongos = nomes.filter { it.length > 5 }
    println("Nome acima de cinco letras: $nomesLongos")

    // REMOVER TODOS - nome que contém a letra a
    println("====================== REMOVER TODOS - nome que contém a letra a ======================")
    nomes.removeAll { it.contains("a") }
    println("Sem 'a': $nomes ")

    // Removendo valor específico
    println("====================== Removendo valor específico ======================")
    nomes.removeAll { it.equals("Ellen", ignoreCase = true) }
    println("Nomes: $nomes")

    // Remove nome com a letra I
    println("====================== Remove nome com a letra I ======================")
    nomes.removeIf { it.startsWith("I") }
    println("Nomes: $nomes")

}

/*
O "it" é um nome automático que o Kotlin cria para o único parâmetro de uma lambda quando você não declara explicitamente.
É uma abreviação para tornar o código mais curto e limpo.

Conceito Básico
Quando uma função espera uma lambda com 1 parâmetro, você pode:

Declarar o parâmetro: { nome -> nome.length }

Usar it: { it.length }
Kotlin cria o it automaticamente
* */