package object_e_singleton

interface Mensagem {
    fun entrarMensagem(msg: String)
}

object GerenciarMensagem: Mensagem {
    override fun entrarMensagem(msg: String) {
        println("Sua mensagem: ${msg}")
    }
}

fun main() {
    GerenciarMensagem.entrarMensagem("Olá Kotlin!")
}

/*
* Aqui o objetivo é mostrar como funciona o object como implementação de interface. Ou seja, um singleton que implementa uma interface.
* */