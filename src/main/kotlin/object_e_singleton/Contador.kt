package object_e_singleton

object Contador {
    var total = 0

    fun incrementar() {
        total++
    }
}

fun main(){
    Contador.incrementar()
    println(Contador.total)
}