package basic

fun main() {

    val frutas = mutableListOf<String>()

    // Exemplo 1 - Imprime lista
    println("================= Exemplo 1 =================")
    println("Lista Vazia: $frutas")


    // Exemplo 2 - Add elementos
    println("================= Exemplo 2 - add elementos  =================")
    frutas.add("Maça")
    frutas.add("Banana")
    frutas.add("Laranja")
    frutas.add("Uva")

    println("Lista: $frutas")

    // add primeiro da lista
    println("================= Exemplo 2.1 - add elemento no primeiro da lista  =================")
    frutas.addFirst("Mamão")
    println("Lista: $frutas")

    // add ultimo da lista
    println("================= Exemplo 2.2 - add elemento no último da lista  =================")
    frutas.addLast("Pitaia")
    println("Lista: $frutas")


    // Exemplo 3 - Add na lista utilizando indice
    println("================= Exemplo 3 - Add na lista utilizando indice  =================")
    frutas.add(0, "Morango")
    frutas.add(5, "Goiaba")

    println("Lista: $frutas")

    // Exemplo 4 - Alterar Elemento
    println("================= Exemplo 4 - alterar elemento para Limão  =================")
    frutas.set(0, "Limão")

    println("Lista: $frutas")

    // Exemplo 5 - Verificar existência com in - retorna boolean
    println("================= Exemplo 5 - Verificar existência com in (retorna boolean)  =================")
    println("Goiaba" in frutas)

    // Exemplo 6 - Acessar elemento da lista
    println("================= Exemplo 6 - Acessar elemento da lista utilizando get  =================")
    val index = frutas.get(2)
    println("Acessando elemento pelo index utilizando get: $index")

    // Exemplo 7 - acessar o valor do indece
    println("================= Exemplo 7 - Acessar o valor do indice da lista utilizando indexOf  =================")
    println("Acessando elemento pelo index: ${frutas.indexOf("Banana")}")

    // Exemplo 8 - Verificar o tamanho da lista
    println("================= Exemplo 8 - Verificar o tamanho da lista  =================")
    println("Tamanho da Lista: ${frutas.size}")

    // Exemplo 9 - Verificar se contém o elemento desejado - retorna boolean
    println("================= Exemplo 9 - Verificar se contém o elemento desejado (retorna boolean) =================")
    println(frutas.contains("Goiaba"))

    // Exemplo 10 - Verificar se a lista está vazia - retorna boolean
    println("================= Exemplo 10 - Verificar se a lista está vazia (retorna boolean) =================")
    println(frutas.isEmpty())

    // Exemplo 11 - Imprimir a lista utilizando forEach
    println("================= Exemplo 11 - Imprimir a lista utilizando forEach =================")
    frutas.forEach { println("Frutas: ${it.uppercase()}") }


    // Exemplo 12 - Remover elemento da Lista
    println("================= Exemplo 12 - Remover elemento da Lista =================")

    println("================= Exemplo 12.1 - Remover primeiro elemento da Lista =================")
    frutas.removeFirst()
    println("Lista: $frutas")

    println("================= Exemplo 12.2 - Remover ultimo elemento da Lista =================")
    frutas.removeLast()
    println("Lista: $frutas")

    println("================= Exemplo 12.3 - Remover buscando pela fruta (uva) =================")
    frutas.remove("uva")
    println("Lista: $frutas")

    println("================= Exemplo 12.4 - Remover fruta buscando pelo indice =================")
    frutas.removeAt(1)
    println("Lista: $frutas")

    println("================= Exemplo 12.5 - Remover fruta utilizando condição (Mamão) =================")
    val removidos = frutas.removeAll { it.equals("Mamão", ignoreCase = true) }
    println("Mamão removido? $removidos") // true se removeu
    println("Lista final: $frutas")

    println("================= Exemplo 12.6 - Remove frutas com mais de 5 letras =================")
    frutas.removeAll { it.length > 5 }
    println("Frutas curtas: $frutas")


    // Exemplo 13 - Limpar Lista
    println("================= Exemplo 13 - Limpar lista de frutas =================")
    frutas.clear()
    println("Lista: $frutas")

}

/*
mutableListOf cria listas mutáveis em Kotlin, permitindo adicionar, remover ou alterar elementos após a criação.
Diferente de listOf (imutável), ela é ideal para coleções que mudam dinamicamente, como o registry de usuários do seu código.

Conceito Básico:
Uma MutableList é uma lista que suporta modificações:
    - Adicionar: add(), addAll()
    - Remover: remove(), removeAt()
    - Alterar: set(), clear()
    - Acessar: get(), size, índices [0]


Diferença listOf vs mutableListOf

 Tipo                 Criação               Pode modificar?     Uso Ideal
listOf	         listOf("A", "B")	              Não	       Dados fixos
mutableListOf	 mutableListOf("A", "B")	      Sim	       Dados dinâmicos

Dica: Use mutableListOf quando precisar modificar (como registry), listOf para dados constantes (menu de opções).
* */