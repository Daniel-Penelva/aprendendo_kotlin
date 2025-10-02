package basic

fun main() {

    // Exemplo 1: Operadores básicos
    val a = 10
    val b = 2

    println("Soma ${a + b}")
    println("Subtração ${a - b}")
    println("Multiplicação ${a * b}")
    println("Divisão ${a / b}")

    val resto = a % b
    println("Resto ${resto}")


    // Exemplo 2: Resultados com casas decimais
    val x = 10.0
    val y = 3.0

    println("Divisão com double: ${x / y}")

    // Exemplo 3: Operadores de incremento e decremento

    // ++ incremento 1 (ou soma 1)
    // -- decrementa 1 (ou subtrai 1)

    var numero = 5
    println(numero++) // imprime 5, depois vira 6 (pós-incremento)
    println(++numero) // incrementa antes, então imprime 7

    println(numero--) // imprime 7, depois vira 6
    println(--numero) // decrementa antes, então imprime 5


    // Exemplo 4: Operadores de atribuição abreviados

    // += soma e atribui
    // -= subtrai e atribui
    // *= multiplica e atribui
    // /= divide e atribui
    // %= resto da divisão e atribui

    var n = 10
    n += 5  // n = n + 5
    n -= 3  // n = n - 3 → 12
    n *= 2   // n = n * 2 → 24
    n /= 4   // n = n / 4 → 6
    n %= 4   // n = n % 4 → 2

    println("Resultado final: $n")


    // Exemplo 5: recedência (ordem dos operadores) - Regras:
    // 1. Parênteses ()
    // 2. Multiplicação (*), Divisão (/), Resto (%)
    // 3. Soma (+), Subtração (-)

    val resultado = 2 + 3 * 4
    val resultado2 = (2 + 3) * 4

    println(resultado)
    println(resultado2)

    // Exemplo 6: Concatenação de Strings com números
    val nome = "Daniel"
    val idade = 25

    val concatenar = nome + idade
    println(concatenar)
    // ATENÇÃO! Se a operação iniciar com idade e depois nome dará erro - exemplo: val concatenarErrado = idade + nome


    // Exemplo 7: Operadores Bitwise (bit a bit)
    // No Kotlin, os operadores de bits não usam símbolos (&, |, ^...), mas funções de extensão. Isso deixa o código mais claro.
    /** Principais:
     * and → E bit a bit
     * or → OU bit a bit
     * xor → OU exclusivo (XOR)
     * inv() → inverte os bits
     * shl(n) → desloca bits para a esquerda (shift left)
     * shr(n) → desloca bits para a direita preservando o sinal (shift right signed)
     * ushr(n) → desloca bits para a direita sem preservar o sinal (shift right unsigned)
     * */

    val z = 0b1010  // 10 em binário
    val t = 0b1100  // 12 em binário

    println("z AND t = ${(z and t).toString(2)}") // 1000 (8)
    println("z OR t = ${(z or t).toString(2)}") // 1110 (14)
    println("z XOR t = ${(z xor t).toString(2)}") // 0110 (6)
    println("inv(z) = ${(z.inv()).toString(2)}") // complemento de a

    // Shift
    println("z shl 1 = ${(z shl 1).toString(2)}")  // 10100 (20)
    println("z shr 1 = ${(z shr 1).toString(2)}")  // 0101 (5)
    println("z ushr 1 = ${(z ushr 1).toString(2)}") // desloca ignorando sinal

    // ATENÇÃO! Esses operadores são muito usados em otimizações, criptografia, compressão e manipulação de flags.


    // Exemplo 8: Operadores in e !in
    // Usados para verificar se um elemento pertence a uma coleção ou intervalo.

    val lista = listOf("kotlin", "java", "C#")
    println("kotlin" in lista)  // true
    println("Python" !in lista) // true

    val num = 5
    if (num in 1..10) {
        println("Número dentro do intervalo")
    }


    // Operadores is e !is

    val texto: Any = "Olá Kotlin"

    if (texto is String) {
        println("É uma String com tamanho ${texto.length}")
    }

    if (texto !is Int) {
        println("Não é um número inteiro")
    }


    // Exemplo 10: Operador Elvis (?:)
    // Usado para tratar valores nulos de forma concisa.
    val valorNulo: String? = null
    val tamanho = valorNulo?.length ?: 0  // Se valorNulo for nulo, retorna 0
    println("Tamanho: $tamanho")


    // Exemplo 11: Operador de Atribuição Segura (?.)
    val nomeNulo: String? = null
    println("Nome em maiúsculas: ${nomeNulo?.uppercase() ?: "Nome é nulo"}")


    // Exemplo 12: Operador rem() e mod() - Este operador calcula o resto da divisão entre dois números.
    // mod() - este operador sempre retorna um resultado não negativo, mesmo que o dividendo seja negativo.
    // rem() - este operador retorna o resto da divisão, que pode ser negativo se o dividendo for negativo.

    println(10 % 2)
    println(10.rem(2))
    println(10.mod(2))


    val a1 = 10
    val b1 = 3
    println("Resto da divisão com rem(): ${a1.rem(b1)}") // 1
    println("Resto da divisão com %: ${a1 % b1}") // 1
    println("Resto da divisão com mod(): ${a1.mod(b1)}") // 1


}