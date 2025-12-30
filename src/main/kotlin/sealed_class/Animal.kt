package sealed_class

// Exemplo 2
sealed class Animal {
    data class Cachorro(val raca: String): Animal()
    data class Gato(val raca: String): Animal()
    data class Peixe(val tipo: String): Animal()
}

fun descreverAnimal(animal: Animal) {
    when (animal) {
        is Animal.Cachorro -> println("Cachorro da raça: ${animal.raca}")
        is Animal.Gato -> println("Gato da raça: ${animal.raca}")
        is Animal.Peixe -> println("Peixe do tipo: ${animal.tipo}")
    }
}

fun main() {
    descreverAnimal(Animal.Cachorro("Labrador"))
    descreverAnimal(Animal.Gato("Siamês"))
    descreverAnimal(Animal.Peixe("Betta"))
}