package polimorfismo.ex3

fun main() {
    // Criando repositórios para usuários e produtos
    val repositorioUsuarios = Repositorio<Usuario>()
    val repositorioProdutos = Repositorio<Produto>()

    // Adicionando usuários
    repositorioUsuarios.adicionar(Usuario("Alice"))
    repositorioUsuarios.adicionar(Usuario("Bob"))

    // Adicionando produtos
    repositorioProdutos.adicionar(Produto("Laptop"))
    repositorioProdutos.adicionar(Produto("Smartphone"))

    // Listando e imprimindo usuários
    println("Usuários:")
    imprimirLista(repositorioUsuarios.listar())

    // Listando e imprimindo produtos
    println("\nProdutos:")
    imprimirLista(repositorioProdutos.listar())
}