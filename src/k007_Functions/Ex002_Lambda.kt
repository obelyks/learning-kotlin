package k007_Functions

fun main(args: Array<String>) {
    val f1 = { name: String ->
        "Your name is $name" //This is returned
    }
    val f2 = { argumentOne: String, argumentTwo: String ->
        "$argumentOne - $argumentTwo"
    }

    //TODO error nova verze jinak??? val f3 = { "Your name is $it" }
    //var f3= { "Your name is $it" }//compiler to musi umet poznt!
    //println(f3())

    var ints = arrayOf(1, 0, 3, 4, 5, 0, 7);
    println(ints.filter { it > 0 })

    // These are identical ONLY argument is fce: nejsou potreba kulate zavorky!
    println(listOf(1, 2, 3, 4).map({ it + 2 }))
    println(listOf(1, 2, 3, 4).map { it + 2 })

    //Operators
    data class IntListWrapper (val wrapped: List<Int>) {
        //operator fun get(position: Int): Int = wrapped[position]
        operator fun get(position: Int): Int {
            println("called my function as oprerator...")
            return wrapped[position]
        }
    }
    val a = IntListWrapper(listOf(1, 2453, 3))
    println(a[1])

}