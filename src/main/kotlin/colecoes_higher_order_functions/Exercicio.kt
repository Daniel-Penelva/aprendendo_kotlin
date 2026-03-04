package colecoes_higher_order_functions

/* Enunciado - Exercicio:
* Usando higher-order functions:
*   1. Imprima somente os aprovados
*   2. Imprima a média das notas de todos
*   3. Imprima o nome do aluno com maior nota
*   4. Crie um Map agrupando alunos por aprovado (true / false)
* */
data class Aluno(
    val nome: String,
    val nota1: Double,
    val nota2: Double
)
fun main() {

    val aluno1 = Aluno("Daniel", 7.2, 5.8)
    val aluno2 = Aluno("Paulo", 4.7, 2.3)
    val aluno3 = Aluno("João", 9.2, 6.8)
    val aluno4 = Aluno("maria", 3.9, 4.8)

    val alunos = listOf(aluno1, aluno2, aluno3, aluno4)

    // Imprima Somente os aprovados
    val aprovados = alunos.filter { (it.nota1 + it.nota2)/2 >= 6.0 }

    println("Alunos aprovados:")
    for (aluno in aprovados) {
        println("Nome: ${aluno.nome} - Nota1: ${aluno.nota1} - Nota2: ${aluno.nota2}")
    }


    // Imprima a média das notas de todos
    val mediaGeral = alunos.map { (it.nota1 + it.nota2)/2 }.average()

    println("Média dos alunos: $mediaGeral")


    // Imprima o nome do aluno com maior nota
    val melhorAluno = alunos.maxByOrNull { (it.nota1 + it.nota2)/2 }

    println("Melhor aluno - Nome: ${melhorAluno?.nome}")


    // Crie um Map agrupando alunos por aprovado(true/false)
    val agrupados = alunos.groupBy { (it.nota1 + it.nota2)/2 >= 6.0 }

    println("Alunos agrupados por aprovação:")
    for ((aprovado, grupo) in agrupados) {
        println("Aprovado: $aprovado")
        for (aluno in grupo) {
            println("  - ${aluno.nome}")
        }
    }

    /* OBS.
    * As variaveis aprovado e grupo são criadas para receber os valores do Map agrupados.
    * O for percorre cada entrada do Map, onde aprovado é a chave (true ou false) e
    * o grupo é a lista de alunos correspondente a essa chave.
    * */

}