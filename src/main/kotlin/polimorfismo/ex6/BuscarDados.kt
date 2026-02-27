package polimorfismo.ex6

fun buscarDados(codigo: Int): Resultado {

    return when (codigo) {
        1 -> Resultado.Sucesso("Dados encontrados")
        2 -> Resultado.Erro("Erro ao buscar dados")
        else -> Resultado.Carregando
    }

}