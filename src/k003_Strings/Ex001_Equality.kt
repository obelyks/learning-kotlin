package k003_Strings

fun main(args: Array<String>) {
    equality()
    escaped()
    raw()
    elements()
    stringTemplates()
}

private fun equality() {
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

fun stringTemplates() {
    val i = 10
    val s = "i = $i" // evaluates to "i = 10"
    val s2 = "abc"
    val str1 = ">>  $s.length is ${s.length} <<" // evaluates to "abc.length is 3"
    println(str1)

    val str2 = "\$foo" // evaluates to "$foo"
    val price = """
            ${'$'}9.99
    """
    println(str2)
    println(price)
}

fun elements() {
    val str = "Hello, World!"
    println(str[1]) // Prints e
    for (c in str) {
        print(c)
    }
}

fun escaped() {
    val s = "Hello, world!\n \t, \b,  \n,  \r, \', \", \\ and \$"
    println(s)
}

fun raw() {
    val text = """
        for (c in "foo")
        print(c)  \n noescaping inside
    """
    print(text)
    //default margin prefix=|
    val text2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()
    print(text2)
}