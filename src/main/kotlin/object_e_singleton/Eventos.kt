package object_e_singleton

interface Eventos {
    fun meuEvento(msg: String)
}

class ProcessarEvento {
    // Definindo uma propriedade que é uma expressão de object anônima
    private val eventoListener = object : Eventos {
        override fun meuEvento(msg: String) {
            println("Evento recebido: $msg")
        }
    }

    fun dispararEvento(msg: String) {
        eventoListener.meuEvento(msg)
    }
}

fun main() {
    val processador = ProcessarEvento()
    processador.dispararEvento("Kotlin é incrível!")
}

/*
1. interface EventListener: Define um contrato básico que qualquer classe ou objeto que a implemente deve seguir (ter a função onEvent).

2. class EventManager: É a classe principal onde a ação acontece. Ela contém uma propriedade privada eventListener que é uma expressão de object
anônima implementando a interface EventListener.

3. private val eventoListener = object : Eventos { ... }
    1 - Aqui, a palavra-chave object é usada para declarar e instanciar imediatamente uma expressão de objeto.
    2 - : indica que este objeto anônimo está implementando a interface Eventos.
    3 - Dentro das chaves { ... }, sobrescreve a função meuEvento com o comportamento específico que deseja para este objeto em particular.

4. fun main(): Demonstra como a classe ProcessarEvento é usada e como o objeto anônimo processa o evento internamente.

* */