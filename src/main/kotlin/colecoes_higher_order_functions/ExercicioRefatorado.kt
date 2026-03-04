package colecoes_higher_order_functions

/* Enunciado - Exercicio:
* Usando higher-order functions:
*   1. Imprima somente os aprovados
*   2. Imprima a média das notas de todos
*   3. Imprima o nome do aluno com maior nota
*   4. Crie um Map agrupando alunos por aprovado (true / false)
* */

data class Estudante(val nome: String, val nota1: Double, val nota2: Double) {
    val media: Double get() = (nota1 + nota2) / 2
    val aprovado: Boolean get() = media >= 6.0
}

fun main() {
    val alunos = listOf(
        Estudante("Daniel", 7.2, 5.8),
        Estudante("Paulo", 4.7, 2.3),
        Estudante("João", 9.2, 6.8),
        Estudante("Maria", 3.9, 4.8)
    )

    println("Aprovados:")
    alunos.filter { it.aprovado }
        .forEach { println("  ${it.nome} — Média: ${it.media}") }

    println("\nMédia geral: ${alunos.map { it.media }.average()}")

    println("\nMelhor aluno: ${alunos.maxByOrNull { it.media }?.nome}")

    println("\nAgrupados:")
    alunos.groupBy { it.aprovado }
        .forEach { (aprovado, grupo) ->
            println("Aprovado: $aprovado")
            grupo.forEach { println("  - ${it.nome}") }
        }
}

/*
* O que foi refatorado?
* 1. Evitando recalcular a média repetidamente.
*    Foi criado as propriedades "media" e "aprovado" dentro da data class Estudante
*
* 2. Uso de forEach para imprimir os aprovados, tornando o código mais fluido e legível.
*
* 3. Uso de map para calcular a média geral, evitando a necessidade de criar uma variável intermediária.
*
* 4. Uso de maxByOrNull para encontrar o melhor aluno de forma mais direta.
*
* */