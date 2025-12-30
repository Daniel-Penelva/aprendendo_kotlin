package visibilidade.protegido

fun main() {
    val cachorro = Cachorro()
    cachorro.brincar()      // Funciona
    cachorro.mostrarPatas() // Funciona (método public)

    val gato = Gato()
    gato.miar()
    gato.mostrarPatas()

    val porco = Porco()
    porco.grunhir()
    porco.mostrarPatas()

    // X ERRO! protected não é acessível fora da hierarquia
    // cachorro.patas = 3     // Compilation Error!
    // cachorro.fazerSom() // Compilation Error!
}