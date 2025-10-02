package basic

fun main() {

    // Exemplo 1: Comparando Strings
    // ATENÇÃO! Em Kotlin, a comparação de Strings com == verifica o conteúdo, e não a referência (igual no Java com .equals).

    val nome1 = "Daniel"
    val nome2 = "Daniel"
    val nome3 = "Andrade"

    println(nome1 == nome2)  // true (conteúdo igual)
    println(nome1 == nome3)  // false (conteúdo diferente)
    println(nome1 != nome3)  // true (são diferentes)

    // ou

    var n1 = 10
    var n2 = 10
    var resultado = (n1 == n2)
    println(resultado)

    // Vale apena saber que true = 1 e false = 0
    var r1 = true   // 1
    var r2 = false  // 0
    var r3 = (r1 > r2) // 1 > 0 → true  ou se assumir que (r1 < r2) vai retornar false
    println(r3)


    // Exemplo 2: Aqui entram && (E), || (OU), ! (NÃO).

    // && (E)
    val usuario = "admin"
    val senha = "1234"

    if (usuario == "admin" && senha == "1234") {
        println("Login bem-sucedido")
    } else {
        println("Usuário ou senha incorreto")
    }

    // || (ou)
    val linguagem = "kotlin"

    if (linguagem == "kotlin" || linguagem == "java") {
        println("Linguagem aceita")
    } else {
        println("Linguagem não aceita")
    }

    // ! (Não)

    val cor = "azul"

    if (!(cor == "vermelho")) {
        println("A cor não é vermelho")
    }


    // Exemplo 3: Verificando se String está vazia

    val texto = ""

    if (texto.isEmpty() || texto.isBlank()) {
        println("Texto vazio ou só com espaços")
    }


    // Exemplo 4: Combinando várias condições

    val nome = "Maria"
    val sobrenome = "Silva"

    if (nome.startsWith("M") && sobrenome.endsWith("a")) {
        println("Condição atendida")
    } else {
        println("Condição não atendida")
    }

    // ATENÇÃO! A função .startsWith é case-sensitive, ou seja, diferencia maiúsculas de minúsculas. Busca o prefixo exato no início da String.
    // A função .endsWith também é case-sensitive. Busca o sufixo exato no final da String.

    // Exemplo 5: Aqui entram <, >, <=, >=

    val idade = 20
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    val nota = 85
    if (nota > 90) {
        println("Excelente")
    } else if (nota >= 75) {
        println("Bom")
    } else {
        println("Precisa melhorar")
    }


    // Exemplo 6 - Operador xor (OU Exclusivo)
    val a = true
    val b = false
    val c = a xor b  // true, pois apenas um dos valores é true
    println("a xor b = $c")
    val d = true
    val e = a xor d  // false, pois ambos são true
    println("a xor d = $e")

}

/*
 Operadores Lógicos

 && (E)
 v - v -> v
 v - f -> f
 f - v -> f
 f - v -> f

 || (OU)
 v - v -> v
 v - f -> v
 f - v -> v
 f - f -> f

 ! (NÃO)
 v -> f
 f -> v

 xor (OU Exclusivo)
 v - v -> f
 v - f -> v
 f - v -> v
 f - f -> f

*/