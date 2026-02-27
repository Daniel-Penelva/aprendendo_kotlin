package polimorfismo.ex4

fun main() {

    val veterinarioAnimal = Veterinario<Animal>()
    veterinarioAnimal.examinar(Animal("Generic Animal"))

    val veterinario = Veterinario<Cachorro>()
    veterinario.examinar(Cachorro("Rex"))
}