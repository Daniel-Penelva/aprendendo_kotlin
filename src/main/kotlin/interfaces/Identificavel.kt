package interfaces

interface Identificavel {
    val id: Int
}

class Usuario(override val id: Int, val nome: String) : Identificavel

fun main() {
    val usuario: Identificavel = Usuario(1, "Alice")
    println("ID do usuário: ${usuario.id}")
    println("Nome do usuário: ${(usuario as Usuario).nome}")
}

/* Exemplo:
Interfaces com propriedades
Interfaces não armazenam estado, mas podem definir propriedades.

Como funciona:
    - A classe fornece o valor
    - Interface só define o contrato
* */