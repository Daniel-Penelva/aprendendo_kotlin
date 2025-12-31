package abstract_class.ex1

abstract class Animal(val nome: String) {

    // Propriedade com estado
    var nivelFome: Int = 0

    // Método abstrato (filhos implementam)
    abstract fun fazerBarulho()


    // Método concreto (já implementado)
    fun dormir() {
        println("$nome está dormindo.")
    }

    // Método concreto (já implementado)
    fun comer(quantidade: Int) {
        nivelFome -= quantidade
        println("$nome comeu $quantidade unidades de comida. Nível de fome: $nivelFome")
    }

    // Método open (pode ser sobreescrito)
    open fun correr() {
        println("$nome está correndo.")
    }

}