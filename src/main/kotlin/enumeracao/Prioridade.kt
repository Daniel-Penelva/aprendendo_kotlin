package enumeracao

// Exemplo - Enum com Propriedades e Construtor
enum class Prioridade(val codigo: Int, val cor: String) {
    BAIXA(1, "VERDE"),
    MEDIA(2, "AMARELO"),
    ALTA(3, "VERMELHO"),
    CRITICA(4, "PRETO");

    fun estaUrgente(): Boolean = codigo >= 3
}

fun main() {
    val tarefa = Prioridade.ALTA
    println("Código: ${tarefa.codigo}, Cor: ${tarefa.cor}")
    println("Urgente? ${tarefa.estaUrgente()}")  // true
}