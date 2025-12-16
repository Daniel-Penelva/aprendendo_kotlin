package classes

class Departamento(var nome: String, var codigo: Int, var ativo: Boolean) {

    init {
        println("Departamento $nome com código $codigo foi criado.")
    }

    // Pode haver vários inits
    init {
        if (codigo == 101) {
            println("Este é o departamento de Recursos Humanos.")
        }
    }

    // Init com validação com throw
    init {
        nome = nome.trim()

        if (nome.isEmpty()) {
            throw IllegalArgumentException("O nome do departamento não pode ser vazio.")
        } else if (codigo <= 0) {
            throw IllegalArgumentException("O código do departamento deve ser maior que zero.")
        } else {
            nome = nome.replaceFirstChar { it.uppercase() }
            println("Nome do departamento ajustado para: $nome")
        }
    }

    // Init utilizando require - valida argumentos de entrada - Erro: IllegalArgumentException
    init {
        require(nome.isNotBlank()) {
            "O nome do departamento não pode ser vazio ou apenas espaços."
        }

        require(codigo > 0) {
            "O código do departamento deve ser maior que zero."
        }
    }

    // Init utilizando ckeck - valida estado interno - Erro: IllegalStateException
    init {
        check(nome.length >= 3) {
            "O nome do departamento deve ter pelo menos 3 caracteres."
        }

        check(codigo in 1..999) {
            "O código do departamento deve estar entre 1 e 999."
        }

        check(!(ativo && codigo == 99)) {
            "O departamento com código 99 (Secreto) não pode estar ativo."
        }
    }

    // Init utilizando assert - valida suposições (debug) - Erro: AssertionError
    // Usado para verificar condições que você acredita que sempre são verdadeiras
    // Só funciona se assertions estiverem habilitadas (-ea)
    // O assert não executa - Nenhum erro é lançado
    init {
        assert(nome.isNotEmpty()) {
            "O nome do departamento não deve estar vazio."
        }

        assert(codigo > 0) {
            "O código do departamento deve ser maior que zero."
        }

        assert(codigo != 666) {
            "Código 666 não deveria existir"
        }
    }
}

fun main () {

    val departamento1 = Departamento("Recursos Humanos", 101, true)
    val departamento2 = Departamento("Tecnologia da Informação", 202, true)
    // val departamentoVazio = Departamento("   ", 303, false) // Isso lançaria uma exceção
    // val departamentoInvalido = Departamento("Financeiro", -5, false) // Isso lançaria uma exceção

    val departamento3 = Departamento("Recursos Humanos", 101, true)

    val departamento4 = Departamento("  marketing  ", 303, true)
    val departamento5 = Departamento("  Secreto  ", 99, false)  // Isso lançaria uma exceção - IllegalStateException
}

/*
O que é o init em Kotlin?

O init é um bloco de inicialização.
    - Ele é executado toda vez que um objeto da classe é criado
    - Ele roda logo após o construtor primário receber os parâmetros
    - Ele serve para executar lógica, validações ou ajustes iniciais
    - Pode ter mais de um bloco init em uma classe
    - Executa antes do construtor secundário, se houver
    - Usa parâmetros do construtor primário diretamente

Regra Mental das funções require, check e assert:
    - Se o erro for do “usuário da classe” → require - valida argumentos de entrada (Parâmetros Inválidos - Execução: IllegalArgumentException)
    - Se o erro for do “estado do objeto” → check - valida estado interno (Estado Inválido - Execução: IllegalStateException)
    - Se for só uma suposição para debug → assert - valida suposições (debug) (Suposição Internas - Execução: AssertionError)
*/