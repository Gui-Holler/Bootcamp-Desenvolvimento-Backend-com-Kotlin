val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssues(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueALreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssues(aNewIssue))}")
    println("Issue $anIssueALreadyIn ${getStatusLog(addIssues(anIssueALreadyIn))}")
}