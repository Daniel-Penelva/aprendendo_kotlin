package visibilidade.interno

// internal - Vísivel no mesmo projeto
internal class AnimalInterno(val nome: String) {
    internal fun fazerBarulho() {
        println("$nome faz AU AU")
    }
}

class AnimalPublico(val nome: String) {
    fun fazerBarulho() {
        println("$nome faz MIAU")
    }
}

/*
O internal é um modificador de visibilidade do Kotlin que restringe o acesso a dentro do mesmo módulo (conjunto de arquivos Kotlin compilados juntos).
É equivalente ao package-private do Java, mas mais poderoso.

Conceito Simples:
Módulo = Todos os arquivos .kt do meu projeto atual
internal = "Visível só dentro deste módulo"

Resumo Visual:
MeuApp (Módulo)
├── Animal.kt          internal OK
├── Main.kt            internal OK
├── Usuario.kt         internal OK
└── build/             Compila tudo junto

OutroApp (Outro Módulo)
└── X ERRO: Não vê internals do MeuApp!

* */