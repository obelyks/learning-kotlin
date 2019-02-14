package k014_NullSafety

class ZData(val adata: String?) {
}

class YData(val zdata: ZData?) {
}

class XData(val ydata: YData?) {
    //    fun printA()="A"
//    fun printB()="B"//TODO multireturn resultmultik014_NullSafety.XData@6f94fa3e
    fun printA() = println("A__________")

    fun printB() = println("B__________")

}

//class Data(val first:String?)
class Data() {
    //nullable
    fun first(): String {
        return "r"
        //return null
    }

    fun second(): String? {
        //return "second"
        return null
    }

}

//TODO typ s otaznikem?
fun main(args: Array<String>) {
    //nullable expression in an if-else fashion
    var data: Data? = null
    val value: String = data?.first() ?: "Nothing here."
    //The expression above returns  "Nothing here" if
    // data?.first() or data itself yield a  null value
    // else the result of  data?.first()
    println(value)
    data = Data()
    val value2: String = data?.first() ?: "Nothing here." //always left operand if non nullable
    println(value2)

    var datanq: Data = Data()
    val valuenq: String = datanq.first() ?: "Nothing here."
    println(valuenq)

    try { //nemusi tu byt kotlin exc Nejsou checked!
        val valueSecond: String = data?.second() ?: throw IllegalArgumentException("Value can't be null!")
        println(valueSecond)
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
    //Reminder: NullPointerExceptions can be thrown using the assertion operator (e.g.  data!!.second()!!
    try {
        println(data!!.second()!!)
    } catch (ex2: Exception) {
        //ex2.printStackTrace()
        println("exception2 $ex2")

    }

    nullable()
    elvis2()
    safecall()
}

/**
 * ?.
 * ?.apply
 * ?.let
 */
fun safecall() {
    val string: String? = "Hello World!"
    //print(string.length) // Compile error: Can't directly access property of nullable type.
    print(string?.length) // Will print the string's length, or "null" if the string is null.
    //?. podobny jako ?: pro nullable type  pro ?. vraci null //TODO retezeni???
    var x: XData? = null
    println("x.." + x?.ydata?.zdata)
    println("x.." + x?.ydata?.zdata?.adata)

    var x2: XData? = XData(null)
    // if  obj is non-null, skipping the entire block otherwise
    var result = x2?.apply {
        printA()
        printB()
    }
    println("resultmulti" + result)

    //chci tam mit jmeno promenne aby bylo videt! ne implicit/auto/neviditelny receiver jako u apply
    var multak2 = x2?.let { notnull ->
        notnull.printA()
        notnull.printB()
    }
    println("multi2 $multak2")
//    nullable?.let { notnull ->
//        notnull.foo()
//        notnull.bar()
//    }

}

fun elvis2() {
    var a: String? = "Nullable String Value"

    //if  a is not null, use it, otherwise use some non-null value  x
    val bIf: Int = if (a != null) a.length else -1
    //elsis shorter!!!
    val b = a?.length ?: -1
}

private fun nullable() {
    //Normal types, like String , are not nullable
    //var s1:String=null//NEJDE compiletime error
    //able to hold null values
    var s2: String? = null


    var string: String = "Hello World!"
    var nullableString: String? = null
    //string = nullableString // Compiler error: Can't assign nullable to non-nullable type.
    nullableString = string // This will work however!
}