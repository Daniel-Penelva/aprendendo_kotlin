package basic

fun main() {

    // OBS. Em Kotlin, você pode criar intervalos de valores usando o operador ".."
    // O primeiro e o último valor estão incluídos no intervalo.

    // Exemplo 1
    val intervalo1 = 1..5
    val intervalo2 = 'a'..'e'
    val intervalo3 = 10 downTo 1 step 2  // Intervalo decrescente com passo de 2

    println("=============== Exemplo 1 ===============")
    println("Intervalo 1: $intervalo1")
    println("Intervalo 2: $intervalo2")
    println("Intervalo 3: $intervalo3")

    println("Verificando se 3 está em intervalo1: ${3 in intervalo1}")
    println("Verificando se 'c' está em intervalo2: ${'c' in intervalo2}")
    println("Verificando se 4 está em intervalo3: ${4 in intervalo3}")

    // Com o for loop, você também pode criar intervalos de valores com " .."
    // Exemplo 2 - intervalos com caracteres
    println("=============== Exemplo 2 ===============")

    for (alfabetico in 'a'..'x') {
        print("$alfabetico - ")
    }

    println();

    // Exemplo 3 - intervalos com números
    println("=============== Exemplo 3 ===============")

    for (num1 in 5..15) {
        println(num1)
    }

    // Exemplo 4 - intervalos decrescentes
    println("=============== Exemplo 4 ===============")

    for (num2 in 15 downTo 5) {
        println(num2)
    }

    // Exemplo 5 - intervalos com passo (pulando de dois em dois)
    println("=============== Exemplo 5 ===============")

    for (num3 in 1..10 step 2) {
        println(num3)
    }

    // Exemplo 6 - intervalos decrescentes com passo
    println("=============== Exemplo 6 ===============")

    for (num4 in 10 downTo 1 step 3) {
        println(num4)
    }

    // OBS. Você também pode usar o "in" operador para verificar se um valor existe em um intervalo
    // Exemplo 7 - verificando se um valor está fora do intervalo
    println("=============== Exemplo 7 ===============")

    val intervaloEx7 = 1..20
    val valorEx7 = 25

    if (valorEx7 !in intervaloEx7) {
        println("$valorEx7 está fora do intervalo de $intervaloEx7")
    } else {
        println("$valorEx7 está dentro do intervalo de $intervaloEx7")
    }

    // Exemplo 8 - verificar se existe um valor numerico em um array
    println("=============== Exemplo 8 ===============")

    val nums = arrayOf(2, 4, 6, 8)

    if (2 in nums) {
        println("O valor 2 existe no array nums")
    } else {
        println("O valor 2 não existe no array nums")
    }

    // Exemplo 9 - verificar se existe um valor string em um array
    println("=============== Exemplo 9 ===============")

    val carros = arrayOf("BMW", "Audi", "Ferrari", "Mazda")

    if ("Ferrari" in carros) {
        println("O carro Ferrari existe no array carros")
    } else {
        println("O carro Ferrari não existe no array carros")
    }

    // Exemplo 10 - Interromper um intervalo
    println("=============== Exemplo 10 ===============")

    for (num5 in 1..10) {
        if (num5 == 6) {
            println("Interrompendo o loop ao encontrar o número 6")
            break
        }
        println(num5)
    }

    // Exemplo 11 - Continuar um intervalo
    println("=============== Exemplo 11 ===============")

    for (num6 in 1..10) {
        if (num6 == 6) {
            println("Pulando o número 6")  // Ignore o valor 6 no loop e continue com a próxima iteração
            continue
        }
        println(num6)
    }

    // Exemplo 12 - Usando intervalos com funções
    println("=============== Exemplo 12 ===============")

    fun estaNoIntervalo(num: Int, inicio: Int, fim: Int): Boolean {
        return num in inicio..fim
    }

    val numeroTeste = 15
    val inicioIntervalo = 10
    val fimIntervalo = 20

    if (estaNoIntervalo(numeroTeste, inicioIntervalo, fimIntervalo)) {
        println("$numeroTeste está no intervalo de $inicioIntervalo a $fimIntervalo")
    } else {
        println("$numeroTeste não está no intervalo de $inicioIntervalo a $fimIntervalo")
    }

    // Exemplo 13 - Usando intervalos com when
    println("=============== Exemplo 13 ===============")

    val nota = 85
    val conceito = when (nota) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("A nota $nota corresponde ao conceito $conceito")

    // Exemplo 14 - Usando intervalos com listas
    println("=============== Exemplo 14 ===============")

    val listaNumeros = listOf(5, 10, 15, 20, 25)
    val somaIntervalo = listaNumeros.filter { it in 10..20 }.sum()

    println("A soma dos números entre 10 e 20 na lista é: $somaIntervalo")

    // Exemplo 15 - Usando intervalos com mapas
    println("=============== Exemplo 15 ===============")

    val mapaIdades = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35, "Diana" to 40)
    val pessoasNoIntervalo = mapaIdades.filter { it.value in 30..40 }.keys
    println("Pessoas com idades entre 30 e 40: $pessoasNoIntervalo")

}