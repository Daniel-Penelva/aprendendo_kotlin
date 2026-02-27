package polimorfismo.ex5

class Calculadora {

    // 1. Soma de dois Int
    fun somar(a: Int, b: Int): Int {
        println("Somando Int")
        return a + b
    }

    // 2. Soma de dois Double
    fun somar(a: Double, b: Double): Double {
        println("Somando Double")
        return a + b
    }

    // 3. Soma de três Int
    fun somar(a: Int, b: Int, c: Int): Int {
        println("Somando três Int")
        return a + b + c
    }

}