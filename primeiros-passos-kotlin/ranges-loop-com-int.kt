fun main() {
    for (i in 0..3) { // considera como menor ou igual
        print(i)
    }
    print(" ")

    for (i in 0 until 3) { // considera como menor que
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) { // vai de um parâmetro a outro, com incrementos de 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) { // vai de 3 ate 0 (decremento)
        print(i)
    }
    print(" ")
}