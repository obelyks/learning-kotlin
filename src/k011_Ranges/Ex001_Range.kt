package k011_Ranges

fun main(args: Array<String>) {
    for (i in 1..4) print(i)
    for (i in 4..1) print(i) //nic!!
    for (i in 4 downTo 1) print(i)
    for (i in 4.downTo(1)) print(i)
    println("---")
    for (i in 1..4 step 2) print(i) // prints "13"
    //for (i in 1..4.step(2)) print(i) // prints "13"
    for (i in 4 downTo 1 step 2) print(i) // prints "42"
    for (i in 4.downTo(1).step(2)) print(i) // prints "42"

    println("---")
    for (i in 1 until 10) { // i in [1, 10), 10 is excluded
        print(i)
    }
    for (i in 1 until 10) print(i)
    for (i in 1 .. 10) print(i) //..nemaji funkci ekvivalent!
}