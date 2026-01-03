package delegation_by

interface Imprimivel {
    fun imprimir()
}

class Impressora: Imprimivel {
    override fun imprimir() {
        println("Imprimindo via Impressora")
    }
}

class Documento(val impressora: Impressora) : Imprimivel by impressora {
    fun salvar() {
        println("Salvando documento...")
    }
}
fun main() {

    val doc = Documento(Impressora())
    doc.imprimir()  // chama impressora.imprimir()
    doc.salvar()    // próprio método

}

/* Exemplo:
Class Delegation (Interface → Objeto)
Classe delega implementação de interface para outro objeto.
* */
