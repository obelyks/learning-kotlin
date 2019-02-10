package k008_Varargs

//vsechny musi byt int!
fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        print(" $number ")
    }
    println(".")
}

fun main(args: Array<String>) {
    printNumbers(0, 1) // Prints "0" "1"
    printNumbers(10, 20, 30, 500)
    //printNumbers(10, 20, 30, 500, "345")

    val numbers = intArrayOf(1, 2, 3)
    printNumbers(*numbers)
    // This is the same as passing in (1, 2, 3)
    //The spread operator can also be used in the middle of the parameters...
    printNumbers(10, 20, *numbers, 30, 40)
    // This is the same as passing in (10, 20, 1, 2, 3, 30, 40)
}