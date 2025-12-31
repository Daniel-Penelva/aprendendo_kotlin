package sealed_interface

sealed interface EstadoTela {

    object Loading: EstadoTela
    object Idle: EstadoTela
    object Error: EstadoTela
}

fun render(estado: EstadoTela) {
    when (estado) {
        EstadoTela.Loading -> println("Carregando...")
        EstadoTela.Idle -> println("Tela ociosa.")
        EstadoTela.Error -> println("Ocorreu um erro.")
    }
}

fun main() {
    val estado1: EstadoTela = EstadoTela.Loading
    val estado2: EstadoTela = EstadoTela.Idle
    val estado3: EstadoTela = EstadoTela.Error

    render(estado1)
    render(estado2)
    render(estado3)
}

/* Exemplo:
sealed interface + object
Perfeito para estados únicos
* */