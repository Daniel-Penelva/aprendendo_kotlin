package basic

fun main() {

    // Tipos de dados em Kotlin
    val meuNum = 5  // Int
    val meuDoubleNum = 5.99 // Double
    val minhaLetra = 'D'  // Char
    val meuBoolean = true  // Boolean
    val meuTexto = "Olá Mundo!" // String

    println(meuNum)
    println(meuDoubleNum)
    println(minhaLetra)
    println(meuBoolean)
    println(meuTexto)

    // Tipos de inteiros
    val meuByte: Byte = 100  // Byte
    val meuShort: Short = 5000 // Short
    val meuInt: Int = 100000 // Int
    val meuLong: Long = 15000000000L  // Long
    val meuFloat: Float = 5.75F  // Float - deve terminar o valor de um Float tipo com um "F".
    val meuDouble: Double = 19.99  // Double

    /* OBS. Um número inteiro é considerado inteiro Int desde que seja até 2147483647. Se ultrapassar esse valor, é definido como Long */

    println(meuByte)
    println(meuShort)
    println(meuInt)
    println(meuLong)

    // Números Científicos
    val meuNumCient1: Float = 35E3F
    val meuNumCient2: Double = 12E4

    println(meuNumCient1)
    println(meuNumCient2)

    // Conversão
    val x: Int = 5
    val y: Long = x.toLong() // Conversão de Int para Long
    println(y)

    val z: Double = 19.99
    val w: Int = z.toInt()  // Conversão de Double para Int (perde a parte decimal)
    println(w)

    /* Para converter um tipo de dados numérico para outro tipo, você deve usar uma das seguintes funções: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()ou toChar() */

}