package k003_Strings

fun main(args: Array<String>) {

    //== operator structural equality.
    val sstr1 = "Hello, World!"
    val sstr2 = "Hello," + " World!"
    println(sstr1 == sstr2) // Prints true

    //=== operator Referential equality...jako identity v jave????
    val str1 = """
            |Hello, World!
    """.trimMargin()
    val str2 = """
            #Hello, World!
    """.trimMargin("#")
    val str3 = str1

    println(str1)
    println(str2)
    println(str3)

    println(str1 == str2) // Prints true
    println(str1 === str2) // Prints false
    println(str1 === str3) // Prints true
}