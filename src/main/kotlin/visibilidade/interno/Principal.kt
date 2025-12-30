package visibilidade.interno

fun main() {

    // Funciona porque estamos no mesmo módulo
    val cachorroInterno = AnimalInterno("Rex")
    cachorroInterno.fazerBarulho()

    val gatoPublico = AnimalPublico("Mimi")
    gatoPublico.fazerBarulho()


    // Imagine que este código está em outro módulo: Projeto B tentando acessar o Projeto A
    // Não funciona porque estamos fora do módulo visibilidade.interno
    // val elefanteInterno = visibilidade.externo.AnimalInterno("Dumbo")

}