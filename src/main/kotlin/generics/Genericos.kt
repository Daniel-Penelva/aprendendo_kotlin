package generics

// =========================
// MODELO BASE
// =========================
open class Animais(val nome: String) {
    override fun toString(): String  = "Animal($nome)"
}

class Dog(nome: String): Animais(nome) {
    fun latir() = println("$nome: Au au!")
}

class Cat(nome: String): Animais(nome) {
    fun miar() = println("$nome: Miau!")
}


// =========================
// PRODUCER (out) - Apenas produz itens, retorna T
// =========================
class Producer<out T>(private val valor: T) {
    fun produzir(): T = valor
}

// =========================
// CONSUMER (in) - Apenas consome itens, recebe T como parâmetro.
// =========================
class Consumer<in T> {
    fun consumir(item: T) {
        println("Consumindo: $item")
    }
}

// =========================
// INVARIANTE - Nem produtor nem consumidor, pode tanto produzir quanto consumir T. Não é permitido subtipagem entre tipos invariantes.
// =========================
class Caixa<T>(var valor: T)


// =========================
// FUNÇÕES COM USE-SITE VARIANCE - Permite usar out/in em tipos genéricos específicos dentro de funções, sem precisar declarar a classe inteira como covariante ou contravariante.
// =========================
fun imprimirAnimais(lista: List<out Animais>) {
    for (animal in lista) {
        println(animal)
    }
}

fun addDog(lista: MutableList<in Dog>) {
    lista.add(Dog("Rex"))
}

// =========================
// MAIN
// =========================

fun main() {

    // =========================
    // OUT (Producer) - Apenas produz itens, retorna T.
    // =========================
    val produtorDog: Producer<Dog> = Producer(Dog("Rex"))


    val produtorAnimal: Producer<Animais> = produtorDog // Covariância: Producer<Dog> é um subtipo de Producer<Animais>

    val animalProduzido: Animais = produtorAnimal.produzir()
    println(animalProduzido) // Saída: Animal(Rex)


    // -------------------------
    // IN (Consumer) - Apenas consome itens, recebe T como parâmetro.
    // -------------------------
    val consumidorAnimal = Consumer<Animais>()
    val consumidorDog: Consumer<Dog> = consumidorAnimal // Contravariância: Consumer<Animais> é um supertipo de Consumer<Dog>

    consumidorDog.consumir(Dog("Rex")) // Saída: Consumindo: Animal(Rex)


    // -------------------------
    // INVARIANTE - Nem produtor nem consumidor, pode tanto produzir quanto consumir T. Não é permitido subtipagem entre tipos invariantes.
    // -------------------------
    val caixaDog = Caixa(Dog("Thor"))
    // val caixaAnimal: Caixa<Animais> = caixaDog // Erro: Invariância - Caixa<Dog> não é um subtipo de Caixa<Animais>


    // -------------------------
    // List é OUT por padrão - List é covariante, ou seja, List<Dog> é um subtipo de List<Animais>.
    // -------------------------
    val cachorros: List<Dog> = listOf(Dog("Bob"), Dog("Nick"))

    val animais: List<Animais> = cachorros // Covariância: List<Dog> é um subtipo de List<Animais>
    imprimirAnimais(animais) // Saída: Animal(Bob), Animal(Nick)


    // -------------------------
    // List é OUT por padrão - List é covariante, ou seja, List<Dog> é um subtipo de List<Animais>.
    // -------------------------
    val listaAnimais: MutableList<Animais> = mutableListOf()
    addDog(listaAnimais) // Contravariância: MutableList<Animais> é um supertipo de MutableList<Dog>

    println(listaAnimais)

}

/*

O Problema que Generics resolvem:
    Sem generics
    val lista: List = listOf(1, 2, 3) // não funciona

    Com generics
    val lista: List<Int> = listOf(1, 2, 3)

        - Segurança de tipo
        - Evita cast
        - Código mais robusto

   O Problema da Variância
   Imagine:
       open class Animal
       class Cachorro : Animal()
   Agora:
        val cachorros: List<Cachorro> = listOf(Cachorro())
   Pergunta:
        List<Cachorro> é subtipo de List<Animal>?
  Resposta curta: Depende da variância.


  1. out (Covariância)
  Regra:
    out significa que o tipo só sai (produz). Ou seja, a List só fornece itens, não recebe.


  2. in (Contravariância)
  Regra:
    in significa que o tipo só entra (consome). Ou seja, só recebe T.

        interface Comparador<in T> {
            fun comparar(a: T, b: T): Int
        }

    Agora:
        val comparadorAnimal: Comparador<Animal> = ...
        val comparadorCachorro: Comparador<Cachorro> = comparadorAnimal

   3. Sem variância (Invariância)

    Se fizer assim:
        class Caixa<T>(var valor: T)

    Isso é invariante. Então:
        Caixa<Cachorro> não é Caixa<Animal>

   Porque:
    - Você pode colocar um Animal dentro
    - Que não seja Cachorro
    - Isso quebraria o tipo.
*/