package basic

fun main() {

    /*
    * O que é um Set?
    *
    * Um Set é uma coleção que:
    *   . NÃO permite elementos repetidos
    *   . NÃO garante ordem (no caso do setOf)
    *   . Permite operações matemáticas de conjuntos (união, interseção, diferença)
    *   . setOf cria um Set imutável (não dá para alterar depois que é criado).
    *
    * É diferente de uma List, que permite elementos duplicados e mantém ordem.
    * */

    // Exemplo 1: Conjunto Imutável
    println("======= Conjuntos (Sets) em Kotlin =======")
    val numeros = setOf(1, 2, 3, 4, 5, 5, 5)
    println("Conjunto original: $numeros") // Output: [1, 2, 3, 4, 5] (sem duplicatas - Repetições são removidas automaticamente)


    // Adicionando elementos a um conjunto (sets são imutáveis por padrão)
    println("========= Adicionando elementos a um conjunto =========")
    val numerosComAdicao = numeros + 6
    println("Conjunto após adição de 6: $numerosComAdicao")


    // Removendo elementos de um conjunto
    println("========= Removendo elementos de um conjunto =========")
    val numerosComRemocao = numeros - 2
    println("Conjunto após remoção de 2: $numerosComRemocao")


    // Tamanho do conjunto
    println("========= Tamanho do conjunto =========")
    val tamanho = numeros.size
    println("Tamanho do conjunto: $tamanho")


    // Verificando se um elemento está no conjunto
    println("========= Verificando se um elemento está no conjunto =========")
    val contemTres = 3 in numeros
    println("O conjunto contém o número 3? $contemTres")


    // Iterando sobre os elementos do conjunto
    println("========= Iterando sobre os elementos do conjunto =========")
    println("(Exemplo 1) Iterando sobre os elementos do conjunto:")
    numeros.forEach { println(it) }

    // ou
    println("(Exemplo 2) Iterando sobre os elementos do conjunto:")
    for (n in numeros) {
        println(n)
    }

    // Operações de conjuntos: união, interseção e diferença
    println("========= Operações de conjuntos: união, interseção e diferença =========")

    val conjuntoA = setOf(1, 2, 3)
    val conjuntoB = setOf(3, 4, 5)

    val uniao = conjuntoA union conjuntoB
    val intersecao = conjuntoA intersect conjuntoB
    val diferenca = conjuntoA subtract conjuntoB

    println("União de A e B: $uniao")               // Output: [1, 2, 3, 4, 5]
    println("Interseção de A e B: $intersecao")     // Output: [3]
    println("Diferença de A e B: $diferenca")       // Output: [1, 2]


    // containsAll - verifica se todos os elementos de outro conjunto estão presentes
    println("========= (Exemplo 1) containsAll - verifica se todos os elementos de outro conjunto estão presentes =========")
    val conjunto = setOf(1, 2, 3, 4)
    println(conjunto.containsAll(listOf(2, 3))) // Output: true
    println(conjunto.containsAll(listOf(2, 5))) // Output: false


    println("========= (Exemplo 2) containsAll - verifica se todos os elementos de outro conjunto estão presentes =========")
    val conjuntoC = setOf(1, 2)
    val contemTodos = numeros.containsAll(conjuntoC)
    println("O conjunto original contém todos os elementos de C? $contemTodos")


    // isEmpty - verifica se o conjunto está vazio
    println("========= isEmpty - verifica se o conjunto está vazio =========")
    val conjuntoVazio = setOf<Int>()
    println("O conjunto vazio está vazio? ${conjuntoVazio.isEmpty()}")


    // Exemplon 2: Conjunto Mutável
    // Set mutavel - mutableSetOf
    // Permite adicionar, alterar e remover elementos após a criação
    println("======= Conjunto Mutável =======")
    val nomes = mutableSetOf("Ana", "Bruno", "Carlos")
    println("Conjunto mutável original: $nomes")


    // Adicionando um elemento
    println("========= Adicionando um elemento =========")
    nomes.add("Diana")
    println("Após adicionar Diana: $nomes")


    // Removendo um elemento
    println("========= Removendo um elemento =========")
    nomes.remove("Bruno")
    println("Após remover Bruno: $nomes")


    // Se você tentar adicionar um elemento que já existe, nada acontece
    println("========= Tentando adicionar um elemento que já existe =========")
    nomes.add("Ana") // já existe
    println(nomes)     // não muda


    // Verificando se contém um elemento
    println("========= Verificando se contém um elemento =========")
    val contemAna = nomes.contains("Ana")
    println("O conjunto mutável contém Ana? $contemAna")


    // Ótimo para buscas rápidas
    println("========= Verificação rápida de existência =========")
    if ("Carlos" in nomes) {
        println("Carlos está no conjunto mutável.")
    } else {
        println("Carlos não está no conjunto mutável.")
    }


    // Limpando o conjunto mutável
    println("========= Limpando o conjunto mutável =========")
    nomes.clear()
    println("Após limpar o conjunto mutável: $nomes") // Output: []


    // hashSetOf - não mantém ordem dos elementos - mais rápido, sem ordem
    println("======= hashSetOf - não mantém ordem dos elementos =======")
    val hashSet = hashSetOf(3, 1, 4, 2, 5)
    println("HashSet original: $hashSet") // Output: ordem pode variar, ex: [1, 2, 3, 4, 5]


    // linkedSetOf - mantém a ordem de inserção dos elementos
    println("======= linkedSetOf - mantém a ordem de inserção dos elementos =======")
    val linkedSet = linkedSetOf(3, 1, 4, 2, 5)
    println("LinkedSet original: $linkedSet") // Output: [3, 1, 4, 2, 5]


    // sortedSetOf - mantém os elementos ordenados
    println("======= sortedSetOf - mantém os elementos ordenados =======")
    val sortedSet = sortedSetOf(5, 3, 1, 4, 2)
    println("SortedSet original: $sortedSet") // Output: [1, 2, 3, 4, 5]

}