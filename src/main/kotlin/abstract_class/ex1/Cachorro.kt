package abstract_class.ex1

class Cachorro(nome: String): Animal(nome) {

    override fun fazerBarulho() {
        println("$nome diz: Au Au!")  // implementa o método
    }

    override fun correr() {
        println("$nome está correndo felizmente!")  // Sobreescreve o método correr
    }
}