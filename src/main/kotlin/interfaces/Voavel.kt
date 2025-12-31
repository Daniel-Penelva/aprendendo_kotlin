package interfaces

interface Voavel {

    fun voar() {
        println("Voando...")
    }
}

// Classe
class Passaro : Voavel

fun main() {

    val passaro: Voavel = Passaro()
    passaro.voar()
}

/* Exemplo:
 Interface com implementação padrão:
   - Não precisa sobrescrever
   - Código reutilizável
**/
