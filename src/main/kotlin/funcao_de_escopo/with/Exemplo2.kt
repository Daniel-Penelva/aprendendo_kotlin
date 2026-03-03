package funcao_de_escopo.with

data class Data(var dia: Int, var mes: Int, var ano: Int)

fun main() {

    val data = Data(15, 8, 2024)

    val dataFormatada = with(data) {
        String.format("%02d/%02d/%04d", dia, mes, ano) // retorno do with
    }
    println("Data formatada: $dataFormatada")
}

// 'with' para formatar uma data