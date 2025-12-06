package basic

fun main() {

    println("======= Listas em Kotlin =======")
    val numeros = listOf(1, 2, 3, 4, 5)
    println("Lista original: $numeros")

    // Funções Comuns em Collections

    // forEach - itera sobre os elementos da lista
    println("========= forEach - itera sobre os elementos da lista =========")
    listOf(1, 2, 3).forEach() {
        println(it)
    }

    println("========= forEach com nome de parâmetro =========")
    listOf("maça", "banana", "laranja").forEach { fruta ->
        println(fruta)
    }


    // map - transforma elementos e cria uma nova lista
    println("========= map - transforma elementos e cria uma nova lista =========")
    val dobrados = listOf(1, 2, 3, 4).map { it * 2 }
    println(dobrados) // Output: [2, 4, 6, 8]


    // filter - filtra elementos com base em uma condição
    println("========= filter - filtra elementos com base em uma condição =========")
    val pares = listOf(1, 2, 3, 4, 5, 6).filter { it % 2 == 0 }
    println(pares) // Output: [2, 4, 6]


    // sum - soma todos os elementos da lista
    println("========= sum - soma todos os elementos da lista =========")
    val soma = listOf(1, 2, 3, 4, 5).sum()
    println(soma) // Output: 15


    // find - encontra o primeiro elemento que satisfaz uma condição
    println("========= find - encontra o primeiro elemento que satisfaz uma condição =========")
    val primeiroPar = listOf(1, 3, 5, 6, 7).find { it % 2 == 0 }
    println(primeiroPar) // Output: 6


    // any - verifica se algum elemento satisfaz uma condição - retorna boolean
    println("========= (Exemplo 1) any - verifica se algum elemento satisfaz uma condição =========")
    val temPar = listOf(1, 3, 5, 7).any { it % 2 == 0 }
    println(temPar) // Output: false

    println("========= (Exemplo 2) any - verifica se algum elemento satisfaz uma condição =========")
    val nums = listOf(2, 4, 6)
    println(nums.any{ it > 5}) // Output: true
    println(nums.any{ it == 1}) // Output: false


    // all - verifica se todos os elementos satisfazem uma condição - retorna boolean
    println("========= all - verifica se todos os elementos satisfazem uma condição =========")
    val todosPares = listOf(2, 4, 6, 8).all { it % 2 == 0 }
    println(todosPares) // Output: true


    // count - conta quantos elementos satisfazem uma condição
    println("========= count - conta quantos elementos satisfazem uma condição =========")
    val quantidadePares = listOf(1, 2, 3, 4, 5, 6).count { it % 2 == 0 }
    println(quantidadePares) // Output: 3


    // sorted - ordena os elementos da lista
    println("========= sorted - ordena os elementos da lista =========")
    val ordenados = listOf(5, 2, 8, 1, 4).sorted()
    println(ordenados) // Output: [1, 2, 4, 5, 8]


    // sortedDescending - ordena os elementos da lista em ordem decrescente
    println("========= sortedDescending - ordena os elementos da lista em ordem decrescente =========")
    val ordenadosDecrescente = listOf(5, 2, 8, 1, 4).sortedDescending()
    println(ordenadosDecrescente) // Output: [8, 5, 4, 2, 1]


    // reverse - inverte a ordem dos elementos da lista
    println("========= reverse - inverte a ordem dos elementos da lista =========")
    val invertidos = listOf(1, 2, 3, 4, 5).reversed()
    println(invertidos) // Output: [5, 4, 3, 2, 1]


    // take - pega os primeiros n elementos da lista
    println("========= take - pega os primeiros n elementos da lista =========")
    val lista = listOf(1, 2, 3, 4, 5).take(3)
    println(lista) // Output: [1, 2, 3]

    println(lista.take(2)) // Output: [1, 2]


    // drop - descarta os primeiros n elementos da lista
    println("========= drop - descarta os primeiros n elementos da lista =========")
    val listaDrop = listOf(1, 2, 3, 4, 5).drop(2)
    println(listaDrop) // Output: [3, 4, 5]

    println(listaDrop.drop(1)) // Output: [4, 5]


    // first - retorna o primeiro elemento da lista
    println("========= first - retorna o primeiro elemento da lista =========")
    val primeiroElemento = listOf(10, 20, 30, 40).first()
    println(primeiroElemento) // Output: 10
    // ou
    // println(primeiroElemento.first())


    // last - retorna o último elemento da lista
    println("========= last - retorna o último elemento da lista =========")
    val ultimoElemento = listOf(10, 20, 30, 40).last()
    println(ultimoElemento) // Output: 40
    // ou
    // println(primeiroElemento.last())


    // reduce - reduz a lista a um único valor usando uma operação acumulativa
    println("========= (Exemplo 1) reduce - reduz a lista a um único valor usando uma operação acumulativa =========")
    val produto = listOf(1, 2, 3, 4).reduce { acc, num -> acc * num }
    println(produto) // Output: 24 (1*2*3*4)

    println("========= (Exemplo 2) reduce - reduz a lista a um único valor usando uma operação acumulativa =========")
    val adicao = listOf(1, 2, 3).reduce {acc, n -> acc + n}
    println(adicao) // Output: 6 (1+2+3)


    // fold - semelhante ao reduce, mas permite um valor inicial
    println("========= fold - semelhante ao reduce, mas permite um valor inicial =========")
    val somaComInicial = listOf(1, 2, 3).fold(10) { acc, n -> acc + n }
    println(somaComInicial) // Output: 16 (10+1+2+3)

}