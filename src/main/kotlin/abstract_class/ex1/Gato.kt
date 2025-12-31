package abstract_class.ex1

class Gato(nome: String): Animal(nome) {

    override fun fazerBarulho() {
        println("$nome diz: Miau Miau!")
    }

    override fun correr() {
        super.correr()        // Manteve o comportamento original
    }
}