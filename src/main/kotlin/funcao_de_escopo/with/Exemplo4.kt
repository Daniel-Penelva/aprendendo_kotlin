package funcao_de_escopo.with

data class Usuario(var nome: String = "", var email: String = "", var idade: Int = 0)

fun main() {

    val usuario = Usuario("Daniel", "daniel@email.com", 25)

    val resumo = with(usuario) {
        "Nome: $nome, Email: $email, Idade: $idade"
    }

    println(resumo)
}