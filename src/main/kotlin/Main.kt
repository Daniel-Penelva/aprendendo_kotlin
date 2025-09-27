fun main() {
    println("Hello, Kotlin!");

    /* fun: define uma função
    * main: ponto de entrada do programa.
    * println(): imprime no console
    * */

    /* Variáveis em Kotlin
    * Kotlin trabalha com dois tipos principais de variáveis:
    * 1. Imutável (val) - Como "final" em Java. O valor não pode ser alterado depois de atribuído.
    *
    * 2. Mutável (var) - Pode ter o valor alterado.
    * */

    // Sintaxe:  < tipo_variavel nome_variavel = valor; >

    val nome = "Daniel"
    println(nome)

    var idade = 25
    idade = 30
    println(idade)

    /* Tipagem Automática
    * Kotlin infere o tipo automaticamente, mas você pode definir manualmente.
    * */

    val cidade: String = "São Paulo"
    var populacao: Int = 12300000
    println("$cidade tem uma população de $populacao habitantes.")

    /* Principais Tipos:
    * Int: números inteiros
    * Float: números decimais
    * Double: números decimais
    * Boolean: verdadeiro ou falso
    * String: texto - Sequência de caracteres. Pode usar interpolação com $.
    * Char: um único caractere
    * Byte: número inteiro de 8 bits.
    * */

    // Inteiros (Int)
    val idadeDirigir: Int = 18;
    var anosParaAposentar: Int = 40;

    println("Idade atual: $idadeDirigir")
    println("Anos para se aposentar: $anosParaAposentar")

    anosParaAposentar += 5;
    println("Agora faltam $anosParaAposentar anos")

    // Números Decimais (Float e Double)
    val pi: Double = 3.1415926535
    var preco: Float = 19.99f

    println("Pi: $pi")
    println("Preço: $preco")

    // Boolean
    val maiorDeIdade: Boolean = true
    var temCarteira: Boolean = false

    if (maiorDeIdade && temCarteira) {
        println("Pode dirigir")
    } else {
        println("Não pode dirigir")
    }

    // Texto (String)
    var primeiroNome: String = "Daniel"
    var sobrenome: String = "Penelva"
    println("Nome completo: $primeiroNome $sobrenome")

    // Também é possível usar strings multilinhas:
    val mensagem = """
    Olá, $nome $sobrenome!
    Bem-vindo ao Kotlin.
    """
    println(mensagem)

    // Caractere (Char)
    val letra: Char = 'K'
    val numero: Char = '7'

    println("Letra: $letra, Número: $numero")

    // Null Safety (?) - Variáveis que podem ser nulas. - Sintaxe: <tipo_variavel? nome_variavel = null;>
    var apelido: String? = null
    println("Apelido: $apelido")

    println("Tamanho do apelido: ${apelido?.length}")

    // Byte
    var pequenoNumero: Byte = 127
    println("Pequeno número: $pequenoNumero")

    // Soma
    val numero1: Int = 10
    val numero2: Int = 20
    val soma = numero1 + numero2
    println("A soma de $numero1 e $numero2 é $soma")

}