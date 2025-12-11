package basic

fun main(){

    // Exemplo 1 - Tipos não Nulos .VS Tipos Nulos
    println("--- Exemplo 1 - Tipos não Nulos .VS Tipos  (?) ---")

    // Tipo não nulo (padrão)
    val nome: String = "Daniel"
    // nome = null // Isso causará um erro de compilação
    println("Nome: $nome")

    // Tipo que aceita nulo - Use o ? no tipo
    val sobrenome: String? = "Silva"     // O "?" significa: este valor pode ser nulo.
    // sobrenome = null; // Isso é permitido
    println("Sobrenome $sobrenome")


    // Exemplo 2 - Operador de chamada segura - ?.
    println("--- Exemplo 2 - Operador de chamada segura (?.) ---")

    val programacao: String? = "Kotlin"
    println(programacao?.length) // Usa o operador de chamada segura (?.)
    println(programacao?.uppercase()) // Usa o operador de chamada segura (?.)

    // Se name for nulo - o resultado da expressão será null e NÃO ocorrerá erro.
    val name: String? = null
    println(name?.uppercase()) // Usa o operador de chamada segura (?.)


    // Exemplo 3 - Operador Elvis - ?:
    // Serve para definir um valor padrão caso a expressão à esquerda seja nula.
    println("--- Exemplo 3 - Operador Elvis (?:) ---")

    val linguagem: String? = null
    val tamanhoLinguagem: Int = linguagem?.length ?: 0 // Se linguagem for nulo, retorna 0
    println("Tamanho da linguagem: $tamanhoLinguagem")


    // Exemplo 3.1
    println("--- Exemplo 3.1 - Operador Elvis (?:) ---")
    var firstname: String? = null
    var texto = firstname ?: "Nome inexistente!"
    println("Texto: $texto")

    firstname = "Daniel"
    texto = firstname ?: "Nome inexistente!"
    println("Texto: $texto")


    // Exemplo 3.2 - Usando o operador Elvis com variáveis
    val age: Int? = null
    val ageReal: Int = age ?: 0 // Se age for nulo, retorna 0


    // Exemplo 3.3 - Usando o operador Elvis com funções
    println("--- Exemplo 3.2 - Operador Elvis (?:) com funções ---")
    fun obterTamanho(texto: String?): Int {
        return texto?.length ?: -1 // Retorna -1 se texto for nulo
    }
    println(obterTamanho("Kotlin")) // Saída: 6
    println(obterTamanho(null))     // Saída: -1


    // Exemplo 4 - Operador Not-Null Assertion - !!
    // Força o valor a NÃO ser nulo.
    /*
    Regra:
        (1) Evite usar!!, exceto quando for absolutamente necessário.
        (2) Use-o apenas quando você tem certeza absoluta de que o valor não é nulo.
        (3) Normalmente existe uma solução melhor com ?. ou ?:.
     */

    println("--- Exemplo 4 - Operador Not-Null Assertion (!!) ---")
    val cidade: String? = "São Paulo"
    val tamanhoCidade: Int = cidade!!.length // Força a não nulidade com !!
    println("Tamanho da cidade: $tamanhoCidade")

    // Exemplo 4.1 - Usando !! com valor nulo
    // Se for nulo → lança NullPointerException.
    val pais: String? = null
    //println(pais!!.length) // Isso lançará uma NullPointerException


    // Exemplo 5 - Tratamento de Nulos em Funções
    println("--- Exemplo 5 - Tratamento de Nulos em Funções ---")

    fun imprimirComprimento(texto: String?) {
        val comprimento: Int = texto?.length ?: 0 // Usa operador Elvis para tratar nulo
        println("Comprimento do texto: $comprimento")
    }

    imprimirComprimento("Kotlin") // Saída: Comprimento do texto: 6
    imprimirComprimento(null)     // Saída: Comprimento do texto: 0


    // Exemplo 6 - Encadeamento de chamadas seguras
    println("--- Exemplo 6 - Encadeamento de chamadas seguras ---")
    data class Endereco(val rua: String?, val cidade: String?)
    data class Pessoa(val nome: String, val endereco: Endereco?)

    val pessoa: Pessoa? = Pessoa("Ana", Endereco(null, "Rio de Janeiro"))

    val nomePessoa: String? = pessoa?.nome // Chamada segura para obter o nome
    val tamanhoNomePessoa = pessoa?.nome?.length // Chamada segura para obter o tamanho do nome

    val nomeRua: String? = pessoa?.endereco?.rua // Encadeamento de chamadas seguras
    val tamanhoRua: Int? = pessoa?.endereco?.rua?.length // Encadeamento de chamadas seguras

    println("Nome da pessoa: $nomePessoa") // Saída: Nome da pessoa: Ana
    println("Tamanho do nome da pessoa: $tamanhoNomePessoa") // Saída: Tamanho do nome da pessoa: 3
    println("Nome da rua: $nomeRua") // Saída: Nome da rua: null
    println("Tamanho da rua: $tamanhoRua") // Saída: Tamanho da rua: null


    // Exemplo 7 - Uso combinado de operadores de nulidade
    // firstOrNull() retorna o primeiro caractere ou nulo se a string estiver vazia.
    println("--- Exemplo 7 - Uso combinado de operadores de nulidade ---")

    fun obterPrimeiraLetra(texto: String?): Char {
        return texto?.firstOrNull() ?: 'N' // Retorna 'N' se texto for nulo ou vazio
    }

    println(obterPrimeiraLetra("Kotlin")) // Saída: K
    println(obterPrimeiraLetra(null))     // Saída: N


    // Exemplo 8 - Safe cast - as?
    println("--- Exemplo 8 - Safe cast (as?) ---")

    fun safeCastExample(obj: Any) {
        val str: String? = obj as? String // Tenta fazer o cast para String
        println("Resultado do safe cast: $str")
    }

    safeCastExample("Hello") // Saída: Resultado do safe cast: Hello
    safeCastExample(123)     // Saída: Resultado do safe cast: null


    // Exemplo 8.1
    println("--- Exemplo 8.1 - Safe cast (as?) ---")
    val obj: Any = "Olá"

    val text: String? = obj as? String // Retorna "Olá", pois obj é String
    val numero: Int? = obj as? Int     // Retorna null, pois obj não é Int

    println("Text: $text")       // Saída: Text: Olá
    println("Number: $numero")   // Saída: Number: null


    // Exemplo 9 - let com tipos nulos - Usado com nullable
    println("--- Exemplo 9 - let com tipos nulos ---")

    val primeiroNome: String? = "Pedro"

    primeiroNome?.let {
        println("O comprimento do primeiro nome é ${it.length}")
    }
    // OBS. Se for nulo → o bloco não roda.


    // Exemplo 9.1 - Executa um bloco e retorna valor - Ideal para operações encadeadas em objetos nullable
    println("--- Exemplo 9.1 - run com tipos nulos ---")

    val resultado = primeiroNome?.run {
        length * 2
    } ?: "Nome inexistente!"

    println("Resultado: $resultado")


    // Exemplo 9.2 - apply — Para configurar objetos - Muito usado ao criar objetos, mas só vai rodar se o objeto não for nulo
    println("--- Exemplo 9.2 - apply com tipos nulos ---")
    data class Configuracao(var host: String = "", var porta: Int = 0)

    val config: Configuracao? = Configuracao()

    config?.apply {
        host = "localhost"
        porta = 8080
    }
    println("Configuração: host=${config?.host}, porta=${config?.porta}")


    // Exemplo 9.3 - also — Para executar ações adicionais - Só vai rodar se o objeto não for nulo - Usado para logging/side effects
    println("--- Exemplo 9.3 - also com tipos nulos ---")

    val usuario: String? = "admin"
    usuario?.also {
        println("Usuário definido como: $it")
    }

    // Exemplo 9.4 - with — Não é para nulos
    println("--- Exemplo 9.4 - with (não para nulos) ---")

    val endereco = Endereco("Av. Brasil", "São Paulo")

    val detalhesEndereco = with(endereco) {
        "Rua: $rua, Cidade: $cidade"
    }
    println("Detalhes do endereço: $detalhesEndereco")

    // ou
    endereco?.let {
        with(it) {
            println("Rua: $rua, Cidade: $cidade")
        }
    }


    // Exemplo 10 - Combinação prática de null safety + funções de escopo
    println("--- Exemplo 10 - Combinação prática de null safety + funções de escopo ---")

    var nomeFormatado = nome?.let {
        it.trim() // Remove espaços em branco
            .uppercase() // Converte para maiúsculas
            .also { println("Nome formatado: $it") } // Log do nome formatado
    } ?: "NOME DESCONHECIDO"
    println("Nome final: $nomeFormatado")


    // Outro Exemplo 10.1 - Mais enxuto
    nomeFormatado = nome
        ?.trim() // Remove espaços em branco
        ?.takeIf { it.isNotEmpty() } // Verifica se não está vazio
        ?.uppercase() // Converte para maiúsculas
        ?: "NOME DESCONHECIDO" // Valor padrão se for nulo ou vazio
    println("Nome final: $nomeFormatado")


    // Exemplo com listas 10.2 - Tratamento de nulos em listas
    val nomes: List<String?> = listOf("Ana", null, "Carlos", "Beatriz", null)
    val nomesFormatados = nomes.map { nome ->
        nome
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.uppercase()
            ?: "NOME DESCONHECIDO"
    }
    println("Nomes formatados: $nomesFormatados")


    // Exemplo 11 - Uso de variáveis lateint e lazy com null safety
    println("--- Exemplo 11 - Uso de variáveis lateinit e lazy com null safety ---")
    class ExemploLazy {
        // Variável que será inicializada posteriormente
        lateinit var descricao: String

        // Variável que será inicializada na primeira vez que for acessada
        val saudacao: String by lazy {
            println("Inicializando saudação...")
            "Olá, Mundo!"
        }

        fun inicializarDescricao(texto: String) {
            descricao = texto
        }

        fun mostrarDescricao() {
            if (this::descricao.isInitialized) {
                println("Descrição: $descricao")
            } else {
                println("Descrição não foi inicializada.")
            }
        }
    }
    val exemplo = ExemploLazy()
    exemplo.mostrarDescricao() // Descrição não foi inicializada.
    exemplo.inicializarDescricao("Este é um exemplo de lateinit.")
    exemplo.mostrarDescricao() // Descrição: Este é um exemplo de lateinit.
    println(exemplo.saudacao) // Inicializando saudação... Olá, Mundo!

}

/*
* Ele faz isso obrigando você a tratar valores que podem ser nulos.
* */