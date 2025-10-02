package basic

fun main() {

    /* O for funciona direto sobre ranges, listas e coleções. */

    // Exemplo 1 - for simples com range.
    for (i in 1..5) {
        println("Número: $i")  // 1..5 → cria um intervalo de 1 até 5.
    }


    // Exemplo 2 - for com passo (step) - Pulando valores
    for (i in 1..10 step 2) {
        println("Número ímpar: $i")  // 1, 3, 5, 7, 9
    }


    // Exemplo 3 - for com decremento (downTo) - Contagem regressiva (intervalo decrescente)
    for (i in 5 downTo 1) {
        println("Contagem regressiva: $i")  // 5, 4, 3, 2, 1
    }


    // Exemplo 4 - for com listas (Percorrendo listas)
    val frutas = listOf("Maçã", "Banana", "Laranja")
    for (fruta in frutas) {
        println("Fruta: $fruta")
    }


    // Exemplo 5 - for com arrays
    val numeros = arrayOf(10, 20, 30, 40, 50)
    for (numero in numeros) {
        println("Número do array: $numero")
    }

    // Exemplo 6 - for com índice e valor (usando withIndex)
    val cor = listOf("Vermelho", "Verde", "Azul")
    for ((index, valor) in cor.withIndex()) {
        println("Índice: $index, Valor: $valor")
    }

    // Exemplo 7 - for com condição (usando if dentro do loop)
    for (i in 1..10) {
        if (i % 2 == 0) {  // Verifica se o número é par
            println("Número par: $i")
        }
    }

    // Exemplo 8 - for aninhado (loop dentro de loop)
    for (i in 1..3) {
        for (j in 1..2) {
            println("i: $i, j: $j")
        }
    }

    // Exemplo 9 - for com break (interrompe o loop)
    for (i in 1..10) {
        if (i == 6) {
            println("Interrompendo o loop no número: $i")
            break  // Sai do loop quando i é igual a 6
        }
        println("Número: $i")
    }


    // Exemplo 10 - for com continue (pula para a próxima iteração)
    for (i in 1..10) {
        if (i % 2 != 0) {
            continue  // Pula os números ímpares
        }
        println("Número par: $i")
    }

    // extra
    for (i in 1..10) {
        if (i == 5) break       // para quando chegar em 5
        if (i % 2 == 0) continue // pula os pares
        println(i)
    }


    // Exemplo 11 - for com range decrescente e passo (pulando de 2 em 2)
    for (i in 10 downTo 1 step 2) {
        println("Número decrescente com passo: $i")  // 10, 8, 6, 4, 2
    }


    // Exemplo 12 - for com listas mutáveis
    val numerosMutaveis = mutableListOf(1, 2, 3, 4, 5)
    for (numero in numerosMutaveis) {
        println("Número mutável: $numero")
    }


    // Exemplo 13 - for com arrays multidimensionais
    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    for (linha in matriz) {
        for (elemento in linha) {
            println("Elemento da matriz: $elemento")
        }
    }


    // Exemplo 14 - for com strings (iterando sobre caracteres)
    val palavra = "Kotlin"
    for (char in palavra) {
        println("Caractere: $char")
    }


    // Exemplo 15 - for com índices de arrays (usando indices)
    for (i in numeros.indices) {
        println("Índice: $i, Valor: ${numeros[i]}")
    }


    // Exemplo 16 - for com listas e filtragem (usando filter)
    val numerosFiltrados = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (numero in numerosFiltrados.filter { it % 2 == 0 }) {
        println("Número par filtrado: $numero")
    }


    // Exemplo 17 - for com range exclusivo (until)
    for (i in 1 until 5) {
        println("Número (exclusive): $i")  // 1, 2, 3, 4 (5 não incluído)
    }


    // Exemplo 18 - for com listas e transformação (usando map)
    val numerosTransformados = listOf(1, 2, 3, 4, 5)
    for (numero in numerosTransformados.map { it * 2 }) {
        println("Número transformado: $numero")  // 2, 4, 6, 8, 10
    }


    // Exemplo 19 - for com range e condição (usando if dentro do loop)
    for (i in 1..20) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz: $i")  // Números divisíveis por 3 e 5
        }
    }


    // Exemplo 20 - for com listas e ordenação (usando sorted)
    val numerosDesordenados = listOf(5, 3, 8, 1, 2)
    for (numero in numerosDesordenados.sorted()) {
        println("Número ordenado: $numero")  // 1, 2, 3, 5, 8
    }


    // Exemplo 21 - for com range e condição composta
    for (i in 1..30) {
        if (i % 2 == 0 || i % 3 == 0) {
            println("Número divisível por 2 ou 3: $i")  // Números divisíveis por 2 ou 3
        }
    }


    // Exemplo 22 - for com listas e agregação (usando sum)
    val somaNumeros = listOf(1, 2, 3, 4, 5)
    var soma = 0
    for (numero in somaNumeros) {
        soma += numero
    }
    println("Soma dos números: $soma")  // Soma dos números: 15


    // Exemplo 23 - for com range e condição de múltiplos
    for (i in 1..50) {
        if (i % 7 == 0) {
            println("Múltiplo de 7: $i")  // Números múltiplos de 7
        }
    }


    // Exemplo 24 - for com listas e verificação de existência (usando any)
    val listaVerificacao = listOf(10, 20, 30, 40, 50)
    for (numero in listaVerificacao) {
        if (numero == 30) {
            println("Número 30 encontrado na lista!")
        }
    }


    // Exemplo 25 - for com range e condição de intervalo
    for (i in 1..100) {
        if (i in 20..30) {
            println("Número no intervalo de 20 a 30: $i")  // Números entre 20 e 30
        }
    }


    // Exemplo 26 - for com listas e contagem (usando count)
    val listaContagem = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var countPar = 0
    for (numero in listaContagem) {
        if (numero % 2 == 0) {
            countPar++
        }
    }
    println("Total de números pares na lista: $countPar")  // Total de números pares na lista: 5


    // Exemplo 27 - for com range e condição de primalidade
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
    for (i in 1..50) {
        if (isPrime(i)) {
            println("Número primo: $i")  // Números primos entre 1 e 50
        }
    }


    // Exemplo 28 - for com listas e concatenação (usando joinToString)
    val listaConcat = listOf("Kotlin", "é", "incrível")
    var frase = ""
    for (palavra in listaConcat) {
        frase += "$palavra "
    }
    println("Frase concatenada: ${frase.trim()}")  // Frase concatenada: Kotlin é incrível


    // Exemplo 29 - for com range e condição de múltiplos de 4
    for (i in 1..100) {
        if (i % 4 == 0) {
            println("Múltiplo de 4: $i")  // Números múltiplos de 4
        }
    }


    // Exemplo 30 - for com listas e verificação de todos os elementos (usando all)
    val listaAll = listOf(2, 4, 6, 8, 10)
    var allEven = true
    for (numero in listaAll) {
        if (numero % 2 != 0) {
            allEven = false
            break
        }
    }
    println("Todos os números são pares? $allEven")  // Todos os números são pares? true


    // Exemplo 31 - while
    var contador = 1

    while (contador <= 5) {
        println("Contador: $contador")
        contador++
    }

    // Exemplo 32 - do...while
    var numero = 0

    do {
        println("Número: $numero")
        numero++
    } while (numero < 3)

}

/* ATENÇÃO!
* for → percorre intervalos, coleções e listas.
* while → executa enquanto a condição for verdadeira.
* do-while → executa pelo menos uma vez.
* break e continue → controlam a execução dentro dos loops.
* */