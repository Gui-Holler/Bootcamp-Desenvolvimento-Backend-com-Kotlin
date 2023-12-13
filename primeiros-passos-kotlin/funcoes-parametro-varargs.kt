// Funções - Parâmetros vararg

fun main() {
    fun imprimaTudo(vararg messages: String) {
        for (m in messages) println(m)
    }
    imprimaTudo("Hello", "Hallo", "Salut", "Hola", "Olá")

    fun imprimaTudoComPrefixo(vararg message: String, prefix: String) {
        for (m in message) println(prefix + m)
    }
    imprimaTudoComPrefixo(
        "Hello", "Hallo", "Salut", "Hola", "Olá",
        prefix = "Saudações: "
    )

    fun log(vararg entries: String) {
        imprimaTudo(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "Olá")

}