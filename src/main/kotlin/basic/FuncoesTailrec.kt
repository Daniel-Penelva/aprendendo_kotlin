package basic

fun main() {

    // Exemplo 1 - Função Tail Recursiva
    tailrec fun fatorial(n: Int, acumulador: Int = 1): Int {
        return if (n <= 1) acumulador else fatorial(n - 1, n * acumulador)
    }

    // Exemplo 2 - contagem recursiva
    tailrec fun contagemRegressiva(n: Int) {
        if (n <= 0) {
            println("Fogo!")
        } else {
            println(n)
            contagemRegressiva(n - 1)
        }
    }

    // Exemplo 2.1
    tailrec fun contarAte(max: Int, atual: Int = 0) {
        if(atual > max) return
        println(atual)
        contarAte(max, atual + 1)
    }

    // É o mesmo que isso
    fun contarAteNormal(max: Int, atual: Int = 0) {
        if(atual > max){
            println("Fim!")
            return
        } else {
            println(atual)
            contarAteNormal(max, atual + 1)
        }

    }


    /* ======================== || ======================== */
    // Chamando as funções tailrec

    val numero = 5
    val resultado = fatorial(numero)
    println("Fatorial de $numero é $resultado")

    contagemRegressiva(5)

    contarAte(5)

    contarAteNormal(4)
}

/*
Função tailrec é para otimizar funções recursivas.

Ela transforma recursão em loop interno, evitando stack overflow.

Requisito importante:
A chamada recursiva deve ser a última instrução da função.
*/