package k002_Basics

fun main(args: Array<String>) {
    printHelloUnit("Franta")
    printHelloUnit("Lojza")

    // String interpolation:
    val num = 10
    val s = "i = $num"
    println(s)

    //nullable references
    var a: String = "abc"
    //a = null // compilation error

    //non-null references
    var b: String? = "abc"
    b = null // ok
    println(b)

    // Kotlin,== actually checks for equality
    println(a == b)
    println(a?.equals(b) ?: (b === null))
    //unused elvis operator ?: always returns LEFT operand...
    //TODO varName?
    //TODO  ?:
    //TODO ===    jako == java?
}

// Unit return type declaration is optional for functions
//REdundant Unit Type warning
fun printHelloUnit(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
}

fun printHello(name: String?) {
    if (name != null)
        println("Hello ${name}")
}

//
fun double(x: Int): Int = x * 2

fun doubleNoRet(x: Int) = x * 2

