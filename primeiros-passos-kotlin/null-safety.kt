//fun main(){

//    var neverNull: String = "Esta não pode ser nula"
//    neverNull = null

//    var nullable: String? = "Você pode chamar um nulo aqui"
//    nullable = null

//    var inferredNonNull = "O compilador assume não nulo"
//    inferredNonNull = null

//    fun strLength(str: String?): Int {
//        return str?.length ?: 0
//    }

//    println(strLength(neverNull))
//    println(strLength(nullable))
//}
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
    return "Sequência de comprimento ${maybeString.length}"
    } else {
        return "String vazia ou nula"
    }
}

fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}