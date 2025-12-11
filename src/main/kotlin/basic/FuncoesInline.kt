package basic

// Exemplo 1 - Função Inline - retorna void
inline fun olaMundo() {
    println("Olá Mundo!")
}

// Exemplo 2 - retorna Unit (void) com lambda como parâmetro
inline fun executar(op: () -> Unit) {
    println("Antes da operação")
    op()
    println("Depois da operação")
}

// Exemplo 3 - inline permite usar return dentro do lambda
inline fun teste(block: () -> Unit) {
    block()
}

// Exemplo 4 - Função Inline com retorno de valor e lambda como parâmetro
inline fun <T> calcular(op: () -> T): T {
    println("Iniciando cálculo...")
    val resultado = op()
    println("Cálculo finalizado.")
    return resultado
}

// noinline - Se uma função tem vários lambdas pode escolher quais NÃO serão inline
inline fun processar(a: () -> Unit, noinline b: () -> Unit) {
    a()
    b() // este não será inline
}

fun main() {

    // Chamando as funções inline
    olaMundo()

    executar { println("Operação em execução - Rodando...") }

    teste {
        println("Saindo da função main!")
        return // isso só funciona porque é inline
    }

    val soma = calcular { 5 + 10 }
    println("Resultado da soma: $soma")

    processar(
        a = { println("Função A - inline") },
        b = { println("Função B - noinline") }
    )

}

/*
Uma função marcada com inline faz com que o código seja copiado para o local onde ela é chamada, evitando a criação de objetos de função e
overhead de chamada.
É usada principalmente para:
    -> Reduzir custo de chamadas de função
    -> Melhorar performance de lambdas
    -> Evitar criação de classes anônimas para lambdas
* */