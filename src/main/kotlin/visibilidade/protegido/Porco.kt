package visibilidade.protegido

class Porco: Animal() {
    fun grunhir() {
        patas = 4 // Acesso permitido
        fazerSom() // Acesso permitido
        println("Porco tem $patas patas e faz som ao grunhir.")
    }
}