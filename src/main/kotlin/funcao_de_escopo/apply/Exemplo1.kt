package funcao_de_escopo.apply

fun main() {

    val mensagem = StringBuilder().apply {
        append("Olá, ")
        append("mundo!")
    }
    println(mensagem.toString())
}

// Usando 'apply' para configurar um objeto StringBuilder
// A função StringBuilder() tem a função de criar um novo objeto StringBuilder, que é uma classe em Kotlin usada para construir strings de forma eficiente.
// O método append() é chamado dentro do bloco apply para adicionar texto ao StringBuilder.
// O resultado final é uma string "Olá, mundo!" que é impressa no console.