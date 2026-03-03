package funcao_de_escopo.run

fun main() {
    val mensagem = "Olá, Mundo!"

    val resultado = mensagem.run {
        trim()            // remove espaços
            .uppercase()  // deixa maiúsculo
    }

    println(resultado) // Imprime: "OLÁ, MUNDO!"
}