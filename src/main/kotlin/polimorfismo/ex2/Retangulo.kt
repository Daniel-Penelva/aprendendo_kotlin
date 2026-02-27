package polimorfismo.ex2

class Retangulo(val largura: Double, val altura: Double): Forma {
    override fun calcularArea() = largura * altura
}