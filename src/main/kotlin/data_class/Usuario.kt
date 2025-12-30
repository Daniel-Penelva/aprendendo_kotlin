package data_class

data class Usuario(val nome: String, val email: String,  val idade: Int, private val senha: String = "") {

    // Exemplo 5 - com lógica init
    init {
        require(idade >= 18) {
            "Usuário deve ser maior de idade"
        }
    }


    // Exemplo 6 - Controlando visibilidade + encapsulamento - propriedade senha (private)
    // senha não é visível fora da classe data class.
    fun mostrarSenha(senha: String = this.senha) {
        println("Senha de $nome é: $senha")
    }
}

fun main() {
    val user1 = Usuario("Daniel", "daniel@gmail.com", 30)
    val user2 = Usuario("Ana", "ana@gmail.com", 30)

    // Exemplo 1 - tostring() AUTOMÁTICO
    println("=========== Exemplo 1 - toString() AUTOMÁTICO ===========")

    println(user1)
    println(user2)


    // Exemplo 2 - equals() AUTOMÁTICO
    println("=========== Exemplo 2 - equals() AUTOMÁTICO ===========")

    println(user1 == user2) // false (valores diferentes!)

    /*
    * OBS.
    * Na classe comum se compara referência -> class Usuario(val nome: String, val idade: Int)
    * Na data class se compara valores -> data class Usuario(val nome: String, val idade: Int)
    *
    * Portanto, data class compara conteúdo, não referência.
    * */

    /*
    Essenciais para:
        - Set
        - Map
        - Comparações
    * */

    // Set
    println("=========== Exemplo 2 - set ===========")
    val set = setOf(
        Usuario("Fabiana", "fabiana@gmail.com", 20),
        Usuario("Babi", "babi@gmail.com", 20),
        Usuario("Babi", "babi@gmail.com", 20)
    )

    println(set.size) // 2 - aqui compara valores, não referências, ou seja, não adiciona repetidos

    // Map
    println("=========== Exemplo 2 - map ===========")
    val mapa = mapOf(user1 to "Administrador", user2 to "Usuário Comum")
    println("Nome: ${user1.nome} | ${mapa[user1]}") // Administrador
    println("Nome: ${user2.nome} | ${mapa[user2]}") // Usuário Comum


    // Exemplo 3 - copy() AUTOMÁTICO
    println("=========== Exemplo 3 - copy() AUTOMÁTICO ===========")

    val user3 = user2.copy(idade = 26)
    println(user3)  // Usuario(nome=Ana, email=ana@gmail.com, idade=26)

    val user4 = user1.copy(nome = "João", email = "joao@gmail.com", idade = 21)
    println(user4)


    // Exemplo 4 - Destructuring (Desestruturação) AUTOMÁTICO
    println("=========== Exemplo 4 - Destructuring AUTOMÁTICO ===========")

    val (nome, idade) = user4
    println("$nome tem $idade anos")  // João tem 21 anos


    // Exemplo 5 - Com lógica init
    println("=========== Exemplo 5 - Com lógica init ===========")
    // val user5 = Usuario("Caio", "caio@gmail.com", 10) // vai lançar erro IllegalArgumentException
    // println(user5)


    // Exemplo 6 - Controlando visibilidade + encapsulamento
    println("=========== Exemplo 6 - Controlando visibilidade + encapsulamento ===========")
    val user6 = Usuario("Caio", "caio@gmail.com", 39)
    user6.mostrarSenha("1234caio")

}
