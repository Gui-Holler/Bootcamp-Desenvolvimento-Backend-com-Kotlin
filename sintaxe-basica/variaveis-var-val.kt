fun algumaCondicao() = false

fun main() {
    var a: String = "inicial" // var é uma variável mutável, pode ter valores alterados
    println(a)
    a = "final"
    println(a)
    val b: Int = 1 // val é uma variável imutável, não pode ser alterada
    val c = 3
    println(b)
    println(c)

    val d: Int

    if (algumaCondicao()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}