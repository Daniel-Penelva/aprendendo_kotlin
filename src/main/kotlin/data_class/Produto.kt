package data_class

data class Produto(val nome: String, val preco: Double, val disponivel: Boolean?)

// "this" aqui é o Produto — acesso total às propriedades
fun Produto.imprimeProduto() {
    val status = if (disponivel ?: false) "R$ $preco" else "Indisponível"
    println("Produto: $nome - Status: $status")
}


fun main() {

    val produto1 = Produto("Notebook", 2500.0, true)
    val produto2 = Produto("Smartphone", 1500.0, null)

    produto1.imprimeProduto() // Produto: Notebook - Status: R$2500.0
    produto2.imprimeProduto() // Produto: Smartphone - Status: Indisponível
}