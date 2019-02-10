package k010_Loops

fun main(args: Array<String>) {
    val list = listOf("Hello", "World", "!")
    for(str in list) {
        print(str)
    }
    for(i in 0..9) {
        print(i)
    }
    for((index, element) in list.withIndex()) {
        print("$element at index $index")
    }
    list.forEach{
        print(it.toString())
    }

    repeat(10) { i ->
        println("This line will be printed 10 times")
        println("We are on the ${i + 1}. loop iteration")
    }
    repeat(10) {
        println("This line will be printed 10 times")
        println("We are on the ${it + 1}. loop iteration")
    }

    //break label podobne jako v jave
    outer@ for(i in 0..10) {
        inner@ for(j in 0..10) {
            break // Will break the inner loop
            break@inner // Will break the inner loop
            break@outer // Will break the outer loop
        }
    }

}