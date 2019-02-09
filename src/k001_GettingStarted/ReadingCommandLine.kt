package k001_GettingStarted


//TODO co znamena !! a jak a proc se pouziva...
//jiank je tam jenom string templae/expression nebo jak se to jmenuje



fun main(args: Array<String>) {
    println("Enter Two number")
    val (a, b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).
    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}
fun maxNum(a: Int, b: Int): Int {
    val max = if (a > b) {
        println("The value of a is $a")
        a
    } else {
        println("The value of b is $b")
        b
    }
    return max
}