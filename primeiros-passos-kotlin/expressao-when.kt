fun main() {
    println(whenAssing("Hello"))
    println(whenAssing(3.4))
    println(whenAssing(1))
    println(whenAssing(MinhaClasse()))
}

fun whenAssing(obj: Any): Any{
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MinhaClasse