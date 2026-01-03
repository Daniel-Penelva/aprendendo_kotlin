package delegation_by

interface Contador {
    var total: Int
}

class ContadorImpl: Contador {
    override var total = 0
}

class Servico: Contador by ContadorImpl() {
    fun processar() {
        for (i in 1..10) {
            total += i
        }
        println("Total processado: $total")
    }
}
fun main(){

    val servico = Servico()
    servico.processar()  // total será atualizado via ContadorImpl

}

/** Exemplo:
Delegation com estado

Cálculo Passo a Passo:
i=1  → total = 0 + 1 = 1
i=2  → total = 1 + 2 = 3
i=3  → total = 3 + 3 = 6
i=4  → total = 6 + 4 = 10
i=5  → total = 10 + 5 = 15
i=6  → total = 15 + 6 = 21
i=7  → total = 21 + 7 = 28
i=8  → total = 28 + 8 = 36
i=9  → total = 36 + 9 = 45
i=10 → total = 45 + 10 = 55
 **/
