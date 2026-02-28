package basic

fun main() {

    // Exemplo 1
    val firstname: String = "Daniel"  // nunca pode ser null
    val lastname: String? = null  // o "?" permite null

    // Para usar uma variável nullable, você precisa tratar:
    println(lastname?.length) // retorna null se apelido for null (safe call)
    println(lastname ?: "Sobrenome Desconecido") // retorna "Sobrenome Desconecido" se apelido for null (Elvis operator)

    // ou mais detalhadamente
    println("Nome Completo: ${firstname} ${lastname ?: "Sobrenome Desconecido"}") // Usa o operador Elvis (?:) para fornecer um valor padrão

    // Exemplo 2 - Operador Elvis com variáveis
    val nome: String? = null
    val nomeReal: String = nome ?: "Nome Desconecido"
    println("Nome Real: $nomeReal")

    // Exemplo 3 - Operador Elvis com funções
    fun obterIdade(idade: Int?): Int {
        return idade ?: 0 // Retorna 0 se idade for nulo
    }

    println("Idade: ${obterIdade(null)}")
    println("Idade: ${obterIdade(25)}")

    // ===================//====================

    fun cadastrar(nome: String, idade: Int?) {
        println("Nome: ${nome} - Idade: ${idade ?: "Idade não informada"}")
    }

    cadastrar("Daniel", null)

    // Exemplo 4 - Operador Elvis com expressões
    val idade: Int? = null
    val categoria = if (idade != null) {
        if (idade < 18) "Menor de idade" else "Adulto"
    } else {
        "Idade desconhecida"
    }
    println("Categoria: $categoria")

    // Exemplo 5 - Operador Elvis com chamadas de função
    fun obterCategoria(idade: Int?): String {
        return if (idade != null) {
            if (idade < 18) "Menor de idade" else "Adulto"
        } else {
            "Idade desconhecida"
        }
    }

    println("Categoria: ${obterCategoria(null)}")
    println("Categoria: ${obterCategoria(25)}")

    // Exemplo 6 - Operador Elvis com variáveis mutáveis
    var apelido: String? = null
    println("Apelido: ${apelido ?: "Sem apelido"}")

    apelido = "Dani"
    println("Apelido: ${apelido ?: "Sem apelido"}")

    // Exemplo 7 - Operador Elvis com tipos de retorno de função
    fun obterNomeCompleto(nome: String?, sobrenome: String?): String {
        return "${nome ?: "Nome Desconecido"} ${sobrenome ?: "Sobrenome Desconecido"}"
    }

    println("Nome Completo: ${obterNomeCompleto(null, null)}")
    println("Nome Completo: ${obterNomeCompleto("Daniel", null)}")

}