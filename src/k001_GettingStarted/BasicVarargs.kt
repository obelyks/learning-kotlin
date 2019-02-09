package k001_GettingStarted  //nameng convetions stejne jako v jave... clejny class code
//package my.program

fun main(vararg args: String) {
    println("Hello, world with args:")
    for (arg in args) {
        println(arg)
    }
}
