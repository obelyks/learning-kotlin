package k012_Regex

//import kotlin.text.regex

fun doStuff() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun main(args: Array<String>) {

    immutableLocals()
    anonymousTemporaries()
}

//1. less horiontal more vertical(vic radku) preferable in loop regexp def outside!!
private fun immutableLocals() {
    var string = "/* some string */"
    val regex1 = Regex("/* pattern */")
    val regex2 = Regex("/* pattern */")
/* etc */
    when {
        regex1.matches(string) -> doStuff() /* do stuff */
        regex2.matches(string) -> doStuff()/* do stuff */
/* etc */
    }
}
//2...less vertical/ morehorizontal  not to be used in loop!
fun anonymousTemporaries() {
    var string = "/* some string */"
    when {
        Regex("/* pattern */").matches(string) -> doStuff() /* do stuff */
        Regex("/* pattern */").matches(string) -> doStuff()/* do stuff */
/* etc */
    }
}



