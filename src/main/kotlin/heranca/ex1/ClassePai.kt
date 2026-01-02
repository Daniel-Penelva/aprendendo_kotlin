package heranca.ex1

open class ClassePai {  // open permite herança
    var nome: String = ""

    open fun falar() {  // pode sobreescrever
        println("Olá, eu sou a Classe Pai.")
    }

    final fun despedir() {  // não pode ser sobrescrito, por que o método é final
        println("Adeus!")
    }
}

class ClassFilha: ClassePai() {
    override fun falar() {  // sobrescreve o método falar
        println("Olá, eu sou a Classe Filha.")
    }


    // override fun despedir() {}  // Isso não compila
}

fun main() {
    val pai = ClassePai()
    pai.falar()  // Saída: Olá, eu sou a Classe Pai.
    pai.despedir()  // Saída: Adeus!

    val filha = ClassFilha()
    filha.falar()  // Saída: Olá, eu sou a Classe Filha.
}

/*Exemplo
* Herança sem construtor
* Utilizando método final - Mesmo em classes open pode bloquear herança pontual.
* */