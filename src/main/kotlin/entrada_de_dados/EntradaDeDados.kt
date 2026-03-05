package entrada_de_dados
import java.util.Scanner

fun main(){

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<< readln() ou readlnOrNull() >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // Utilizando readln() e readlnOrNull() para ler dados do usuário
    // Exemplo 1 - Entrada padrão (console) e retorna uma String. Se a entrada estiver vazia ou for null, podemos usar o operador Elvis para fornecer um valor padrão. Sem o operador Elvis retorna uma exceção.
    println("Digite seu nome: ")
    val nome = readln() ?: "Desconecido" // readLine() retorna String? (nullable), então usamos o operador Elvis para fornecer um valor padrão caso seja null.

    println("Digite seu sobrenome: ")
    val sobrenome = readlnOrNull()

    println("Olá, $nome ${sobrenome ?: "Sobrenome Desconecido"}!") // Se o usuário não digitar nada, sobrenome será null, e o operador Elvis fornecerá "Sobrenome Desconecido" como valor padrão.


    // Exemplo 2 - Conversão de tipos (toInt, toDouble, etc.)
    println("Digite sua idade: ")
    val idade = readln().toInt()
    println("Sua idade é: $idade")

    println("Digite seu número favorito: ")
    val numero = readln().toIntOrNull() ?: 0
    println("Seu número favorito é: $numero")

    /* OBS. Diferença entre toInt e toIntOrNull
    * Em toInt() - Se a string não puder ser convertida para um número inteiro, ele lançará uma NumberFormatException. Por exemplo, se o usuário digitar "abc", o programa irá falhar.
    * Em toIntOrNull() - Se a string não puder ser convertida para um número inteiro, ele retornará null em vez de lançar uma exceção. Por exemplo, se o usuário digitar "abc", o resultado será null, e com o operador Elvis (?:) podemos fornecer um valor padrão, como 0, para evitar erros.
    * */

    println("Digite sua altura: ")
    val altura = readln().toDoubleOrNull() ?: 0.0 // Se a conversão falhar, retorna 0.0
    println("Sua altura é: $altura")

    // OBS. readlnOrNull() (Seguro) - Retorna null se a entrada for vazia ou se ocorrer um erro de leitura, enquanto readln() (Padrão) lança uma exceção se a entrada for vazia ou se ocorrer um erro de leitura. Portanto, readlnOrNull() é mais seguro para lidar com entradas do usuário, pois permite tratar casos em que a entrada pode ser inválida ou ausente sem causar falhas no programa.


    /* <<<<<<<<<<<<<<<<<<<<<<<<<<<< Utilizando Scanner >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
    // Tem que importar a biblioteca import java.util.Scanner e criar um objeto Scanner para ler a entrada do usuário.
    // O Scanner NÃO é preferível em Kotlin, pois é mais verboso e menos idiomático do que as funções de leitura padrão (readln()e readlnOrNull()). Vale apena caso você queira migrar para o JAVA.

    val scanner = Scanner(System.`in`)

    println("Digite seu nome: ")
    val name = scanner.next()

    println("Digite sua idade: ")
    val age = scanner.nextInt()

    println("Nome: $nome e idade: $age")
}