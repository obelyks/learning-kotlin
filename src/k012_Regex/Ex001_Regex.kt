package k012_Regex

//import kotlin.text.regex

fun doStuff() {
    //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    println("called doStuff TODO find how to complete word like C-n/p in vim")
}

fun main(args: Array<String>) {

    immutableLocals()
    anonymousTemporaries()
    //visitorPattern()  //zmena syntaxe NEFUNGUJE TODO
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

/*
//--visitorPattern
class RegexWhenArgument(val whenArgument: CharSequence) {
    //override operator fun equals(whenEntry: Regex) = whenEntry.matches(whenArgument)
    override fun equals(whenEntry: Regex) = whenEntry.matches(whenArgument)
    //override operator fun equals(whenEntry: Any?) = (whenArgument == whenEntry)
}

fun visitorPattern() {
    var string = "/* some string */"
    when (RegexWhenArgument(string)) {
        Regex(" /* pattern */") -> doStuff()/* do stuff */
        Regex("/* pattern */") -> doStuff()/* do stuff */
/* etc */
    }
}
*/