fun main() {
    cases("Olá")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("olá")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Um")
        "Olá" -> println("Saudação")
        is Long -> println("Longo")
        !is String -> println("Não é uma string")
        else -> println("Desconhecido")
    }
}

class MyClass