package colecoes_higher_order_functions

/*
Higher-Order Functions — o poder real das coleções
É aqui que o Kotlin brilha. Em vez de escrever for para tudo, você usa funções que recebem outras funções como parâmetro.
* */
fun main() {

    /*<<<<<<<<<<<<<<<<<< filter — filtra elementos >>>>>>>>>>>>>>>>> */

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7)
    val pares = numeros.filter { it % 2 == 0 }
    println(pares)


    /*<<<<<<<<<<<<<<<<<< map — transforma cada elemento >>>>>>>>>>>>>>>>> */

    val nomes = listOf("daniel", "ana", "carlos")
    val maiusculas = nomes.map { it.uppercase() }
    println(maiusculas)


    /*<<<<<<<<<<<<<<<<<< find — retorna o primeiro que satisfaz a condição >>>>>>>>>>>>>>>>> */

    val usuarios = listOf("Daniel", "Ana", "Carlos")
    val resultado = usuarios.find { it.startsWith("A") }
    println(resultado)


    /*<<<<<<<<<<<<<<<<<< any e all — verificações booleanas >>>>>>>>>>>>>>>>> */

    val idades = listOf(15, 22, 17, 30)
    println(idades.any{ it >= 18 }) // true — algum é maior de idade?
    println(idades.all { it >= 18 }) // false — todos são maiores?


    /*<<<<<<<<<<<<<<<<<< groupBy — agrupa por critério >>>>>>>>>>>>>>>>> */

    val name = listOf("Ana", "Alberto", "Bruno", "Beatriz", "Carlos")
    val porLetra = name.groupBy { it.first() }
    println(porLetra)


    /*<<<<<<<<<<<<<<<<<< sumOf e maxByOrNull >>>>>>>>>>>>>>>>> */

    data class Produto(val nome: String, val preco: Double)

    val produtos = listOf(
        Produto("Notebook", 2500.0),
        Produto("Mouse", 150.0),
        Produto("Teclado", 300.0)
    )

    val total = produtos.sumOf { it.preco }  // soma todos os preços
    val maisCaro = produtos.maxByOrNull { it.preco } // captura o preço mais caro (maior)

    println("Total: R$$total")          // Total: R$2950.0
    println("Mais caro: ${maisCaro?.nome}") // Mais caro: Notebook


    /*<<<<<<<<<<<<<<<<<< Encadeando funções — o estilo profissional >>>>>>>>>>>>>>>>> */

    val listaDeProdutos = listOf(
        Produto("Notebook", 2500.0),   // usando a data classe Produto do exemplo anterior
        Produto("Mouse", 150.0),
        Produto("Teclado", 300.0),
        Produto("Monitor", 1800.0)
    )

// Filtra acima de 200, ordena por preço, pega os nomes
    val listaResultado = listaDeProdutos
        .filter { it.preco > 200 }
        .sortedBy { it.preco }
        .map { it.nome }

    println(listaResultado) // [Teclado, Monitor, Notebook]
}