package enumeracao

enum class Status {
    ATIVO,
    INATIVO,
    BLOQUEADO;

    fun tratarStatus(status: Status): String {
        return when (status) {
            ATIVO -> "O usuário está ativo e pode acessar o sistema."
            INATIVO -> "O usuário está inativo e não pode acessar o sistema."
            BLOQUEADO -> "O usuário está bloqueado. Contate o suporte."
        }
    }
}

fun main() {

    // Exemplo 1 - Básico
    println("======== Exemplo 1 - Básico ========")

    val status = Status.ATIVO

    if (status == Status.ATIVO) {
        println("O status está ATIVO")
    } else if (status == Status.INATIVO) {
        println("O status está INATIVO")
    } else {
        println("O status está BLOQUEADO")
    }

    // Exemplo 2 - com when
    println("======== Exemplo 2 - com when ========")

    val statusUsuario = Status.BLOQUEADO

    when (statusUsuario) {
        Status.ATIVO -> println("Usuário ativo")
        Status.INATIVO -> println("Usuário inativo")
        Status.BLOQUEADO -> println("Usuário bloqueado")
    }

    // OU PODE FAZER ASSIM
    println("======== Exemplo 2 - com when (outra forma de fazer) ========")
    val mensagem = when (statusUsuario) {
        Status.INATIVO, Status.BLOQUEADO -> "Usuário não pode acessar o sistema"
        Status.ATIVO -> "Usuário pode acessar o sistema"
    }

    println(mensagem)

    // Exemplo 3 - Função utilizando when dentro do Enum
    println("======== Exemplo 3 - Função utilizando when dentro do Enum ========")

    val statusConta = Status.INATIVO
    val resultado = statusConta.tratarStatus(statusConta)
    println(resultado)


    // Exemplo 4 - Iterando sobre enums
    println("======== Exemplo 4 - Iterando sobre enums ========")
    for (status in Status.values()) {
        println("Status: ${status.name}, Posição: ${status.ordinal}")
    }

    // Ou pode fazer assim - mais moderno:
    println("======== Exemplo 4 - forma mais moderna de fazer ========")

    Status.entries.forEach { status ->
        println("Status: ${status.name}, Posição: ${status.ordinal}")
    }

    /*
     Mais Simples:
         Status.entries.forEach {
            println(it.name)
        }
    */


    // Exemplo 5 - name e ordinal
    println("======== Exemplo 4 - Iterando sobre enums ========")

    val s = Status.ATIVO
    println("Conteudo - ${s.name}")
    println("Posição - ${s.ordinal}")

    // OBS. Cuidado com ordinal - Se mudar a ordem, quebra lógica e persistência.
}

/*
O que é uma enum class?

É uma classe que representa um conjunto fixo e conhecido de valores.

Ideal quando:
    - Os valores são poucos
    - Não há variação de estrutura
    - Cada valor representa um estado simples
* */