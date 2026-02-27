package polimorfismo.ex2

fun main() {

    // Exemplo 1
    val circulo = Circulo(5.0)
    val retangulo = Retangulo(4.0, 6.0)

    imprimirArea(circulo)
    imprimirArea(retangulo)

    // Exemplo 2
    imprimirArea(Circulo(5.0))
    imprimirArea(Retangulo(4.0, 6.0))
}