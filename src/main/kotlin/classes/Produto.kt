package classes

class Produto {
    var codigo: Int = 0
    var nome: String = ""
    var preco: Double = 0.0
    var quantidade: Int = 0

    // Exemplo 0 - Usado por frameworks (construtor padrão)
    constructor() {
    }

    // Exemplo 1 - Construtor secundário
    constructor(codigo: Int, nome: String, preco: Double, quantidade: Int) {
        this.codigo = codigo
        this.nome = nome
        this.preco = preco
        this.quantidade = quantidade
    }

    // Exemplo 2 - para provar
    constructor(nome: String, preco: Double): this(0, nome, preco, 0) {
        // código adicional, se necessário
        println("================= exemplo 2 - Produto criado com sucesso! =================")
        println("Produto criado com nome: $nome e preço: $preco")

    }

    // Exemplo 2.1 - É possível criar com construtores primarios e/ou secundrários juntos
    /*
    class Produto(var codigo: Int, var nome: String) {
        var preco: Double = 0.0
        var quantidade: Int = 0

        // Construtor secundário
        constructor(codigo: Int, nome: String, preco: Double, quantidade: Int) : this(codigo, nome) {
            this.preco = preco
            this.quantidade = quantidade
        }
    }
    */

    // Exemplo 3 - construtor + validacao
    constructor(codigo: Int, nome: String, preco: Double) {

        this.codigo = codigo
        this.nome = nome

        if (preco < 0.0) {
            throw IllegalArgumentException("Preço não pode ser negativo ou zero")
        }

        this.preco = preco
        this.quantidade = 0
    }

    // Exemplo 4 - criação com dados diferentes
    constructor(nome: String) {
        this.nome = nome
        this.codigo = 20
        this.preco = 10.99
        this.quantidade = 20
    }

}

fun main() {

    // Exemplo 0 - Usado por frameworks (construtor padrão)
    val criarProduto = Produto()
    criarProduto.codigo = 10
    criarProduto.nome = "Mochila"
    criarProduto.preco = 120.0
    criarProduto.quantidade = 5
    println("================= exemplo 0 - Produto criado com sucesso! =================")
    println("Código do produto: ${criarProduto.codigo}")
    println("Nome do produto: ${criarProduto.nome}")
    println("Preço do produto: ${criarProduto.preco}")
    println("Quantidade do produto: ${criarProduto.quantidade}")



    // Exemplo 1 - Construtor secundário
    println("================= exemplo 1 - Produto criado com sucesso! =================")
    println("Nome do produto: ${Produto(1, "Caneta", 2.5, 100)}")


    // Ou pode criar assim:
    val produto = Produto(2, "Caderno", 15.0, 50)

    println("================= exemplo 1 - Produto criado com sucesso! =================")
    println("Código do produto: ${produto.codigo}")
    println("Nome do produto: ${produto.nome}")
    println("Preço do produto: ${produto.preco}")
    println("Quantidade do produto: ${produto.quantidade}")



    // Exemplo 2 - para provar
    Produto("Borracha", 1.5)


    // Exemplo 3 - construtor + validacao
    println("================= exemplo 3 - Produto criado com sucesso! =================")
    val produto3 = Produto(3, "Lápis", 2.5)
    println("Código do produto: ${produto3.codigo}")
    println("Nome do produto: ${produto3.nome}")
    println("Preço do produto: ${produto3.preco}")


    // Exemplo 3 - construtor + validacao
    println("Exemplo com erro de preço negativo:${Produto(3, "Lápis", 0.0)} ") // lança IllegalArgumentException


    // Exemplo 4 - criação com dados diferentes
    println("================= exemplo 4 - Produto criado com sucesso! =================")
    val produto4 = Produto("Caneta Colorida")
    println("Código do produto: ${produto4.codigo}")
    println("Nome do produto: ${produto4.nome}")
    println("Preço do produto: ${produto4.preco}")
    println("Quantidade do produto: ${produto4.quantidade}")


}

/*
O que é um construtor secundário?

Em Kotlin, o construtor primário é o principal.

O construtor secundário é opcional e existe para:
    - oferecer outras formas de criar o objeto
    - complementar o construtor primário (: this(...))
    - interoperar com Java ou frameworks


Quando NÃO usar construtor secundário
    - Quando valores padrão resolvem
    - Quando data class resolve
    - Quando factory method resolve melhor
*/