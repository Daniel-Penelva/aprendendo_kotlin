package basic

fun main() {

    /*
    * Um Map é uma coleção de pares chave → valor.
    *
    * Exemplo:
    * chave: "nome" → valor: "Daniel"
    * chave: "idade" → valor: 30
    *
    * Ele funciona como um dicionário.
    * */

    // Exemplo 1 - Map Imutável
    // mapOf cria um mapa onde não é possível adicionar, remover ou alterar elementos depois da criação.
    println("=============== Exemplo1 ===============")

    val usuario = mapOf(
        "nome" to "Daniel",
        "idade" to 30,
        "cidade" to "Rio de Janeiro"
    )

    // 1.1 Imprimir o mapa completo
    println("=============== Imprimir o mapa completo ===============")
    println(usuario)

    // 1.2 Como acessar os valores
    println("=============== Como acessar os valores ===============")
    println(usuario["nome"])   // Daniel
    println(usuario["idade"])  // 30

    // 1.3 Verificar se uma chave existe
    println("=============== Verificar se uma chave existe ===============")
    println("nome" in usuario)  // true
    println("telefone" in usuario) // false

    // Iterando sobre um Map
    // 1.4 Pegando chave e valor
    println("=============== Pegando chave e valor ===============")
    for ((chave, valor) in usuario) {
        println("$chave = $valor")
    }

    // 1.5 Pegando só as chaves
    // "keys" retorna um conjunto (Set) com todas as chaves do mapa
    println("=============== Pegando só as chaves ===============")
    for (chave in usuario.keys) {
        println("Chave: $chave")
    }

    // 1.6 Pegando só os valores
    // "values" retorna uma coleção (Collection) com todos os valores do mapa
    println("=============== Pegando só os valores ===============")
    for (valor in usuario.values) {
        println("Valor: $valor")
    }


    // 1.7 Tamanho do Mapa
    println("=============== Tamanho do Mapa ===============")
    println(usuario.size) // 3


    // 1.8 Retornar o valor ou um padrão caso a chave não exista
    println("=============== Retornar o valor ou um padrão caso a chave não exista ===============")
    println(usuario.getOrDefault("telefone", "Chave não encontrada - sem telefone"))


    // 1.9 getValue lança uma exceção se a chave não existir
    println("=============== getValue lança uma exceção se a chave não existir ===============")
    println(usuario.getValue("nome"))  // Ok
    // println(usuario.getValue("email")) // lança NoSuchElementException


    // 1.10 Transformando um Map - mostrar todas as chaves em maiúsculas
    // Você pode transformar o mapa com map, filter, etc.
    println("=============== Transformando um Map - mostrar todas as chaves em maiúsculas ===============")
    val novo = usuario.map { (k, v) -> k.uppercase() to v }
    println(novo)


    // 1.11 Filtrar só itens com valores inteiros
    println("=============== Filtrar só itens com valores inteiros ===============")
    val filtrado = usuario.filterValues { it is Int }
    println(filtrado)


    // Exemplo 2 - Map Imutável
    println("=============== Exemplo2 ===============")
    val num: Map<String, Int> = mapOf(
        "um" to 1,
        "dois" to 2,
        "tres" to 3
    )

    println(num)

    // Exemplo 3 - Criando um Map vazio
    println("=============== Exemplo3 ===============")
    val vazio = mapOf<String, Int>()


    // Exemplo 4 - Map Mutável
    println("=============== Exemplo4 ===============")
    val usuarioMutavel = mutableMapOf(
        "nome" to "Ana",
        "idade" to 25
    )
    println(usuarioMutavel)

    // 4.1 Adicionando um novo par chave-valor
    usuarioMutavel["cidade"] = "São Paulo"
    println(usuarioMutavel)

    // 4.2 Removendo um par chave-valor
    usuarioMutavel.remove("idade")
    println(usuarioMutavel)

    // 4.3 Alterando um valor existente
    usuarioMutavel["nome"] = "Maria"
    println(usuarioMutavel)
}