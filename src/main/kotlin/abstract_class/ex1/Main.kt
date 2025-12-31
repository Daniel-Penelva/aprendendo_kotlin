package abstract_class.ex1

fun main() {
    val cachorro = Cachorro("Rex")
    val gato = Gato("Mimi")

    cachorro.fazerBarulho()  // Rex diz: Au Au!
    cachorro.correr()         // Rex está correndo felizmente!
    cachorro.dormir()         // Rex está dormindo.

    cachorro.nivelFome = 50        // Estado funciona
    cachorro.comer(20)  // Rex comeu 20 unidades de comida. Nível de fome: 30

    gato.fazerBarulho()       // Mimi diz: Miau Miau!
    gato.correr()             // Mimi está correndo.
    gato.dormir()             // Mimi está dormindo.

    gato.nivelFome = 30       // Estado funciona
    gato.comer(10)  // Mimi comeu 10 unidades de comida. Nível de fome: 20


    // ERRO! Não pode instanciar
    // val animal = Animal("Genérico")  // Compilation Error!

}

/*
* Exemplo
Este exemplo demonstra o uso de classes abstratas em Kotlin.

A classe abstrata `Animal` define um contrato para suas subclasses, exigindo que implementem o método `fazerBarulho()`.
Além disso, a classe abstrata possui propriedades e métodos concretos que podem ser utilizados pelas subclasses.

As classes `Cachorro` e `Gato` estendem a classe `Animal`, implementando o método abstrato e, no caso do `Cachorro`, sobrescrevendo o método `correr()`.
O programa principal cria instâncias de `Cachorro` e `Gato`, demonstrando o comportamento definido na classe abstrata e suas subclasses.

Foram mostrados:
    - Propriedade com estado
    - Método abstrato (filhos implementam)
    - Método concreto (já implementada)
    - Método open (que pode ser sobrescrito)
* */