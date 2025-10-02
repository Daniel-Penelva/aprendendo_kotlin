package basic

fun main() {

    // Exemplo 1 - mais simples possível
    val temperatura = 30

    if (temperatura > 25) {
        println("Está quente!")
    }
    if (temperatura <= 25) {
        println("Está frio!")
    }


    // Exemplo 2 - mais básica

    val idade = 18

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }


    // Exemplo 3 - if encadeado

    val nota = 7

    if (nota >= 9) {
        println("Excelente")
    } else if (nota >= 7) {
        println("Bom")
    } else if (nota >= 5) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }

    // Exemplo 4 - if como expressão
    // atenção: Em Kotlin, if pode retornar valor (diferente do Java).

    val age = 20
    val status = if (age >= 18) "Adulto" else "Menor de idade"
    println(status)


    // Exemplo 5 - if aninhado
    val numero = -10
    val tipoNumero = if (numero >= 0) {
        if (numero == 0) {
            "Zero"
        } else {
            "Positivo"
        }
    } else {
        "Negativo"
    }
    println(tipoNumero)


    // Exemplo 6 - if com múltiplas condições
    val hora = 14
    val saudacao = if (hora < 12) {
        "Bom dia"
    } else if (hora < 18) {
        "Boa tarde"
    } else {
        "Boa noite"
    }
    println(saudacao)


    // Exemplo 7 - if com operador lógico
    val diaSemana = 6
    val tipoDia = if (diaSemana == 6 || diaSemana == 7) {
        "Fim de semana"
    } else {
        "Dia de semana"
    }
    println(tipoDia)


    // Exemplo 8 - if com intervalo
    val mes = 4
    val estacao = if (mes in 3..5) {
        "Primavera"
    } else if (mes in 6..8) {
        "Verão"
    } else if (mes in 9..11) {
        "Outono"
    } else {
        "Inverno"
    }
    println(estacao)


    // Exemplo 9 - if com múltiplas variáveis
    val a = 10
    val b = 20
    val maior = if (a > b) a else b
    println("O maior valor é $maior")


    // Exemplo 10 - if com função
    fun verificarParidade(num: Int): String {
        return if (num % 2 == 0) "Par" else "Ímpar"
    }
    println(verificarParidade(10))
    println(verificarParidade(7))


    // Exemplo 11 - if com null safety
    val nome: String? = null
    val saudacaoNome = if (nome != null) "Olá, $nome!" else "Olá, visitante!"
    println(saudacaoNome)


    // Exemplo 12 - if com listas
    val frutas = listOf("Maçã", "Banana", "Laranja")
    val frutaProcurada = "Banana"
    val mensagemFruta = if (frutas.contains(frutaProcurada)) {
        "$frutaProcurada está disponível."
    } else {
        "$frutaProcurada não está disponível."
    }
    println(mensagemFruta)


    // Exemplo 13 - if com mapas
    val capitais = mapOf("Brasil" to "Brasília", "França" to "Paris", "Japão" to "Tóquio")
    val pais = "França"
    val capital = if (capitais.containsKey(pais)) {
        "A capital de $pais é ${capitais[pais]}."
    } else {
        "Capital não encontrada."
    }
    println(capital)


    // Exemplo 14 - if com arrays
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val numeroProcurado = 3
    val mensagemNumero = if (numeros.contains(numeroProcurado)) {
        "$numeroProcurado está na lista."
    } else {
        "$numeroProcurado não está na lista."
    }
    println(mensagemNumero)


    // Exemplo 15 - if com variações de tipos
    val valor: Any = 10.5
    val tipoValor = if (valor is Int) {
        "Inteiro"
    } else if (valor is Double) {
        "Decimal"
    } else if (valor is String) {
        "Texto"
    } else {
        "Tipo desconhecido"
    }
    println("O valor é do tipo: $tipoValor")


// Exemplo 16 - if com retorno de função lambda
    val calcularDesconto: (Double) -> Double = { preco ->
        if (preco > 100) {
            preco * 0.9 // 10% de desconto
        } else {
            preco
        }
    }
    println("Preço com desconto: ${calcularDesconto(150.0)}")
    println("Preço com desconto: ${calcularDesconto(80.0)}")


    // Exemplo 17 - if com múltiplas linhas em cada bloco
    val numeroTeste = 15
    val resultadoTeste = if (numeroTeste % 3 == 0) {
        println("$numeroTeste é divisível por 3")
        "Divisível por 3"
    } else {
        println("$numeroTeste não é divisível por 3")
        "Não divisível por 3"
    }
    println(resultadoTeste)


    // Exemplo 18 - if com múltiplas condições compostas
    val salario = 3000
    val faixaSalarial = if (salario < 2000) {
        "Baixa"
    } else if (salario in 2000..5000) {
        "Média"
    } else {
        "Alta"
    }
    println("Faixa salarial: $faixaSalarial")


    // Exemplo 19 - if com when (switch case)
    val dia = 3
    val diaSemanaNome = if (dia in 1..7) {
        when (dia) {
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            7 -> "Sábado"
            else -> "Dia inválido"
        }
    } else {
        "Dia inválido"
    }
    println(diaSemanaNome)

    // ou mais básico
    val day = 4

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }

    // Vários valores na mesma linha
    val vogal = 'a'
    when (vogal) {
        'a', 'e', 'i', 'o', 'u' -> println("$vogal é uma vogal")
        else -> println("É uma consoante")
    }

    // Adicionando condições lógicas
    val media: Double = 7.0

    when {
        media < 5.0 -> println("Aluno Reprovado")
        media >= 5.0 && media < 7.0 -> println("Aluno em Recuperação")
        media >= 7.0 -> println("Aluno Aprovado")
        else -> println("Média inválida")
    }


    // Exemplo 20 - if com expressão when dentro
    val letra = 'A'
    val tipoLetra = if (letra.isLetter()) {
        when {
            letra in 'A'..'Z' -> "Maiúscula"
            letra in 'a'..'z' -> "Minúscula"
            else -> "Outro tipo de letra"
        }
    } else {
        "Não é uma letra"
    }
    println(tipoLetra)


    // usando intervalos e coleções
    val num = 7

    when (numero) {
        in 1..5 -> println("$num está entre 1 e 5")
        in 6..10 -> println("$num está entre 6 e 10")
        !in 1..10 -> println("$num está fora do intervalo de 1 a 10")
        else -> println("$num é um número desconhecido")
    }

}

/*
* ATENÇÃO!
* if/else → decisões simples ou encadeadas.
* when → substitui switch e ainda aceita intervalos, coleções e condições mais complexas.
* Ambos podem ser usados como expressão, retornando valores.
* */
