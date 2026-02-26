package heranca_multipla_com_interface

// =========================
// CLASSE QUE HERDA E IMPLEMENTA
// =========================
class Estagiario(nome: String): Funcionario(nome), Trabalhador, Estudante {

    // Pode escolher qual rotina seguir ou criar uma nova - Obrigatório resolver conflito
    override fun rotina() {
        println("Minha rotina como estagiário: ")
        super<Trabalhador>.rotina() // Chama a rotina do Trabalhador
        super<Estudante>.rotina() // Chama a rotina do Estudante
    }

    // Sobrescreve o método apresentar para resolver o conflito entre as interfaces
    override fun apresentar() {
        super<Funcionario>.apresentar() // Chama a apresentação do Funcionario
        super<Trabalhador>.apresentar() // Chama a apresentação do Trabalhador
        super<Estudante>.apresentar() // Chama a apresentação do Estudante
    }

}