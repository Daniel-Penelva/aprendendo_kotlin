package heranca_multipla_com_interface

fun main() {

    /* ===== Chamando Estagiário ===== */
    println("===== Exemplo 1 =====")
    val estagiario = Estagiario("João")

    estagiario.apresentar()
    println("--------")
    estagiario.rotina()

    /* ===== Chamando Funcionário ===== */
    println("===== Exemplo 2 =====")
    val funcionario = Funcionario("Maria")
    funcionario.apresentar()

    /* ===== Chamando Trabalhador ===== */
    println("===== Exemplo 3 =====")
    val trabalhador = object : Trabalhador {} // Criando uma instância anônima de Trabalhador
    trabalhador.apresentar()

}