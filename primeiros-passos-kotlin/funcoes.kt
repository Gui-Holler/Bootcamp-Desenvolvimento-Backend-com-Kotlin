import kotlin.enums.EnumEntries

fun imprimirMensagem(message: String) {
    println(message)
}

fun imprimirMensagemComPrefixo(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun soma(x: Int, y: Int): Int {
    return x + y
}

fun multiplicacao(x: Int, y: Int) = x * y

fun main() {
    imprimirMensagem("Olá")
    imprimirMensagemComPrefixo("Olá", "Log")
    imprimirMensagemComPrefixo("Hello")
    imprimirMensagemComPrefixo(prefix = "Log", message = "Hello")
    println(soma(1, 2))
    println(multiplicacao(2, 4))
}