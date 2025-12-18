package classes

class Usuario private constructor(val nome: String, val email: String, val admin: Boolean) {

    // Exemplo 3 - método init - Verifica se o nome não está em branco e verifica se contêm o @ para email
    init {
        require(nome.isNotBlank()){
            "O nome do usuário não pode está em branco!"
        }

        require(email.contains("@")){
            "Email incorreto!"
        }
    }
    companion object {

        private val usuariosRegistrados = mutableListOf<Usuario>()

        // Exemplo 1 - Método factory simples
        fun criar(nome: String, email: String, admin: Boolean): Usuario {
            return Usuario(nome.trim(), email.lowercase(), admin)
        }

        // Exemplo 2 - métodos adicionais para criar tipos específicos de usuários
        fun criarVisitante(nome: String, email: String): Usuario {
            return Usuario(nome = nome, email = email, admin = false)
        }

        fun criarAdmin(nome: String, email: String): Usuario {
            return Usuario(nome = nome, email = email, admin = true)
        }

        // Exemplo 4 - Manipulando Lista para de usuários
        // Criando usuários
        fun criarUsuarios (nome: String, email: String, admin: Boolean): Usuario {
            val criarUsuario = Usuario(nome.trim(), email.lowercase(), admin)
            usuariosRegistrados.add(criarUsuario)
            return criarUsuario
        }

        // Listando usuário
        fun todosUsuarios(): Array<Usuario> {
            return usuariosRegistrados.toTypedArray()
        }


        // Exemplo 5 - Filtrando lista de Admin e Visitante
        fun todosAdmin():Array<Usuario> {
            return usuariosRegistrados.filter { it.admin }.toTypedArray();
        }

        fun todosVisitantes(): Array<Usuario> {
            return usuariosRegistrados.filter { !it.admin }.toTypedArray();
        }

    }
}

fun main() {

    // A utilização do construtor privado (private constructor) impede a criação direta de instâncias da classe Usuario.
    // Isso não pode:
    // Usuario("Ana", "ana@gmail.com", true) // Vai gerar erro porque o private impede o acesso ao construtor.

    // Maneira correta de fazer
    // Exemplo 1 - criando usuário:
    println("=================== Exemplo 1 ===================")
    val criarUsuario = Usuario.criar("Ana Christina da Silva", "ana@gmail.com", true)
    println("Usuário criado com Sucesso!")
    println("Nome: ${criarUsuario.nome}, Email: ${criarUsuario.email}, Admin: ${criarUsuario.admin}")


    // Exemplo 1 - criando outro usuário
    val criarUsuario2 = Usuario.criar("João Paulo Nunes", "joao@gmail.com", false)
    println("Usuário criado com Sucesso!")
    println("Nome: ${criarUsuario2.nome}, Email: ${criarUsuario2.email}, Admin: ${criarUsuario2.admin}")


    // Exemplo 2
    println("=================== Exemplo 2 ===================")
    // Criando Visitante
    val criarVisitante = Usuario.criarVisitante("Guilherme Mota Andrade", "guilherme@gmail.com")
    println("Nome: ${criarVisitante.nome}, Email: ${criarVisitante.email}, Admin: ${criarVisitante.admin}")

    // Criando Admin
    val criarAdmin = Usuario.criarAdmin("Jair Messias Bolsonaro", "bolsonaro@gmail.com")
    println("Nome: ${criarAdmin.nome}, Email: ${criarAdmin.email}, Admin: ${criarAdmin.admin}")


    // Exemplo 3 - método init para verificar se o email está correto
    // val testandoInit = Usuario.criarAdmin("Jair Messias Bolsonaro", "bolsonarogmail.com")


    // Exemplo 4 - Manipulação de lista de usuarios - criando usuario add na lista
    println("=================== Exemplo 4 ===================")
    val usuario1 = Usuario.criarUsuarios("Daniel Penelva", "daniel@gmail.com", true)
    val usuario2 = Usuario.criarUsuarios("Ana Christina da Silva", "ana@gmail.com", true)
    val usuario3 = Usuario.criarUsuarios("João Paulo Nunes", "joao@gmail.com", false)
    val usuario4 = Usuario.criarUsuarios("Guilherme Mota Andrade", "guilherme@gmail.com", false)
    val usuario5 = Usuario.criarUsuarios("Jair Messias Bolsonaro", "bolsonaro@gmail.com", false)

    val todos = Usuario.todosUsuarios()
    todos.forEachIndexed {index, usuario ->
        println("${index + 1}. ${usuario.nome} - ${usuario.email} - Admin: ${if(usuario.admin) "ADMIN" else "Visitante"}")
    }


    // Exemplo 5 - Captura todos os Admins e Visitantes criados
    println("=================== Exemplo 5 ===================")

    // Lista de Admin
    println("=================== Todos Admins ===================")
    val admins = Usuario.todosAdmin()
    println("Total de Admins: ${admins.size}")
    admins.forEach { println("Admin ${it.nome}") }

    // Lista de Visitantes
    println("=================== Todos Visitantes ===================")
    val visitantes = Usuario.todosVisitantes()
    println("Total de Visitantes: ${visitantes.size}")
    visitantes.forEach { println("Visitantes ${it.nome}") }

}

/*
O que é Factory Method?

Factory Method é um padrão de criação.

    - Em vez de usar diretamente o construtor (Usuario(...)),
    - É usado métodos nomeados que criam o objeto.

Isso traz:
    - Mais legibilidade
    - Mais controle
    - Menos erro
    - Melhor encapsulamento

O que é companion object?
O companion object é o equivalente Kotlin de métodos estáticos do Java.

    - É um objeto declarado dentro de uma classe com a palavra-chave companion.
    - Permite definir membros que pertencem à classe, e não às instâncias.
    - Pode conter propriedades e métodos.
    - Exemplo:
    class Usuario {
        companion object {
            fun criarAdmin(): Usuario {
                return Usuario(/* parâmetros para admin */)
            }
        }
    }
*/