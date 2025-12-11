package basic

fun main() {

    /* <<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 1 - let >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Usa it | Retorna o resultado do bloco | Muito usado para null safety e transformações

    // Usando 'let' para transformar o nome em maiúsculas e imprimir
    val nomes = mutableListOf("Ana", "Bia", "Carlos", "Daniel")

    nomes.forEach { nome ->
        nome.let {
            val nomeMaiusculo = it.uppercase()
            println(nomeMaiusculo)
        }
    }

    // Outro exemplo com 'let' retornando o tamanho do nome
    val primeiroNome = "Daniel"

    val tamanho = primeiroNome.let {
        println("Nome: $it")
        it.length
    }
    println("Tamanho do nome: $tamanho")


    // Outro exemplo 'let' é ótimo com objetos nullable - Se programacao for null → o bloco não roda.
    val programacao: String? = "Kotlin"
    programacao?.let {
        println("Estou aprendendo ${it.uppercase()}")  // ou simplesmente println("Estou aprendendo $it")
    }


    /* <<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 - run >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Usa this | Retorna o resultado do bloco | Usado para inicialização ou rodar blocos de código dependentes do objeto

    // Usando 'run' para calcular a soma de uma lista de números
    val numeros = listOf(1, 2, 3, 4, 5)

    val soma = numeros.run {
        this.sum()
    }
    println("Soma: $soma")


    // Outro exemplo 'run' com StringBuilder para construir uma string
    val texto = StringBuilder().run {
        append("Olá ")
        append("Mundo!")
        toString()// retorno do run
    }
    println(texto)


    // Outro exemplo 'run' para inicializar um objeto e retornar um valor derivado dele
    val comprimento = "Kotlin".run {
        println("Linguagem: $this")
        this.length // retorno do run
    }
    println("Comprimento: $comprimento")


    /* <<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 3 - apply >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Usa this | Retorna o proprio objeto | Ideal para configurar objetos (Builder pattern)

    // Usando 'apply' para configurar um objeto StringBuilder
    val mensagem = StringBuilder().apply {
        append("Olá, ")
        append("mundo!")
    }
    println(mensagem.toString())

    // Outro exemplo 'apply' para configurar um objeto de dados
    data class Pessoa(var nome: String, var idade: Int)

    val pessoa = Pessoa("", 0).apply {
        nome = "Carlos"
        idade = 30
    }
    println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")


    // Outro exemplo 'apply' para configurar uma lista de números
    val listaNumeros = mutableListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }
    println("Lista de Números: $listaNumeros")


    /* <<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 4 - also >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Usa it | Retorna o proprio objeto | Usado para efeitos colaterais (log, debug, validações)

    // Usando 'also' para adicionar um sufixo aos nomes e imprimir
    val funcionarios = mutableListOf("Ana", "Bia", "Carlos", "Daniel")

    funcionarios.forEach { nome ->
        nome.also {
            val nomeComSufixo = "$it Silva"
            println(nomeComSufixo)
        }
    }

   // Outro exemplo 'also' para validar um número antes de adicioná-lo a uma lista - also não modifica o valor final — só observa.
    val lista = mutableListOf(1, 2, 3).also {
        println("Números antes de adicionar: $it")
    }.apply {
        add(4)
        add(5)
    }.also {
        println("Números depois de adicionar: $it")
    }


    /* <<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 5 - with >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Usa this | Retorna o resultado do bloco | Não é chamada como extensão — é uma função comum

    // Usando 'with' para operar em um objeto StringBuilder
    val resultado = with(StringBuilder()) {
        append("Kotlin ")
        append("é ")
        append("incrível!")
        toString() // retorno do with
    }
    println(resultado)


    // Outro exemplo 'with' para formatar uma data
    data class Data(var dia: Int, var mes: Int, var ano: Int)

    val data = Data(15, 8, 2024)

    val dataFormatada = with(data) {
        String.format("%02d/%02d/%04d", dia, mes, ano) // retorno do with
    }
    println("Data formatada: $dataFormatada")


    // Outro exemplo 'with' para calcular a área e o perímetro de um retângulo
    data class Retangulo(var largura: Double, var altura: Double)

    val retangulo = Retangulo(5.0, 3.0)

    val (area, perimetro) = with(retangulo) {
        val area = largura * altura
        val perimetro = 2 * (largura + altura)
        Pair(area, perimetro) // retorno do with
    }
    println("Área: $area, Perímetro: $perimetro")

}

/*
* As funções de escopo são um dos recursos mais importantes e usados em Kotlin.
* Elas ajudam a escrever código mais limpo, reduz repetição e melhora legibilidade.
* As principais são:
*   - let (Retorno - Resultado de bloco) | this ou it | encadeamento, evitar null, transformação | Ex: Quero usar o valor (it) e obter outro valor.
*   - run (Retorno - Resultado de bloco) |    it      | inicializações, blocos de código         | Ex: Quero usar o objeto (this) e retornar algo.
*   - apply (o próprio objeto)           |    this    | configuração de objetos                  | Ex: Quero configurar o objeto (this) e retornar ele mesmo.
*   - also  (o próprio objeto)           |    it      | debug, efeitos colaterais                | Ex: Quero usar o objeto (it) sem alterar seu fluxo e retornar ele mesmo.
*   - with  (resultado do bloco)         |    this    | operação em um objeto já existente       | Ex: Quero executar várias operações em um objeto (this) sem retorná-lo.
* */