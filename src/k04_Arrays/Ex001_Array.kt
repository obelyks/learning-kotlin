package k04_Arrays

import java.util.*

fun main(args: Array<String>) {
    generic()
    primitives()
    createArray()
    createArrayCloure()
    extension()
    iterate()
}

fun iterate() {
    val asc = Array(5, { i -> (i * i).toString() })
    for(s : String in asc){
        println(s);
    }

    //change datatype
    val asc2 = Array(5, { i -> (i * i).toString() })
    for(s in asc2){
        println(s);
    }
}

fun extension() {
    //average() is defined for  Byte ,  Int ,  Long ,  Short ,  Double ,  Float and always returns  Double :
    val doubles = doubleArrayOf(1.5, 3.0)
    println("AVG: ${doubles.average()}") // prints 2.25
    val ints = intArrayOf(1, 4)
    println("AVG ing = ${ints.average()}") // prints 2.5
    //component1() ,  component2() , ...  component5() return an item of the array
    println("komponent2 = ${ints.component2()}")
    //getOrNull(index: Int) returns null if index is out of bounds, otherwise an item of the array
    println("get.2= ${ints.getOrNull(2)}")
    println("get.200 = ${ints.getOrNull(200)}")
    //first() ,  last()
    println("first= ${ints.first()}")
    println("last= ${ints.last()}")
    //toHashSet() returns a  HashSet<T> of all elements
    println("komponent2 = ${ints.toHashSet()}")
    //sortedArray() ,  sortedArrayDescending() creates and returns a new array with sorted elements of current
    println("sortedArray = ${ints.sortedArray()}")
    println("sortedArrayDescending = ${ints.sortedArrayDescending()}")
    //sort() ,  sortDescending sort the array in-place
    println("sort = ${ints.sort()}") //INplace!!!! vraci UNIT a puvodni pole je preserazeno
    //min() ,  max()
    println("min = ${ints.min()}")
    println("max = ${ints.max()}")
}

fun createArrayCloure() {
    val a = Array(5) { i -> i * 2 } // creates an Array<Int> of size 3 containing [0, 2, 4]
    println("clojure" + Arrays.toString(a))
}

fun createArray() {
    val a = arrayOf(1, 2, 3, 5, 8) // creates an Array<Int> of size 3 containing [1, 2, 3].
    //println(a)
    println(Arrays.toString(a))
    val a2 = arrayOfNulls<Int>(9) // creates an Array<Int?> of [null, null, null]
    //println(a2)
    println(Arrays.toString(a2))
}


fun primitives() {
    //These types do not inherit from  Array<T> to avoid boxing, however, they have the same attributes and methods.
    //Kotlin type Factory function JVM type
    var booleanArray = booleanArrayOf(true, false) //boolean[]
    var ByteArray = byteArrayOf(1, 2, 3) //byte[]
    var CharArray = charArrayOf('a', 'b', 'c') //char[]
    var DoubleArray = doubleArrayOf(1.2, 5.0) //double[]
    var FloatArray = floatArrayOf(1.2f, 5.0f) //float[]
    var IntArray = intArrayOf(1, 2, 3) //int[]
    var LongArray = longArrayOf(1, 2, 3) //long[]
    var ShortArray = shortArrayOf(1, 2, 3) //short[]
}

fun generic() {
    val empty = emptyArray<String>()
    //var strings = Array<String>(size = 5, init = { index -> "Item #$index" })
    var strings = Array<String>(size = 5, init = { index -> "Item #$index" })

    println(Arrays.toString(strings)) // prints "[Item #0, Item #1, Item #2, Item #3, Item #4]"
    println(strings.size) // prints 5

    strings.set(2, "ChangedItem")
    println(strings.get(2)) // prints "ChangedItem"
// You can use subscription as well:
    strings[2] = "ChangedItem"
    println(strings[2]) // prints "ChangedItem"
}
