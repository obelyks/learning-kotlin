package k007_Functions

/*
Parameter Details
Name Name of the function
Params Values given to the function with a name and type:  Name:Type
Type Return type of the function
Type Argument Type parameter used in generic programming (not necessarily return type)
ArgName Name of value given to the function
ArgType Type specifier for ArgName
ArgNames List of ArgName separated by commas
//TODO example using all of above
*/


//funciton def short
fun addTwo(x: Int) = x + 2

//TODO Functions without a receiver????
//fun foo(p0: Foo0, p1: Foo1, p2: Foo2): Bar {}


//Basic declaratons
fun sayMyName1(name: String): String {
    return "Your name is $name"
}

//A shorthand version of the same:
fun sayMyName2(name: String): String = "Your name is $name"

//And the type can be omitted since it can be inferred:
fun sayMyName3(name: String) = "Your name is $name"


//INLINE! replace in code no call
inline fun sayMyName4(name: String) = "Your name is $name"
//One difference from C macros is that inline functions can't access the scope from which they're called:
//inline fun sayMyName5() = "Your name is $name" //COMPILETIME error


fun main() {
}

fun main(args: Array<String>) {
    //funciton reference
    println(listOf(1, 2, 3, 4).map(::addTwo)) //# => [3, 4, 5, 6]
    // println(::foo::class.java.genericInterfaces[0])

    //srt.15
    //TODO receiver je clss objekt nebo extension function chova se to jinak neob jenom zapsuje TODO
    //TODO stejne je to pry bad practive a je to tam jenom na vysvletleni jak to funguje!!!

    sayMyName1("franta");
    sayMyName2("franta");
    sayMyName3("franta");

    val name = "Foo"
    //sayMyName5()// # => Unresolved reference: name

}

