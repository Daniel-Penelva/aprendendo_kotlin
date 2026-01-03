package delegation_by

interface Logger {
    fun log(msg: String)
}

class ConsoleLogger: Logger {
    override fun log(msg: String) {
        println("Log: $msg")
    }
}
interface Auditoria {
    fun auditar()
}

class AuditoriaSimples : Auditoria {
    override fun auditar() {
        println("Auditando via Auditoria Simples")
    }
}

class Sistema(val consoleLogger: ConsoleLogger , val auditoria: Auditoria) : Logger by consoleLogger, Auditoria by auditoria {
    fun executar() {
        log("Executando sistema...")
        auditar()
    }
}
fun main() {
    val sistema = Sistema(ConsoleLogger(), AuditoriaSimples())
    sistema.executar()  // chama consoleLogger.log() e auditoria.auditar()

}

/*
* Exemplo:
* Delegation com múltiplas interfaces
* Sem herança múltipla
* Extremamente limpo
* */