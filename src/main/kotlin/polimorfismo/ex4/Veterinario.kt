package polimorfismo.ex4

class Veterinario<T: Animal> {
    fun examinar(animal: T) {
        println("Examinando ${animal.nome}")
    }
}