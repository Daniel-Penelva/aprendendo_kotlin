package object_e_singleton

interface Factory<T> {
    fun criar(): T
}
class Produto (val nome: String) {
    companion object: Factory<Produto> {
        override fun criar(): Produto {
            return Produto("Produto Padrão")
        }
    }
}

fun main() {
    val produto1 = Produto.criar()
    val produto2 = Produto.criar()

    println("Produto 1: ${produto1.nome}")
    println("Produto 2: ${produto2.nome}")
}

/*
companion object com interface
Esse exemplo, mostra como usar um objeto companheiro (companion object) em kotlin para implementar o padrão de projeto Factory Method.
Aqui, a classe Produto possui um companion object que implementa a interface factory e fornece um método criar() para instanciar objetos
do tipo Produto. No main, foi demonstrado a criação de dois produtos usando o método criar() do companion object.
* */