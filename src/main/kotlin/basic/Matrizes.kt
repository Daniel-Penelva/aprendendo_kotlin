package basic

fun main() {

    /* Os arrays são usados para armazenar múltiplos valores em uma única variável, em vez de criar variáveis separadas para cada valor.
    * Para criar um array, use a arrayOf()função e coloque os valores em uma lista separada por vírgulas dentro dele */

    // Exemplo 1
    val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(carros[0]) // Acessa o primeiro elemento do array

    carros[0] = "Ferrari"; // Modifica o primeiro elemento do array
    println(carros[0])

    // Tamanho do array
    println(carros.size)  // Retorna o número de elementos no array

    // Verifica se o elemento existe
    if("Volvo" in carros) {
        println("O carro Volvo está na lista.")
    } else {
        println("O carro Volvo NÃO está na lista.")
    }

    // Percorrer um array
    for (carro in carros) {
        println(carro)
    }


    // Exemplo 2
    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    // Exemplo 3 - Funções úteis para arrays
    val numeros = arrayOf(10, 20, 30, 40, 50)
    val soma = numeros.sum() // Soma todos os elementos do array
    val media = numeros.average() // Calcula a média dos elementos do array
    println("A soma dos números é: $soma")
    println("A média dos números é: $media")

    numeros.reverse() // Inverte a ordem dos elementos do array
    println("Array invertido: ${numeros.joinToString(", ")}")

}