package classes

class Animal {
    val id: Int = 1
    var tipo: String? = ""
    var raca: String = ""

    // Exemplo 3 - Tornando o Setter privado (muito comum!)
    var patas: Int = 0
        private  set

    // OBS. Método de acesso abaixo!


    // Exemplo 4 - Getters e setters CUSTOMIZADOS (manuais) - OBS. Podem ser feito juntos ou separados o get e o set
    val precoImposto: Double = 1.1
    var preco: Double = 0.0
        get() = field * precoImposto  // field referencia o valor backing da propriedade, ou seja, preco = field
        set(value) {                  // value corresponde ao valor que está sendo atribuído à propriedade, ou seja, preco = value
            field = value / precoImposto  // Armazena o valor sem imposto
        }

    // Exemplo 5 - Getters e Setters CUSTOMIZADOS com validação
    var nome: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.length >= 3) {
                field = value
            } else {
                println("Nome muito curto! Deve ter pelo menos 3 caracteres.")
            }
        }

    // Exemplo 6 - Propriedade sem campo (backing field)

    private var _sobrenome: String = ""    // backing field para o nome. Usado internamente na classe. Essa propriedade não é visível fora da classe
    var descricao: String
        get() = "Tipo: $tipo, Raça: $raca, Nome: $nome, Sobrenome: $_sobrenome"
        set(value) {
            _sobrenome = value.uppercase()  // Armazena o sobrenome em maiusculas no backing field _sobrenome.

            val partes = value.split(",")  // Divide a string em partes usando a virgula como separador.
            if (partes.size >= 4) {       // Este if é para garantir que a string está no formato esperado antes de tentar dividir e atribuir os valores às propriedades.
                tipo = partes[0].substringAfter("Tipo: ").trim()  // trim( remove espaços em branco extras no ínico e no final da string)
                raca = partes[1].substringAfter("Raça: ").trim()
                nome = partes[2].substringAfter("Nome:").trim()
                _sobrenome = partes[3].substringAfter("Sobrenome:").trim()
            }
        }


    // Exemplo 7 - Encapsulamento com visibilidade
    private var apelido: String = "Pimpão"  // só acessa dentro da classe

    fun mostrarApelido() {
        println("Apelido do animal: $apelido")
    }


    // Exemplo 3 - Tornando o Setter privado - só acessa pelo método
    fun quantasPatas(qntdPatas: Int) {
        patas = qntdPatas
        println("Total de Patas: $patas")
    }
}

fun main() {

    // Exemplo 1 - Getters e setters AUTOMÁTICOS (padrão)
    println("=================== Exemplo 1 - Getters e setters AUTOMÁTICOS (padrão) ===================")
    val animal1 = Animal()
    animal1.tipo = "Cachorro"        // chama o setter
    animal1.raca = "Pastor Alemão"   // chama o setter

    println("Tipo: ${animal1.tipo} | Raça: ${animal1.raca}") // chama getter

    // OBS. Sem escrever código extra. O encapsulamento já está lá.


    // Exemplo 2 - Controlando acesso com val e var
    println("=================== Exemplo 2 - Controlando acesso com val e var ===================")

    // val -> gera somente getter  (imutável)
    // var -> fera getter e setter (mútável)

    val animal2 = Animal()
    // animal2.id = 2  // Vai gerar erro se alterar o valor do id
    animal2.tipo = "gato"
    animal2.raca = "Siamês"
    println("Tipo: ${animal2.tipo} | Raça: ${animal2.raca}")


    // Exemplo 3 - Tornando o Setter privado (muito comum!)
    println("=================== Exemplo 3 - Tornando o setter privado (muito comum!) ===================")

    val animal3 = Animal()
    // Dessa maneira não compila:
    // animal3.patas = 4 // vai gerar erro por que declarou como private set o atributo

    // Vai precisar alterar dentro da classe criando um método.
    // Esse exemplo deixa o encapsulamento forte e regra de negócio centralizada

    val patas = animal3.quantasPatas(2)
    animal3.tipo = "Ave"
    animal3.raca = "Pato"

    println("Tipo: ${animal3.tipo} | Raça: ${animal3.raca} ")


    // Exemplo 4 - Getters e setters CUSTOMIZADOS (manuais)
    println("=================== Exemplo 4 - Getters e setters CUSTOMIZADOS (manuais) ===================")

    val animal4 = Animal()
    animal4.tipo = "Gato"
    animal4.raca = "Frajola"
    animal4.preco = 500.00  // Armazena 500 / 1.1 = ~454.55 (sem imposto)
    println("Tipo: ${animal4.tipo} | Raça: ${animal4.raca}")
    println("Preço COM imposto: ${animal4.preco}")
    println("Preço SEM imposto: ${animal4.preco / animal4.precoImposto}")

    // Exemplo 5 - Getters e setters CUSTOMIZADOS com validação
    println("=================== Exemplo 4 - Getters e setters CUSTOMIZADOS com validação ===================")

    val animal5 = Animal()
    animal5.nome = "Bo"  // Nome muito curto! Deve ter pelo menos 3 caracteres.
    animal5.nome = "Bob"
    println("Nome do animal: ${animal5.nome}") // BOB

    // Exemplo 6 - Propriedade sem campo (backing field)
    println("=================== Exemplo 6 - Propriedade sem campo (backing field) ===================")

    val animal6 = Animal()
    animal6.descricao = "Tipo: Peixe, Raça: Betta, Nome: Jurema, Sobrenome: Listrada"
    println("Tipo: ${animal6.tipo}")
    println("Raça: ${animal6.raca}")
    println("Nome: ${animal6.nome}")
    // println("Nome: ${animal6._sobrenome}") // Não compila, pois _sobrenome é privado
    println("Descrição completa: ${animal6.descricao}")


    // Exemplo 7 - Encapsulamento com visibilidade
    println("=================== Exemplo 7 - Encapsulamento com visibilidade ===================")

    val animal7 = Animal()
    // println("Apelido: ${animal7.apelido}") // Não compila, pois apelido é privado
    animal7.mostrarApelido() // Apelido do animal: Pimpão

}

/*
O que é Encapsulamento?

Encapsulamento é o princípio de controlar o acesso aos dados de uma classe.

    - Você não expõe diretamente como o dado é armazenado
    - Você controla como ele é lido e alterado

Em Java, isso normalmente significa:

    - atributos private
    - getters e setters públicos

Em Kotlin, isso é muito mais simples.
Em Kotlin, toda propriedade já tem getter e setter gerados automaticamente.
* */