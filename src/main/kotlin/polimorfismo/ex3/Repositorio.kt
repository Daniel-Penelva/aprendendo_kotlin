package polimorfismo.ex3

// =========================
// REPOSITÓRIO GENÉRICO
// =========================
class Repositorio<T> {

    private val itens = mutableListOf<T>()

    fun adicionar(item: T) {
        itens.add(item)
    }

    fun listar(): List<T> {
        return itens
    }
}