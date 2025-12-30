package visibilidade.publico

class Pessoa {
    val nome: String = "Ana"
}

fun main() {
    val pesssoa = Pessoa()
    println(pesssoa.nome) // Acessível de qualquer lugar do projeto
}

/*
*
public (padrão)
Se não escrever nada, já é public.

    - Acessível de qualquer lugar do projeto
    - Não precisa declarar explicitamente
* */