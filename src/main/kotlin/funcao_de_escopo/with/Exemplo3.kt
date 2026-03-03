package funcao_de_escopo.with

import polimorfismo.ex2.Retangulo

data class Retangulo(var largura: Double, var altura: Double)
fun main() {

    val retangulo = Retangulo(5.0, 3.0)

    val (area, perimetro) = with(retangulo) {
        val area = largura * altura
        val perimetro = 2 * (largura + altura)
        Pair(area, perimetro) // retorno do with
    }
    println("Área: $area, Perímetro: $perimetro")
}