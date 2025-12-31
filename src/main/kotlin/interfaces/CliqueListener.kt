package interfaces

interface CliqueListener {
    fun onClick()
}

class ListenerDeBotao(private val listener: CliqueListener) {
    fun clicar() {
        listener.onClick()
    }
}

fun main(){
    val botao = ListenerDeBotao(object : CliqueListener {
        override fun onClick() {
            println("Botão clicado!")
        }
    })

    botao.clicar()
}

/*
Exemplo:
Interface com Callback
Este exemplo mostra como usar uma interface para definir um callback de clique.
**/

