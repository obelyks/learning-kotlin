package k007_Functions

//shorthand jenom = a expression
fun sayMyName(name: String): String = "Your name is $name"

// ()->Any ... fce bez parametru vraccejici cokoli!!!
fun twice(x: () -> Any?) {
    x(); x();
}

fun main(args: Array<String>) {
    twice {
        println("Foo")
    }
}