package k010_Loops

import sun.java2d.cmm.ColorTransform.In

fun factorial(n: Long): Long = if (n == 0L) 1 else n * factorial(n - 1)

fun main(args: Array<String>) {
    var map = hashMapOf(1 to "foo", 2 to "bar", 3 to "baz")
    for ((key, value) in map) {
        println("Map[$key] = $value")
    }
    println(factorial(10))
    val condition = false;
    while(condition) {
        doSomething()
    }

//    var lojza="GR"
//    do {
//        doSomething()
//        //var lojza//stejne musi byt venku
//    } while (lojza=="LOJZA")
    //In the do-while loop, the condition block has access to values and variables declared in the loop body.

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val numberStrings = numbers.filter { it % 2 == 0 }.map { "Number $it" }
    println(numberStrings)
}

fun doSomething() {
    println("doSom")
}
