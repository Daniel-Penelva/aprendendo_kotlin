package basic

fun main() {

    // Exemplo 1 - Função Simples - retorna void
    fun olaMundo() {
        println("Olá Mundo!")
    }


    // Exemplo 2 - Função com Parâmetro e Retorno
    fun saudacao(nome: String): String {
        return "Olá, $nome!"
    }


    // Exemplo 3 - Função com parâmetros
    fun somar(a: Int, b: Int) {
        val resultado = a + b
        println("Soma: $a + $b = $resultado")
    }


    // Exemplo 4 - Função com parâmetros com retorno
    fun multiplicar(a: Int, b: Int): Int {
        return a * b;
    }


    // Exemplo 5 - Retorno Implícito (Funções curtas) - deduz automaticamente o tipo de retorno.
    fun dobro(numero: Int) = numero * 2;


    // Exemplo 6 - Parâmetros com valor padrão (omitir na chamada da função) sem retorno
    fun mensagem(texto: String = "Olá") {
        println(texto)
    }


    // Exemplo 7 - Parâmetros com valor padrão (omitir na chamada da função) com retorno
    fun potencia(base: Int, expoente: Int = 2): Int {
        return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
    }


    // Exemplo 8 - Parâmetros noemados (named arguments) - permite especificar os nomes dos parâmetros na chamada da função
    fun apresentar(nome: String, idade: Int) {
        println("Nome: $nome, Idade: $idade")
    }


    // Exemplo 9 - Funções com vários retornos usando Pair e Triple
    fun dividir(a: Int, b: Int): Pair<Int, Int> {
        return Pair(a / b, a % b) // Retorna quociente e resto
    }


    // Exemplo 10 - Função Unit (sem retorno explícito)
    // unit é equivalente ao void, não retorna valor
    fun mostrar(): Unit {
        println("Teste utilizando Unit")
    }


    // Exemplo 11 - Função dentro de função (funções locais)
    fun processar() {
         fun validar () {
             println("Validando...")
         }

        validar()
        println("Processando...")
    }


    // Exemplo 12 - Função que retorna outra função - É possível mesmo sem lambda explícita
    // Os :: significa referência de função

    fun multiplicando(x: Int) = x * 2

    fun operacao(): (Int) -> Int {
        return ::multiplicando
    }


    // Exemplo 12.1 - Usando expressões lambda
    fun operacaoMatematica(tipo: String): (Int, Int) -> Int {
        return when (tipo) {
            "soma" -> fun(a: Int, b: Int): Int { return a + b }
            "subtracao" -> fun(a: Int, b: Int): Int { return a - b }
            else -> fun(a: Int, b: Int): Int { return 0 }
        }
    }


    // Exemplo 13 - Função de extensão - Adiciona novas funcionalidades a classes existentes sem herança
    fun String.apagarEspacos(): String {
        return this.replace(" ", "")
    }


    // Exemplo 14 - Usando a função de extensão em uma classe personalizada
    class Pessoa(val nome: String) {
        fun saudacao(): String {
            return "Olá, meu nome é $nome"
        }
    }


    // Exemplo 15 - Função Recursivas - uma função que chama a si mesma
    fun fatorial(n: Int): Int {
        if (n == 0) return 1
        return n * fatorial(n - 1)
    }


    /* ============================== // ============================== */
    // Chamando as funções
    olaMundo()

    println(saudacao("Daniel"))

    somar(10, 20)

    val resulta = multiplicar(2, 4)
    println("Resultado da Multiplicação $resulta")

    dobro(10)

    mensagem() // usa o valor padrão
    mensagem("Bom dia!") // usa o valor fornecido

    val potenciaQuadrado = potencia(3) // usa o valor padrão do expoente

    apresentar(nome="Daniel", idade = 30)
    apresentar(idade=34, nome = "Daniel") // ordem não importa

    val (resultado, resto) =  dividir(10, 3)
    println("Divisão: $resultado") // 3
    println("Resto: $resto") // 1

    mostrar()

    processar()

    val funcaoRetornada = operacao()
    println(funcaoRetornada(5)) // 10

    val (somando, subtraindo) = Pair(operacaoMatematica("soma"), operacaoMatematica("subtracao"))
    println("Operação Soma: ${somando(10, 5)}") // 15
    println("Operação Subtração: ${subtraindo(10, 5)}") // 5

    println("Olá Kotlin".apagarEspacos()) // OláKotlin

    val pessoa = Pessoa("Daniel")
    println(pessoa.saudacao()) // Olá, meu nome é Daniel

    println(fatorial(5)) // 120

}