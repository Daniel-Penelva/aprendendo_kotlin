package funcao_de_escopo.apply

data class Usuario(var nome: String = "", var email: String = "", var idade: Int = 0, )
fun main() {

    // Sem apply:
    val usu1 = Usuario()
    usu1.nome = "Daniel"
    usu1.email = "daniel@gmail.com"
    usu1.idade = 30


    // Com apply - muito mais limpo:
    val usu2 = Usuario().apply {
        nome = "Daniel"  // "this" é o Usuario, não precisa nem escrever
        email = "daniel@gmail.com"
        idade = 30
    }


    // Imprimindo resultado
    for (usuario in listOf(usu1, usu2)) {
        println("Usuário: ${usuario.nome}, Email: ${usuario.email}, Idade: ${usuario.idade}")
    }
}