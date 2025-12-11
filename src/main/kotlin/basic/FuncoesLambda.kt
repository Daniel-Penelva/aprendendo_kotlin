package basic

// Exemplo 20 - Inline lambdas
inline fun executarOperacao(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}
fun main() {

    // Exemplo 1 - Definindo uma função lambda simples
    println("================= Exemplo 1 =================")
    val saudacao = { nome: String -> "Olá $nome"}

    saudacao("Daniel").also { println(it) }  // Saída: Olá Mundo
    println(saudacao("Eduardo")) // ou assim


    // Exemplo 2 - Lambda com variáveis
    println("================= Exemplo 2 =================")
    val soma = { a: Int, b: Int -> a + b }

    val resultadoSoma = soma(5, 10)
    println("Soma: $resultadoSoma")  // Saída: Soma: 15


    // Exemplo 3 - Tipos de Função
    println("================= Exemplo 3 =================")
    val multiplicar: (Int, Int) -> Int = { x, y -> x * y }

    println(multiplicar(4, 5))  // Saída: 20


    // Exemplo 4 - Lambda com um único parâmetro
    // Se a lambda tem só 1 parâmetro, então NÃO precisa nomeá-lo — Kotlin usa automaticamente it.
    println("================= Exemplo 4 =================")
    val dobrar: (Int) -> Int = { it * 2}

    println(dobrar(7))  // Saída: 14


    // Exemplo 5 - Usando em uma lista - Lambda com map
    println("================= Exemplo 5 =================")
    val lista = listOf(1, 2, 3, 4, 5)
    val resultado = lista.map { it * 2}
    println(resultado)  // Saída: [2, 4, 6, 8, 10]


    // Exemplo 6 - Filtrando uma lista com lambda - Lambda com filter
    println("================= Exemplo 6 =================")
    val lista2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosPares = lista2.filter { it % 2 == 0 }
    println(numerosPares)  // Saída: [2, 4]

    val carros = listOf("Ferrari", "BMW", "Audi", "Ford", "Fiat")
    val filtrados = carros.filter { it.startsWith("F") }
    println(filtrados)  // Saída: [Ferrari, Ford, Fiat]


    // Exemplo 7 - Lambda com forEach
    println("================= Exemplo 7 =================")
    val nomes = listOf("Ana", "Bia", "Carlos", "Daniel")
    nomes.forEach{ println(it) }


    // Exemplo 8 - Ordenando uma lista com lambda - Lambda com sortedBy
    println("================= Exemplo 8 =================")
    val listaNomes = listOf("Ana", "Bia", "Carlos", "Daniel")
    val nomesOrdenados = listaNomes.sortedBy { it.length }
    println(nomesOrdenados)  // Saída: [Ana, Bia, Daniel, Carlos]


    // Exemplo 9 - Lambdas como parâmetros de funções (funções de alta ordem) - Uma função que recebe outra função
    println("================= Exemplo 9 =================")
    fun operar(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }

    val resultadoOperacao = operar(10, 5, { x, y -> x - y })
    println("Resultado da operação: $resultadoOperacao")  // Saída: Resultado da operação: 5


    // Exemplo 9.1 - Lambdas como parâmetros de funções (funções de alta ordem) - Uma função que recebe outra função
    println("================= Exemplo 9.1 =================")
    fun aplicarOperacao(a: Int, b: Int, op: (Int, Int) -> Int): Int {
        return op(a, b)
    }

    val adicao = aplicarOperacao(5, 3) { x, y -> x + y }
    val subtracao = aplicarOperacao(10, 4) { x, y -> x - y }
    val multiplicacao = aplicarOperacao(6, 7) { x, y -> x * y }

    println("Adição: $adicao")          // Saída: Adição: 8
    println("Subtração: $subtracao")    // Saída: Subtração: 6
    println("Multiplicação: $multiplicacao") // Saída: Multiplicação: 42


    // Exemplon 10 - Lambda com captura de variável
    println("================= Exemplo 10 =================")
    var fator = 2
    val multiplicarPorFator = { numero: Int -> numero * fator }
    println(multiplicarPorFator(5))  // Saída: 10


    // Exemplo 11 - Lambda com retorno explícito
    println("================= Exemplo 11 =================")
    val maiorQueDez = { numero: Int ->
        if (numero > 10) {
            true
        } else {
            false
        }
    }
    println(maiorQueDez(15))  // Saída: true
    println(maiorQueDez(8))   // Saída: false


    // Exemplo 12 - Lambdas sem parâmetros
    println("================= Exemplo 12 =================")
    val ola = { println("Olá") }
    ola()  // Saída: Olá


    // Exemplo 13 - Lambda com múltiplas linhas
    println("================= Exemplo 13 =================")
    val calcularFatorial = { numero: Int ->
        var resultado = 1
        for (i in 1..numero) {
            resultado *= i
        }
        resultado
    }
    println(calcularFatorial(5))  // Saída: 120


    // 13.1 - Lambda com múltiplas linhas - Se a lambda for grande
    println("================= Exemplo 13.1 =================")
    val calcular = { x: Int ->
        val quadrado = x * 2
        val cubo = x * 3
        quadrado + cubo
    }

    println(calcular(2))


    // Exemplo 14 - Lambda com tipos genéricos
    println("================= Exemplo 14 =================")
    val imprimirElemento: (Any) -> Unit = { elemento -> println("Elemento: $elemento") }
    imprimirElemento("Teste")  // Saída: Elemento: Teste
    imprimirElemento(123)     // Saída: Elemento: 123
    imprimirElemento(45.67)   // Saída: Elemento: 45.67


    // Exemplo 15 - Lambda com coleção de objetos - Filtrando uma lista de objetos com lambda
    println("================= Exemplo 15 =================")
    data class Produto(val nome: String, val preco: Double)
    val produtos = listOf(
        Produto("Notebook", 2500.0),
        Produto("Smartphone", 1500.0),
        Produto("Tablet", 800.0),
        Produto("Monitor", 1200.0)
    )
    val produtosCaros = produtos.filter { it.preco > 1000.0 }
    produtosCaros.forEach { println("Produto caro: ${it.nome}, Preço: ${it.preco}") }


    // Exemplo 16 - return em lambdas
    // Em lambdas, return não é permitido diretamente (pois a lambda não é uma função nomeada).
    // Mas você pode usar: return@label
    println("================= Exemplo 16 =================")
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    numeros.forEach {
        if (it == 5) {
            return@forEach  // Continua para o próximo elemento
        }
        println(it)
    }
    println("Fim da iteração")

    // Exemplo 16.1
    println("================= Exemplo 16.1 =================")
    val valores = listOf(1, 2, 3, 4)

    val resulta = valores.map {
        if (it == 3) return@map 0
        it * 2
    }
    println(resulta)


    // Exemplo 17 - Lambda com receiver
    println("================= Exemplo 17 =================")
    val construirString: StringBuilder.() -> Unit = {
        append("Kotlin ")
        append("é ")
        append("incrível!")
    }
    val meuStringBuilder = StringBuilder()
    meuStringBuilder.construirString()
    println(meuStringBuilder.toString())  // Saída: Kotlin é incrível!


    // Exemplo 18 - Lambdas com receptores (DSLs Kotlin)
    println("================= Exemplo 18 =================")
    fun construirHtml(construtor: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("<html>\n")
        stringBuilder.construtor()
        stringBuilder.append("\n</html>")
        return stringBuilder.toString()
    }
    val html = construirHtml {
        append("  <body>\n")
        append("    <h1>Olá, Mundo!</h1>\n")
        append("  </body>")
    }
    println(html)


    // Exemplo 18.1
    println("================= Exemplo 18.1 =================")
    val text = buildString {
        append("Olá ")
        append("Kotlin!")
    }
    println(text)  // Saída: Olá Kotlin!


    // Exemplo 19 - Função Lambda com captura de variável externa
    println("================= Exemplo 19 =================")
    var contador = 0
    val incrementarContador = {
        contador++
    }
    incrementarContador()
    incrementarContador()
    println("Contador: $contador")  // Saída: Contador: 2


    // Exemplo 20 - Inline lambdas
    println("================= Exemplo 20 =================")

    val somarInline = executarOperacao(10, 2) { x, y -> x + y }
    val dividirInline = executarOperacao(8, 4) { x, y -> x / y }

    println("Resultado da operação inline: $somarInline")    // Saída: Resultado da operação inline: 12
    println("Resultado da operação inline: $dividirInline")  // Saída: Resultado da operação inline: 2


    // Exemplo 21 - Lambda com múltiplos parâmetros e tipos diferentes
    println("================= Exemplo 21 =================")
    val combinar: (String, Int, Double) -> String = { nome, idade, altura ->
        "Nome: $nome, Idade: $idade, Altura: $altura"
    }
    println(combinar("Ana", 25, 1.68))  // Saída: Nome: Ana, Idade: 25, Altura: 1.68


    // Exemplo 22 - Lambda com retorno de outro lambda
    println("================= Exemplo 22 =================")
    val criarMultiplicador: (Int) -> (Int) -> Int = { fator ->
        { numero -> numero * fator }
    }
    val multiplicarPor3 = criarMultiplicador(3)
    println(multiplicarPor3(10))  // Saída: 30


    // Exemplo 23 - Lambda com tratamento de exceção
    // ArithmeticException é lançada quando há uma tentativa de divisão por zero.
    println("================= Exemplo 23 =================")
    val dividirComTratamento: (Int, Int) -> String = { a, b ->
        try {
            val resultado = a / b
            "Resultado: $resultado"
        } catch (e: ArithmeticException) {
            "Erro: Divisão por zero"
        }
    }
    println(dividirComTratamento(10, 2))  // Saída: Resultado: 5
    println(dividirComTratamento(10, 0))  // Saída: Erro: Divisão por zero


    // Exemplo 23.1 - Lambda com tratamento de exceção
    // toDouble é usado para evitar ArithmeticException em divisões inteiras.
    // ArithmeticException é lançada quando há uma tentativa de divisão por zero.
    println("================= Exemplo 23.1 =================")
    val safeDivide: (Float, Float) -> Double? = { x, y ->
        try {
            x.toDouble() / y
        } catch (e: ArithmeticException) {
            null
        }
    }
    println(safeDivide(11.5F, 2F))  // Saída: 5.75
    println(safeDivide(10F, 0F))  // Saída: Infinity


}

/*
* Função Lambda é uma função anônima, ou seja, sem nome.
* São usadas em listas, Maps, callbacks, filtros, ordenação, funções de alta ordem e muito mais.
*
* Formato básico:
* { parâmetros -> corpo da função }
* */