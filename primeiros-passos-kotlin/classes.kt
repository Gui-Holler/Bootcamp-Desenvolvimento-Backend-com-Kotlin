class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "guilherme0604@hotmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "holler.guilherme@gmail.com"
    println(contact.email)
}