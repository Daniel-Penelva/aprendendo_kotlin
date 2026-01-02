package basic

// Exemplo 4 - is com Herança
open class Animal(val nome: String)
class Cachorro(nome:String, val raca: String): Animal(nome)


// Exemplo 5 - is com Sealed Class
sealed class Estado {
    object Ligado: Estado()
    object Desligado: Estado()
    data class Configuracao(val nível: Int): Estado()
}
fun main(){

    // Exemplo 1
    println("=========== Exemplo 1 - if simples ===========")

    val valor: Any = "Olá Mundo!"

    if (valor is String) {
        println("A variável 'valor' é do tipo String e seu conteúdo é: $valor")
    } else {
        println("A variável 'valor' é do tipo Any e seu conteúdo é: $valor")
    }


    // Exemplo 2 - !is (Negação)
    println("=========== Exemplo 2 - !is (Negação) ===========")

    val numero: Any = 42

    if (numero !is String) {
        println("Não é texto!")  // Smart cast para não-String
    } else {
        println("É texto!")
    }

    // Exemplo 3 - is em When
    println("=========== Exemplo 2 - is em When ===========")

    fun identificador(objeto: Any): String {
        return when (objeto) {
            is String -> "É uma String com valor: $objeto"
            is Int -> "É um Int com valor: $objeto"
            is Double -> "É um Double com valor: $objeto"
            else -> "Tipo desconhecido"
        }
    }

    println(identificador("Kotlin"))
    println(identificador(100))
    println(identificador(3.14))


    // Exemplo 4 - is com Herança
    println("=========== Exemplo 4 - is com Herança ===========")

    val meuAnimal: Animal = Cachorro("Rex", "Labrador")
    if (meuAnimal is Cachorro) { // ao utilizar o is já identifica a subclasse e faz o cast automaticamente, ou seja, os atributos da subclasse já ficam disponíveis.
        println("O animal é um cachorro da raça: ${meuAnimal.raca}")
    } else {
        println("O animal não é um cachorro.")
    }

    /*
    Fluxo Visual:
        val x: Animal = Cachorro("Rex")

        if (x is Cachorro) {
            ↑ Verificação
            ↓ Smart cast
            x.raca  // x agora É Cachorro!
    * */


    // Exemplo 5 - is com Sealed Class
    println("=========== Exemplo 5 - is com Sealed Class  ===========")

    fun status(estado: Estado): String {
        return when (estado) {
            Estado.Ligado -> "O estado está ligado."  // Aqui não precisa, porque é um objeto singleton e não possui propriedades. Agora se existisse uma propriedade, aí sim seria necessário o cast.
            Estado.Desligado -> "O estado está desligado." // Aqui não precisa, porque é um objeto singleton e não possui propriedades. Agora se existisse uma propriedade, aí sim seria necessário o cast.
            is Estado.Configuracao -> "O estado está em configuração com nível: ${estado.nível}."  // smart cast! Como possui apenas uma subclasse (contém uma propriedade 'nível'), o compilador já faz o cast automático.
        }
    }

    println(status(Estado.Ligado))
    println(status(Estado.Desligado))
    println(status(Estado.Configuracao(5)))


    // Exemplo 6 - Smart Cast com Nullable
    println("=========== Exemplo 6 - Smart Cast com Nullable  ===========")

    fun processar(texto: Any?) {
        if (texto is String) {
            // Smart cast para String
            println("O texto em maiúsculas é: ${texto.uppercase()}")
        } else {
            println("Não é uma String válida.")
        }
    }

    processar("Kotlin é incrível!")


    // Exemplo 7 - Múltiplos is (Smart Cast Local)
    println("=========== Exemplo 7 - Múltiplos is (Smart Cast Local)  ===========")

    fun processarLista(item: Any) {
        if (item is String) {
            println(item.length)
        } else if(item is Int) {
            println(item * 2)
        } else if(item is Double) {
            println(item + 0.5)
        } else {
            println("Tipo desconhecido")
        }
    }

    processarLista(listOf("Teste", 10, 3.5, true))

}