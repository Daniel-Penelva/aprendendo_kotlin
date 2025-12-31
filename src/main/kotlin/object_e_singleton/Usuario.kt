package object_e_singleton

class Usuario(val nome: String) {

    // companion object é o substituto do static, ou seja, membros declarados aqui pertencem à classe e não a instância da classe.
    companion object {
        fun criarUsuario(nome: String) : Usuario {
            return Usuario(nome)
        }
    }
}

fun main() {
    val usuario = Usuario.criarUsuario("Daniel")
    println("Nome do usuário: ${usuario.nome}")

    // Repare que não é necessário criar uma instância de Usuario para chamar o método criarUsuario, pois ele pertence à classe.
}

/*
O companion object (Singleton da Classe) é o substituto do static em Kotlin. Mwmbros declarados dentro de um companion object pertencem à classe
em si, e não a instâncias da classe.

Aqui o companion obejct é usado para definir um método de fábrica (factory method) chamado criarUsuario, que cria e retorna uma instância da
classe Usuario. Isso é útil quando você quer encapsular a lógica de criação de objetos ou quando a criação de objetos envolve mais do que apenas
chamar o construtor padrão.

Uso:
     - Pertence à classe
     - Uma única instância por classe
     - Pode implementar interface
     - Acessível via nome da classe

* */