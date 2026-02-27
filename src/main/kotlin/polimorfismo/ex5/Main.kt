package polimorfismo.ex5

fun main() {

    // Exemplo 1: Sobrecarga de Funções (Overloading)
    println("=== Sobrecarga de Funções ===")
    val calculadora = Calculadora()

    // Testando as diferentes formas de somar
    val resultado1 = calculadora.somar(5, 10) // Soma de dois Int
    println("Resultado da soma de dois Int: $resultado1")

    val resultado2 = calculadora.somar(3.5, 4.2) // Soma de dois Double
    println("Resultado da soma de dois Double: $resultado2")

    val resultado3 = calculadora.somar(1, 2, 3) // Soma de três Int
    println("Resultado da soma de três Int: $resultado3")

    // Exemplo 2 : Sobrecarga de Funções com Parâmetros Opcionais
    println("\n=== Sobrecarga de Funções com Parâmetros Opcionais ===")
    criarUsuario("Alice") // Idade padrão
    criarUsuario("Bob", 30) // Idade fornecida

    // Isso substitui dois métodos sobrecarregados.
}