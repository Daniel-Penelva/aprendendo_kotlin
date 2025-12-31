package sealed_interface

sealed interface Validavel {
    fun validarEmail(): Boolean

    fun validarIdade(): String
}

sealed interface Serializavel {
    fun serializar(): String
}
data class Usuario(val nome: String, val email: String, val idade: Int): Validavel, Serializavel {
    override fun validarEmail(): Boolean {
        return nome.isNotEmpty() && email.contains("@")
    }

    override fun serializar(): String {
        return "Usuario(nome='$nome', email='$email', idade = $idade)"
    }

    // Pode fazer assim também:
    override fun validarIdade() = if (idade >= 18) "Maior de idade" else "Menor de idade"

    // ou assim
    /*
         override fun validarIdade(): String {
            return if (idade >= 18) {
                "Maior de idade"
            } else {
                "Menor de idade"
            }
    * */

}

fun main() {
    val usuario1 = Usuario("Daniel", "daniel@gmail.com", 34)
    println(usuario1.validarEmail())
    println(usuario1.validarIdade())
    println(usuario1.serializar())
}

/*
Exemplo:
Múltiplas Heranças
Aqui foi definido duas interfaces seladas, `Validavel` e `Serializavel`, e a classe `Usuario` implementa ambas.
* */
