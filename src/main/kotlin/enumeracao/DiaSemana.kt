package enumeracao

// Exemplo 1 - Básico
enum class DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

fun main() {
    val hoje = DiaSemana.QUARTA

    println(hoje)           // QUARTA
    println(hoje.name)      // "QUARTA"
    println(hoje.ordinal)   // 3 (posição 0-based)

    // when exaustivo (sem else!)
    val mensagem = when (hoje) {
        DiaSemana.SABADO, DiaSemana.DOMINGO -> "Fim de semana!"
        DiaSemana.QUARTA -> "Meio da semana"
        else -> "Dia útil"
    }
    println(mensagem)
}