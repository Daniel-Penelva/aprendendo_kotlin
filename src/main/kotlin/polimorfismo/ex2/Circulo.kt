package polimorfismo.ex2

class Circulo(val raio: Double): Forma {
    override fun calcularArea() = Math.PI * raio * raio
}